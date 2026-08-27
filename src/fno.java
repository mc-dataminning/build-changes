import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class fno implements fnd.a {
   private final enn a;
   private final Map<dfk, Map<String, drs>> b = Maps.newIdentityHashMap();
   private final Map<dfk, Map<String, drs>> c = Maps.newIdentityHashMap();
   private final Map<dfk, Map<String, Boolean>> d = Maps.newIdentityHashMap();
   private static final int e = 500;

   public fno(enn $$0) {
      this.a = $$0;
   }

   @Override
   public void a(eij $$0, fjx $$1, double $$2, double $$3, double $$4) {
      emz $$5 = this.a.j.m();
      cmn $$6 = this.a.s;
      dfk $$7 = $$6.x_();
      gu $$8 = gu.a($$5.b().c, 0.0, $$5.b().e);
      ein $$9 = $$1.getBuffer(fkf.x());
      if (this.b.containsKey($$7)) {
         for (drs $$10 : this.b.get($$7).values()) {
            if ($$8.a($$10.f(), 500.0)) {
               fjv.a(
                  $$0,
                  $$9,
                  (double)$$10.g() - $$2,
                  (double)$$10.h() - $$3,
                  (double)$$10.i() - $$4,
                  (double)($$10.j() + 1) - $$2,
                  (double)($$10.k() + 1) - $$3,
                  (double)($$10.l() + 1) - $$4,
                  1.0F,
                  1.0F,
                  1.0F,
                  1.0F,
                  1.0F,
                  1.0F,
                  1.0F
               );
            }
         }
      }

      if (this.c.containsKey($$7)) {
         for (Entry<String, drs> $$11 : this.c.get($$7).entrySet()) {
            String $$12 = $$11.getKey();
            drs $$13 = $$11.getValue();
            Boolean $$14 = this.d.get($$7).get($$12);
            if ($$8.a($$13.f(), 500.0)) {
               if ($$14) {
                  fjv.a(
                     $$0,
                     $$9,
                     (double)$$13.g() - $$2,
                     (double)$$13.h() - $$3,
                     (double)$$13.i() - $$4,
                     (double)($$13.j() + 1) - $$2,
                     (double)($$13.k() + 1) - $$3,
                     (double)($$13.l() + 1) - $$4,
                     0.0F,
                     1.0F,
                     0.0F,
                     1.0F,
                     0.0F,
                     1.0F,
                     0.0F
                  );
               } else {
                  fjv.a(
                     $$0,
                     $$9,
                     (double)$$13.g() - $$2,
                     (double)$$13.h() - $$3,
                     (double)$$13.i() - $$4,
                     (double)($$13.j() + 1) - $$2,
                     (double)($$13.k() + 1) - $$3,
                     (double)($$13.l() + 1) - $$4,
                     0.0F,
                     0.0F,
                     1.0F,
                     1.0F,
                     0.0F,
                     0.0F,
                     1.0F
                  );
               }
            }
         }
      }
   }

   public void a(drs $$0, List<drs> $$1, List<Boolean> $$2, dfk $$3) {
      if (!this.b.containsKey($$3)) {
         this.b.put($$3, Maps.newHashMap());
      }

      if (!this.c.containsKey($$3)) {
         this.c.put($$3, Maps.newHashMap());
         this.d.put($$3, Maps.newHashMap());
      }

      this.b.get($$3).put($$0.toString(), $$0);

      for (int $$4 = 0; $$4 < $$1.size(); $$4++) {
         drs $$5 = $$1.get($$4);
         Boolean $$6 = $$2.get($$4);
         this.c.get($$3).put($$5.toString(), $$5);
         this.d.get($$3).put($$5.toString(), $$6);
      }
   }

   @Override
   public void a() {
      this.b.clear();
      this.c.clear();
      this.d.clear();
   }
}
