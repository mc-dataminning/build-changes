import com.google.common.annotations.VisibleForTesting;
import java.util.function.Consumer;

public interface apy {
   apy a = new apy() {
      @Override
      public boolean a(int $$0, int $$1, boolean $$2) {
         return false;
      }

      @Override
      public void a(Consumer<dbn> $$0) {
      }
   };

   static apy a(dbn $$0, int $$1) {
      return new apy.a($$0, $$1);
   }

   static void a(apy $$0, apy $$1, Consumer<dbn> $$2, Consumer<dbn> $$3) {
      if (!$$0.equals($$1)) {
         if ($$0 instanceof apy.a $$4 && $$1 instanceof apy.a $$5 && $$4.a($$5)) {
            int $$6 = Math.min($$4.c(), $$5.c());
            int $$7 = Math.min($$4.d(), $$5.d());
            int $$8 = Math.max($$4.e(), $$5.e());
            int $$9 = Math.max($$4.f(), $$5.f());

            for (int $$10 = $$6; $$10 <= $$8; $$10++) {
               for (int $$11 = $$7; $$11 <= $$9; $$11++) {
                  boolean $$12 = $$4.a($$10, $$11);
                  boolean $$13 = $$5.a($$10, $$11);
                  if ($$12 != $$13) {
                     if ($$13) {
                        $$2.accept(new dbn($$10, $$11));
                     } else {
                        $$3.accept(new dbn($$10, $$11));
                     }
                  }
               }
            }

            return;
         }

         $$0.a($$3);
         $$1.a($$2);
      }
   }

   default boolean a(dbn $$0) {
      return this.a($$0.e, $$0.f);
   }

   default boolean a(int $$0, int $$1) {
      return this.a($$0, $$1, true);
   }

   boolean a(int var1, int var2, boolean var3);

   void a(Consumer<dbn> var1);

   default boolean b(int $$0, int $$1) {
      return this.a($$0, $$1, false);
   }

   static boolean a(int $$0, int $$1, int $$2, int $$3, int $$4) {
      return a($$0, $$1, $$2, $$3, $$4, false);
   }

   static boolean a(int $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
      int $$6 = Math.max(0, Math.abs($$3 - $$0) - 1);
      int $$7 = Math.max(0, Math.abs($$4 - $$1) - 1);
      long $$8 = (long)Math.max(0, Math.max($$6, $$7) - ($$5 ? 1 : 0));
      long $$9 = (long)Math.min($$6, $$7);
      long $$10 = $$9 * $$9 + $$8 * $$8;
      int $$11 = $$2 * $$2;
      return $$10 < (long)$$11;
   }

   public static record a(dbn b, int c) implements apy {
      int c() {
         return this.b.e - this.c - 1;
      }

      int d() {
         return this.b.f - this.c - 1;
      }

      int e() {
         return this.b.e + this.c + 1;
      }

      int f() {
         return this.b.f + this.c + 1;
      }

      @VisibleForTesting
      protected boolean a(apy.a $$0) {
         return this.c() <= $$0.e() && this.e() >= $$0.c() && this.d() <= $$0.f() && this.f() >= $$0.d();
      }

      @Override
      public boolean a(int $$0, int $$1, boolean $$2) {
         return apy.a(this.b.e, this.b.f, this.c, $$0, $$1, $$2);
      }

      @Override
      public void a(Consumer<dbn> $$0) {
         for (int $$1 = this.c(); $$1 <= this.e(); $$1++) {
            for (int $$2 = this.d(); $$2 <= this.f(); $$2++) {
               if (this.a($$1, $$2)) {
                  $$0.accept(new dbn($$1, $$2));
               }
            }
         }
      }

      public dbn a() {
         return this.b;
      }

      public int b() {
         return this.c;
      }
   }
}
