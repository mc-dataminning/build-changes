import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;

public class clx extends clt {
   private static final cly a = cly.a(cjb.tf, cjb.oF, cjb.rt, cjb.tr, cjb.ts, cjb.tv, cjb.tt, cjb.tw, cjb.tu, cjb.tx);
   private static final cly b = cly.a(cjb.nK);
   private static final cly c = cly.a(cjb.qk);
   private static final Map<cit, cic.a> d = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(cjb.tf, cic.a.b);
      $$0.put(cjb.oF, cic.a.e);
      $$0.put(cjb.rt, cic.a.c);
      $$0.put(cjb.tr, cic.a.d);
      $$0.put(cjb.ts, cic.a.d);
      $$0.put(cjb.tv, cic.a.d);
      $$0.put(cjb.tt, cic.a.d);
      $$0.put(cjb.tw, cic.a.d);
      $$0.put(cjb.tu, cic.a.d);
      $$0.put(cjb.tx, cic.a.d);
   });
   private static final cly e = cly.a(cjb.oG);

   public clx(aer $$0, clr $$1) {
      super($$0, $$1);
   }

   public boolean a(ces $$0, cpm $$1) {
      boolean $$2 = false;
      boolean $$3 = false;
      boolean $$4 = false;
      boolean $$5 = false;
      boolean $$6 = false;

      for (int $$7 = 0; $$7 < $$0.b(); $$7++) {
         ciy $$8 = $$0.a($$7);
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
               if (!($$8.d() instanceof chn)) {
                  return false;
               }

               $$3 = true;
            }
         }
      }

      return $$2 && $$3;
   }

   public ciy a(ces $$0, hs $$1) {
      ciy $$2 = new ciy(cjb.tB);
      qr $$3 = $$2.a("Explosion");
      cic.a $$4 = cic.a.a;
      List<Integer> $$5 = Lists.newArrayList();

      for (int $$6 = 0; $$6 < $$0.b(); $$6++) {
         ciy $$7 = $$0.a($$6);
         if (!$$7.b()) {
            if (a.a($$7)) {
               $$4 = d.get($$7.d());
            } else if (c.a($$7)) {
               $$3.a("Flicker", true);
            } else if (b.a($$7)) {
               $$3.a("Trail", true);
            } else if ($$7.d() instanceof chn) {
               $$5.add(((chn)$$7.d()).d().f());
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
   public ciy a(hs $$0) {
      return new ciy(cjb.tB);
   }

   @Override
   public cmd<?> aj_() {
      return cmd.h;
   }
}
