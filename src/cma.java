import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;

public class cma extends clw {
   private static final cmb a = cmb.a(cjd.tf, cjd.oF, cjd.rt, cjd.tr, cjd.ts, cjd.tv, cjd.tt, cjd.tw, cjd.tu, cjd.tx);
   private static final cmb b = cmb.a(cjd.nK);
   private static final cmb c = cmb.a(cjd.qk);
   private static final Map<civ, cie.a> d = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(cjd.tf, cie.a.b);
      $$0.put(cjd.oF, cie.a.e);
      $$0.put(cjd.rt, cie.a.c);
      $$0.put(cjd.tr, cie.a.d);
      $$0.put(cjd.ts, cie.a.d);
      $$0.put(cjd.tv, cie.a.d);
      $$0.put(cjd.tt, cie.a.d);
      $$0.put(cjd.tw, cie.a.d);
      $$0.put(cjd.tu, cie.a.d);
      $$0.put(cjd.tx, cie.a.d);
   });
   private static final cmb e = cmb.a(cjd.oG);

   public cma(clt $$0) {
      super($$0);
   }

   public boolean a(ceu $$0, cpq $$1) {
      boolean $$2 = false;
      boolean $$3 = false;
      boolean $$4 = false;
      boolean $$5 = false;
      boolean $$6 = false;

      for (int $$7 = 0; $$7 < $$0.b(); $$7++) {
         cja $$8 = $$0.a($$7);
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
               if (!($$8.d() instanceof chp)) {
                  return false;
               }

               $$3 = true;
            }
         }
      }

      return $$2 && $$3;
   }

   public cja a(ceu $$0, hu $$1) {
      cja $$2 = new cja(cjd.tB);
      qu $$3 = $$2.a("Explosion");
      cie.a $$4 = cie.a.a;
      List<Integer> $$5 = Lists.newArrayList();

      for (int $$6 = 0; $$6 < $$0.b(); $$6++) {
         cja $$7 = $$0.a($$6);
         if (!$$7.b()) {
            if (a.a($$7)) {
               $$4 = d.get($$7.d());
            } else if (c.a($$7)) {
               $$3.a("Flicker", true);
            } else if (b.a($$7)) {
               $$3.a("Trail", true);
            } else if ($$7.d() instanceof chp) {
               $$5.add(((chp)$$7.d()).d().f());
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
   public cja a(hu $$0) {
      return new cja(cjd.tB);
   }

   @Override
   public cmh<?> ai_() {
      return cmh.h;
   }
}
