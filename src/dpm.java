import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class dpm {
   final dpl a;
   private final ii<eec.a> b;
   private final dpe c;
   private final cvf.f d;
   private final dpq e;
   private final dpl f;
   private final dpl g;
   private final Map<ahg<eec.a>, eec> h;
   private final Map<ahh, dpl> i;

   public static dpm a(ii.a $$0, ahg<dpd> $$1, long $$2) {
      return a($$0.b(ke.aA).b($$1).a(), $$0.b(ke.aB), $$2);
   }

   public static dpm a(dpd $$0, ii<eec.a> $$1, long $$2) {
      return new dpm($$0, $$1, $$2);
   }

   private dpm(dpd $$0, ii<eec.a> $$1, final long $$2) {
      this.a = $$0.d().a($$2).e();
      this.b = $$1;
      this.f = this.a.a(new ahh("aquifer")).e();
      this.g = this.a.a(new ahh("ore")).e();
      this.h = new ConcurrentHashMap<>();
      this.i = new ConcurrentHashMap<>();
      this.e = new dpq(this, $$0.g(), $$0.l(), this.a);
      final boolean $$3 = $$0.n();

      class a implements dor.f {
         private final Map<dor, dor> d = new HashMap<>();

         private auw a(long $$0) {
            return new doz($$2 + $$0);
         }

         @Override
         public dor.c a(dor.c $$0) {
            ih<eec.a> $$1 = $$0.b();
            if ($$3) {
               if ($$1.a(dph.a)) {
                  eec $$2 = eec.a(this.a(0L), new eec.a(-7, 1.0, 1.0));
                  return new dor.c($$1, $$2);
               }

               if ($$1.a(dph.b)) {
                  eec $$3 = eec.a(this.a(1L), new eec.a(-7, 1.0, 1.0));
                  return new dor.c($$1, $$3);
               }

               if ($$1.a(dph.j)) {
                  eec $$4 = eec.b(dpm.this.a.a(dph.j.a()), new eec.a(0, 0.0));
                  return new dor.c($$1, $$4);
               }
            }

            eec $$5 = dpm.this.a($$1.e().orElseThrow());
            return new dor.c($$1, $$5);
         }

         private dor a(dor $$0) {
            if ($$0 instanceof edz $$1) {
               auw $$2 = $$3 ? this.a(0L) : dpm.this.a.a(new ahh("terrain"));
               return $$1.a($$2);
            } else {
               return (dor)($$0 instanceof dos.i ? new dos.i($$2) : $$0);
            }
         }

         @Override
         public dor apply(dor $$0) {
            return this.d.computeIfAbsent($$0, this::a);
         }
      }

      this.c = $$0.i().a(new a());
      dor.f $$4 = new dor.f() {
         private final Map<dor, dor> b = new HashMap<>();

         private dor a(dor $$0) {
            if ($$0 instanceof dos.j $$1) {
               return $$1.j().a();
            } else {
               return $$0 instanceof dos.l $$2 ? $$2.k() : $$0;
            }
         }

         @Override
         public dor apply(dor $$0) {
            return this.b.computeIfAbsent($$0, this::a);
         }
      };
      this.d = new cvf.f(this.c.e().a($$4), this.c.f().a($$4), this.c.g().a($$4), this.c.h().a($$4), this.c.i().a($$4), this.c.j().a($$4), $$0.k());
   }

   public eec a(ahg<eec.a> $$0) {
      return this.h.computeIfAbsent($$0, $$1 -> dph.a(this.b, this.a, $$0));
   }

   public dpl a(ahh $$0) {
      return this.i.computeIfAbsent($$0, $$1 -> this.a.a($$0).e());
   }

   public dpe a() {
      return this.c;
   }

   public cvf.f b() {
      return this.d;
   }

   public dpq c() {
      return this.e;
   }

   public dpl d() {
      return this.f;
   }

   public dpl e() {
      return this.g;
   }
}
