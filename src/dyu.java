import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class dyu {
   final dyt a;
   private final jk<enm.a> b;
   private final dym c;
   private final ddp.f d;
   private final dyy e;
   private final dyt f;
   private final dyt g;
   private final Map<akj<enm.a>, enm> h;
   private final Map<akk, dyt> i;

   public static dyu a(jk.a $$0, akj<dyl> $$1, long $$2) {
      return a($$0.b(lr.aN).b($$1).a(), $$0.b(lr.aO), $$2);
   }

   public static dyu a(dyl $$0, jk<enm.a> $$1, long $$2) {
      return new dyu($$0, $$1, $$2);
   }

   private dyu(dyl $$0, jk<enm.a> $$1, final long $$2) {
      this.a = $$0.d().a($$2).e();
      this.b = $$1;
      this.f = this.a.a(new akk("aquifer")).e();
      this.g = this.a.a(new akk("ore")).e();
      this.h = new ConcurrentHashMap<>();
      this.i = new ConcurrentHashMap<>();
      this.e = new dyy(this, $$0.g(), $$0.l(), this.a);
      final boolean $$3 = $$0.n();

      class a implements dxz.f {
         private final Map<dxz, dxz> d = new HashMap<>();

         private ayo a(long $$0) {
            return new dyh($$2 + $$0);
         }

         @Override
         public dxz.c a(dxz.c $$0) {
            jj<enm.a> $$1 = $$0.b();
            if ($$3) {
               if ($$1.a(dyp.a)) {
                  enm $$2 = enm.a(this.a(0L), new enm.a(-7, 1.0, 1.0));
                  return new dxz.c($$1, $$2);
               }

               if ($$1.a(dyp.b)) {
                  enm $$3 = enm.a(this.a(1L), new enm.a(-7, 1.0, 1.0));
                  return new dxz.c($$1, $$3);
               }

               if ($$1.a(dyp.j)) {
                  enm $$4 = enm.b(dyu.this.a.a(dyp.j.a()), new enm.a(0, 0.0));
                  return new dxz.c($$1, $$4);
               }
            }

            enm $$5 = dyu.this.a($$1.e().orElseThrow());
            return new dxz.c($$1, $$5);
         }

         private dxz a(dxz $$0) {
            if ($$0 instanceof enj $$1) {
               ayo $$2 = $$3 ? this.a(0L) : dyu.this.a.a(new akk("terrain"));
               return $$1.a($$2);
            } else {
               return (dxz)($$0 instanceof dya.i ? new dya.i($$2) : $$0);
            }
         }

         @Override
         public dxz apply(dxz $$0) {
            return this.d.computeIfAbsent($$0, this::a);
         }
      }

      this.c = $$0.i().a(new a());
      dxz.f $$4 = new dxz.f() {
         private final Map<dxz, dxz> a = new HashMap<>();

         private dxz a(dxz $$0) {
            if ($$0 instanceof dya.j $$1) {
               return $$1.j().a();
            } else {
               return $$0 instanceof dya.l $$2 ? $$2.k() : $$0;
            }
         }

         @Override
         public dxz apply(dxz $$0) {
            return this.a.computeIfAbsent($$0, this::a);
         }
      };
      this.d = new ddp.f(this.c.e().a($$4), this.c.f().a($$4), this.c.g().a($$4), this.c.h().a($$4), this.c.i().a($$4), this.c.j().a($$4), $$0.k());
   }

   public enm a(akj<enm.a> $$0) {
      return this.h.computeIfAbsent($$0, $$1 -> dyp.a(this.b, this.a, $$0));
   }

   public dyt a(akk $$0) {
      return this.i.computeIfAbsent($$0, $$1 -> this.a.a($$0).e());
   }

   public dym a() {
      return this.c;
   }

   public ddp.f b() {
      return this.d;
   }

   public dyy c() {
      return this.e;
   }

   public dyt d() {
      return this.f;
   }

   public dyt e() {
      return this.g;
   }
}
