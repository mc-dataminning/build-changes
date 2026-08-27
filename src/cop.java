import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;

public class cop extends cok {
   private static final coq a = coq.a(clr.tR, clr.pq, clr.sf, clr.ud, clr.ue, clr.uh, clr.uf, clr.ui, clr.ug, clr.uj);
   private static final coq b = coq.a(clr.ov);
   private static final coq c = coq.a(clr.qV);
   private static final Map<clj, cks.a> d = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(clr.tR, cks.a.b);
      $$0.put(clr.pq, cks.a.e);
      $$0.put(clr.sf, cks.a.c);
      $$0.put(clr.ud, cks.a.d);
      $$0.put(clr.ue, cks.a.d);
      $$0.put(clr.uh, cks.a.d);
      $$0.put(clr.uf, cks.a.d);
      $$0.put(clr.ui, cks.a.d);
      $$0.put(clr.ug, cks.a.d);
      $$0.put(clr.uj, cks.a.d);
   });
   private static final coq e = coq.a(clr.pr);

   public cop(coh $$0) {
      super($$0);
   }

   public boolean a(chh $$0, csf $$1) {
      boolean $$2 = false;
      boolean $$3 = false;
      boolean $$4 = false;
      boolean $$5 = false;
      boolean $$6 = false;

      for (int $$7 = 0; $$7 < $$0.b(); $$7++) {
         clo $$8 = $$0.a($$7);
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
               if (!($$8.d() instanceof ckd)) {
                  return false;
               }

               $$3 = true;
            }
         }
      }

      return $$2 && $$3;
   }

   public clo a(chh $$0, it $$1) {
      clo $$2 = new clo(clr.un);
      sd $$3 = $$2.a("Explosion");
      cks.a $$4 = cks.a.a;
      List<Integer> $$5 = Lists.newArrayList();

      for (int $$6 = 0; $$6 < $$0.b(); $$6++) {
         clo $$7 = $$0.a($$6);
         if (!$$7.b()) {
            if (a.a($$7)) {
               $$4 = d.get($$7.d());
            } else if (c.a($$7)) {
               $$3.a("Flicker", true);
            } else if (b.a($$7)) {
               $$3.a("Trail", true);
            } else if ($$7.d() instanceof ckd) {
               $$5.add(((ckd)$$7.d()).d().f());
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
   public clo a(it $$0) {
      return new clo(clr.un);
   }

   @Override
   public cox<?> as_() {
      return cox.h;
   }
}
