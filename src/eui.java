import java.util.function.Consumer;

public class eui {
   public static euf a() {
      throw new IllegalArgumentException();
   }

   public static euf a(euf $$0) {
      return $$0;
   }

   public static euf a(euf $$0, euf $$1) {
      return new eui.a($$0, $$1);
   }

   public static euf a(euf... $$0) {
      return new eui.b($$0);
   }

   static class a implements euf {
      private final euf a;
      private final euf b;

      public a(euf $$0, euf $$1) {
         if ($$0 == $$1) {
            throw new IllegalArgumentException("Duplicate delegates");
         } else {
            this.a = $$0;
            this.b = $$1;
         }
      }

      @Override
      public euf a(double $$0, double $$1, double $$2) {
         this.a.a($$0, $$1, $$2);
         this.b.a($$0, $$1, $$2);
         return this;
      }

      @Override
      public euf a(int $$0, int $$1, int $$2, int $$3) {
         this.a.a($$0, $$1, $$2, $$3);
         this.b.a($$0, $$1, $$2, $$3);
         return this;
      }

      @Override
      public euf a(float $$0, float $$1) {
         this.a.a($$0, $$1);
         this.b.a($$0, $$1);
         return this;
      }

      @Override
      public euf a(int $$0, int $$1) {
         this.a.a($$0, $$1);
         this.b.a($$0, $$1);
         return this;
      }

      @Override
      public euf b(int $$0, int $$1) {
         this.a.b($$0, $$1);
         this.b.b($$0, $$1);
         return this;
      }

      @Override
      public euf a(float $$0, float $$1, float $$2) {
         this.a.a($$0, $$1, $$2);
         this.b.a($$0, $$1, $$2);
         return this;
      }

      @Override
      public void a(
         float $$0,
         float $$1,
         float $$2,
         float $$3,
         float $$4,
         float $$5,
         float $$6,
         float $$7,
         float $$8,
         int $$9,
         int $$10,
         float $$11,
         float $$12,
         float $$13
      ) {
         this.a.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, $$10, $$11, $$12, $$13);
         this.b.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, $$10, $$11, $$12, $$13);
      }

      @Override
      public void e() {
         this.a.e();
         this.b.e();
      }

      @Override
      public void b(int $$0, int $$1, int $$2, int $$3) {
         this.a.b($$0, $$1, $$2, $$3);
         this.b.b($$0, $$1, $$2, $$3);
      }

      @Override
      public void l() {
         this.a.l();
         this.b.l();
      }
   }

   static class b implements euf {
      private final euf[] a;

      public b(euf[] $$0) {
         for (int $$1 = 0; $$1 < $$0.length; $$1++) {
            for (int $$2 = $$1 + 1; $$2 < $$0.length; $$2++) {
               if ($$0[$$1] == $$0[$$2]) {
                  throw new IllegalArgumentException("Duplicate delegates");
               }
            }
         }

         this.a = $$0;
      }

      private void a(Consumer<euf> $$0) {
         for (euf $$1 : this.a) {
            $$0.accept($$1);
         }
      }

      @Override
      public euf a(double $$0, double $$1, double $$2) {
         this.a($$3 -> $$3.a($$0, $$1, $$2));
         return this;
      }

      @Override
      public euf a(int $$0, int $$1, int $$2, int $$3) {
         this.a($$4 -> $$4.a($$0, $$1, $$2, $$3));
         return this;
      }

      @Override
      public euf a(float $$0, float $$1) {
         this.a($$2 -> $$2.a($$0, $$1));
         return this;
      }

      @Override
      public euf a(int $$0, int $$1) {
         this.a($$2 -> $$2.a($$0, $$1));
         return this;
      }

      @Override
      public euf b(int $$0, int $$1) {
         this.a($$2 -> $$2.b($$0, $$1));
         return this;
      }

      @Override
      public euf a(float $$0, float $$1, float $$2) {
         this.a($$3 -> $$3.a($$0, $$1, $$2));
         return this;
      }

      @Override
      public void a(
         float $$0,
         float $$1,
         float $$2,
         float $$3,
         float $$4,
         float $$5,
         float $$6,
         float $$7,
         float $$8,
         int $$9,
         int $$10,
         float $$11,
         float $$12,
         float $$13
      ) {
         this.a($$14 -> $$14.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, $$10, $$11, $$12, $$13));
      }

      @Override
      public void e() {
         this.a(euf::e);
      }

      @Override
      public void b(int $$0, int $$1, int $$2, int $$3) {
         this.a($$4 -> $$4.b($$0, $$1, $$2, $$3));
      }

      @Override
      public void l() {
         this.a(euf::l);
      }
   }
}
