import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;

public class clv extends clr {
   private static final clw a = clw.a(ciz.tf, ciz.oF, ciz.rt, ciz.tr, ciz.ts, ciz.tv, ciz.tt, ciz.tw, ciz.tu, ciz.tx);
   private static final clw b = clw.a(ciz.nK);
   private static final clw c = clw.a(ciz.qk);
   private static final Map<cir, cia.a> d = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(ciz.tf, cia.a.b);
      $$0.put(ciz.oF, cia.a.e);
      $$0.put(ciz.rt, cia.a.c);
      $$0.put(ciz.tr, cia.a.d);
      $$0.put(ciz.ts, cia.a.d);
      $$0.put(ciz.tv, cia.a.d);
      $$0.put(ciz.tt, cia.a.d);
      $$0.put(ciz.tw, cia.a.d);
      $$0.put(ciz.tu, cia.a.d);
      $$0.put(ciz.tx, cia.a.d);
   });
   private static final clw e = clw.a(ciz.oG);

   public clv(aep $$0, clp $$1) {
      super($$0, $$1);
   }

   public boolean a(ceq $$0, cpk $$1) {
      boolean $$2 = false;
      boolean $$3 = false;
      boolean $$4 = false;
      boolean $$5 = false;
      boolean $$6 = false;

      for (int $$7 = 0; $$7 < $$0.b(); $$7++) {
         ciw $$8 = $$0.a($$7);
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
               if (!($$8.d() instanceof chl)) {
                  return false;
               }

               $$3 = true;
            }
         }
      }

      return $$2 && $$3;
   }

   public ciw a(ceq $$0, ht $$1) {
      ciw $$2 = new ciw(ciz.tB);
      qs $$3 = $$2.a("Explosion");
      cia.a $$4 = cia.a.a;
      List<Integer> $$5 = Lists.newArrayList();

      for (int $$6 = 0; $$6 < $$0.b(); $$6++) {
         ciw $$7 = $$0.a($$6);
         if (!$$7.b()) {
            if (a.a($$7)) {
               $$4 = d.get($$7.d());
            } else if (c.a($$7)) {
               $$3.a("Flicker", true);
            } else if (b.a($$7)) {
               $$3.a("Trail", true);
            } else if ($$7.d() instanceof chl) {
               $$5.add(((chl)$$7.d()).d().f());
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
   public ciw a(ht $$0) {
      return new ciw(ciz.tB);
   }

   @Override
   public cmb<?> aj_() {
      return cmb.h;
   }
}
