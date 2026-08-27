import com.google.common.collect.Maps;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class fub implements ftq.a {
   private final esr a;
   private final Map<agf<crs>, Map<String, dwn>> b = Maps.newIdentityHashMap();
   private final Map<agf<crs>, Map<String, xr.a>> c = Maps.newIdentityHashMap();
   private static final int d = 500;

   public fub(esr $$0) {
      this.a = $$0;
   }

   @Override
   public void a(enk $$0, fqh $$1, double $$2, double $$3, double $$4) {
      esc $$5 = this.a.j.m();
      agf<crs> $$6 = this.a.r.ac();
      ht $$7 = ht.a($$5.b().c, 0.0, $$5.b().e);
      eno $$8 = $$1.getBuffer(fqp.w());
      if (this.b.containsKey($$6)) {
         for (dwn $$9 : this.b.get($$6).values()) {
            if ($$7.a($$9.f(), 500.0)) {
               fqf.a(
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

      Map<String, xr.a> $$10 = this.c.get($$6);
      if ($$10 != null) {
         for (xr.a $$11 : $$10.values()) {
            dwn $$12 = $$11.a();
            if ($$7.a($$12.f(), 500.0)) {
               if ($$11.b()) {
                  fqf.a(
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
                  fqf.a(
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

   public void a(dwn $$0, List<xr.a> $$1, agf<crs> $$2) {
      this.b.computeIfAbsent($$2, $$0x -> new HashMap<>()).put($$0.toString(), $$0);
      Map<String, xr.a> $$3 = this.c.computeIfAbsent($$2, $$0x -> new HashMap<>());

      for (xr.a $$4 : $$1) {
         $$3.put($$4.a().toString(), $$4);
      }
   }

   @Override
   public void a() {
      this.b.clear();
      this.c.clear();
   }
}
