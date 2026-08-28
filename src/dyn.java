import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class dyn {
   final dym a;
   private final jk<ene.a> b;
   private final dyf c;
   private final ddm.f d;
   private final dyr e;
   private final dym f;
   private final dym g;
   private final Map<akj<ene.a>, ene> h;
   private final Map<akk, dym> i;

   public static dyn a(jk.a $$0, akj<dye> $$1, long $$2) {
      return a($$0.b(lr.aN).b($$1).a(), $$0.b(lr.aO), $$2);
   }

   public static dyn a(dye $$0, jk<ene.a> $$1, long $$2) {
      return new dyn($$0, $$1, $$2);
   }

   private dyn(dye $$0, jk<ene.a> $$1, final long $$2) {
      this.a = $$0.d().a($$2).e();
      this.b = $$1;
      this.f = this.a.a(new akk("aquifer")).e();
      this.g = this.a.a(new akk("ore")).e();
      this.h = new ConcurrentHashMap<>();
      this.i = new ConcurrentHashMap<>();
      this.e = new dyr(this, $$0.g(), $$0.l(), this.a);
      final boolean $$3 = $$0.n();

      class a implements dxs.f {
         private final Map<dxs, dxs> d = new HashMap<>();

         private aym a(long $$0) {
            return new dya($$2 + $$0);
         }

         @Override
         public dxs.c a(dxs.c $$0) {
            jj<ene.a> $$1 = $$0.b();
            if ($$3) {
               if ($$1.a(dyi.a)) {
                  ene $$2 = ene.a(this.a(0L), new ene.a(-7, 1.0, 1.0));
                  return new dxs.c($$1, $$2);
               }

               if ($$1.a(dyi.b)) {
                  ene $$3 = ene.a(this.a(1L), new ene.a(-7, 1.0, 1.0));
                  return new dxs.c($$1, $$3);
               }

               if ($$1.a(dyi.j)) {
                  ene $$4 = ene.b(dyn.this.a.a(dyi.j.a()), new ene.a(0, 0.0));
                  return new dxs.c($$1, $$4);
               }
            }

            ene $$5 = dyn.this.a($$1.e().orElseThrow());
            return new dxs.c($$1, $$5);
         }

         private dxs a(dxs $$0) {
            if ($$0 instanceof enb $$1) {
               aym $$2 = $$3 ? this.a(0L) : dyn.this.a.a(new akk("terrain"));
               return $$1.a($$2);
            } else {
               return (dxs)($$0 instanceof dxt.i ? new dxt.i($$2) : $$0);
            }
         }

         @Override
         public dxs apply(dxs $$0) {
            return this.d.computeIfAbsent($$0, this::a);
         }
      }

      this.c = $$0.i().a(new a());
      dxs.f $$4 = new dxs.f() {
         private final Map<dxs, dxs> a = new HashMap<>();

         private dxs a(dxs $$0) {
            if ($$0 instanceof dxt.j $$1) {
               return $$1.j().a();
            } else {
               return $$0 instanceof dxt.l $$2 ? $$2.k() : $$0;
            }
         }

         @Override
         public dxs apply(dxs $$0) {
            return this.a.computeIfAbsent($$0, this::a);
         }
      };
      this.d = new ddm.f(this.c.e().a($$4), this.c.f().a($$4), this.c.g().a($$4), this.c.h().a($$4), this.c.i().a($$4), this.c.j().a($$4), $$0.k());
   }

   public ene a(akj<ene.a> $$0) {
      return this.h.computeIfAbsent($$0, $$1 -> dyi.a(this.b, this.a, $$0));
   }

   public dym a(akk $$0) {
      return this.i.computeIfAbsent($$0, $$1 -> this.a.a($$0).e());
   }

   public dyf a() {
      return this.c;
   }

   public ddm.f b() {
      return this.d;
   }

   public dyr c() {
      return this.e;
   }

   public dym d() {
      return this.f;
   }

   public dym e() {
      return this.g;
   }
}
