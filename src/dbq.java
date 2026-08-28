import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.Map;

public class dbq extends dbl {
   private static final Map<cxc, czv.a> c = Map.of(
      cxk.uV,
      czv.a.b,
      cxk.pY,
      czv.a.e,
      cxk.tf,
      czv.a.c,
      cxk.vk,
      czv.a.d,
      cxk.vl,
      czv.a.d,
      cxk.vo,
      czv.a.d,
      cxk.vm,
      czv.a.d,
      cxk.vp,
      czv.a.d,
      cxk.vn,
      czv.a.d,
      cxk.vq,
      czv.a.d
   );
   private static final dbr d = dbr.a(cxk.pe);
   private static final dbr e = dbr.a(cxk.rV);
   private static final dbr f = dbr.a(cxk.pZ);

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
            cxg $$8 = $$0.a($$7);
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
                  if (!($$8.h() instanceof cwe)) {
                     return false;
                  }

                  $$3 = true;
               }
            }
         }

         return $$2 && $$3;
      }
   }

   public cxg a(dbj $$0, js.a $$1) {
      czv.a $$2 = czv.a.a;
      boolean $$3 = false;
      boolean $$4 = false;
      IntList $$5 = new IntArrayList();

      for (int $$6 = 0; $$6 < $$0.a(); $$6++) {
         cxg $$7 = $$0.a($$6);
         if (!$$7.f()) {
            czv.a $$8 = c.get($$7.h());
            if ($$8 != null) {
               $$2 = $$8;
            } else if (e.a($$7)) {
               $$3 = true;
            } else if (d.a($$7)) {
               $$4 = true;
            } else if ($$7.h() instanceof cwe $$9) {
               $$5.add($$9.b().f());
            }
         }
      }

      cxg $$10 = new cxg(cxk.vu);
      $$10.b(ku.ae, new czv($$2, $$5, IntList.of(), $$4, $$3));
      return $$10;
   }

   @Override
   public dcf<dbq> a() {
      return dcf.h;
   }
}
