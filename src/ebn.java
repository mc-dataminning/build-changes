import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class ebn {
   final ebm a;
   private final jq<eqh.a> b;
   private final ebf c;
   private final dgf.f d;
   private final ebr e;
   private final ebm f;
   private final ebm g;
   private final Map<alg<eqh.a>, eqh> h;
   private final Map<alh, ebm> i;

   public static ebn a(jq.a $$0, alg<ebe> $$1, long $$2) {
      return a($$0.b(ly.aP).b($$1).a(), $$0.b(ly.aQ), $$2);
   }

   public static ebn a(ebe $$0, jq<eqh.a> $$1, long $$2) {
      return new ebn($$0, $$1, $$2);
   }

   private ebn(ebe $$0, jq<eqh.a> $$1, final long $$2) {
      this.a = $$0.d().a($$2).e();
      this.b = $$1;
      this.f = this.a.a(alh.b("aquifer")).e();
      this.g = this.a.a(alh.b("ore")).e();
      this.h = new ConcurrentHashMap<>();
      this.i = new ConcurrentHashMap<>();
      this.e = new ebr(this, $$0.g(), $$0.l(), this.a);
      final boolean $$3 = $$0.n();

      class a implements eas.f {
         private final Map<eas, eas> d = new HashMap<>();

         private azr a(long $$0) {
            return new eba($$2 + $$0);
         }

         @Override
         public eas.c a(eas.c $$0) {
            jp<eqh.a> $$1 = $$0.b();
            if ($$3) {
               if ($$1.a(ebi.a)) {
                  eqh $$2 = eqh.a(this.a(0L), new eqh.a(-7, 1.0, 1.0));
                  return new eas.c($$1, $$2);
               }

               if ($$1.a(ebi.b)) {
                  eqh $$3 = eqh.a(this.a(1L), new eqh.a(-7, 1.0, 1.0));
                  return new eas.c($$1, $$3);
               }

               if ($$1.a(ebi.j)) {
                  eqh $$4 = eqh.b(ebn.this.a.a(ebi.j.a()), new eqh.a(0, 0.0));
                  return new eas.c($$1, $$4);
               }
            }

            eqh $$5 = ebn.this.a($$1.e().orElseThrow());
            return new eas.c($$1, $$5);
         }

         private eas a(eas $$0) {
            if ($$0 instanceof eqe $$1) {
               azr $$2 = $$3 ? this.a(0L) : ebn.this.a.a(alh.b("terrain"));
               return $$1.a($$2);
            } else {
               return (eas)($$0 instanceof eat.i ? new eat.i($$2) : $$0);
            }
         }

         @Override
         public eas apply(eas $$0) {
            return this.d.computeIfAbsent($$0, this::a);
         }
      }

      this.c = $$0.i().a(new a());
      eas.f $$4 = new eas.f() {
         private final Map<eas, eas> a = new HashMap<>();

         private eas a(eas $$0) {
            if ($$0 instanceof eat.j $$1) {
               return $$1.j().a();
            } else {
               return $$0 instanceof eat.l $$2 ? $$2.k() : $$0;
            }
         }

         @Override
         public eas apply(eas $$0) {
            return this.a.computeIfAbsent($$0, this::a);
         }
      };
      this.d = new dgf.f(this.c.e().a($$4), this.c.f().a($$4), this.c.g().a($$4), this.c.h().a($$4), this.c.i().a($$4), this.c.j().a($$4), $$0.k());
   }

   public eqh a(alg<eqh.a> $$0) {
      return this.h.computeIfAbsent($$0, $$1 -> ebi.a(this.b, this.a, $$0));
   }

   public ebm a(alh $$0) {
      return this.i.computeIfAbsent($$0, $$1 -> this.a.a($$0).e());
   }

   public ebf a() {
      return this.c;
   }

   public dgf.f b() {
      return this.d;
   }

   public ebr c() {
      return this.e;
   }

   public ebm d() {
      return this.f;
   }

   public ebm e() {
      return this.g;
   }
}
