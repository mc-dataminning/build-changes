public abstract class cqm {
   private int a;

   public static cqm a(final cqe $$0, final int $$1) {
      return new cqm() {
         @Override
         public int b() {
            return $$0.a($$1);
         }

         @Override
         public void a(int $$0x) {
            $$0.a($$1, $$0);
         }
      };
   }

   public static cqm a(final int[] $$0, final int $$1) {
      return new cqm() {
         @Override
         public int b() {
            return $$0[$$1];
         }

         @Override
         public void a(int $$0x) {
            $$0[$$1] = $$0;
         }
      };
   }

   public static cqm a() {
      return new cqm() {
         private int a;

         @Override
         public int b() {
            return this.a;
         }

         @Override
         public void a(int $$0) {
            this.a = $$0;
         }
      };
   }

   public abstract int b();

   public abstract void a(int var1);

   public boolean c() {
      int $$0 = this.b();
      boolean $$1 = $$0 != this.a;
      this.a = $$0;
      return $$1;
   }
}
