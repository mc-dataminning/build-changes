import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.Map;

public class dem extends deh {
   private static final Map<czw, dco.a> d = Map.of(
      dae.vg,
      dco.a.b,
      dae.qh,
      dco.a.e,
      dae.tq,
      dco.a.c,
      dae.vv,
      dco.a.d,
      dae.vw,
      dco.a.d,
      dae.vz,
      dco.a.d,
      dae.vx,
      dco.a.d,
      dae.vA,
      dco.a.d,
      dae.vy,
      dco.a.d,
      dae.vB,
      dco.a.d
   );
   private static final den e = den.a(dae.pn);
   private static final den f = den.a(dae.sg);
   private static final den g = den.a(dae.qi);

   public dem(dee $$0) {
      super($$0);
   }

   public boolean a(def $$0, djz $$1) {
      if ($$0.e() < 2) {
         return false;
      } else {
         boolean $$2 = false;
         boolean $$3 = false;
         boolean $$4 = false;
         boolean $$5 = false;
         boolean $$6 = false;

         for (int $$7 = 0; $$7 < $$0.a(); $$7++) {
            daa $$8 = $$0.a($$7);
            if (!$$8.f()) {
               if (d.containsKey($$8.h())) {
                  if ($$4) {
                     return false;
                  }

                  $$4 = true;
               } else if (f.a($$8)) {
                  if ($$6) {
                     return false;
                  }

                  $$6 = true;
               } else if (e.a($$8)) {
                  if ($$5) {
                     return false;
                  }

                  $$5 = true;
               } else if (g.a($$8)) {
                  if ($$2) {
                     return false;
                  }

                  $$2 = true;
               } else {
                  if (!($$8.h() instanceof cyz)) {
                     return false;
                  }

                  $$3 = true;
               }
            }
         }

         return $$2 && $$3;
      }
   }

   public daa a(def $$0, ji.a $$1) {
      dco.a $$2 = dco.a.a;
      boolean $$3 = false;
      boolean $$4 = false;
      IntList $$5 = new IntArrayList();

      for (int $$6 = 0; $$6 < $$0.a(); $$6++) {
         daa $$7 = $$0.a($$6);
         if (!$$7.f()) {
            dco.a $$8 = d.get($$7.h());
            if ($$8 != null) {
               $$2 = $$8;
            } else if (f.a($$7)) {
               $$3 = true;
            } else if (e.a($$7)) {
               $$4 = true;
            } else if ($$7.h() instanceof cyz $$9) {
               $$5.add($$9.a().f());
            }
         }
      }

      daa $$10 = new daa(dae.vF);
      $$10.b(kl.ai, new dco($$2, $$5, IntList.of(), $$4, $$3));
      return $$10;
   }

   @Override
   public dfb<dem> a() {
      return dfb.h;
   }
}
