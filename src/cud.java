import javax.annotation.Nullable;

public class cud extends cwq implements csz {
   public static final int a = 2;
   public static final dgl b = dgb.ar;
   protected static final int c = 4;
   protected static final int d = 5;
   protected static final int e = 2;
   protected static final int f = 6;
   protected static final int g = 7;
   protected static final int h = 3;
   protected static final int i = 8;
   protected static final int j = 9;
   protected static final int k = 4;
   protected static final eii[] l = new eii[]{
      csx.a(11.0, 7.0, 6.0, 15.0, 12.0, 10.0), csx.a(9.0, 5.0, 5.0, 15.0, 12.0, 11.0), csx.a(7.0, 3.0, 4.0, 15.0, 12.0, 12.0)
   };
   protected static final eii[] m = new eii[]{
      csx.a(1.0, 7.0, 6.0, 5.0, 12.0, 10.0), csx.a(1.0, 5.0, 5.0, 7.0, 12.0, 11.0), csx.a(1.0, 3.0, 4.0, 9.0, 12.0, 12.0)
   };
   protected static final eii[] n = new eii[]{
      csx.a(6.0, 7.0, 1.0, 10.0, 12.0, 5.0), csx.a(5.0, 5.0, 1.0, 11.0, 12.0, 7.0), csx.a(4.0, 3.0, 1.0, 12.0, 12.0, 9.0)
   };
   protected static final eii[] D = new eii[]{
      csx.a(6.0, 7.0, 11.0, 10.0, 12.0, 15.0), csx.a(5.0, 5.0, 9.0, 11.0, 12.0, 15.0), csx.a(4.0, 3.0, 7.0, 12.0, 12.0, 15.0)
   };

   public cud(dfk.d $$0) {
      super($$0);
      this.k(this.C.b().a(aC, hc.c).a(b, Integer.valueOf(0)));
   }

   @Override
   public boolean e_(dfl $$0) {
      return $$0.c(b) < 2;
   }

   @Override
   public void b(dfl $$0, aks $$1, gw $$2, ase $$3) {
      if ($$1.z.a(5) == 0) {
         int $$4 = $$0.c(b);
         if ($$4 < 2) {
            $$1.a($$2, $$0.a(b, Integer.valueOf($$4 + 1)), 2);
         }
      }
   }

   @Override
   public boolean a(dfl $$0, cqa $$1, gw $$2) {
      dfl $$3 = $$1.a_($$2.a($$0.c(aC)));
      return $$3.a(apu.z);
   }

   @Override
   public eii a(dfl $$0, cpd $$1, gw $$2, ehu $$3) {
      int $$4 = $$0.c(b);
      switch ((hc)$$0.c(aC)) {
         case d:
            return D[$$4];
         case c:
         default:
            return n[$$4];
         case e:
            return m[$$4];
         case f:
            return l[$$4];
      }
   }

   @Nullable
   @Override
   public dfl a(clp $$0) {
      dfl $$1 = this.n();
      cqa $$2 = $$0.q();
      gw $$3 = $$0.a();

      for (hc $$4 : $$0.f()) {
         if ($$4.o().d()) {
            $$1 = $$1.a(aC, $$4);
            if ($$1.a($$2, $$3)) {
               return $$1;
            }
         }
      }

      return null;
   }

   @Override
   public dfl a(dfl $$0, hc $$1, dfl $$2, cpy $$3, gw $$4, gw $$5) {
      return $$1 == $$0.c(aC) && !$$0.a($$3, $$4) ? csy.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(cqa $$0, gw $$1, dfl $$2) {
      return $$2.c(b) < 2;
   }

   @Override
   public boolean a(cpx $$0, ase $$1, gw $$2, dfl $$3) {
      return true;
   }

   @Override
   public void a(aks $$0, ase $$1, gw $$2, dfl $$3) {
      $$0.a($$2, $$3.a(b, Integer.valueOf($$3.c(b) + 1)), 2);
   }

   @Override
   protected void a(dfm.a<csx, dfl> $$0) {
      $$0.a(aC, b);
   }

   @Override
   public boolean a(dfl $$0, cpd $$1, gw $$2, ebe $$3) {
      return false;
   }
}
