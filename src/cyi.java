import java.util.function.BiFunction;

public class cyi extends ctf implements csz {
   public static final int a = 1;
   public static final int b = 4;
   public static final dgf c = dgb.R;
   public static final dgl d = dgb.S;
   private static final BiFunction<hc, Integer, eii> e = ac.a(
      ($$0, $$1) -> {
         eii[] $$2 = new eii[]{
            csx.a(8.0, 0.0, 8.0, 16.0, 3.0, 16.0),
            csx.a(8.0, 0.0, 0.0, 16.0, 3.0, 8.0),
            csx.a(0.0, 0.0, 0.0, 8.0, 3.0, 8.0),
            csx.a(0.0, 0.0, 8.0, 8.0, 3.0, 16.0)
         };
         eii $$3 = eif.a();

         for (int $$4 = 0; $$4 < $$1; $$4++) {
            int $$5 = Math.floorMod($$4 - $$0.e(), 4);
            $$3 = eif.a($$3, $$2[$$5]);
         }

         return $$3.b();
      }
   );

   protected cyi(dfk.d $$0) {
      super($$0);
      this.k(this.C.b().a(c, hc.c).a(d, Integer.valueOf(1)));
   }

   @Override
   public dfl a(dfl $$0, czj $$1) {
      return $$0.a(c, $$1.a($$0.c(c)));
   }

   @Override
   public dfl a(dfl $$0, cxs $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   public boolean a(dfl $$0, clp $$1) {
      return !$$1.h() && $$1.n().a(this.k()) && $$0.c(d) < 4 ? true : super.a($$0, $$1);
   }

   @Override
   public eii a(dfl $$0, cpd $$1, gw $$2, ehu $$3) {
      return e.apply($$0.c(c), $$0.c(d));
   }

   @Override
   public dfl a(clp $$0) {
      dfl $$1 = $$0.q().a_($$0.a());
      return $$1.a(this) ? $$1.a(d, Integer.valueOf(Math.min(4, $$1.c(d) + 1))) : this.n().a(c, $$0.g().g());
   }

   @Override
   protected void a(dfm.a<csx, dfl> $$0) {
      $$0.a(c, d);
   }

   @Override
   public boolean a(cqa $$0, gw $$1, dfl $$2) {
      return true;
   }

   @Override
   public boolean a(cpx $$0, ase $$1, gw $$2, dfl $$3) {
      return true;
   }

   @Override
   public void a(aks $$0, ase $$1, gw $$2, dfl $$3) {
      int $$4 = $$3.c(d);
      if ($$4 < 4) {
         $$0.a($$2, $$3.a(d, Integer.valueOf($$4 + 1)), 2);
      } else {
         a($$0, $$2, new cjh(this));
      }
   }
}
