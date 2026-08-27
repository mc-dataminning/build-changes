public class fok extends fon {
   private final fiq a;
   private final frh b = frh.i(fvv.a);

   fok(flo $$0, double $$1, double $$2, double $$3) {
      super($$0, $$1, $$2, $$3);
      this.a = new fib(eti.N().aO().a(fks.P));
      this.u = 0.0F;
      this.t = 30;
   }

   @Override
   public fos b() {
      return fos.e;
   }

   @Override
   public void a(eof $$0, est $$1, float $$2) {
      float $$3 = ((float)this.s + $$2) / (float)this.t;
      float $$4 = 0.05F + 0.5F * atq.a($$3 * (float) Math.PI);
      eob $$5 = new eob();
      $$5.a($$1.f());
      $$5.a(a.b.rotationDegrees(150.0F * $$3 - 60.0F));
      $$5.b(-1.0F, -1.0F, 1.0F);
      $$5.a(0.0F, -1.101F, 1.5F);
      fqz.a $$6 = eti.N().aN().c();
      eof $$7 = $$6.getBuffer(this.b);
      this.a.a($$5, $$7, 15728880, gbq.d, 1.0F, 1.0F, 1.0F, $$4);
      $$6.b();
   }

   public static class a implements foq<jz> {
      public fon a(jz $$0, flo $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new fok($$1, $$2, $$3, $$4);
      }
   }
}
