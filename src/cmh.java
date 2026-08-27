import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;

public class cmh extends cmd {
   private static final cmi a = cmi.a(cjk.tf, cjk.oF, cjk.rt, cjk.tr, cjk.ts, cjk.tv, cjk.tt, cjk.tw, cjk.tu, cjk.tx);
   private static final cmi b = cmi.a(cjk.nK);
   private static final cmi c = cmi.a(cjk.qk);
   private static final Map<cjc, cil.a> d = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(cjk.tf, cil.a.b);
      $$0.put(cjk.oF, cil.a.e);
      $$0.put(cjk.rt, cil.a.c);
      $$0.put(cjk.tr, cil.a.d);
      $$0.put(cjk.ts, cil.a.d);
      $$0.put(cjk.tv, cil.a.d);
      $$0.put(cjk.tt, cil.a.d);
      $$0.put(cjk.tw, cil.a.d);
      $$0.put(cjk.tu, cil.a.d);
      $$0.put(cjk.tx, cil.a.d);
   });
   private static final cmi e = cmi.a(cjk.oG);

   public cmh(cma $$0) {
      super($$0);
   }

   public boolean a(cfb $$0, cpx $$1) {
      boolean $$2 = false;
      boolean $$3 = false;
      boolean $$4 = false;
      boolean $$5 = false;
      boolean $$6 = false;

      for (int $$7 = 0; $$7 < $$0.b(); $$7++) {
         cjh $$8 = $$0.a($$7);
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
               if (!($$8.d() instanceof chw)) {
                  return false;
               }

               $$3 = true;
            }
         }
      }

      return $$2 && $$3;
   }

   public cjh a(cfb $$0, hu $$1) {
      cjh $$2 = new cjh(cjk.tB);
      qy $$3 = $$2.a("Explosion");
      cil.a $$4 = cil.a.a;
      List<Integer> $$5 = Lists.newArrayList();

      for (int $$6 = 0; $$6 < $$0.b(); $$6++) {
         cjh $$7 = $$0.a($$6);
         if (!$$7.b()) {
            if (a.a($$7)) {
               $$4 = d.get($$7.d());
            } else if (c.a($$7)) {
               $$3.a("Flicker", true);
            } else if (b.a($$7)) {
               $$3.a("Trail", true);
            } else if ($$7.d() instanceof chw) {
               $$5.add(((chw)$$7.d()).d().f());
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
   public cjh a(hu $$0) {
      return new cjh(cjk.tB);
   }

   @Override
   public cmo<?> an_() {
      return cmo.h;
   }
}
