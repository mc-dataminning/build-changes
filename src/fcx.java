import it.unimi.dsi.fastutil.ints.IntList;

public class fcx {
   private static final int a = -1;
   private final ir<fcw> b = new ir<>(32);

   public static fcx a(fct $$0) {
      fcx $$1 = new fcx();
      $$1.a(($$0x, $$1x) -> $$1x > 0 ? -1 : ctw.a($$0x, -6265536), crm.px, crm.py, crm.pz, crm.pA, crm.uH);
      $$1.a(($$0x, $$1x) -> $$1x != 1 ? -1 : ctw.a($$0x, 0), crm.oq);
      $$1.a(($$0x, $$1x) -> cyv.a(0.5, 1.0), dca.iH, dca.iI);
      $$1.a(($$0x, $$1x) -> {
         if ($$1x != 1) {
            return -1;
         } else {
            ctx $$2x = $$0x.a(jp.J);
            IntList $$3 = $$2x != null ? $$2x.b() : IntList.of();
            int $$4 = $$3.size();
            if ($$4 == 0) {
               return -7697782;
            } else if ($$4 == 1) {
               return awu.b.e($$3.getInt(0));
            } else {
               int $$5 = 0;
               int $$6 = 0;
               int $$7 = 0;

               for (int $$8 = 0; $$8 < $$4; $$8++) {
                  int $$9 = $$3.getInt($$8);
                  $$5 += awu.b.b($$9);
                  $$6 += awu.b.c($$9);
                  $$7 += awu.b.d($$9);
               }

               return awu.b.a($$5 / $$4, $$6 / $$4, $$7 / $$4);
            }
         }
      }, crm.ut);
      $$1.a(($$0x, $$1x) -> $$1x > 0 ? -1 : awu.b.e($$0x.a(jp.x, cth.a).b()), crm.sj, crm.vm, crm.vp, crm.vo);

      for (csn $$2 : csn.h()) {
         $$1.a(($$1x, $$2x) -> awu.b.e($$2.a($$2x)), $$2);
      }

      $$1.a(($$1x, $$2x) -> {
         doz $$3 = ((cph)$$1x.f()).d().n();
         return $$0.a($$3, null, null, $$2x);
      }, dca.i, dca.bt, dca.bu, dca.ff, dca.aE, dca.aF, dca.aG, dca.aH, dca.aI, dca.aK, dca.fm);
      $$1.a(($$0x, $$1x) -> cyr.d(), dca.aL);
      $$1.a(($$0x, $$1x) -> $$1x == 0 ? -1 : awu.b.e($$0x.a(jp.r, cue.c).a()), crm.rT);
      return $$1;
   }

   public int a(crj $$0, int $$1) {
      fcw $$2 = this.b.a(kr.h.a($$0.f()));
      return $$2 == null ? -1 : $$2.getColor($$0, $$1);
   }

   public void a(fcw $$0, cyw... $$1) {
      for (cyw $$2 : $$1) {
         this.b.a($$0, cre.a($$2.p()));
      }
   }
}
