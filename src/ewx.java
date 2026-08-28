public final class ewx extends ewo {
   private final ewo d;
   private final int e;
   private final int f;
   private final int g;
   private final int h;
   private final int i;
   private final int j;

   protected ewx(ewo $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6) {
      super($$4 - $$1, $$5 - $$2, $$6 - $$3);
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
      this.h = $$4;
      this.i = $$5;
      this.j = $$6;
   }

   @Override
   public boolean b(int $$0, int $$1, int $$2) {
      return this.d.b(this.e + $$0, this.f + $$1, this.g + $$2);
   }

   @Override
   public void c(int $$0, int $$1, int $$2) {
      this.d.c(this.e + $$0, this.f + $$1, this.g + $$2);
   }

   @Override
   public int a(jf.a $$0) {
      return this.a($$0, this.d.a($$0));
   }

   @Override
   public int b(jf.a $$0) {
      return this.a($$0, this.d.b($$0));
   }

   private int a(jf.a $$0, int $$1) {
      int $$2 = $$0.a(this.e, this.f, this.g);
      int $$3 = $$0.a(this.h, this.i, this.j);
      return ayg.a($$1, $$2, $$3) - $$2;
   }
}
