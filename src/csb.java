import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;

public class csb extends crx {
   private static final csc a = csc.a(cpg.tV, cpg.ps, cpg.sh, cpg.uh, cpg.ui, cpg.ul, cpg.uj, cpg.um, cpg.uk, cpg.un);
   private static final csc b = csc.a(cpg.ox);
   private static final csc c = csc.a(cpg.qX);
   private static final Map<coy, coh.a> d = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(cpg.tV, coh.a.b);
      $$0.put(cpg.ps, coh.a.e);
      $$0.put(cpg.sh, coh.a.c);
      $$0.put(cpg.uh, coh.a.d);
      $$0.put(cpg.ui, coh.a.d);
      $$0.put(cpg.ul, coh.a.d);
      $$0.put(cpg.uj, coh.a.d);
      $$0.put(cpg.um, coh.a.d);
      $$0.put(cpg.uk, coh.a.d);
      $$0.put(cpg.un, coh.a.d);
   });
   private static final csc e = csc.a(cpg.pt);

   public csb(crv $$0) {
      super($$0);
   }

   public boolean a(ckv $$0, cvr $$1) {
      boolean $$2 = false;
      boolean $$3 = false;
      boolean $$4 = false;
      boolean $$5 = false;
      boolean $$6 = false;

      for (int $$7 = 0; $$7 < $$0.b(); $$7++) {
         cpd $$8 = $$0.a($$7);
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
               if (!($$8.d() instanceof cns)) {
                  return false;
               }

               $$3 = true;
            }
         }
      }

      return $$2 && $$3;
   }

   public cpd a(ckv $$0, iw $$1) {
      cpd $$2 = new cpd(cpg.ur);
      sw $$3 = $$2.a("Explosion");
      coh.a $$4 = coh.a.a;
      List<Integer> $$5 = Lists.newArrayList();

      for (int $$6 = 0; $$6 < $$0.b(); $$6++) {
         cpd $$7 = $$0.a($$6);
         if (!$$7.b()) {
            if (a.a($$7)) {
               $$4 = d.get($$7.d());
            } else if (c.a($$7)) {
               $$3.a("Flicker", true);
            } else if (b.a($$7)) {
               $$3.a("Trail", true);
            } else if ($$7.d() instanceof cns) {
               $$5.add(((cns)$$7.d()).d().f());
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
   public cpd a(iw $$0) {
      return new cpd(cpg.ur);
   }

   @Override
   public csj<?> at_() {
      return csj.h;
   }
}
