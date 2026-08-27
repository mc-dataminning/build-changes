import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;

public class cnj extends cnf {
   private static final cnk a = cnk.a(ckm.tf, ckm.oF, ckm.rt, ckm.tr, ckm.ts, ckm.tv, ckm.tt, ckm.tw, ckm.tu, ckm.tx);
   private static final cnk b = cnk.a(ckm.nK);
   private static final cnk c = cnk.a(ckm.qk);
   private static final Map<cke, cjn.a> d = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(ckm.tf, cjn.a.b);
      $$0.put(ckm.oF, cjn.a.e);
      $$0.put(ckm.rt, cjn.a.c);
      $$0.put(ckm.tr, cjn.a.d);
      $$0.put(ckm.ts, cjn.a.d);
      $$0.put(ckm.tv, cjn.a.d);
      $$0.put(ckm.tt, cjn.a.d);
      $$0.put(ckm.tw, cjn.a.d);
      $$0.put(ckm.tu, cjn.a.d);
      $$0.put(ckm.tx, cjn.a.d);
   });
   private static final cnk e = cnk.a(ckm.oG);

   public cnj(cnc $$0) {
      super($$0);
   }

   public boolean a(cgd $$0, cqz $$1) {
      boolean $$2 = false;
      boolean $$3 = false;
      boolean $$4 = false;
      boolean $$5 = false;
      boolean $$6 = false;

      for (int $$7 = 0; $$7 < $$0.b(); $$7++) {
         ckj $$8 = $$0.a($$7);
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
               if (!($$8.d() instanceof ciy)) {
                  return false;
               }

               $$3 = true;
            }
         }
      }

      return $$2 && $$3;
   }

   public ckj a(cgd $$0, ip $$1) {
      ckj $$2 = new ckj(ckm.tB);
      rt $$3 = $$2.a("Explosion");
      cjn.a $$4 = cjn.a.a;
      List<Integer> $$5 = Lists.newArrayList();

      for (int $$6 = 0; $$6 < $$0.b(); $$6++) {
         ckj $$7 = $$0.a($$6);
         if (!$$7.b()) {
            if (a.a($$7)) {
               $$4 = d.get($$7.d());
            } else if (c.a($$7)) {
               $$3.a("Flicker", true);
            } else if (b.a($$7)) {
               $$3.a("Trail", true);
            } else if ($$7.d() instanceof ciy) {
               $$5.add(((ciy)$$7.d()).d().f());
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
   public ckj a(ip $$0) {
      return new ckj(ckm.tB);
   }

   @Override
   public cnq<?> aq_() {
      return cnq.h;
   }
}
