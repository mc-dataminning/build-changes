import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.Map;

public class day extends dat {
   private static final Map<cwk, czd.a> c = Map.of(
      cws.uV,
      czd.a.b,
      cws.pY,
      czd.a.e,
      cws.tf,
      czd.a.c,
      cws.vk,
      czd.a.d,
      cws.vl,
      czd.a.d,
      cws.vo,
      czd.a.d,
      cws.vm,
      czd.a.d,
      cws.vp,
      czd.a.d,
      cws.vn,
      czd.a.d,
      cws.vq,
      czd.a.d
   );
   private static final daz d = daz.a(cws.pe);
   private static final daz e = daz.a(cws.rV);
   private static final daz f = daz.a(cws.pZ);

   public day(daq $$0) {
      super($$0);
   }

   public boolean a(dar $$0, dgh $$1) {
      if ($$0.e() < 2) {
         return false;
      } else {
         boolean $$2 = false;
         boolean $$3 = false;
         boolean $$4 = false;
         boolean $$5 = false;
         boolean $$6 = false;

         for (int $$7 = 0; $$7 < $$0.a(); $$7++) {
            cwo $$8 = $$0.a($$7);
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
                  if (!($$8.h() instanceof cvm)) {
                     return false;
                  }

                  $$3 = true;
               }
            }
         }

         return $$2 && $$3;
      }
   }

   public cwo a(dar $$0, jt.a $$1) {
      czd.a $$2 = czd.a.a;
      boolean $$3 = false;
      boolean $$4 = false;
      IntList $$5 = new IntArrayList();

      for (int $$6 = 0; $$6 < $$0.a(); $$6++) {
         cwo $$7 = $$0.a($$6);
         if (!$$7.f()) {
            czd.a $$8 = c.get($$7.h());
            if ($$8 != null) {
               $$2 = $$8;
            } else if (e.a($$7)) {
               $$3 = true;
            } else if (d.a($$7)) {
               $$4 = true;
            } else if ($$7.h() instanceof cvm $$9) {
               $$5.add($$9.b().f());
            }
         }
      }

      cwo $$10 = new cwo(cws.vu);
      $$10.b(kv.ae, new czd($$2, $$5, IntList.of(), $$4, $$3));
      return $$10;
   }

   @Override
   public dbn<day> a() {
      return dbn.h;
   }
}
