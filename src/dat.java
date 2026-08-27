import java.util.function.Supplier;

public class dat extends ctf implements csz {
   public static final int a = 7;
   public static final dgl b = dgb.av;
   protected static final float c = 1.0F;
   protected static final eii[] d = new eii[]{
      csx.a(7.0, 0.0, 7.0, 9.0, 2.0, 9.0),
      csx.a(7.0, 0.0, 7.0, 9.0, 4.0, 9.0),
      csx.a(7.0, 0.0, 7.0, 9.0, 6.0, 9.0),
      csx.a(7.0, 0.0, 7.0, 9.0, 8.0, 9.0),
      csx.a(7.0, 0.0, 7.0, 9.0, 10.0, 9.0),
      csx.a(7.0, 0.0, 7.0, 9.0, 12.0, 9.0),
      csx.a(7.0, 0.0, 7.0, 9.0, 14.0, 9.0),
      csx.a(7.0, 0.0, 7.0, 9.0, 16.0, 9.0)
   };
   private final dau e;
   private final Supplier<cjc> f;

   protected dat(dau $$0, Supplier<cjc> $$1, dfk.d $$2) {
      super($$2);
      this.e = $$0;
      this.f = $$1;
      this.k(this.C.b().a(b, Integer.valueOf(0)));
   }

   @Override
   public eii a(dfl $$0, cpd $$1, gw $$2, ehu $$3) {
      return d[$$0.c(b)];
   }

   @Override
   protected boolean d(dfl $$0, cpd $$1, gw $$2) {
      return $$0.a(csy.cC);
   }

   @Override
   public void b(dfl $$0, aks $$1, gw $$2, ase $$3) {
      if ($$1.b($$2, 0) >= 9) {
         float $$4 = cuo.a(this, $$1, $$2);
         if ($$3.a((int)(25.0F / $$4) + 1) == 0) {
            int $$5 = $$0.c(b);
            if ($$5 < 7) {
               $$0 = $$0.a(b, Integer.valueOf($$5 + 1));
               $$1.a($$2, $$0, 2);
            } else {
               hc $$6 = hc.c.a.a($$3);
               gw $$7 = $$2.a($$6);
               dfl $$8 = $$1.a_($$7.d());
               if ($$1.a_($$7).i() && ($$8.a(csy.cC) || $$8.a(apu.af))) {
                  $$1.b($$7, this.e.n());
                  $$1.b($$2, this.e.b().n().a(cwq.aC, $$6));
               }
            }
         }
      }
   }

   @Override
   public cjh a(cpd $$0, gw $$1, dfl $$2) {
      return new cjh(this.f.get());
   }

   @Override
   public boolean a(cqa $$0, gw $$1, dfl $$2) {
      return $$2.c(b) != 7;
   }

   @Override
   public boolean a(cpx $$0, ase $$1, gw $$2, dfl $$3) {
      return true;
   }

   @Override
   public void a(aks $$0, ase $$1, gw $$2, dfl $$3) {
      int $$4 = Math.min(7, $$3.c(b) + ary.a($$0.z, 2, 5));
      dfl $$5 = $$3.a(b, Integer.valueOf($$4));
      $$0.a($$2, $$5, 2);
      if ($$4 == 7) {
         $$5.b($$0, $$2, $$0.z);
      }
   }

   @Override
   protected void a(dfm.a<csx, dfl> $$0) {
      $$0.a(b);
   }

   public dau a() {
      return this.e;
   }
}
