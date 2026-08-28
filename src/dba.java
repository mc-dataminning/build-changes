import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.Map;

public class dba extends dav {
   private static final Map<cwm, czf.a> c = Map.of(
      cwu.uV,
      czf.a.b,
      cwu.pY,
      czf.a.e,
      cwu.tf,
      czf.a.c,
      cwu.vk,
      czf.a.d,
      cwu.vl,
      czf.a.d,
      cwu.vo,
      czf.a.d,
      cwu.vm,
      czf.a.d,
      cwu.vp,
      czf.a.d,
      cwu.vn,
      czf.a.d,
      cwu.vq,
      czf.a.d
   );
   private static final dbb d = dbb.a(cwu.pe);
   private static final dbb e = dbb.a(cwu.rV);
   private static final dbb f = dbb.a(cwu.pZ);

   public dba(das $$0) {
      super($$0);
   }

   public boolean a(dat $$0, dgj $$1) {
      if ($$0.e() < 2) {
         return false;
      } else {
         boolean $$2 = false;
         boolean $$3 = false;
         boolean $$4 = false;
         boolean $$5 = false;
         boolean $$6 = false;

         for (int $$7 = 0; $$7 < $$0.a(); $$7++) {
            cwq $$8 = $$0.a($$7);
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
                  if (!($$8.h() instanceof cvo)) {
                     return false;
                  }

                  $$3 = true;
               }
            }
         }

         return $$2 && $$3;
      }
   }

   public cwq a(dat $$0, jt.a $$1) {
      czf.a $$2 = czf.a.a;
      boolean $$3 = false;
      boolean $$4 = false;
      IntList $$5 = new IntArrayList();

      for (int $$6 = 0; $$6 < $$0.a(); $$6++) {
         cwq $$7 = $$0.a($$6);
         if (!$$7.f()) {
            czf.a $$8 = c.get($$7.h());
            if ($$8 != null) {
               $$2 = $$8;
            } else if (e.a($$7)) {
               $$3 = true;
            } else if (d.a($$7)) {
               $$4 = true;
            } else if ($$7.h() instanceof cvo $$9) {
               $$5.add($$9.b().f());
            }
         }
      }

      cwq $$10 = new cwq(cwu.vu);
      $$10.b(kv.ae, new czf($$2, $$5, IntList.of(), $$4, $$3));
      return $$10;
   }

   @Override
   public dbp<dba> a() {
      return dbp.h;
   }
}
