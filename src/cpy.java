import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;

public class cpy extends cpu {
   private static final cpz a = cpz.a(cnb.tS, cnb.pq, cnb.sf, cnb.ue, cnb.uf, cnb.ui, cnb.ug, cnb.uj, cnb.uh, cnb.uk);
   private static final cpz b = cpz.a(cnb.ov);
   private static final cpz c = cpz.a(cnb.qV);
   private static final Map<cmt, cmc.a> d = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(cnb.tS, cmc.a.b);
      $$0.put(cnb.pq, cmc.a.e);
      $$0.put(cnb.sf, cmc.a.c);
      $$0.put(cnb.ue, cmc.a.d);
      $$0.put(cnb.uf, cmc.a.d);
      $$0.put(cnb.ui, cmc.a.d);
      $$0.put(cnb.ug, cmc.a.d);
      $$0.put(cnb.uj, cmc.a.d);
      $$0.put(cnb.uh, cmc.a.d);
      $$0.put(cnb.uk, cmc.a.d);
   });
   private static final cpz e = cpz.a(cnb.pr);

   public cpy(cps $$0) {
      super($$0);
   }

   public boolean a(cir $$0, ctp $$1) {
      boolean $$2 = false;
      boolean $$3 = false;
      boolean $$4 = false;
      boolean $$5 = false;
      boolean $$6 = false;

      for (int $$7 = 0; $$7 < $$0.b(); $$7++) {
         cmy $$8 = $$0.a($$7);
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
               if (!($$8.d() instanceof cln)) {
                  return false;
               }

               $$3 = true;
            }
         }
      }

      return $$2 && $$3;
   }

   public cmy a(cir $$0, iu $$1) {
      cmy $$2 = new cmy(cnb.uo);
      sn $$3 = $$2.a("Explosion");
      cmc.a $$4 = cmc.a.a;
      List<Integer> $$5 = Lists.newArrayList();

      for (int $$6 = 0; $$6 < $$0.b(); $$6++) {
         cmy $$7 = $$0.a($$6);
         if (!$$7.b()) {
            if (a.a($$7)) {
               $$4 = d.get($$7.d());
            } else if (c.a($$7)) {
               $$3.a("Flicker", true);
            } else if (b.a($$7)) {
               $$3.a("Trail", true);
            } else if ($$7.d() instanceof cln) {
               $$5.add(((cln)$$7.d()).d().f());
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
   public cmy a(iu $$0) {
      return new cmy(cnb.uo);
   }

   @Override
   public cqg<?> ar_() {
      return cqg.h;
   }
}
