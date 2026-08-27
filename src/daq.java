public class daq extends csu implements cso {
   private static final float c = 0.003F;
   public static final int a = 3;
   public static final dga b = dfq.as;
   private static final ehx d = csm.a(3.0, 0.0, 3.0, 13.0, 8.0, 13.0);
   private static final ehx e = csm.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);

   public daq(dez.d $$0) {
      super($$0);
      this.k(this.C.b().a(b, Integer.valueOf(0)));
   }

   @Override
   public ciy a(cos $$0, gu $$1, dfa $$2) {
      return new ciy(cjb.vv);
   }

   @Override
   public ehx a(dfa $$0, cos $$1, gu $$2, ehj $$3) {
      if ($$0.c(b) == 0) {
         return d;
      } else {
         return $$0.c(b) < 3 ? e : super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public boolean e_(dfa $$0) {
      return $$0.c(b) < 3;
   }

   @Override
   public void b(dfa $$0, akk $$1, gu $$2, aru $$3) {
      int $$4 = $$0.c(b);
      if ($$4 < 3 && $$3.a(5) == 0 && $$1.b($$2.c(), 0) >= 9) {
         dfa $$5 = $$0.a(b, Integer.valueOf($$4 + 1));
         $$1.a($$2, $$5, 2);
         $$1.a(djk.c, $$2, djk.a.a($$5));
      }
   }

   @Override
   public void a(dfa $$0, cpm $$1, gu $$2, bii $$3) {
      if ($$3 instanceof biy && $$3.ag() != bim.N && $$3.ag() != bim.h) {
         $$3.a($$0, new ehe(0.8F, 0.75, 0.8F));
         if (!$$1.B && $$0.c(b) > 0 && ($$3.ac != $$3.dp() || $$3.ae != $$3.dv())) {
            double $$4 = Math.abs($$3.dp() - $$3.ac);
            double $$5 = Math.abs($$3.dv() - $$3.ae);
            if ($$4 >= 0.003F || $$5 >= 0.003F) {
               $$3.a($$1.ag().s(), 1.0F);
            }
         }
      }
   }

   @Override
   public bgq a(dfa $$0, cpm $$1, gu $$2, cbn $$3, bgp $$4, eha $$5) {
      int $$6 = $$0.c(b);
      boolean $$7 = $$6 == 3;
      if (!$$7 && $$3.b($$4).a(cjb.qK)) {
         return bgq.d;
      } else if ($$6 > 1) {
         int $$8 = 1 + $$1.z.a(2);
         a($$1, $$2, new ciy(cjb.vv, $$8 + ($$7 ? 1 : 0)));
         $$1.a(null, $$2, aow.xA, aox.e, 1.0F, 0.8F + $$1.z.i() * 0.4F);
         dfa $$9 = $$0.a(b, Integer.valueOf(1));
         $$1.a($$2, $$9, 2);
         $$1.a(djk.c, $$2, djk.a.a($$3, $$9));
         return bgq.a($$1.B);
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   protected void a(dfb.a<csm, dfa> $$0) {
      $$0.a(b);
   }

   @Override
   public boolean a(cpp $$0, gu $$1, dfa $$2) {
      return $$2.c(b) < 3;
   }

   @Override
   public boolean a(cpm $$0, aru $$1, gu $$2, dfa $$3) {
      return true;
   }

   @Override
   public void a(akk $$0, aru $$1, gu $$2, dfa $$3) {
      int $$4 = Math.min(3, $$3.c(b) + 1);
      $$0.a($$2, $$3.a(b, Integer.valueOf($$4)), 2);
   }
}
