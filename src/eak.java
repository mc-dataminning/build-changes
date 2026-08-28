import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class eak {
   final eaj a;
   private final jo<epe.a> b;
   private final eac c;
   private final dfc.f d;
   private final eao e;
   private final eaj f;
   private final eaj g;
   private final Map<ala<epe.a>, epe> h;
   private final Map<alb, eaj> i;

   public static eak a(jo.a $$0, ala<eab> $$1, long $$2) {
      return a($$0.b(lv.aO).b($$1).a(), $$0.b(lv.aP), $$2);
   }

   public static eak a(eab $$0, jo<epe.a> $$1, long $$2) {
      return new eak($$0, $$1, $$2);
   }

   private eak(eab $$0, jo<epe.a> $$1, final long $$2) {
      this.a = $$0.d().a($$2).e();
      this.b = $$1;
      this.f = this.a.a(alb.b("aquifer")).e();
      this.g = this.a.a(alb.b("ore")).e();
      this.h = new ConcurrentHashMap<>();
      this.i = new ConcurrentHashMap<>();
      this.e = new eao(this, $$0.g(), $$0.l(), this.a);
      final boolean $$3 = $$0.n();

      class a implements dzp.f {
         private final Map<dzp, dzp> d = new HashMap<>();

         private azk a(long $$0) {
            return new dzx($$2 + $$0);
         }

         @Override
         public dzp.c a(dzp.c $$0) {
            jn<epe.a> $$1 = $$0.b();
            if ($$3) {
               if ($$1.a(eaf.a)) {
                  epe $$2 = epe.a(this.a(0L), new epe.a(-7, 1.0, 1.0));
                  return new dzp.c($$1, $$2);
               }

               if ($$1.a(eaf.b)) {
                  epe $$3 = epe.a(this.a(1L), new epe.a(-7, 1.0, 1.0));
                  return new dzp.c($$1, $$3);
               }

               if ($$1.a(eaf.j)) {
                  epe $$4 = epe.b(eak.this.a.a(eaf.j.a()), new epe.a(0, 0.0));
                  return new dzp.c($$1, $$4);
               }
            }

            epe $$5 = eak.this.a($$1.e().orElseThrow());
            return new dzp.c($$1, $$5);
         }

         private dzp a(dzp $$0) {
            if ($$0 instanceof epb $$1) {
               azk $$2 = $$3 ? this.a(0L) : eak.this.a.a(alb.b("terrain"));
               return $$1.a($$2);
            } else {
               return (dzp)($$0 instanceof dzq.i ? new dzq.i($$2) : $$0);
            }
         }

         @Override
         public dzp apply(dzp $$0) {
            return this.d.computeIfAbsent($$0, this::a);
         }
      }

      this.c = $$0.i().a(new a());
      dzp.f $$4 = new dzp.f() {
         private final Map<dzp, dzp> a = new HashMap<>();

         private dzp a(dzp $$0) {
            if ($$0 instanceof dzq.j $$1) {
               return $$1.j().a();
            } else {
               return $$0 instanceof dzq.l $$2 ? $$2.k() : $$0;
            }
         }

         @Override
         public dzp apply(dzp $$0) {
            return this.a.computeIfAbsent($$0, this::a);
         }
      };
      this.d = new dfc.f(this.c.e().a($$4), this.c.f().a($$4), this.c.g().a($$4), this.c.h().a($$4), this.c.i().a($$4), this.c.j().a($$4), $$0.k());
   }

   public epe a(ala<epe.a> $$0) {
      return this.h.computeIfAbsent($$0, $$1 -> eaf.a(this.b, this.a, $$0));
   }

   public eaj a(alb $$0) {
      return this.i.computeIfAbsent($$0, $$1 -> this.a.a($$0).e());
   }

   public eac a() {
      return this.c;
   }

   public dfc.f b() {
      return this.d;
   }

   public eao c() {
      return this.e;
   }

   public eaj d() {
      return this.f;
   }

   public eaj e() {
      return this.g;
   }
}
