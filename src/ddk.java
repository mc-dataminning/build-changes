import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.Map;

public class ddk extends ddf {
   private static final Map<cyu, dbm.a> c = Map.of(
      czc.vb,
      dbm.a.b,
      czc.qe,
      dbm.a.e,
      czc.tl,
      dbm.a.c,
      czc.vq,
      dbm.a.d,
      czc.vr,
      dbm.a.d,
      czc.vu,
      dbm.a.d,
      czc.vs,
      dbm.a.d,
      czc.vv,
      dbm.a.d,
      czc.vt,
      dbm.a.d,
      czc.vw,
      dbm.a.d
   );
   private static final ddl d = ddl.a(czc.pk);
   private static final ddl e = ddl.a(czc.sb);
   private static final ddl f = ddl.a(czc.qf);

   public ddk(ddc $$0) {
      super($$0);
   }

   public boolean a(ddd $$0, div $$1) {
      if ($$0.e() < 2) {
         return false;
      } else {
         boolean $$2 = false;
         boolean $$3 = false;
         boolean $$4 = false;
         boolean $$5 = false;
         boolean $$6 = false;

         for (int $$7 = 0; $$7 < $$0.a(); $$7++) {
            cyy $$8 = $$0.a($$7);
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
                  if (!($$8.h() instanceof cxx)) {
                     return false;
                  }

                  $$3 = true;
               }
            }
         }

         return $$2 && $$3;
      }
   }

   public cyy a(ddd $$0, jg.a $$1) {
      dbm.a $$2 = dbm.a.a;
      boolean $$3 = false;
      boolean $$4 = false;
      IntList $$5 = new IntArrayList();

      for (int $$6 = 0; $$6 < $$0.a(); $$6++) {
         cyy $$7 = $$0.a($$6);
         if (!$$7.f()) {
            dbm.a $$8 = c.get($$7.h());
            if ($$8 != null) {
               $$2 = $$8;
            } else if (e.a($$7)) {
               $$3 = true;
            } else if (d.a($$7)) {
               $$4 = true;
            } else if ($$7.h() instanceof cxx $$9) {
               $$5.add($$9.a().f());
            }
         }
      }

      cyy $$10 = new cyy(czc.vA);
      $$10.b(kj.ai, new dbm($$2, $$5, IntList.of(), $$4, $$3));
      return $$10;
   }

   @Override
   public ddz<ddk> a() {
      return ddz.h;
   }
}
