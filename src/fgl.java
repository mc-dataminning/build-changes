import it.unimi.dsi.fastutil.ints.IntList;

public class fgl {
   private static final int a = -1;
   private final jo<fgk> b = new jo<>(32);

   public static fgl a(fgh $$0) {
      fgl $$1 = new fgl();
      $$1.a(($$0x, $$1x) -> $$1x > 0 ? -1 : cxg.a($$0x, -6265536), cur.py, cur.pz, cur.pA, cur.pB, cur.uJ);
      $$1.a(($$0x, $$1x) -> $$1x != 1 ? -1 : cxg.a($$0x, 0), cur.or);
      $$1.a(($$0x, $$1x) -> dbv.a(0.5, 1.0), dfa.iH, dfa.iI);
      $$1.a(($$0x, $$1x) -> {
         if ($$1x != 1) {
            return -1;
         } else {
            cxh $$2x = $$0x.a(km.T);
            IntList $$3 = $$2x != null ? $$2x.b() : IntList.of();
            int $$4 = $$3.size();
            if ($$4 == 0) {
               return -7697782;
            } else if ($$4 == 1) {
               return ayi.b.e($$3.getInt(0));
            } else {
               int $$5 = 0;
               int $$6 = 0;
               int $$7 = 0;

               for (int $$8 = 0; $$8 < $$4; $$8++) {
                  int $$9 = $$3.getInt($$8);
                  $$5 += ayi.b.b($$9);
                  $$6 += ayi.b.c($$9);
                  $$7 += ayi.b.d($$9);
               }

               return ayi.b.a($$5 / $$4, $$6 / $$4, $$7 / $$4);
            }
         }
      }, cur.uv);
      $$1.a(($$0x, $$1x) -> $$1x > 0 ? -1 : ayi.b.e($$0x.a(km.G, cwp.a).b()), cur.sk, cur.vo, cur.vr, cur.vq);

      for (cvv $$2 : cvv.h()) {
         $$1.a(($$1x, $$2x) -> ayi.b.e($$2.a($$2x)), $$2);
      }

      $$1.a(($$1x, $$2x) -> {
         dsb $$3 = ((csm)$$1x.g()).d().o();
         return $$0.a($$3, null, null, $$2x);
      }, dfa.i, dfa.bt, dfa.bu, dfa.ff, dfa.aE, dfa.aF, dfa.aG, dfa.aH, dfa.aI, dfa.aK, dfa.fm);
      $$1.a(($$0x, $$1x) -> dbr.d(), dfa.aL);
      $$1.a(($$0x, $$1x) -> $$1x == 0 ? -1 : ayi.b.e($$0x.a(km.A, cxo.c).a()), cur.rU);
      return $$1;
   }

   public int a(cuo $$0, int $$1) {
      fgk $$2 = this.b.a(lp.h.a($$0.g()));
      return $$2 == null ? -1 : $$2.getColor($$0, $$1);
   }

   public void a(fgk $$0, dbw... $$1) {
      for (dbw $$2 : $$1) {
         this.b.a($$0, cuj.a($$2.r()));
      }
   }
}
