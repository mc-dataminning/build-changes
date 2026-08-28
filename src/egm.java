import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class egm {
   final egl a;
   private final jf<evj.a> b;
   private final ege c;
   private final dkh.f d;
   private final egq e;
   private final egl f;
   private final egl g;
   private final Map<alf<evj.a>, evj> h;
   private final Map<alg, egl> i;

   public static egm a(jf.a $$0, alf<egd> $$1, long $$2) {
      return a($$0.b(mg.aW).b($$1).a(), $$0.b(mg.aX), $$2);
   }

   public static egm a(egd $$0, jf<evj.a> $$1, long $$2) {
      return new egm($$0, $$1, $$2);
   }

   private egm(egd $$0, jf<evj.a> $$1, final long $$2) {
      this.a = $$0.d().a($$2).e();
      this.b = $$1;
      this.f = this.a.a(alg.b("aquifer")).e();
      this.g = this.a.a(alg.b("ore")).e();
      this.h = new ConcurrentHashMap<>();
      this.i = new ConcurrentHashMap<>();
      this.e = new egq(this, $$0.g(), $$0.l(), this.a);
      final boolean $$3 = $$0.n();

      class a implements efr.f {
         private final Map<efr, efr> d = new HashMap<>();

         private azv a(long $$0) {
            return new efz($$2 + $$0);
         }

         @Override
         public efr.c a(efr.c $$0) {
            je<evj.a> $$1 = $$0.b();
            if ($$3) {
               if ($$1.a(egh.a)) {
                  evj $$2 = evj.a(this.a(0L), new evj.a(-7, 1.0, 1.0));
                  return new efr.c($$1, $$2);
               }

               if ($$1.a(egh.b)) {
                  evj $$3 = evj.a(this.a(1L), new evj.a(-7, 1.0, 1.0));
                  return new efr.c($$1, $$3);
               }

               if ($$1.a(egh.j)) {
                  evj $$4 = evj.b(egm.this.a.a(egh.j.a()), new evj.a(0, 0.0));
                  return new efr.c($$1, $$4);
               }
            }

            evj $$5 = egm.this.a($$1.e().orElseThrow());
            return new efr.c($$1, $$5);
         }

         private efr a(efr $$0) {
            if ($$0 instanceof evg $$1) {
               azv $$2 = $$3 ? this.a(0L) : egm.this.a.a(alg.b("terrain"));
               return $$1.a($$2);
            } else {
               return (efr)($$0 instanceof efs.i ? new efs.i($$2) : $$0);
            }
         }

         @Override
         public efr apply(efr $$0) {
            return this.d.computeIfAbsent($$0, this::a);
         }
      }

      this.c = $$0.i().a(new a());
      efr.f $$4 = new efr.f() {
         private final Map<efr, efr> a = new HashMap<>();

         private efr a(efr $$0) {
            if ($$0 instanceof efs.j $$1) {
               return $$1.j().a();
            } else {
               return $$0 instanceof efs.l $$2 ? $$2.k() : $$0;
            }
         }

         @Override
         public efr apply(efr $$0) {
            return this.a.computeIfAbsent($$0, this::a);
         }
      };
      this.d = new dkh.f(this.c.e().a($$4), this.c.f().a($$4), this.c.g().a($$4), this.c.h().a($$4), this.c.i().a($$4), this.c.j().a($$4), $$0.k());
   }

   public evj a(alf<evj.a> $$0) {
      return this.h.computeIfAbsent($$0, $$1 -> egh.a(this.b, this.a, $$0));
   }

   public egl a(alg $$0) {
      return this.i.computeIfAbsent($$0, $$1 -> this.a.a($$0).e());
   }

   public ege a() {
      return this.c;
   }

   public dkh.f b() {
      return this.d;
   }

   public egq c() {
      return this.e;
   }

   public egl d() {
      return this.f;
   }

   public egl e() {
      return this.g;
   }
}
