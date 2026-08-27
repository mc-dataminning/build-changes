import com.google.common.collect.Maps;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class fru implements frj.a {
   private final eqp a;
   private final Map<aey<cqb>, Map<String, duu>> b = Maps.newIdentityHashMap();
   private final Map<aey<cqb>, Map<String, wl.a>> c = Maps.newIdentityHashMap();
   private static final int d = 500;

   public fru(eqp $$0) {
      this.a = $$0;
   }

   @Override
   public void a(elj $$0, foa $$1, double $$2, double $$3, double $$4) {
      eqa $$5 = this.a.j.m();
      aey<cqb> $$6 = this.a.r.ac();
      gw $$7 = gw.a($$5.b().c, 0.0, $$5.b().e);
      eln $$8 = $$1.getBuffer(foi.x());
      if (this.b.containsKey($$6)) {
         for (duu $$9 : this.b.get($$6).values()) {
            if ($$7.a($$9.f(), 500.0)) {
               fny.a(
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

      Map<String, wl.a> $$10 = this.c.get($$6);
      if ($$10 != null) {
         for (wl.a $$11 : $$10.values()) {
            duu $$12 = $$11.a();
            if ($$7.a($$12.f(), 500.0)) {
               if ($$11.b()) {
                  fny.a(
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
                  fny.a(
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

   public void a(duu $$0, List<wl.a> $$1, aey<cqb> $$2) {
      this.b.computeIfAbsent($$2, $$0x -> new HashMap<>()).put($$0.toString(), $$0);
      Map<String, wl.a> $$3 = this.c.computeIfAbsent($$2, $$0x -> new HashMap<>());

      for (wl.a $$4 : $$1) {
         $$3.put($$4.a().toString(), $$4);
      }
   }

   @Override
   public void a() {
      this.b.clear();
      this.c.clear();
   }
}
