public class czl extends ctf implements csz {
   public static final dgl d = dgb.aU;
   protected static final float e = 6.0F;
   protected static final eii f = csx.a(2.0, 0.0, 2.0, 14.0, 12.0, 14.0);
   private final der a;

   protected czl(der $$0, dfk.d $$1) {
      super($$1);
      this.a = $$0;
      this.k(this.C.b().a(d, Integer.valueOf(0)));
   }

   @Override
   public eii a(dfl $$0, cpd $$1, gw $$2, ehu $$3) {
      return f;
   }

   @Override
   public void b(dfl $$0, aks $$1, gw $$2, ase $$3) {
      if ($$1.z($$2.c()) >= 9 && $$3.a(7) == 0) {
         this.a($$1, $$2, $$0, $$3);
      }
   }

   public void a(aks $$0, gw $$1, dfl $$2, ase $$3) {
      if ($$2.c(d) == 0) {
         $$0.a($$1, $$2.a(d), 4);
      } else {
         this.a.a($$0, $$0.k().g(), $$1, $$2, $$3);
      }
   }

   @Override
   public boolean a(cqa $$0, gw $$1, dfl $$2) {
      return true;
   }

   @Override
   public boolean a(cpx $$0, ase $$1, gw $$2, dfl $$3) {
      return (double)$$0.z.i() < 0.45;
   }

   @Override
   public void a(aks $$0, ase $$1, gw $$2, dfl $$3) {
      this.a($$0, $$2, $$3, $$1);
   }

   @Override
   protected void a(dfm.a<csx, dfl> $$0) {
      $$0.a(d);
   }
}
