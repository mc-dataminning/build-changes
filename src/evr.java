public class evr {
   private static final int a = -1;
   private final il<evq> b = new il<>(32);

   public static evr a(evn $$0) {
      evr $$1 = new evr();
      $$1.a(($$0x, $$1x) -> $$1x > 0 ? -1 : ((ckz)$$0x.d()).e_($$0x), cmk.pv, cmk.pw, cmk.px, cmk.py, cmk.uC);
      $$1.a(($$0x, $$1x) -> csw.a(0.5, 1.0), cwb.iH, cwb.iI);
      $$1.a(($$0x, $$1x) -> {
         if ($$1x != 1) {
            return -1;
         } else {
            sj $$2x = $$0x.b("Explosion");
            int[] $$3 = $$2x != null && $$2x.b("Colors", 11) ? $$2x.n("Colors") : null;
            if ($$3 != null && $$3.length != 0) {
               if ($$3.length == 1) {
                  return $$3[0];
               } else {
                  int $$4 = 0;
                  int $$5 = 0;
                  int $$6 = 0;

                  for (int $$7 : $$3) {
                     $$4 += ($$7 & 0xFF0000) >> 16;
                     $$5 += ($$7 & 0xFF00) >> 8;
                     $$6 += ($$7 & 0xFF) >> 0;
                  }

                  $$4 /= $$3.length;
                  $$5 /= $$3.length;
                  $$6 /= $$3.length;
                  return $$4 << 16 | $$5 << 8 | $$6;
               }
            } else {
               return 9079434;
            }
         }
      }, cmk.uo);
      $$1.a(($$0x, $$1x) -> $$1x > 0 ? -1 : cog.c($$0x), cmk.sh, cmk.vh, cmk.vk);

      for (cnm $$2 : cnm.h()) {
         $$1.a(($$1x, $$2x) -> $$2.a($$2x), $$2);
      }

      $$1.a(($$1x, $$2x) -> {
         dip $$3 = ((cka)$$1x.d()).e().o();
         return $$0.a($$3, null, null, $$2x);
      }, cwb.i, cwb.bt, cwb.bu, cwb.ff, cwb.aE, cwb.aF, cwb.aG, cwb.aH, cwb.aI, cwb.aK, cwb.fm);
      $$1.a(($$0x, $$1x) -> css.d(), cwb.aL);
      $$1.a(($$0x, $$1x) -> $$1x == 0 ? cog.c($$0x) : -1, cmk.vj);
      $$1.a(($$0x, $$1x) -> $$1x == 0 ? -1 : cmo.o($$0x), cmk.rR);
      return $$1;
   }

   public int a(cmh $$0, int $$1) {
      evq $$2 = this.b.a(kb.h.a($$0.d()));
      return $$2 == null ? -1 : $$2.getColor($$0, $$1);
   }

   public void a(evq $$0, csx... $$1) {
      for (csx $$2 : $$1) {
         this.b.a($$0, cmc.a($$2.k()));
      }
   }
}
