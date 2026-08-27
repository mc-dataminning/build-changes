import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;

public class cml extends cmh {
   private static final cmm a = cmm.a(cjo.tf, cjo.oF, cjo.rt, cjo.tr, cjo.ts, cjo.tv, cjo.tt, cjo.tw, cjo.tu, cjo.tx);
   private static final cmm b = cmm.a(cjo.nK);
   private static final cmm c = cmm.a(cjo.qk);
   private static final Map<cjg, cip.a> d = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(cjo.tf, cip.a.b);
      $$0.put(cjo.oF, cip.a.e);
      $$0.put(cjo.rt, cip.a.c);
      $$0.put(cjo.tr, cip.a.d);
      $$0.put(cjo.ts, cip.a.d);
      $$0.put(cjo.tv, cip.a.d);
      $$0.put(cjo.tt, cip.a.d);
      $$0.put(cjo.tw, cip.a.d);
      $$0.put(cjo.tu, cip.a.d);
      $$0.put(cjo.tx, cip.a.d);
   });
   private static final cmm e = cmm.a(cjo.oG);

   public cml(cme $$0) {
      super($$0);
   }

   public boolean a(cff $$0, cqb $$1) {
      boolean $$2 = false;
      boolean $$3 = false;
      boolean $$4 = false;
      boolean $$5 = false;
      boolean $$6 = false;

      for (int $$7 = 0; $$7 < $$0.b(); $$7++) {
         cjl $$8 = $$0.a($$7);
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
               if (!($$8.d() instanceof cia)) {
                  return false;
               }

               $$3 = true;
            }
         }
      }

      return $$2 && $$3;
   }

   public cjl a(cff $$0, hr $$1) {
      cjl $$2 = new cjl(cjo.tB);
      qw $$3 = $$2.a("Explosion");
      cip.a $$4 = cip.a.a;
      List<Integer> $$5 = Lists.newArrayList();

      for (int $$6 = 0; $$6 < $$0.b(); $$6++) {
         cjl $$7 = $$0.a($$6);
         if (!$$7.b()) {
            if (a.a($$7)) {
               $$4 = d.get($$7.d());
            } else if (c.a($$7)) {
               $$3.a("Flicker", true);
            } else if (b.a($$7)) {
               $$3.a("Trail", true);
            } else if ($$7.d() instanceof cia) {
               $$5.add(((cia)$$7.d()).d().f());
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
   public cjl a(hr $$0) {
      return new cjl(cjo.tB);
   }

   @Override
   public cms<?> an_() {
      return cms.h;
   }
}
