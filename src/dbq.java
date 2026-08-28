import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.Map;

public class dbq extends dbl {
   private static final Map<cxd, czu.a> c = Map.of(
      cxl.uX,
      czu.a.b,
      cxl.qa,
      czu.a.e,
      cxl.th,
      czu.a.c,
      cxl.vm,
      czu.a.d,
      cxl.vn,
      czu.a.d,
      cxl.vq,
      czu.a.d,
      cxl.vo,
      czu.a.d,
      cxl.vr,
      czu.a.d,
      cxl.vp,
      czu.a.d,
      cxl.vs,
      czu.a.d
   );
   private static final dbr d = dbr.a(cxl.pg);
   private static final dbr e = dbr.a(cxl.rX);
   private static final dbr f = dbr.a(cxl.qb);

   public dbq(dbi $$0) {
      super($$0);
   }

   public boolean a(dbj $$0, dgz $$1) {
      if ($$0.e() < 2) {
         return false;
      } else {
         boolean $$2 = false;
         boolean $$3 = false;
         boolean $$4 = false;
         boolean $$5 = false;
         boolean $$6 = false;

         for (int $$7 = 0; $$7 < $$0.a(); $$7++) {
            cxh $$8 = $$0.a($$7);
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
                  if (!($$8.h() instanceof cwf)) {
                     return false;
                  }

                  $$3 = true;
               }
            }
         }

         return $$2 && $$3;
      }
   }

   public cxh a(dbj $$0, jt.a $$1) {
      czu.a $$2 = czu.a.a;
      boolean $$3 = false;
      boolean $$4 = false;
      IntList $$5 = new IntArrayList();

      for (int $$6 = 0; $$6 < $$0.a(); $$6++) {
         cxh $$7 = $$0.a($$6);
         if (!$$7.f()) {
            czu.a $$8 = c.get($$7.h());
            if ($$8 != null) {
               $$2 = $$8;
            } else if (e.a($$7)) {
               $$3 = true;
            } else if (d.a($$7)) {
               $$4 = true;
            } else if ($$7.h() instanceof cwf $$9) {
               $$5.add($$9.b().f());
            }
         }
      }

      cxh $$10 = new cxh(cxl.vw);
      $$10.b(kv.ag, new czu($$2, $$5, IntList.of(), $$4, $$3));
      return $$10;
   }

   @Override
   public dcf<dbq> a() {
      return dcf.h;
   }
}
