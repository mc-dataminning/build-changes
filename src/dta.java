import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class dta {
   final dsz a;
   private final im<ehq.a> b;
   private final dss c;
   private final cyh.f d;
   private final dte e;
   private final dsz f;
   private final dsz g;
   private final Map<ajg<ehq.a>, ehq> h;
   private final Map<ajh, dsz> i;

   public static dta a(im.a $$0, ajg<dsr> $$1, long $$2) {
      return a($$0.b(kj.aB).b($$1).a(), $$0.b(kj.aC), $$2);
   }

   public static dta a(dsr $$0, im<ehq.a> $$1, long $$2) {
      return new dta($$0, $$1, $$2);
   }

   private dta(dsr $$0, im<ehq.a> $$1, final long $$2) {
      this.a = $$0.d().a($$2).e();
      this.b = $$1;
      this.f = this.a.a(new ajh("aquifer")).e();
      this.g = this.a.a(new ajh("ore")).e();
      this.h = new ConcurrentHashMap<>();
      this.i = new ConcurrentHashMap<>();
      this.e = new dte(this, $$0.g(), $$0.l(), this.a);
      final boolean $$3 = $$0.n();

      class a implements dsf.f {
         private final Map<dsf, dsf> d = new HashMap<>();

         private axd a(long $$0) {
            return new dsn($$2 + $$0);
         }

         @Override
         public dsf.c a(dsf.c $$0) {
            il<ehq.a> $$1 = $$0.b();
            if ($$3) {
               if ($$1.a(dsv.a)) {
                  ehq $$2 = ehq.a(this.a(0L), new ehq.a(-7, 1.0, 1.0));
                  return new dsf.c($$1, $$2);
               }

               if ($$1.a(dsv.b)) {
                  ehq $$3 = ehq.a(this.a(1L), new ehq.a(-7, 1.0, 1.0));
                  return new dsf.c($$1, $$3);
               }

               if ($$1.a(dsv.j)) {
                  ehq $$4 = ehq.b(dta.this.a.a(dsv.j.a()), new ehq.a(0, 0.0));
                  return new dsf.c($$1, $$4);
               }
            }

            ehq $$5 = dta.this.a($$1.e().orElseThrow());
            return new dsf.c($$1, $$5);
         }

         private dsf a(dsf $$0) {
            if ($$0 instanceof ehn $$1) {
               axd $$2 = $$3 ? this.a(0L) : dta.this.a.a(new ajh("terrain"));
               return $$1.a($$2);
            } else {
               return (dsf)($$0 instanceof dsg.i ? new dsg.i($$2) : $$0);
            }
         }

         @Override
         public dsf apply(dsf $$0) {
            return this.d.computeIfAbsent($$0, this::a);
         }
      }

      this.c = $$0.i().a(new a());
      dsf.f $$4 = new dsf.f() {
         private final Map<dsf, dsf> b = new HashMap<>();

         private dsf a(dsf $$0) {
            if ($$0 instanceof dsg.j $$1) {
               return $$1.j().a();
            } else {
               return $$0 instanceof dsg.l $$2 ? $$2.k() : $$0;
            }
         }

         @Override
         public dsf apply(dsf $$0) {
            return this.b.computeIfAbsent($$0, this::a);
         }
      };
      this.d = new cyh.f(this.c.e().a($$4), this.c.f().a($$4), this.c.g().a($$4), this.c.h().a($$4), this.c.i().a($$4), this.c.j().a($$4), $$0.k());
   }

   public ehq a(ajg<ehq.a> $$0) {
      return this.h.computeIfAbsent($$0, $$1 -> dsv.a(this.b, this.a, $$0));
   }

   public dsz a(ajh $$0) {
      return this.i.computeIfAbsent($$0, $$1 -> this.a.a($$0).e());
   }

   public dss a() {
      return this.c;
   }

   public cyh.f b() {
      return this.d;
   }

   public dte c() {
      return this.e;
   }

   public dsz d() {
      return this.f;
   }

   public dsz e() {
      return this.g;
   }
}
