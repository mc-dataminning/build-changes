public class ewz {
   private static final int a = -1;
   private final in<ewy> b = new in<>(32);

   public static ewz a(ewv $$0) {
      ewz $$1 = new ewz();
      $$1.a(($$0x, $$1x) -> $$1x > 0 ? -1 : ((clz)$$0x.d()).e_($$0x), cnj.px, cnj.py, cnj.pz, cnj.pA, cnj.uF);
      $$1.a(($$0x, $$1x) -> ctv.a(0.5, 1.0), cxa.iH, cxa.iI);
      $$1.a(($$0x, $$1x) -> {
         if ($$1x != 1) {
            return -1;
         } else {
            so $$2x = $$0x.b("Explosion");
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
      }, cnj.ur);
      $$1.a(($$0x, $$1x) -> $$1x > 0 ? -1 : cpg.c($$0x), cnj.sj, cnj.vk, cnj.vn);

      for (col $$2 : col.h()) {
         $$1.a(($$1x, $$2x) -> $$2.a($$2x), $$2);
      }

      $$1.a(($$1x, $$2x) -> {
         djp $$3 = ((cla)$$1x.d()).e().o();
         return $$0.a($$3, null, null, $$2x);
      }, cxa.i, cxa.bt, cxa.bu, cxa.ff, cxa.aE, cxa.aF, cxa.aG, cxa.aH, cxa.aI, cxa.aK, cxa.fm);
      $$1.a(($$0x, $$1x) -> ctr.d(), cxa.aL);
      $$1.a(($$0x, $$1x) -> $$1x == 0 ? cpg.c($$0x) : -1, cnj.vm);
      $$1.a(($$0x, $$1x) -> $$1x == 0 ? -1 : cnn.o($$0x), cnj.rT);
      return $$1;
   }

   public int a(cng $$0, int $$1) {
      ewy $$2 = this.b.a(kd.h.a($$0.d()));
      return $$2 == null ? -1 : $$2.getColor($$0, $$1);
   }

   public void a(ewy $$0, ctw... $$1) {
      for (ctw $$2 : $$1) {
         this.b.a($$0, cnb.a($$2.j()));
      }
   }
}
