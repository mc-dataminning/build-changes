import java.util.function.Consumer;

public class fbn {
   public static fbk a() {
      throw new IllegalArgumentException();
   }

   public static fbk a(fbk $$0) {
      return $$0;
   }

   public static fbk a(fbk $$0, fbk $$1) {
      return new fbn.a($$0, $$1);
   }

   public static fbk a(fbk... $$0) {
      return new fbn.b($$0);
   }

   static class a implements fbk {
      private final fbk a;
      private final fbk b;

      public a(fbk $$0, fbk $$1) {
         if ($$0 == $$1) {
            throw new IllegalArgumentException("Duplicate delegates");
         } else {
            this.a = $$0;
            this.b = $$1;
         }
      }

      @Override
      public fbk a(float $$0, float $$1, float $$2) {
         this.a.a($$0, $$1, $$2);
         this.b.a($$0, $$1, $$2);
         return this;
      }

      @Override
      public fbk a(int $$0, int $$1, int $$2, int $$3) {
         this.a.a($$0, $$1, $$2, $$3);
         this.b.a($$0, $$1, $$2, $$3);
         return this;
      }

      @Override
      public fbk a(float $$0, float $$1) {
         this.a.a($$0, $$1);
         this.b.a($$0, $$1);
         return this;
      }

      @Override
      public fbk a(int $$0, int $$1) {
         this.a.a($$0, $$1);
         this.b.a($$0, $$1);
         return this;
      }

      @Override
      public fbk b(int $$0, int $$1) {
         this.a.b($$0, $$1);
         this.b.b($$0, $$1);
         return this;
      }

      @Override
      public fbk b(float $$0, float $$1, float $$2) {
         this.a.b($$0, $$1, $$2);
         this.b.b($$0, $$1, $$2);
         return this;
      }

      @Override
      public void a(float $$0, float $$1, float $$2, int $$3, float $$4, float $$5, int $$6, int $$7, float $$8, float $$9, float $$10) {
         this.a.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, $$10);
         this.b.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, $$10);
      }
   }

   static record b(fbk[] a) implements fbk {
      b(fbk[] a) {
         for (int $$1 = 0; $$1 < a.length; $$1++) {
            for (int $$2 = $$1 + 1; $$2 < a.length; $$2++) {
               if (a[$$1] == a[$$2]) {
                  throw new IllegalArgumentException("Duplicate delegates");
               }
            }
         }

         this.a = a;
      }

      private void a(Consumer<fbk> $$0) {
         for (fbk $$1 : this.a) {
            $$0.accept($$1);
         }
      }

      @Override
      public fbk a(float $$0, float $$1, float $$2) {
         this.a($$3 -> $$3.a($$0, $$1, $$2));
         return this;
      }

      @Override
      public fbk a(int $$0, int $$1, int $$2, int $$3) {
         this.a($$4 -> $$4.a($$0, $$1, $$2, $$3));
         return this;
      }

      @Override
      public fbk a(float $$0, float $$1) {
         this.a($$2 -> $$2.a($$0, $$1));
         return this;
      }

      @Override
      public fbk a(int $$0, int $$1) {
         this.a($$2 -> $$2.a($$0, $$1));
         return this;
      }

      @Override
      public fbk b(int $$0, int $$1) {
         this.a($$2 -> $$2.b($$0, $$1));
         return this;
      }

      @Override
      public fbk b(float $$0, float $$1, float $$2) {
         this.a($$3 -> $$3.b($$0, $$1, $$2));
         return this;
      }

      @Override
      public void a(float $$0, float $$1, float $$2, int $$3, float $$4, float $$5, int $$6, int $$7, float $$8, float $$9, float $$10) {
         this.a($$11 -> $$11.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, $$10));
      }
   }
}
