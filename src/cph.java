import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;

public class cph extends cpd {
   private static final cpi a = cpi.a(cmk.tS, cmk.pq, cmk.sf, cmk.ue, cmk.uf, cmk.ui, cmk.ug, cmk.uj, cmk.uh, cmk.uk);
   private static final cpi b = cpi.a(cmk.ov);
   private static final cpi c = cpi.a(cmk.qV);
   private static final Map<cmc, cll.a> d = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(cmk.tS, cll.a.b);
      $$0.put(cmk.pq, cll.a.e);
      $$0.put(cmk.sf, cll.a.c);
      $$0.put(cmk.ue, cll.a.d);
      $$0.put(cmk.uf, cll.a.d);
      $$0.put(cmk.ui, cll.a.d);
      $$0.put(cmk.ug, cll.a.d);
      $$0.put(cmk.uj, cll.a.d);
      $$0.put(cmk.uh, cll.a.d);
      $$0.put(cmk.uk, cll.a.d);
   });
   private static final cpi e = cpi.a(cmk.pr);

   public cph(cpb $$0) {
      super($$0);
   }

   public boolean a(cia $$0, csy $$1) {
      boolean $$2 = false;
      boolean $$3 = false;
      boolean $$4 = false;
      boolean $$5 = false;
      boolean $$6 = false;

      for (int $$7 = 0; $$7 < $$0.b(); $$7++) {
         cmh $$8 = $$0.a($$7);
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
               if (!($$8.d() instanceof ckw)) {
                  return false;
               }

               $$3 = true;
            }
         }
      }

      return $$2 && $$3;
   }

   public cmh a(cia $$0, is $$1) {
      cmh $$2 = new cmh(cmk.uo);
      sj $$3 = $$2.a("Explosion");
      cll.a $$4 = cll.a.a;
      List<Integer> $$5 = Lists.newArrayList();

      for (int $$6 = 0; $$6 < $$0.b(); $$6++) {
         cmh $$7 = $$0.a($$6);
         if (!$$7.b()) {
            if (a.a($$7)) {
               $$4 = d.get($$7.d());
            } else if (c.a($$7)) {
               $$3.a("Flicker", true);
            } else if (b.a($$7)) {
               $$3.a("Trail", true);
            } else if ($$7.d() instanceof ckw) {
               $$5.add(((ckw)$$7.d()).d().f());
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
   public cmh a(is $$0) {
      return new cmh(cmk.uo);
   }

   @Override
   public cpp<?> ar_() {
      return cpp.h;
   }
}
