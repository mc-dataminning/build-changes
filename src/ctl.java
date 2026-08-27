import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;

public class ctl extends cth {
   private static final ctm a = ctm.a(cqp.tW, cqp.ps, cqp.sh, cqp.uj, cqp.uk, cqp.un, cqp.ul, cqp.uo, cqp.um, cqp.up);
   private static final ctm b = ctm.a(cqp.ox);
   private static final ctm c = ctm.a(cqp.qX);
   private static final Map<cqh, cpr.a> d = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(cqp.tW, cpr.a.b);
      $$0.put(cqp.ps, cpr.a.e);
      $$0.put(cqp.sh, cpr.a.c);
      $$0.put(cqp.uj, cpr.a.d);
      $$0.put(cqp.uk, cpr.a.d);
      $$0.put(cqp.un, cpr.a.d);
      $$0.put(cqp.ul, cpr.a.d);
      $$0.put(cqp.uo, cpr.a.d);
      $$0.put(cqp.um, cpr.a.d);
      $$0.put(cqp.up, cpr.a.d);
   });
   private static final ctm e = ctm.a(cqp.pt);

   public ctl(ctf $$0) {
      super($$0);
   }

   public boolean a(cmg $$0, cxb $$1) {
      boolean $$2 = false;
      boolean $$3 = false;
      boolean $$4 = false;
      boolean $$5 = false;
      boolean $$6 = false;

      for (int $$7 = 0; $$7 < $$0.b(); $$7++) {
         cqm $$8 = $$0.a($$7);
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
               if (!($$8.d() instanceof cpe)) {
                  return false;
               }

               $$3 = true;
            }
         }
      }

      return $$2 && $$3;
   }

   public cqm a(cmg $$0, iz $$1) {
      cqm $$2 = new cqm(cqp.ut);
      ta $$3 = $$2.b("Explosion");
      cpr.a $$4 = cpr.a.a;
      List<Integer> $$5 = Lists.newArrayList();

      for (int $$6 = 0; $$6 < $$0.b(); $$6++) {
         cqm $$7 = $$0.a($$6);
         if (!$$7.b()) {
            if (a.a($$7)) {
               $$4 = d.get($$7.d());
            } else if (c.a($$7)) {
               $$3.a("Flicker", true);
            } else if (b.a($$7)) {
               $$3.a("Trail", true);
            } else if ($$7.d() instanceof cpe) {
               $$5.add(((cpe)$$7.d()).c().f());
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
   public cqm a(iz $$0) {
      return new cqm(cqp.ut);
   }

   @Override
   public ctt<?> ar_() {
      return ctt.h;
   }
}
