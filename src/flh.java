public class flh extends flk {
   private final ffp a;
   private final foc b = foc.i(fsq.a);

   flh(fin $$0, double $$1, double $$2, double $$3) {
      super($$0, $$1, $$2, $$3);
      this.a = new ffa(eql.O().aP().a(fhr.P));
      this.u = 0.0F;
      this.t = 30;
   }

   @Override
   public flo b() {
      return flo.e;
   }

   @Override
   public void a(elj $$0, epw $$1, float $$2) {
      float $$3 = ((float)this.s + $$2) / (float)this.t;
      float $$4 = 0.05F + 0.5F * arp.a($$3 * (float) Math.PI);
      elf $$5 = new elf();
      $$5.a($$1.f());
      $$5.a(a.b.rotationDegrees(150.0F * $$3 - 60.0F));
      $$5.b(-1.0F, -1.0F, 1.0F);
      $$5.a(0.0F, -1.101F, 1.5F);
      fnu.a $$6 = eql.O().aO().b();
      elj $$7 = $$6.getBuffer(this.b);
      this.a.a($$5, $$7, 15728880, fyl.d, 1.0F, 1.0F, 1.0F, $$4);
      $$6.b();
   }

   public static class a implements fln<iy> {
      public flk a(iy $$0, fin $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new flh($$1, $$2, $$3, $$4);
      }
   }
}
