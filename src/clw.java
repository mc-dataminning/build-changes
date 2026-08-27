import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;

public class clw extends cls {
   private static final clx a = clx.a(cja.tf, cja.oF, cja.rt, cja.tr, cja.ts, cja.tv, cja.tt, cja.tw, cja.tu, cja.tx);
   private static final clx b = clx.a(cja.nK);
   private static final clx c = clx.a(cja.qk);
   private static final Map<cis, cib.a> d = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(cja.tf, cib.a.b);
      $$0.put(cja.oF, cib.a.e);
      $$0.put(cja.rt, cib.a.c);
      $$0.put(cja.tr, cib.a.d);
      $$0.put(cja.ts, cib.a.d);
      $$0.put(cja.tv, cib.a.d);
      $$0.put(cja.tt, cib.a.d);
      $$0.put(cja.tw, cib.a.d);
      $$0.put(cja.tu, cib.a.d);
      $$0.put(cja.tx, cib.a.d);
   });
   private static final clx e = clx.a(cja.oG);

   public clw(aer $$0, clq $$1) {
      super($$0, $$1);
   }

   public boolean a(cer $$0, cpl $$1) {
      boolean $$2 = false;
      boolean $$3 = false;
      boolean $$4 = false;
      boolean $$5 = false;
      boolean $$6 = false;

      for (int $$7 = 0; $$7 < $$0.b(); $$7++) {
         cix $$8 = $$0.a($$7);
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
               if (!($$8.d() instanceof chm)) {
                  return false;
               }

               $$3 = true;
            }
         }
      }

      return $$2 && $$3;
   }

   public cix a(cer $$0, hs $$1) {
      cix $$2 = new cix(cja.tB);
      qr $$3 = $$2.a("Explosion");
      cib.a $$4 = cib.a.a;
      List<Integer> $$5 = Lists.newArrayList();

      for (int $$6 = 0; $$6 < $$0.b(); $$6++) {
         cix $$7 = $$0.a($$6);
         if (!$$7.b()) {
            if (a.a($$7)) {
               $$4 = d.get($$7.d());
            } else if (c.a($$7)) {
               $$3.a("Flicker", true);
            } else if (b.a($$7)) {
               $$3.a("Trail", true);
            } else if ($$7.d() instanceof chm) {
               $$5.add(((chm)$$7.d()).d().f());
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
   public cix a(hs $$0) {
      return new cix(cja.tB);
   }

   @Override
   public cmc<?> ai_() {
      return cmc.h;
   }
}
