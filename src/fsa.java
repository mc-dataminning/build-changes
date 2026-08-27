import com.google.common.collect.Maps;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class fsa implements frp.a {
   private final eqx a;
   private final Map<aex<cpx>, Map<String, dvc>> b = Maps.newIdentityHashMap();
   private final Map<aex<cpx>, Map<String, wm.a>> c = Maps.newIdentityHashMap();
   private static final int d = 500;

   public fsa(eqx $$0) {
      this.a = $$0;
   }

   @Override
   public void a(elr $$0, fog $$1, double $$2, double $$3, double $$4) {
      eqi $$5 = this.a.j.m();
      aex<cpx> $$6 = this.a.r.ac();
      gw $$7 = gw.a($$5.b().c, 0.0, $$5.b().e);
      elv $$8 = $$1.getBuffer(foo.x());
      if (this.b.containsKey($$6)) {
         for (dvc $$9 : this.b.get($$6).values()) {
            if ($$7.a($$9.f(), 500.0)) {
               foe.a(
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

      Map<String, wm.a> $$10 = this.c.get($$6);
      if ($$10 != null) {
         for (wm.a $$11 : $$10.values()) {
            dvc $$12 = $$11.a();
            if ($$7.a($$12.f(), 500.0)) {
               if ($$11.b()) {
                  foe.a(
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
                  foe.a(
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

   public void a(dvc $$0, List<wm.a> $$1, aex<cpx> $$2) {
      this.b.computeIfAbsent($$2, $$0x -> new HashMap<>()).put($$0.toString(), $$0);
      Map<String, wm.a> $$3 = this.c.computeIfAbsent($$2, $$0x -> new HashMap<>());

      for (wm.a $$4 : $$1) {
         $$3.put($$4.a().toString(), $$4);
      }
   }

   @Override
   public void a() {
      this.b.clear();
      this.c.clear();
   }
}
