import it.unimi.dsi.fastutil.ints.IntList;

public class fgk {
   private static final int a = -1;
   private final jo<fgj> b = new jo<>(32);

   public static fgk a(fgg $$0) {
      fgk $$1 = new fgk();
      $$1.a(($$0x, $$1x) -> $$1x > 0 ? -1 : cxf.a($$0x, -6265536), cuq.py, cuq.pz, cuq.pA, cuq.pB, cuq.uJ);
      $$1.a(($$0x, $$1x) -> $$1x != 1 ? -1 : cxf.a($$0x, 0), cuq.or);
      $$1.a(($$0x, $$1x) -> dbu.a(0.5, 1.0), dez.iH, dez.iI);
      $$1.a(($$0x, $$1x) -> {
         if ($$1x != 1) {
            return -1;
         } else {
            cxg $$2x = $$0x.a(km.S);
            IntList $$3 = $$2x != null ? $$2x.b() : IntList.of();
            int $$4 = $$3.size();
            if ($$4 == 0) {
               return -7697782;
            } else if ($$4 == 1) {
               return ayh.b.e($$3.getInt(0));
            } else {
               int $$5 = 0;
               int $$6 = 0;
               int $$7 = 0;

               for (int $$8 = 0; $$8 < $$4; $$8++) {
                  int $$9 = $$3.getInt($$8);
                  $$5 += ayh.b.b($$9);
                  $$6 += ayh.b.c($$9);
                  $$7 += ayh.b.d($$9);
               }

               return ayh.b.a($$5 / $$4, $$6 / $$4, $$7 / $$4);
            }
         }
      }, cuq.uv);
      $$1.a(($$0x, $$1x) -> $$1x > 0 ? -1 : ayh.b.e($$0x.a(km.F, cwo.a).b()), cuq.sk, cuq.vo, cuq.vr, cuq.vq);

      for (cvu $$2 : cvu.h()) {
         $$1.a(($$1x, $$2x) -> ayh.b.e($$2.a($$2x)), $$2);
      }

      $$1.a(($$1x, $$2x) -> {
         dsa $$3 = ((csl)$$1x.g()).d().o();
         return $$0.a($$3, null, null, $$2x);
      }, dez.i, dez.bt, dez.bu, dez.ff, dez.aE, dez.aF, dez.aG, dez.aH, dez.aI, dez.aK, dez.fm);
      $$1.a(($$0x, $$1x) -> dbq.d(), dez.aL);
      $$1.a(($$0x, $$1x) -> $$1x == 0 ? -1 : ayh.b.e($$0x.a(km.z, cxn.c).a()), cuq.rU);
      return $$1;
   }

   public int a(cun $$0, int $$1) {
      fgj $$2 = this.b.a(lp.h.a($$0.g()));
      return $$2 == null ? -1 : $$2.getColor($$0, $$1);
   }

   public void a(fgj $$0, dbv... $$1) {
      for (dbv $$2 : $$1) {
         this.b.a($$0, cui.a($$2.r()));
      }
   }
}
