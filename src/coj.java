import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;

public class coj extends cof {
   private static final cok a = cok.a(clm.tR, clm.pq, clm.sf, clm.ud, clm.ue, clm.uh, clm.uf, clm.ui, clm.ug, clm.uj);
   private static final cok b = cok.a(clm.ov);
   private static final cok c = cok.a(clm.qV);
   private static final Map<cle, ckn.a> d = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(clm.tR, ckn.a.b);
      $$0.put(clm.pq, ckn.a.e);
      $$0.put(clm.sf, ckn.a.c);
      $$0.put(clm.ud, ckn.a.d);
      $$0.put(clm.ue, ckn.a.d);
      $$0.put(clm.uh, ckn.a.d);
      $$0.put(clm.uf, ckn.a.d);
      $$0.put(clm.ui, ckn.a.d);
      $$0.put(clm.ug, ckn.a.d);
      $$0.put(clm.uj, ckn.a.d);
   });
   private static final cok e = cok.a(clm.pr);

   public coj(coc $$0) {
      super($$0);
   }

   public boolean a(chc $$0, csa $$1) {
      boolean $$2 = false;
      boolean $$3 = false;
      boolean $$4 = false;
      boolean $$5 = false;
      boolean $$6 = false;

      for (int $$7 = 0; $$7 < $$0.b(); $$7++) {
         clj $$8 = $$0.a($$7);
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
               if (!($$8.d() instanceof cjy)) {
                  return false;
               }

               $$3 = true;
            }
         }
      }

      return $$2 && $$3;
   }

   public clj a(chc $$0, ip $$1) {
      clj $$2 = new clj(clm.un);
      rz $$3 = $$2.a("Explosion");
      ckn.a $$4 = ckn.a.a;
      List<Integer> $$5 = Lists.newArrayList();

      for (int $$6 = 0; $$6 < $$0.b(); $$6++) {
         clj $$7 = $$0.a($$6);
         if (!$$7.b()) {
            if (a.a($$7)) {
               $$4 = d.get($$7.d());
            } else if (c.a($$7)) {
               $$3.a("Flicker", true);
            } else if (b.a($$7)) {
               $$3.a("Trail", true);
            } else if ($$7.d() instanceof cjy) {
               $$5.add(((cjy)$$7.d()).d().f());
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
   public clj a(ip $$0) {
      return new clj(clm.un);
   }

   @Override
   public cos<?> aq_() {
      return cos.h;
   }
}
