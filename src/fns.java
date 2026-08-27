public class fns extends fnv {
   private final fhy a;
   private final fqp b = fqp.i(fvd.a);

   fns(fkw $$0, double $$1, double $$2, double $$3) {
      super($$0, $$1, $$2, $$3);
      this.a = new fhj(esr.N().aO().a(fka.P));
      this.u = 0.0F;
      this.t = 30;
   }

   @Override
   public fnz b() {
      return fnz.e;
   }

   @Override
   public void a(eno $$0, esc $$1, float $$2) {
      float $$3 = ((float)this.s + $$2) / (float)this.t;
      float $$4 = 0.05F + 0.5F * ati.a($$3 * (float) Math.PI);
      enk $$5 = new enk();
      $$5.a($$1.f());
      $$5.a(a.b.rotationDegrees(150.0F * $$3 - 60.0F));
      $$5.b(-1.0F, -1.0F, 1.0F);
      $$5.a(0.0F, -1.101F, 1.5F);
      fqh.a $$6 = esr.N().aN().c();
      eno $$7 = $$6.getBuffer(this.b);
      this.a.a($$5, $$7, 15728880, gay.d, 1.0F, 1.0F, 1.0F, $$4);
      $$6.b();
   }

   public static class a implements fny<jv> {
      public fnv a(jv $$0, fkw $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new fns($$1, $$2, $$3, $$4);
      }
   }
}
