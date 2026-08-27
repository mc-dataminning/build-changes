import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class dkv {
   final dku a;
   private final hg<dze.a> b;
   private final dkn c;
   private final cqr.f d;
   private final dkz e;
   private final dku f;
   private final dku g;
   private final Map<aeo<dze.a>, dze> h;
   private final Map<aep, dku> i;

   public static dkv a(hg.a $$0, aeo<dkm> $$1, long $$2) {
      return a($$0.b(jd.aw).b($$1).a(), $$0.b(jd.ax), $$2);
   }

   public static dkv a(dkm $$0, hg<dze.a> $$1, long $$2) {
      return new dkv($$0, $$1, $$2);
   }

   private dkv(dkm $$0, hg<dze.a> $$1, final long $$2) {
      this.a = $$0.d().a($$2).e();
      this.b = $$1;
      this.f = this.a.a(new aep("aquifer")).e();
      this.g = this.a.a(new aep("ore")).e();
      this.h = new ConcurrentHashMap<>();
      this.i = new ConcurrentHashMap<>();
      this.e = new dkz(this, $$0.g(), $$0.l(), this.a);
      final boolean $$3 = $$0.n();

      class a implements dka.f {
         private final Map<dka, dka> d = new HashMap<>();

         private art a(long $$0) {
            return new dki($$2 + $$0);
         }

         @Override
         public dka.c a(dka.c $$0) {
            hf<dze.a> $$1 = $$0.b();
            if ($$3) {
               if ($$1.a(dkq.a)) {
                  dze $$2 = dze.a(this.a(0L), new dze.a(-7, 1.0, 1.0));
                  return new dka.c($$1, $$2);
               }

               if ($$1.a(dkq.b)) {
                  dze $$3 = dze.a(this.a(1L), new dze.a(-7, 1.0, 1.0));
                  return new dka.c($$1, $$3);
               }

               if ($$1.a(dkq.j)) {
                  dze $$4 = dze.b(dkv.this.a.a(dkq.j.a()), new dze.a(0, 0.0));
                  return new dka.c($$1, $$4);
               }
            }

            dze $$5 = dkv.this.a($$1.e().orElseThrow());
            return new dka.c($$1, $$5);
         }

         private dka a(dka $$0) {
            if ($$0 instanceof dzb $$1) {
               art $$2 = $$3 ? this.a(0L) : dkv.this.a.a(new aep("terrain"));
               return $$1.a($$2);
            } else {
               return (dka)($$0 instanceof dkb.i ? new dkb.i($$2) : $$0);
            }
         }

         @Override
         public dka apply(dka $$0) {
            return this.d.computeIfAbsent($$0, this::a);
         }
      }

      this.c = $$0.i().a(new a());
      dka.f $$4 = new dka.f() {
         private final Map<dka, dka> b = new HashMap<>();

         private dka a(dka $$0) {
            if ($$0 instanceof dkb.j $$1) {
               return $$1.j().a();
            } else {
               return $$0 instanceof dkb.l $$2 ? $$2.k() : $$0;
            }
         }

         @Override
         public dka apply(dka $$0) {
            return this.b.computeIfAbsent($$0, this::a);
         }
      };
      this.d = new cqr.f(this.c.e().a($$4), this.c.f().a($$4), this.c.g().a($$4), this.c.h().a($$4), this.c.i().a($$4), this.c.j().a($$4), $$0.k());
   }

   public dze a(aeo<dze.a> $$0) {
      return this.h.computeIfAbsent($$0, $$1 -> dkq.a(this.b, this.a, $$0));
   }

   public dku a(aep $$0) {
      return this.i.computeIfAbsent($$0, $$1 -> this.a.a($$0).e());
   }

   public dkn a() {
      return this.c;
   }

   public cqr.f b() {
      return this.d;
   }

   public dkz c() {
      return this.e;
   }

   public dku d() {
      return this.f;
   }

   public dku e() {
      return this.g;
   }
}
