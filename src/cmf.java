import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;

public class cmf extends cmb {
   private static final cmg a = cmg.a(cji.tf, cji.oF, cji.rt, cji.tr, cji.ts, cji.tv, cji.tt, cji.tw, cji.tu, cji.tx);
   private static final cmg b = cmg.a(cji.nK);
   private static final cmg c = cmg.a(cji.qk);
   private static final Map<cja, cij.a> d = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(cji.tf, cij.a.b);
      $$0.put(cji.oF, cij.a.e);
      $$0.put(cji.rt, cij.a.c);
      $$0.put(cji.tr, cij.a.d);
      $$0.put(cji.ts, cij.a.d);
      $$0.put(cji.tv, cij.a.d);
      $$0.put(cji.tt, cij.a.d);
      $$0.put(cji.tw, cij.a.d);
      $$0.put(cji.tu, cij.a.d);
      $$0.put(cji.tx, cij.a.d);
   });
   private static final cmg e = cmg.a(cji.oG);

   public cmf(cly $$0) {
      super($$0);
   }

   public boolean a(cez $$0, cpv $$1) {
      boolean $$2 = false;
      boolean $$3 = false;
      boolean $$4 = false;
      boolean $$5 = false;
      boolean $$6 = false;

      for (int $$7 = 0; $$7 < $$0.b(); $$7++) {
         cjf $$8 = $$0.a($$7);
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
               if (!($$8.d() instanceof chu)) {
                  return false;
               }

               $$3 = true;
            }
         }
      }

      return $$2 && $$3;
   }

   public cjf a(cez $$0, hu $$1) {
      cjf $$2 = new cjf(cji.tB);
      qx $$3 = $$2.a("Explosion");
      cij.a $$4 = cij.a.a;
      List<Integer> $$5 = Lists.newArrayList();

      for (int $$6 = 0; $$6 < $$0.b(); $$6++) {
         cjf $$7 = $$0.a($$6);
         if (!$$7.b()) {
            if (a.a($$7)) {
               $$4 = d.get($$7.d());
            } else if (c.a($$7)) {
               $$3.a("Flicker", true);
            } else if (b.a($$7)) {
               $$3.a("Trail", true);
            } else if ($$7.d() instanceof chu) {
               $$5.add(((chu)$$7.d()).d().f());
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
   public cjf a(hu $$0) {
      return new cjf(cji.tB);
   }

   @Override
   public cmm<?> an_() {
      return cmm.h;
   }
}
