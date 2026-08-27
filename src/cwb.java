public class cwb extends cpv implements cpp {
   public static final ddb d = dcr.aU;
   protected static final float e = 6.0F;
   protected static final efb f = cpn.a(2.0, 0.0, 2.0, 14.0, 12.0, 14.0);
   private final dbh a;

   protected cwb(dbh $$0, dca.d $$1) {
      super($$1);
      this.a = $$0;
      this.k(this.C.b().a(d, Integer.valueOf(0)));
   }

   @Override
   public efb a(dcb $$0, cls $$1, gu $$2, een $$3) {
      return f;
   }

   @Override
   public void b(dcb $$0, aif $$1, gu $$2, apf $$3) {
      if ($$1.z($$2.c()) >= 9 && $$3.a(7) == 0) {
         this.a($$1, $$2, $$0, $$3);
      }
   }

   public void a(aif $$0, gu $$1, dcb $$2, apf $$3) {
      if ($$2.c(d) == 0) {
         $$0.a($$1, $$2.a(d), 4);
      } else {
         this.a.a($$0, $$0.k().g(), $$1, $$2, $$3);
      }
   }

   @Override
   public boolean a(cmp $$0, gu $$1, dcb $$2, boolean $$3) {
      return true;
   }

   @Override
   public boolean a(cmm $$0, apf $$1, gu $$2, dcb $$3) {
      return (double)$$0.z.i() < 0.45;
   }

   @Override
   public void a(aif $$0, apf $$1, gu $$2, dcb $$3) {
      this.a($$0, $$2, $$3, $$1);
   }

   @Override
   protected void a(dcc.a<cpn, dcb> $$0) {
      $$0.a(d);
   }
}
