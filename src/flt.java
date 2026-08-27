public class flt extends flw {
   private final fgb a;
   private final foo b = foo.i(ftc.a);

   flt(fiz $$0, double $$1, double $$2, double $$3) {
      super($$0, $$1, $$2, $$3);
      this.a = new ffm(eqx.O().aP().a(fid.P));
      this.u = 0.0F;
      this.t = 30;
   }

   @Override
   public fma b() {
      return fma.e;
   }

   @Override
   public void a(elv $$0, eqi $$1, float $$2) {
      float $$3 = ((float)this.s + $$2) / (float)this.t;
      float $$4 = 0.05F + 0.5F * ary.a($$3 * (float) Math.PI);
      elr $$5 = new elr();
      $$5.a($$1.f());
      $$5.a(a.b.rotationDegrees(150.0F * $$3 - 60.0F));
      $$5.b(-1.0F, -1.0F, 1.0F);
      $$5.a(0.0F, -1.101F, 1.5F);
      fog.a $$6 = eqx.O().aO().b();
      elv $$7 = $$6.getBuffer(this.b);
      this.a.a($$5, $$7, 15728880, fyx.d, 1.0F, 1.0F, 1.0F, $$4);
      $$6.b();
   }

   public static class a implements flz<ja> {
      public flw a(ja $$0, fiz $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new flt($$1, $$2, $$3, $$4);
      }
   }
}
