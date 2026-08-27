import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class dlb {
   final dla a;
   private final hh<dzk.a> b;
   private final dkt c;
   private final cqx.f d;
   private final dlf e;
   private final dla f;
   private final dla g;
   private final Map<aet<dzk.a>, dzk> h;
   private final Map<aeu, dla> i;

   public static dlb a(hh.a $$0, aet<dks> $$1, long $$2) {
      return a($$0.b(je.aw).b($$1).a(), $$0.b(je.ax), $$2);
   }

   public static dlb a(dks $$0, hh<dzk.a> $$1, long $$2) {
      return new dlb($$0, $$1, $$2);
   }

   private dlb(dks $$0, hh<dzk.a> $$1, final long $$2) {
      this.a = $$0.d().a($$2).e();
      this.b = $$1;
      this.f = this.a.a(new aeu("aquifer")).e();
      this.g = this.a.a(new aeu("ore")).e();
      this.h = new ConcurrentHashMap<>();
      this.i = new ConcurrentHashMap<>();
      this.e = new dlf(this, $$0.g(), $$0.l(), this.a);
      final boolean $$3 = $$0.n();

      class a implements dkg.f {
         private final Map<dkg, dkg> d = new HashMap<>();

         private arx a(long $$0) {
            return new dko($$2 + $$0);
         }

         @Override
         public dkg.c a(dkg.c $$0) {
            hg<dzk.a> $$1 = $$0.b();
            if ($$3) {
               if ($$1.a(dkw.a)) {
                  dzk $$2 = dzk.a(this.a(0L), new dzk.a(-7, 1.0, 1.0));
                  return new dkg.c($$1, $$2);
               }

               if ($$1.a(dkw.b)) {
                  dzk $$3 = dzk.a(this.a(1L), new dzk.a(-7, 1.0, 1.0));
                  return new dkg.c($$1, $$3);
               }

               if ($$1.a(dkw.j)) {
                  dzk $$4 = dzk.b(dlb.this.a.a(dkw.j.a()), new dzk.a(0, 0.0));
                  return new dkg.c($$1, $$4);
               }
            }

            dzk $$5 = dlb.this.a($$1.e().orElseThrow());
            return new dkg.c($$1, $$5);
         }

         private dkg a(dkg $$0) {
            if ($$0 instanceof dzh $$1) {
               arx $$2 = $$3 ? this.a(0L) : dlb.this.a.a(new aeu("terrain"));
               return $$1.a($$2);
            } else {
               return (dkg)($$0 instanceof dkh.i ? new dkh.i($$2) : $$0);
            }
         }

         @Override
         public dkg apply(dkg $$0) {
            return this.d.computeIfAbsent($$0, this::a);
         }
      }

      this.c = $$0.i().a(new a());
      dkg.f $$4 = new dkg.f() {
         private final Map<dkg, dkg> b = new HashMap<>();

         private dkg a(dkg $$0) {
            if ($$0 instanceof dkh.j $$1) {
               return $$1.j().a();
            } else {
               return $$0 instanceof dkh.l $$2 ? $$2.k() : $$0;
            }
         }

         @Override
         public dkg apply(dkg $$0) {
            return this.b.computeIfAbsent($$0, this::a);
         }
      };
      this.d = new cqx.f(this.c.e().a($$4), this.c.f().a($$4), this.c.g().a($$4), this.c.h().a($$4), this.c.i().a($$4), this.c.j().a($$4), $$0.k());
   }

   public dzk a(aet<dzk.a> $$0) {
      return this.h.computeIfAbsent($$0, $$1 -> dkw.a(this.b, this.a, $$0));
   }

   public dla a(aeu $$0) {
      return this.i.computeIfAbsent($$0, $$1 -> this.a.a($$0).e());
   }

   public dkt a() {
      return this.c;
   }

   public cqx.f b() {
      return this.d;
   }

   public dlf c() {
      return this.e;
   }

   public dla d() {
      return this.f;
   }

   public dla e() {
      return this.g;
   }
}
