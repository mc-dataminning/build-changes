import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class dpe {
   final dpd a;
   private final ii<edu.a> b;
   private final dow c;
   private final cux.f d;
   private final dpi e;
   private final dpd f;
   private final dpd g;
   private final Map<ahf<edu.a>, edu> h;
   private final Map<ahg, dpd> i;

   public static dpe a(ii.a $$0, ahf<dov> $$1, long $$2) {
      return a($$0.b(ke.aA).b($$1).a(), $$0.b(ke.aB), $$2);
   }

   public static dpe a(dov $$0, ii<edu.a> $$1, long $$2) {
      return new dpe($$0, $$1, $$2);
   }

   private dpe(dov $$0, ii<edu.a> $$1, final long $$2) {
      this.a = $$0.d().a($$2).e();
      this.b = $$1;
      this.f = this.a.a(new ahg("aquifer")).e();
      this.g = this.a.a(new ahg("ore")).e();
      this.h = new ConcurrentHashMap<>();
      this.i = new ConcurrentHashMap<>();
      this.e = new dpi(this, $$0.g(), $$0.l(), this.a);
      final boolean $$3 = $$0.n();

      class a implements doj.f {
         private final Map<doj, doj> d = new HashMap<>();

         private auv a(long $$0) {
            return new dor($$2 + $$0);
         }

         @Override
         public doj.c a(doj.c $$0) {
            ih<edu.a> $$1 = $$0.b();
            if ($$3) {
               if ($$1.a(doz.a)) {
                  edu $$2 = edu.a(this.a(0L), new edu.a(-7, 1.0, 1.0));
                  return new doj.c($$1, $$2);
               }

               if ($$1.a(doz.b)) {
                  edu $$3 = edu.a(this.a(1L), new edu.a(-7, 1.0, 1.0));
                  return new doj.c($$1, $$3);
               }

               if ($$1.a(doz.j)) {
                  edu $$4 = edu.b(dpe.this.a.a(doz.j.a()), new edu.a(0, 0.0));
                  return new doj.c($$1, $$4);
               }
            }

            edu $$5 = dpe.this.a($$1.e().orElseThrow());
            return new doj.c($$1, $$5);
         }

         private doj a(doj $$0) {
            if ($$0 instanceof edr $$1) {
               auv $$2 = $$3 ? this.a(0L) : dpe.this.a.a(new ahg("terrain"));
               return $$1.a($$2);
            } else {
               return (doj)($$0 instanceof dok.i ? new dok.i($$2) : $$0);
            }
         }

         @Override
         public doj apply(doj $$0) {
            return this.d.computeIfAbsent($$0, this::a);
         }
      }

      this.c = $$0.i().a(new a());
      doj.f $$4 = new doj.f() {
         private final Map<doj, doj> b = new HashMap<>();

         private doj a(doj $$0) {
            if ($$0 instanceof dok.j $$1) {
               return $$1.j().a();
            } else {
               return $$0 instanceof dok.l $$2 ? $$2.k() : $$0;
            }
         }

         @Override
         public doj apply(doj $$0) {
            return this.b.computeIfAbsent($$0, this::a);
         }
      };
      this.d = new cux.f(this.c.e().a($$4), this.c.f().a($$4), this.c.g().a($$4), this.c.h().a($$4), this.c.i().a($$4), this.c.j().a($$4), $$0.k());
   }

   public edu a(ahf<edu.a> $$0) {
      return this.h.computeIfAbsent($$0, $$1 -> doz.a(this.b, this.a, $$0));
   }

   public dpd a(ahg $$0) {
      return this.i.computeIfAbsent($$0, $$1 -> this.a.a($$0).e());
   }

   public dow a() {
      return this.c;
   }

   public cux.f b() {
      return this.d;
   }

   public dpi c() {
      return this.e;
   }

   public dpd d() {
      return this.f;
   }

   public dpd e() {
      return this.g;
   }
}
