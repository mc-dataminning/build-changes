import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;

public class cso extends csk {
   private static final csp a = csp.a(cpt.tV, cpt.ps, cpt.sh, cpt.uh, cpt.ui, cpt.ul, cpt.uj, cpt.um, cpt.uk, cpt.un);
   private static final csp b = csp.a(cpt.ox);
   private static final csp c = csp.a(cpt.qX);
   private static final Map<cpl, cov.a> d = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(cpt.tV, cov.a.b);
      $$0.put(cpt.ps, cov.a.e);
      $$0.put(cpt.sh, cov.a.c);
      $$0.put(cpt.uh, cov.a.d);
      $$0.put(cpt.ui, cov.a.d);
      $$0.put(cpt.ul, cov.a.d);
      $$0.put(cpt.uj, cov.a.d);
      $$0.put(cpt.um, cov.a.d);
      $$0.put(cpt.uk, cov.a.d);
      $$0.put(cpt.un, cov.a.d);
   });
   private static final csp e = csp.a(cpt.pt);

   public cso(csi $$0) {
      super($$0);
   }

   public boolean a(clk $$0, cwe $$1) {
      boolean $$2 = false;
      boolean $$3 = false;
      boolean $$4 = false;
      boolean $$5 = false;
      boolean $$6 = false;

      for (int $$7 = 0; $$7 < $$0.b(); $$7++) {
         cpq $$8 = $$0.a($$7);
         if (!$$8.b()) {
            if (a.a($$8)) {
               if ($$4) {
                  return false;
               }

               $$4 = true;
            } else if (c.a($$8)) {
               if ($$6) {
                  return false;
               }

               $$6 = true;
            } else if (b.a($$8)) {
               if ($$5) {
                  return false;
               }

               $$5 = true;
            } else if (e.a($$8)) {
               if ($$2) {
                  return false;
               }

               $$2 = true;
            } else {
               if (!($$8.d() instanceof coh)) {
                  return false;
               }

               $$3 = true;
            }
         }
      }

      return $$2 && $$3;
   }

   public cpq a(clk $$0, iy $$1) {
      cpq $$2 = new cpq(cpt.ur);
      sy $$3 = $$2.b("Explosion");
      cov.a $$4 = cov.a.a;
      List<Integer> $$5 = Lists.newArrayList();

      for (int $$6 = 0; $$6 < $$0.b(); $$6++) {
         cpq $$7 = $$0.a($$6);
         if (!$$7.b()) {
            if (a.a($$7)) {
               $$4 = d.get($$7.d());
            } else if (c.a($$7)) {
               $$3.a("Flicker", true);
            } else if (b.a($$7)) {
               $$3.a("Trail", true);
            } else if ($$7.d() instanceof coh) {
               $$5.add(((coh)$$7.d()).c().f());
            }
         }
      }

      $$3.b("Colors", $$5);
      $$3.a("Type", (byte)$$4.a());
      return $$2;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public cpq a(iy $$0) {
      return new cpq(cpt.ur);
   }

   @Override
   public csw<?> as_() {
      return csw.h;
   }
}
