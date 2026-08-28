import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.Map;

public class daz extends dau {
   private static final Map<cwl, cze.a> c = Map.of(
      cwt.uV,
      cze.a.b,
      cwt.pY,
      cze.a.e,
      cwt.tf,
      cze.a.c,
      cwt.vk,
      cze.a.d,
      cwt.vl,
      cze.a.d,
      cwt.vo,
      cze.a.d,
      cwt.vm,
      cze.a.d,
      cwt.vp,
      cze.a.d,
      cwt.vn,
      cze.a.d,
      cwt.vq,
      cze.a.d
   );
   private static final dba d = dba.a(cwt.pe);
   private static final dba e = dba.a(cwt.rV);
   private static final dba f = dba.a(cwt.pZ);

   public daz(dar $$0) {
      super($$0);
   }

   public boolean a(das $$0, dgi $$1) {
      if ($$0.e() < 2) {
         return false;
      } else {
         boolean $$2 = false;
         boolean $$3 = false;
         boolean $$4 = false;
         boolean $$5 = false;
         boolean $$6 = false;

         for (int $$7 = 0; $$7 < $$0.a(); $$7++) {
            cwp $$8 = $$0.a($$7);
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
                  if (!($$8.h() instanceof cvn)) {
                     return false;
                  }

                  $$3 = true;
               }
            }
         }

         return $$2 && $$3;
      }
   }

   public cwp a(das $$0, jt.a $$1) {
      cze.a $$2 = cze.a.a;
      boolean $$3 = false;
      boolean $$4 = false;
      IntList $$5 = new IntArrayList();

      for (int $$6 = 0; $$6 < $$0.a(); $$6++) {
         cwp $$7 = $$0.a($$6);
         if (!$$7.f()) {
            cze.a $$8 = c.get($$7.h());
            if ($$8 != null) {
               $$2 = $$8;
            } else if (e.a($$7)) {
               $$3 = true;
            } else if (d.a($$7)) {
               $$4 = true;
            } else if ($$7.h() instanceof cvn $$9) {
               $$5.add($$9.b().f());
            }
         }
      }

      cwp $$10 = new cwp(cwt.vu);
      $$10.b(kv.ae, new cze($$2, $$5, IntList.of(), $$4, $$3));
      return $$10;
   }

   @Override
   public dbo<daz> a() {
      return dbo.h;
   }
}
