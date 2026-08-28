import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class edx {
   final edw a;
   private final jr<est.a> b;
   private final edp c;
   private final dik.f d;
   private final eeb e;
   private final edw f;
   private final edw g;
   private final Map<alo<est.a>, est> h;
   private final Map<alp, edw> i;

   public static edx a(jr.a $$0, alo<edo> $$1, long $$2) {
      return a($$0.b(mb.aR).b($$1).a(), $$0.b(mb.aS), $$2);
   }

   public static edx a(edo $$0, jr<est.a> $$1, long $$2) {
      return new edx($$0, $$1, $$2);
   }

   private edx(edo $$0, jr<est.a> $$1, final long $$2) {
      this.a = $$0.d().a($$2).e();
      this.b = $$1;
      this.f = this.a.a(alp.b("aquifer")).e();
      this.g = this.a.a(alp.b("ore")).e();
      this.h = new ConcurrentHashMap<>();
      this.i = new ConcurrentHashMap<>();
      this.e = new eeb(this, $$0.g(), $$0.l(), this.a);
      final boolean $$3 = $$0.n();

      class a implements edc.f {
         private final Map<edc, edc> d = new HashMap<>();

         private bac a(long $$0) {
            return new edk($$2 + $$0);
         }

         @Override
         public edc.c a(edc.c $$0) {
            jq<est.a> $$1 = $$0.b();
            if ($$3) {
               if ($$1.a(eds.a)) {
                  est $$2 = est.a(this.a(0L), new est.a(-7, 1.0, 1.0));
                  return new edc.c($$1, $$2);
               }

               if ($$1.a(eds.b)) {
                  est $$3 = est.a(this.a(1L), new est.a(-7, 1.0, 1.0));
                  return new edc.c($$1, $$3);
               }

               if ($$1.a(eds.j)) {
                  est $$4 = est.b(edx.this.a.a(eds.j.a()), new est.a(0, 0.0));
                  return new edc.c($$1, $$4);
               }
            }

            est $$5 = edx.this.a($$1.e().orElseThrow());
            return new edc.c($$1, $$5);
         }

         private edc a(edc $$0) {
            if ($$0 instanceof esq $$1) {
               bac $$2 = $$3 ? this.a(0L) : edx.this.a.a(alp.b("terrain"));
               return $$1.a($$2);
            } else {
               return (edc)($$0 instanceof edd.i ? new edd.i($$2) : $$0);
            }
         }

         @Override
         public edc apply(edc $$0) {
            return this.d.computeIfAbsent($$0, this::a);
         }
      }

      this.c = $$0.i().a(new a());
      edc.f $$4 = new edc.f() {
         private final Map<edc, edc> a = new HashMap<>();

         private edc a(edc $$0) {
            if ($$0 instanceof edd.j $$1) {
               return $$1.j().a();
            } else {
               return $$0 instanceof edd.l $$2 ? $$2.k() : $$0;
            }
         }

         @Override
         public edc apply(edc $$0) {
            return this.a.computeIfAbsent($$0, this::a);
         }
      };
      this.d = new dik.f(this.c.e().a($$4), this.c.f().a($$4), this.c.g().a($$4), this.c.h().a($$4), this.c.i().a($$4), this.c.j().a($$4), $$0.k());
   }

   public est a(alo<est.a> $$0) {
      return this.h.computeIfAbsent($$0, $$1 -> eds.a(this.b, this.a, $$0));
   }

   public edw a(alp $$0) {
      return this.i.computeIfAbsent($$0, $$1 -> this.a.a($$0).e());
   }

   public edp a() {
      return this.c;
   }

   public dik.f b() {
      return this.d;
   }

   public eeb c() {
      return this.e;
   }

   public edw d() {
      return this.f;
   }

   public edw e() {
      return this.g;
   }
}
