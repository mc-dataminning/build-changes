import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.Predicate;

public abstract class ecz {
   public static ecz.b a(int $$0, int $$1) {
      return new ecz.b($$0 - 1, $$1 + 1);
   }

   public static ecz.b b(int $$0, int $$1) {
      return new ecz.b($$0, $$1);
   }

   public static ecz a(int $$0) {
      return new ecz.c($$0, false);
   }

   public static ecz b(int $$0) {
      return new ecz.c($$0 + 1, false);
   }

   public static ecz c(int $$0) {
      return new ecz.c($$0, true);
   }

   public static ecz d(int $$0) {
      return new ecz.c($$0 - 1, true);
   }

   public static ecz a() {
      return ecz.a.a;
   }

   public static ecz a(OptionalInt $$0, OptionalInt $$1) {
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

   public ecz a(OptionalInt $$0) {
      return a($$0, this.b());
   }

   public ecz b(OptionalInt $$0) {
      return a(this.c(), $$0);
   }

   public static Optional<ecz> a(dhf $$0, jh $$1, int $$2, Predicate<dxo> $$3, Predicate<dxo> $$4) {
      jh.a $$5 = $$1.k();
      if (!$$0.a($$1, $$3)) {
         return Optional.empty();
      } else {
         int $$6 = $$1.v();
         OptionalInt $$7 = a($$0, $$2, $$3, $$4, $$5, $$6, jm.b);
         OptionalInt $$8 = a($$0, $$2, $$3, $$4, $$5, $$6, jm.a);
         return Optional.of(a($$8, $$7));
      }
   }

   private static OptionalInt a(dhf $$0, int $$1, Predicate<dxo> $$2, Predicate<dxo> $$3, jh.a $$4, int $$5, jm $$6) {
      $$4.q($$5);

      for (int $$7 = 1; $$7 < $$1 && $$0.a($$4, $$2); $$7++) {
         $$4.c($$6);
      }

      return $$0.a($$4, $$3) ? OptionalInt.of($$4.v()) : OptionalInt.empty();
   }

   public static final class a extends ecz {
      static final ecz.a a = new ecz.a();

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

   public static final class b extends ecz {
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

   public static final class c extends ecz {
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
