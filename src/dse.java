import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.Predicate;

public abstract class dse {
   public static dse.b a(int $$0, int $$1) {
      return new dse.b($$0 - 1, $$1 + 1);
   }

   public static dse.b b(int $$0, int $$1) {
      return new dse.b($$0, $$1);
   }

   public static dse a(int $$0) {
      return new dse.c($$0, false);
   }

   public static dse b(int $$0) {
      return new dse.c($$0 + 1, false);
   }

   public static dse c(int $$0) {
      return new dse.c($$0, true);
   }

   public static dse d(int $$0) {
      return new dse.c($$0 - 1, true);
   }

   public static dse a() {
      return dse.a.a;
   }

   public static dse a(OptionalInt $$0, OptionalInt $$1) {
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

   public dse a(OptionalInt $$0) {
      return a($$0, this.b());
   }

   public dse b(OptionalInt $$0) {
      return a(this.c(), $$0);
   }

   public static Optional<dse> a(cxh $$0, ib $$1, int $$2, Predicate<dnb> $$3, Predicate<dnb> $$4) {
      ib.a $$5 = $$1.j();
      if (!$$0.a($$1, $$3)) {
         return Optional.empty();
      } else {
         int $$6 = $$1.v();
         OptionalInt $$7 = a($$0, $$2, $$3, $$4, $$5, $$6, ih.b);
         OptionalInt $$8 = a($$0, $$2, $$3, $$4, $$5, $$6, ih.a);
         return Optional.of(a($$8, $$7));
      }
   }

   private static OptionalInt a(cxh $$0, int $$1, Predicate<dnb> $$2, Predicate<dnb> $$3, ib.a $$4, int $$5, ih $$6) {
      $$4.q($$5);

      for (int $$7 = 1; $$7 < $$1 && $$0.a($$4, $$2); $$7++) {
         $$4.c($$6);
      }

      return $$0.a($$4, $$3) ? OptionalInt.of($$4.v()) : OptionalInt.empty();
   }

   public static final class a extends dse {
      static final dse.a a = new dse.a();

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

   public static final class b extends dse {
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

   public static final class c extends dse {
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
