public class cza extends csu implements cso {
   public static final dga d = dfq.aU;
   protected static final float e = 6.0F;
   protected static final ehx f = csm.a(2.0, 0.0, 2.0, 14.0, 12.0, 14.0);
   private final deg a;

   protected cza(deg $$0, dez.d $$1) {
      super($$1);
      this.a = $$0;
      this.k(this.C.b().a(d, Integer.valueOf(0)));
   }

   @Override
   public ehx a(dfa $$0, cos $$1, gu $$2, ehj $$3) {
      return f;
   }

   @Override
   public void b(dfa $$0, akk $$1, gu $$2, aru $$3) {
      if ($$1.z($$2.c()) >= 9 && $$3.a(7) == 0) {
         this.a($$1, $$2, $$0, $$3);
      }
   }

   public void a(akk $$0, gu $$1, dfa $$2, aru $$3) {
      if ($$2.c(d) == 0) {
         $$0.a($$1, $$2.a(d), 4);
      } else {
         this.a.a($$0, $$0.k().g(), $$1, $$2, $$3);
      }
   }

   @Override
   public boolean a(cpp $$0, gu $$1, dfa $$2) {
      return true;
   }

   @Override
   public boolean a(cpm $$0, aru $$1, gu $$2, dfa $$3) {
      return (double)$$0.z.i() < 0.45;
   }

   @Override
   public void a(akk $$0, aru $$1, gu $$2, dfa $$3) {
      this.a($$0, $$2, $$3, $$1);
   }

   @Override
   protected void a(dfb.a<csm, dfa> $$0) {
      $$0.a(d);
   }
}
