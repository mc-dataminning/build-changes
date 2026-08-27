import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.Predicate;

public abstract class dwl {
   public static dwl.b a(int $$0, int $$1) {
      return new dwl.b($$0 - 1, $$1 + 1);
   }

   public static dwl.b b(int $$0, int $$1) {
      return new dwl.b($$0, $$1);
   }

   public static dwl a(int $$0) {
      return new dwl.c($$0, false);
   }

   public static dwl b(int $$0) {
      return new dwl.c($$0 + 1, false);
   }

   public static dwl c(int $$0) {
      return new dwl.c($$0, true);
   }

   public static dwl d(int $$0) {
      return new dwl.c($$0 - 1, true);
   }

   public static dwl a() {
      return dwl.a.a;
   }

   public static dwl a(OptionalInt $$0, OptionalInt $$1) {
      if ($$0.isPresent() && $$1.isPresent()) {
         return b($$0.getAsInt(), $$1.getAsInt());
      } else if ($$0.isPresent()) {
         return c($$0.getAsInt());
      } else {
         return $$1.isPresent() ? a($$1.getAsInt()) : a();
      }
   }

   public abstract OptionalInt b();

   public abstract OptionalInt c();

   public abstract OptionalInt d();

   public dwl a(OptionalInt $$0) {
      return a($$0, this.b());
   }

   public dwl b(OptionalInt $$0) {
      return a(this.c(), $$0);
   }

   public static Optional<dwl> a(dbf $$0, io $$1, int $$2, Predicate<drd> $$3, Predicate<drd> $$4) {
      io.a $$5 = $$1.j();
      if (!$$0.a($$1, $$3)) {
         return Optional.empty();
      } else {
         int $$6 = $$1.v();
         OptionalInt $$7 = a($$0, $$2, $$3, $$4, $$5, $$6, it.b);
         OptionalInt $$8 = a($$0, $$2, $$3, $$4, $$5, $$6, it.a);
         return Optional.of(a($$8, $$7));
      }
   }

   private static OptionalInt a(dbf $$0, int $$1, Predicate<drd> $$2, Predicate<drd> $$3, io.a $$4, int $$5, it $$6) {
      $$4.q($$5);

      for (int $$7 = 1; $$7 < $$1 && $$0.a($$4, $$2); $$7++) {
         $$4.c($$6);
      }

      return $$0.a($$4, $$3) ? OptionalInt.of($$4.v()) : OptionalInt.empty();
   }

   public static final class a extends dwl {
      static final dwl.a a = new dwl.a();

      private a() {
      }

      @Override
      public OptionalInt b() {
         return OptionalInt.empty();
      }

      @Override
      public OptionalInt c() {
         return OptionalInt.empty();
      }

      @Override
      public OptionalInt d() {
         return OptionalInt.empty();
      }

      @Override
      public String toString() {
         return "C(-)";
      }
   }

   public static final class b extends dwl {
      private final int a;
      private final int b;

      protected b(int $$0, int $$1) {
         this.a = $$0;
         this.b = $$1;
         if (this.g() < 0) {
            throw new IllegalArgumentException("Column of negative height: " + this);
         }
      }

      @Override
      public OptionalInt b() {
         return OptionalInt.of(this.b);
      }

      @Override
      public OptionalInt c() {
         return OptionalInt.of(this.a);
      }

      @Override
      public OptionalInt d() {
         return OptionalInt.of(this.g());
      }

      public int e() {
         return this.b;
      }

      public int f() {
         return this.a;
      }

      public int g() {
         return this.b - this.a - 1;
      }

      @Override
      public String toString() {
         return "C(" + this.b + "-" + this.a + ")";
      }
   }

   public static final class c extends dwl {
      private final int a;
      private final boolean b;

      public c(int $$0, boolean $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public OptionalInt b() {
         return this.b ? OptionalInt.empty() : OptionalInt.of(this.a);
      }

      @Override
      public OptionalInt c() {
         return this.b ? OptionalInt.of(this.a) : OptionalInt.empty();
      }

      @Override
      public OptionalInt d() {
         return OptionalInt.empty();
      }

      @Override
      public String toString() {
         return this.b ? "C(" + this.a + "-)" : "C(-" + this.a + ")";
      }
   }
}
