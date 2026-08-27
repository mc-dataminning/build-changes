import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class dom {
   final dol a;
   private final ig<edc.a> b;
   private final doe c;
   private final cug.f d;
   private final doq e;
   private final dol f;
   private final dol g;
   private final Map<ags<edc.a>, edc> h;
   private final Map<agt, dol> i;

   public static dom a(ig.a $$0, ags<dod> $$1, long $$2) {
      return a($$0.b(kc.az).b($$1).a(), $$0.b(kc.aA), $$2);
   }

   public static dom a(dod $$0, ig<edc.a> $$1, long $$2) {
      return new dom($$0, $$1, $$2);
   }

   private dom(dod $$0, ig<edc.a> $$1, final long $$2) {
      this.a = $$0.d().a($$2).e();
      this.b = $$1;
      this.f = this.a.a(new agt("aquifer")).e();
      this.g = this.a.a(new agt("ore")).e();
      this.h = new ConcurrentHashMap<>();
      this.i = new ConcurrentHashMap<>();
      this.e = new doq(this, $$0.g(), $$0.l(), this.a);
      final boolean $$3 = $$0.n();

      class a implements dnr.f {
         private final Map<dnr, dnr> d = new HashMap<>();

         private auf a(long $$0) {
            return new dnz($$2 + $$0);
         }

         @Override
         public dnr.c a(dnr.c $$0) {
            ie<edc.a> $$1 = $$0.b();
            if ($$3) {
               if ($$1.a(doh.a)) {
                  edc $$2 = edc.a(this.a(0L), new edc.a(-7, 1.0, 1.0));
                  return new dnr.c($$1, $$2);
               }

               if ($$1.a(doh.b)) {
                  edc $$3 = edc.a(this.a(1L), new edc.a(-7, 1.0, 1.0));
                  return new dnr.c($$1, $$3);
               }

               if ($$1.a(doh.j)) {
                  edc $$4 = edc.b(dom.this.a.a(doh.j.a()), new edc.a(0, 0.0));
                  return new dnr.c($$1, $$4);
               }
            }

            edc $$5 = dom.this.a($$1.e().orElseThrow());
            return new dnr.c($$1, $$5);
         }

         private dnr a(dnr $$0) {
            if ($$0 instanceof ecz $$1) {
               auf $$2 = $$3 ? this.a(0L) : dom.this.a.a(new agt("terrain"));
               return $$1.a($$2);
            } else {
               return (dnr)($$0 instanceof dns.i ? new dns.i($$2) : $$0);
            }
         }

         @Override
         public dnr apply(dnr $$0) {
            return this.d.computeIfAbsent($$0, this::a);
         }
      }

      this.c = $$0.i().a(new a());
      dnr.f $$4 = new dnr.f() {
         private final Map<dnr, dnr> b = new HashMap<>();

         private dnr a(dnr $$0) {
            if ($$0 instanceof dns.j $$1) {
               return $$1.j().a();
            } else {
               return $$0 instanceof dns.l $$2 ? $$2.k() : $$0;
            }
         }

         @Override
         public dnr apply(dnr $$0) {
            return this.b.computeIfAbsent($$0, this::a);
         }
      };
      this.d = new cug.f(this.c.e().a($$4), this.c.f().a($$4), this.c.g().a($$4), this.c.h().a($$4), this.c.i().a($$4), this.c.j().a($$4), $$0.k());
   }

   public edc a(ags<edc.a> $$0) {
      return this.h.computeIfAbsent($$0, $$1 -> doh.a(this.b, this.a, $$0));
   }

   public dol a(agt $$0) {
      return this.i.computeIfAbsent($$0, $$1 -> this.a.a($$0).e());
   }

   public doe a() {
      return this.c;
   }

   public cug.f b() {
      return this.d;
   }

   public doq c() {
      return this.e;
   }

   public dol d() {
      return this.f;
   }

   public dol e() {
      return this.g;
   }
}
