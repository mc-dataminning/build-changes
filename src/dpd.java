import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class dpd {
   final dpc a;
   private final ii<edt.a> b;
   private final dov c;
   private final cuw.f d;
   private final dph e;
   private final dpc f;
   private final dpc g;
   private final Map<ahf<edt.a>, edt> h;
   private final Map<ahg, dpc> i;

   public static dpd a(ii.a $$0, ahf<dou> $$1, long $$2) {
      return a($$0.b(ke.aA).b($$1).a(), $$0.b(ke.aB), $$2);
   }

   public static dpd a(dou $$0, ii<edt.a> $$1, long $$2) {
      return new dpd($$0, $$1, $$2);
   }

   private dpd(dou $$0, ii<edt.a> $$1, final long $$2) {
      this.a = $$0.d().a($$2).e();
      this.b = $$1;
      this.f = this.a.a(new ahg("aquifer")).e();
      this.g = this.a.a(new ahg("ore")).e();
      this.h = new ConcurrentHashMap<>();
      this.i = new ConcurrentHashMap<>();
      this.e = new dph(this, $$0.g(), $$0.l(), this.a);
      final boolean $$3 = $$0.n();

      class a implements doi.f {
         private final Map<doi, doi> d = new HashMap<>();

         private auu a(long $$0) {
            return new doq($$2 + $$0);
         }

         @Override
         public doi.c a(doi.c $$0) {
            ih<edt.a> $$1 = $$0.b();
            if ($$3) {
               if ($$1.a(doy.a)) {
                  edt $$2 = edt.a(this.a(0L), new edt.a(-7, 1.0, 1.0));
                  return new doi.c($$1, $$2);
               }

               if ($$1.a(doy.b)) {
                  edt $$3 = edt.a(this.a(1L), new edt.a(-7, 1.0, 1.0));
                  return new doi.c($$1, $$3);
               }

               if ($$1.a(doy.j)) {
                  edt $$4 = edt.b(dpd.this.a.a(doy.j.a()), new edt.a(0, 0.0));
                  return new doi.c($$1, $$4);
               }
            }

            edt $$5 = dpd.this.a($$1.e().orElseThrow());
            return new doi.c($$1, $$5);
         }

         private doi a(doi $$0) {
            if ($$0 instanceof edq $$1) {
               auu $$2 = $$3 ? this.a(0L) : dpd.this.a.a(new ahg("terrain"));
               return $$1.a($$2);
            } else {
               return (doi)($$0 instanceof doj.i ? new doj.i($$2) : $$0);
            }
         }

         @Override
         public doi apply(doi $$0) {
            return this.d.computeIfAbsent($$0, this::a);
         }
      }

      this.c = $$0.i().a(new a());
      doi.f $$4 = new doi.f() {
         private final Map<doi, doi> b = new HashMap<>();

         private doi a(doi $$0) {
            if ($$0 instanceof doj.j $$1) {
               return $$1.j().a();
            } else {
               return $$0 instanceof doj.l $$2 ? $$2.k() : $$0;
            }
         }

         @Override
         public doi apply(doi $$0) {
            return this.b.computeIfAbsent($$0, this::a);
         }
      };
      this.d = new cuw.f(this.c.e().a($$4), this.c.f().a($$4), this.c.g().a($$4), this.c.h().a($$4), this.c.i().a($$4), this.c.j().a($$4), $$0.k());
   }

   public edt a(ahf<edt.a> $$0) {
      return this.h.computeIfAbsent($$0, $$1 -> doy.a(this.b, this.a, $$0));
   }

   public dpc a(ahg $$0) {
      return this.i.computeIfAbsent($$0, $$1 -> this.a.a($$0).e());
   }

   public dov a() {
      return this.c;
   }

   public cuw.f b() {
      return this.d;
   }

   public dph c() {
      return this.e;
   }

   public dpc d() {
      return this.f;
   }

   public dpc e() {
      return this.g;
   }
}
