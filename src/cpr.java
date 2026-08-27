import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;

public class cpr extends cpn {
   private static final cps a = cps.a(cmu.tS, cmu.pq, cmu.sf, cmu.ue, cmu.uf, cmu.ui, cmu.ug, cmu.uj, cmu.uh, cmu.uk);
   private static final cps b = cps.a(cmu.ov);
   private static final cps c = cps.a(cmu.qV);
   private static final Map<cmm, clv.a> d = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(cmu.tS, clv.a.b);
      $$0.put(cmu.pq, clv.a.e);
      $$0.put(cmu.sf, clv.a.c);
      $$0.put(cmu.ue, clv.a.d);
      $$0.put(cmu.uf, clv.a.d);
      $$0.put(cmu.ui, clv.a.d);
      $$0.put(cmu.ug, clv.a.d);
      $$0.put(cmu.uj, clv.a.d);
      $$0.put(cmu.uh, clv.a.d);
      $$0.put(cmu.uk, clv.a.d);
   });
   private static final cps e = cps.a(cmu.pr);

   public cpr(cpl $$0) {
      super($$0);
   }

   public boolean a(cik $$0, cti $$1) {
      boolean $$2 = false;
      boolean $$3 = false;
      boolean $$4 = false;
      boolean $$5 = false;
      boolean $$6 = false;

      for (int $$7 = 0; $$7 < $$0.b(); $$7++) {
         cmr $$8 = $$0.a($$7);
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
               if (!($$8.d() instanceof clg)) {
                  return false;
               }

               $$3 = true;
            }
         }
      }

      return $$2 && $$3;
   }

   public cmr a(cik $$0, iu $$1) {
      cmr $$2 = new cmr(cmu.uo);
      sl $$3 = $$2.a("Explosion");
      clv.a $$4 = clv.a.a;
      List<Integer> $$5 = Lists.newArrayList();

      for (int $$6 = 0; $$6 < $$0.b(); $$6++) {
         cmr $$7 = $$0.a($$6);
         if (!$$7.b()) {
            if (a.a($$7)) {
               $$4 = d.get($$7.d());
            } else if (c.a($$7)) {
               $$3.a("Flicker", true);
            } else if (b.a($$7)) {
               $$3.a("Trail", true);
            } else if ($$7.d() instanceof clg) {
               $$5.add(((clg)$$7.d()).d().f());
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
   public cmr a(iu $$0) {
      return new cmr(cmu.uo);
   }

   @Override
   public cpz<?> ar_() {
      return cpz.h;
   }
}
