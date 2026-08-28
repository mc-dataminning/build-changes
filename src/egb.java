import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class egb {
   final ega a;
   private final jf<euy.a> b;
   private final eft c;
   private final dkb.f d;
   private final egf e;
   private final ega f;
   private final ega g;
   private final Map<ald<euy.a>, euy> h;
   private final Map<ale, ega> i;

   public static egb a(jf.a $$0, ald<efs> $$1, long $$2) {
      return a($$0.b(mg.aV).b($$1).a(), $$0.b(mg.aW), $$2);
   }

   public static egb a(efs $$0, jf<euy.a> $$1, long $$2) {
      return new egb($$0, $$1, $$2);
   }

   private egb(efs $$0, jf<euy.a> $$1, final long $$2) {
      this.a = $$0.d().a($$2).e();
      this.b = $$1;
      this.f = this.a.a(ale.b("aquifer")).e();
      this.g = this.a.a(ale.b("ore")).e();
      this.h = new ConcurrentHashMap<>();
      this.i = new ConcurrentHashMap<>();
      this.e = new egf(this, $$0.g(), $$0.l(), this.a);
      final boolean $$3 = $$0.n();

      class a implements efg.f {
         private final Map<efg, efg> d = new HashMap<>();

         private azt a(long $$0) {
            return new efo($$2 + $$0);
         }

         @Override
         public efg.c a(efg.c $$0) {
            je<euy.a> $$1 = $$0.b();
            if ($$3) {
               if ($$1.a(efw.a)) {
                  euy $$2 = euy.a(this.a(0L), new euy.a(-7, 1.0, 1.0));
                  return new efg.c($$1, $$2);
               }

               if ($$1.a(efw.b)) {
                  euy $$3 = euy.a(this.a(1L), new euy.a(-7, 1.0, 1.0));
                  return new efg.c($$1, $$3);
               }

               if ($$1.a(efw.j)) {
                  euy $$4 = euy.b(egb.this.a.a(efw.j.a()), new euy.a(0, 0.0));
                  return new efg.c($$1, $$4);
               }
            }

            euy $$5 = egb.this.a($$1.e().orElseThrow());
            return new efg.c($$1, $$5);
         }

         private efg a(efg $$0) {
            if ($$0 instanceof euv $$1) {
               azt $$2 = $$3 ? this.a(0L) : egb.this.a.a(ale.b("terrain"));
               return $$1.a($$2);
            } else {
               return (efg)($$0 instanceof efh.i ? new efh.i($$2) : $$0);
            }
         }

         @Override
         public efg apply(efg $$0) {
            return this.d.computeIfAbsent($$0, this::a);
         }
      }

      this.c = $$0.i().a(new a());
      efg.f $$4 = new efg.f() {
         private final Map<efg, efg> a = new HashMap<>();

         private efg a(efg $$0) {
            if ($$0 instanceof efh.j $$1) {
               return $$1.j().a();
            } else {
               return $$0 instanceof efh.l $$2 ? $$2.k() : $$0;
            }
         }

         @Override
         public efg apply(efg $$0) {
            return this.a.computeIfAbsent($$0, this::a);
         }
      };
      this.d = new dkb.f(this.c.e().a($$4), this.c.f().a($$4), this.c.g().a($$4), this.c.h().a($$4), this.c.i().a($$4), this.c.j().a($$4), $$0.k());
   }

   public euy a(ald<euy.a> $$0) {
      return this.h.computeIfAbsent($$0, $$1 -> efw.a(this.b, this.a, $$0));
   }

   public ega a(ale $$0) {
      return this.i.computeIfAbsent($$0, $$1 -> this.a.a($$0).e());
   }

   public eft a() {
      return this.c;
   }

   public dkb.f b() {
      return this.d;
   }

   public egf c() {
      return this.e;
   }

   public ega d() {
      return this.f;
   }

   public ega e() {
      return this.g;
   }
}
