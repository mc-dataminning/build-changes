import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class dly {
   final dlx a;
   private final ic<eah.a> b;
   private final dlq c;
   private final csg.f d;
   private final dmc e;
   private final dlx f;
   private final dlx g;
   private final Map<afv<eah.a>, eah> h;
   private final Map<afw, dlx> i;

   public static dly a(ic.a $$0, afv<dlp> $$1, long $$2) {
      return a($$0.b(jz.ax).b($$1).a(), $$0.b(jz.ay), $$2);
   }

   public static dly a(dlp $$0, ic<eah.a> $$1, long $$2) {
      return new dly($$0, $$1, $$2);
   }

   private dly(dlp $$0, ic<eah.a> $$1, final long $$2) {
      this.a = $$0.d().a($$2).e();
      this.b = $$1;
      this.f = this.a.a(new afw("aquifer")).e();
      this.g = this.a.a(new afw("ore")).e();
      this.h = new ConcurrentHashMap<>();
      this.i = new ConcurrentHashMap<>();
      this.e = new dmc(this, $$0.g(), $$0.l(), this.a);
      final boolean $$3 = $$0.n();

      class a implements dld.f {
         private final Map<dld, dld> d = new HashMap<>();

         private ate a(long $$0) {
            return new dll($$2 + $$0);
         }

         @Override
         public dld.c a(dld.c $$0) {
            ib<eah.a> $$1 = $$0.b();
            if ($$3) {
               if ($$1.a(dlt.a)) {
                  eah $$2 = eah.a(this.a(0L), new eah.a(-7, 1.0, 1.0));
                  return new dld.c($$1, $$2);
               }

               if ($$1.a(dlt.b)) {
                  eah $$3 = eah.a(this.a(1L), new eah.a(-7, 1.0, 1.0));
                  return new dld.c($$1, $$3);
               }

               if ($$1.a(dlt.j)) {
                  eah $$4 = eah.b(dly.this.a.a(dlt.j.a()), new eah.a(0, 0.0));
                  return new dld.c($$1, $$4);
               }
            }

            eah $$5 = dly.this.a($$1.e().orElseThrow());
            return new dld.c($$1, $$5);
         }

         private dld a(dld $$0) {
            if ($$0 instanceof eae $$1) {
               ate $$2 = $$3 ? this.a(0L) : dly.this.a.a(new afw("terrain"));
               return $$1.a($$2);
            } else {
               return (dld)($$0 instanceof dle.i ? new dle.i($$2) : $$0);
            }
         }

         @Override
         public dld apply(dld $$0) {
            return this.d.computeIfAbsent($$0, this::a);
         }
      }

      this.c = $$0.i().a(new a());
      dld.f $$4 = new dld.f() {
         private final Map<dld, dld> b = new HashMap<>();

         private dld a(dld $$0) {
            if ($$0 instanceof dle.j $$1) {
               return $$1.j().a();
            } else {
               return $$0 instanceof dle.l $$2 ? $$2.k() : $$0;
            }
         }

         @Override
         public dld apply(dld $$0) {
            return this.b.computeIfAbsent($$0, this::a);
         }
      };
      this.d = new csg.f(this.c.e().a($$4), this.c.f().a($$4), this.c.g().a($$4), this.c.h().a($$4), this.c.i().a($$4), this.c.j().a($$4), $$0.k());
   }

   public eah a(afv<eah.a> $$0) {
      return this.h.computeIfAbsent($$0, $$1 -> dlt.a(this.b, this.a, $$0));
   }

   public dlx a(afw $$0) {
      return this.i.computeIfAbsent($$0, $$1 -> this.a.a($$0).e());
   }

   public dlq a() {
      return this.c;
   }

   public csg.f b() {
      return this.d;
   }

   public dmc c() {
      return this.e;
   }

   public dlx d() {
      return this.f;
   }

   public dlx e() {
      return this.g;
   }
}
