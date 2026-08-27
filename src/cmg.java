public abstract class cmg {
   private int a;

   public static cmg a(final cly $$0, final int $$1) {
      return new cmg() {
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

   public static cmg a(final int[] $$0, final int $$1) {
      return new cmg() {
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

   public static cmg a() {
      return new cmg() {
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
