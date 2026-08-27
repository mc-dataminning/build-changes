import com.google.common.collect.Maps;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class fry implements frn.a {
   private final eqv a;
   private final Map<aew<cpv>, Map<String, dva>> b = Maps.newIdentityHashMap();
   private final Map<aew<cpv>, Map<String, wk.a>> c = Maps.newIdentityHashMap();
   private static final int d = 500;

   public fry(eqv $$0) {
      this.a = $$0;
   }

   @Override
   public void a(elp $$0, foe $$1, double $$2, double $$3, double $$4) {
      eqg $$5 = this.a.j.m();
      aew<cpv> $$6 = this.a.r.ac();
      gw $$7 = gw.a($$5.b().c, 0.0, $$5.b().e);
      elt $$8 = $$1.getBuffer(fom.x());
      if (this.b.containsKey($$6)) {
         for (dva $$9 : this.b.get($$6).values()) {
            if ($$7.a($$9.f(), 500.0)) {
               foc.a(
                  $$0,
                  $$8,
                  (double)$$9.g() - $$2,
                  (double)$$9.h() - $$3,
                  (double)$$9.i() - $$4,
                  (double)($$9.j() + 1) - $$2,
                  (double)($$9.k() + 1) - $$3,
                  (double)($$9.l() + 1) - $$4,
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

      Map<String, wk.a> $$10 = this.c.get($$6);
      if ($$10 != null) {
         for (wk.a $$11 : $$10.values()) {
            dva $$12 = $$11.a();
            if ($$7.a($$12.f(), 500.0)) {
               if ($$11.b()) {
                  foc.a(
                     $$0,
                     $$8,
                     (double)$$12.g() - $$2,
                     (double)$$12.h() - $$3,
                     (double)$$12.i() - $$4,
                     (double)($$12.j() + 1) - $$2,
                     (double)($$12.k() + 1) - $$3,
                     (double)($$12.l() + 1) - $$4,
                     0.0F,
                     1.0F,
                     0.0F,
                     1.0F,
                     0.0F,
                     1.0F,
                     0.0F
                  );
               } else {
                  foc.a(
                     $$0,
                     $$8,
                     (double)$$12.g() - $$2,
                     (double)$$12.h() - $$3,
                     (double)$$12.i() - $$4,
                     (double)($$12.j() + 1) - $$2,
                     (double)($$12.k() + 1) - $$3,
                     (double)($$12.l() + 1) - $$4,
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

   public void a(dva $$0, List<wk.a> $$1, aew<cpv> $$2) {
      this.b.computeIfAbsent($$2, $$0x -> new HashMap<>()).put($$0.toString(), $$0);
      Map<String, wk.a> $$3 = this.c.computeIfAbsent($$2, $$0x -> new HashMap<>());

      for (wk.a $$4 : $$1) {
         $$3.put($$4.a().toString(), $$4);
      }
   }

   @Override
   public void a() {
      this.b.clear();
      this.c.clear();
   }
}
