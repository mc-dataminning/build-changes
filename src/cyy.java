public class cyy extends css implements csm {
   public static final dfy d = dfo.aU;
   protected static final float e = 6.0F;
   protected static final ehy f = csk.a(2.0, 0.0, 2.0, 14.0, 12.0, 14.0);
   private final dee a;

   protected cyy(dee $$0, dex.d $$1) {
      super($$1);
      this.a = $$0;
      this.k(this.C.b().a(d, Integer.valueOf(0)));
   }

   @Override
   public ehy a(dey $$0, coq $$1, gv $$2, ehk $$3) {
      return f;
   }

   @Override
   public void b(dey $$0, aki $$1, gv $$2, art $$3) {
      if ($$1.z($$2.c()) >= 9 && $$3.a(7) == 0) {
         this.a($$1, $$2, $$0, $$3);
      }
   }

   public void a(aki $$0, gv $$1, dey $$2, art $$3) {
      if ($$2.c(d) == 0) {
         $$0.a($$1, $$2.a(d), 4);
      } else {
         this.a.a($$0, $$0.k().g(), $$1, $$2, $$3);
      }
   }

   @Override
   public boolean a(cpn $$0, gv $$1, dey $$2) {
      return true;
   }

   @Override
   public boolean a(cpk $$0, art $$1, gv $$2, dey $$3) {
      return (double)$$0.z.i() < 0.45;
   }

   @Override
   public void a(aki $$0, art $$1, gv $$2, dey $$3) {
      this.a($$0, $$2, $$3, $$1);
   }

   @Override
   protected void a(dez.a<csk, dey> $$0) {
      $$0.a(d);
   }
}
