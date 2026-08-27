import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;

public class cob extends cnx {
   private static final coc a = coc.a(cle.tg, cle.oF, cle.ru, cle.ts, cle.tt, cle.tw, cle.tu, cle.tx, cle.tv, cle.ty);
   private static final coc b = coc.a(cle.nK);
   private static final coc c = coc.a(cle.qk);
   private static final Map<ckw, ckf.a> d = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(cle.tg, ckf.a.b);
      $$0.put(cle.oF, ckf.a.e);
      $$0.put(cle.ru, ckf.a.c);
      $$0.put(cle.ts, ckf.a.d);
      $$0.put(cle.tt, ckf.a.d);
      $$0.put(cle.tw, ckf.a.d);
      $$0.put(cle.tu, ckf.a.d);
      $$0.put(cle.tx, ckf.a.d);
      $$0.put(cle.tv, ckf.a.d);
      $$0.put(cle.ty, ckf.a.d);
   });
   private static final coc e = coc.a(cle.oG);

   public cob(cnu $$0) {
      super($$0);
   }

   public boolean a(cgu $$0, crs $$1) {
      boolean $$2 = false;
      boolean $$3 = false;
      boolean $$4 = false;
      boolean $$5 = false;
      boolean $$6 = false;

      for (int $$7 = 0; $$7 < $$0.b(); $$7++) {
         clb $$8 = $$0.a($$7);
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
               if (!($$8.d() instanceof cjq)) {
                  return false;
               }

               $$3 = true;
            }
         }
      }

      return $$2 && $$3;
   }

   public clb a(cgu $$0, ip $$1) {
      clb $$2 = new clb(cle.tC);
      rz $$3 = $$2.a("Explosion");
      ckf.a $$4 = ckf.a.a;
      List<Integer> $$5 = Lists.newArrayList();

      for (int $$6 = 0; $$6 < $$0.b(); $$6++) {
         clb $$7 = $$0.a($$6);
         if (!$$7.b()) {
            if (a.a($$7)) {
               $$4 = d.get($$7.d());
            } else if (c.a($$7)) {
               $$3.a("Flicker", true);
            } else if (b.a($$7)) {
               $$3.a("Trail", true);
            } else if ($$7.d() instanceof cjq) {
               $$5.add(((cjq)$$7.d()).d().f());
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
   public clb a(ip $$0) {
      return new clb(cle.tC);
   }

   @Override
   public coj<?> aq_() {
      return coj.h;
   }
}
