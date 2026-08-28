import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.Map;

public class dax extends das {
   private static final Map<cwj, czc.a> c = Map.of(
      cwr.uV,
      czc.a.b,
      cwr.pY,
      czc.a.e,
      cwr.tf,
      czc.a.c,
      cwr.vk,
      czc.a.d,
      cwr.vl,
      czc.a.d,
      cwr.vo,
      czc.a.d,
      cwr.vm,
      czc.a.d,
      cwr.vp,
      czc.a.d,
      cwr.vn,
      czc.a.d,
      cwr.vq,
      czc.a.d
   );
   private static final day d = day.a(cwr.pe);
   private static final day e = day.a(cwr.rV);
   private static final day f = day.a(cwr.pZ);

   public dax(dap $$0) {
      super($$0);
   }

   public boolean a(daq $$0, dgg $$1) {
      if ($$0.e() < 2) {
         return false;
      } else {
         boolean $$2 = false;
         boolean $$3 = false;
         boolean $$4 = false;
         boolean $$5 = false;
         boolean $$6 = false;

         for (int $$7 = 0; $$7 < $$0.a(); $$7++) {
            cwn $$8 = $$0.a($$7);
            if (!$$8.f()) {
               if (c.containsKey($$8.h())) {
                  if ($$4) {
                     return false;
                  }

                  $$4 = true;
               } else if (e.a($$8)) {
                  if ($$6) {
                     return false;
                  }

                  $$6 = true;
               } else if (d.a($$8)) {
                  if ($$5) {
                     return false;
                  }

                  $$5 = true;
               } else if (f.a($$8)) {
                  if ($$2) {
                     return false;
                  }

                  $$2 = true;
               } else {
                  if (!($$8.h() instanceof cvl)) {
                     return false;
                  }

                  $$3 = true;
               }
            }
         }

         return $$2 && $$3;
      }
   }

   public cwn a(daq $$0, jt.a $$1) {
      czc.a $$2 = czc.a.a;
      boolean $$3 = false;
      boolean $$4 = false;
      IntList $$5 = new IntArrayList();

      for (int $$6 = 0; $$6 < $$0.a(); $$6++) {
         cwn $$7 = $$0.a($$6);
         if (!$$7.f()) {
            czc.a $$8 = c.get($$7.h());
            if ($$8 != null) {
               $$2 = $$8;
            } else if (e.a($$7)) {
               $$3 = true;
            } else if (d.a($$7)) {
               $$4 = true;
            } else if ($$7.h() instanceof cvl $$9) {
               $$5.add($$9.b().f());
            }
         }
      }

      cwn $$10 = new cwn(cwr.vu);
      $$10.b(kv.ae, new czc($$2, $$5, IntList.of(), $$4, $$3));
      return $$10;
   }

   @Override
   public dbm<dax> a() {
      return dbm.h;
   }
}
