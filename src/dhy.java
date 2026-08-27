import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class dhy {
   final dhx a;
   private final hf<dwh.a> b;
   private final dhq c;
   private final cnt.f d;
   private final dic e;
   private final dhx f;
   private final dhx g;
   private final Map<acp<dwh.a>, dwh> h;
   private final Map<acq, dhx> i;

   public static dhy a(hf.a $$0, acp<dhp> $$1, long $$2) {
      return a($$0.b(jc.aw).b($$1).a(), $$0.b(jc.ax), $$2);
   }

   public static dhy a(dhp $$0, hf<dwh.a> $$1, long $$2) {
      return new dhy($$0, $$1, $$2);
   }

   private dhy(dhp $$0, hf<dwh.a> $$1, final long $$2) {
      this.a = $$0.d().a($$2).e();
      this.b = $$1;
      this.f = this.a.a(new acq("aquifer")).e();
      this.g = this.a.a(new acq("ore")).e();
      this.h = new ConcurrentHashMap<>();
      this.i = new ConcurrentHashMap<>();
      this.e = new dic(this, $$0.g(), $$0.l(), this.a);
      final boolean $$3 = $$0.n();

      class a implements dhd.f {
         private final Map<dhd, dhd> d = new HashMap<>();

         private apf a(long $$0) {
            return new dhl($$2 + $$0);
         }

         @Override
         public dhd.c a(dhd.c $$0) {
            he<dwh.a> $$1 = $$0.b();
            if ($$3) {
               if ($$1.a(dht.a)) {
                  dwh $$2 = dwh.a(this.a(0L), new dwh.a(-7, 1.0, 1.0));
                  return new dhd.c($$1, $$2);
               }

               if ($$1.a(dht.b)) {
                  dwh $$3 = dwh.a(this.a(1L), new dwh.a(-7, 1.0, 1.0));
                  return new dhd.c($$1, $$3);
               }

               if ($$1.a(dht.j)) {
                  dwh $$4 = dwh.b(dhy.this.a.a(dht.j.a()), new dwh.a(0, 0.0));
                  return new dhd.c($$1, $$4);
               }
            }

            dwh $$5 = dhy.this.a($$1.e().orElseThrow());
            return new dhd.c($$1, $$5);
         }

         private dhd a(dhd $$0) {
            if ($$0 instanceof dwe $$1) {
               apf $$2 = $$3 ? this.a(0L) : dhy.this.a.a(new acq("terrain"));
               return $$1.a($$2);
            } else {
               return (dhd)($$0 instanceof dhe.i ? new dhe.i($$2) : $$0);
            }
         }

         @Override
         public dhd apply(dhd $$0) {
            return this.d.computeIfAbsent($$0, this::a);
         }
      }

      this.c = $$0.i().a(new a());
      dhd.f $$4 = new dhd.f() {
         private final Map<dhd, dhd> b = new HashMap<>();

         private dhd a(dhd $$0) {
            if ($$0 instanceof dhe.j $$1) {
               return $$1.j().a();
            } else {
               return $$0 instanceof dhe.l $$2 ? $$2.k() : $$0;
            }
         }

         @Override
         public dhd apply(dhd $$0) {
            return this.b.computeIfAbsent($$0, this::a);
         }
      };
      this.d = new cnt.f(this.c.e().a($$4), this.c.f().a($$4), this.c.g().a($$4), this.c.h().a($$4), this.c.i().a($$4), this.c.j().a($$4), $$0.k());
   }

   public dwh a(acp<dwh.a> $$0) {
      return this.h.computeIfAbsent($$0, $$1 -> dht.a(this.b, this.a, $$0));
   }

   public dhx a(acq $$0) {
      return this.i.computeIfAbsent($$0, $$1 -> this.a.a($$0).e());
   }

   public dhq a() {
      return this.c;
   }

   public cnt.f b() {
      return this.d;
   }

   public dic c() {
      return this.e;
   }

   public dhx d() {
      return this.f;
   }

   public dhx e() {
      return this.g;
   }
}
