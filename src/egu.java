import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class egu {
   final egt a;
   private final jf<evr.a> b;
   private final egm c;
   private final dkm.f d;
   private final egy e;
   private final egt f;
   private final egt g;
   private final Map<alf<evr.a>, evr> h;
   private final Map<alg, egt> i;

   public static egu a(jf.a $$0, alf<egl> $$1, long $$2) {
      return a($$0.b(mg.aX).b($$1).a(), $$0.b(mg.aY), $$2);
   }

   public static egu a(egl $$0, jf<evr.a> $$1, long $$2) {
      return new egu($$0, $$1, $$2);
   }

   private egu(egl $$0, jf<evr.a> $$1, final long $$2) {
      this.a = $$0.d().a($$2).e();
      this.b = $$1;
      this.f = this.a.a(alg.b("aquifer")).e();
      this.g = this.a.a(alg.b("ore")).e();
      this.h = new ConcurrentHashMap<>();
      this.i = new ConcurrentHashMap<>();
      this.e = new egy(this, $$0.g(), $$0.l(), this.a);
      final boolean $$3 = $$0.n();

      class a implements efz.f {
         private final Map<efz, efz> d = new HashMap<>();

         private azv a(long $$0) {
            return new egh($$2 + $$0);
         }

         @Override
         public efz.c a(efz.c $$0) {
            je<evr.a> $$1 = $$0.b();
            if ($$3) {
               if ($$1.a(egp.a)) {
                  evr $$2 = evr.a(this.a(0L), new evr.a(-7, 1.0, 1.0));
                  return new efz.c($$1, $$2);
               }

               if ($$1.a(egp.b)) {
                  evr $$3 = evr.a(this.a(1L), new evr.a(-7, 1.0, 1.0));
                  return new efz.c($$1, $$3);
               }

               if ($$1.a(egp.j)) {
                  evr $$4 = evr.b(egu.this.a.a(egp.j.a()), new evr.a(0, 0.0));
                  return new efz.c($$1, $$4);
               }
            }

            evr $$5 = egu.this.a($$1.e().orElseThrow());
            return new efz.c($$1, $$5);
         }

         private efz a(efz $$0) {
            if ($$0 instanceof evo $$1) {
               azv $$2 = $$3 ? this.a(0L) : egu.this.a.a(alg.b("terrain"));
               return $$1.a($$2);
            } else {
               return (efz)($$0 instanceof ega.i ? new ega.i($$2) : $$0);
            }
         }

         @Override
         public efz apply(efz $$0) {
            return this.d.computeIfAbsent($$0, this::a);
         }
      }

      this.c = $$0.i().a(new a());
      efz.f $$4 = new efz.f() {
         private final Map<efz, efz> a = new HashMap<>();

         private efz a(efz $$0) {
            if ($$0 instanceof ega.j $$1) {
               return $$1.j().a();
            } else {
               return $$0 instanceof ega.l $$2 ? $$2.k() : $$0;
            }
         }

         @Override
         public efz apply(efz $$0) {
            return this.a.computeIfAbsent($$0, this::a);
         }
      };
      this.d = new dkm.f(this.c.e().a($$4), this.c.f().a($$4), this.c.g().a($$4), this.c.h().a($$4), this.c.i().a($$4), this.c.j().a($$4), $$0.k());
   }

   public evr a(alf<evr.a> $$0) {
      return this.h.computeIfAbsent($$0, $$1 -> egp.a(this.b, this.a, $$0));
   }

   public egt a(alg $$0) {
      return this.i.computeIfAbsent($$0, $$1 -> this.a.a($$0).e());
   }

   public egm a() {
      return this.c;
   }

   public dkm.f b() {
      return this.d;
   }

   public egy c() {
      return this.e;
   }

   public egt d() {
      return this.f;
   }

   public egt e() {
      return this.g;
   }
}
