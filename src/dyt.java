import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class dyt {
   final dys a;
   private final jk<enk.a> b;
   private final dyl c;
   private final ddo.f d;
   private final dyx e;
   private final dys f;
   private final dys g;
   private final Map<akj<enk.a>, enk> h;
   private final Map<akk, dys> i;

   public static dyt a(jk.a $$0, akj<dyk> $$1, long $$2) {
      return a($$0.b(lr.aN).b($$1).a(), $$0.b(lr.aO), $$2);
   }

   public static dyt a(dyk $$0, jk<enk.a> $$1, long $$2) {
      return new dyt($$0, $$1, $$2);
   }

   private dyt(dyk $$0, jk<enk.a> $$1, final long $$2) {
      this.a = $$0.d().a($$2).e();
      this.b = $$1;
      this.f = this.a.a(new akk("aquifer")).e();
      this.g = this.a.a(new akk("ore")).e();
      this.h = new ConcurrentHashMap<>();
      this.i = new ConcurrentHashMap<>();
      this.e = new dyx(this, $$0.g(), $$0.l(), this.a);
      final boolean $$3 = $$0.n();

      class a implements dxy.f {
         private final Map<dxy, dxy> d = new HashMap<>();

         private ayo a(long $$0) {
            return new dyg($$2 + $$0);
         }

         @Override
         public dxy.c a(dxy.c $$0) {
            jj<enk.a> $$1 = $$0.b();
            if ($$3) {
               if ($$1.a(dyo.a)) {
                  enk $$2 = enk.a(this.a(0L), new enk.a(-7, 1.0, 1.0));
                  return new dxy.c($$1, $$2);
               }

               if ($$1.a(dyo.b)) {
                  enk $$3 = enk.a(this.a(1L), new enk.a(-7, 1.0, 1.0));
                  return new dxy.c($$1, $$3);
               }

               if ($$1.a(dyo.j)) {
                  enk $$4 = enk.b(dyt.this.a.a(dyo.j.a()), new enk.a(0, 0.0));
                  return new dxy.c($$1, $$4);
               }
            }

            enk $$5 = dyt.this.a($$1.e().orElseThrow());
            return new dxy.c($$1, $$5);
         }

         private dxy a(dxy $$0) {
            if ($$0 instanceof enh $$1) {
               ayo $$2 = $$3 ? this.a(0L) : dyt.this.a.a(new akk("terrain"));
               return $$1.a($$2);
            } else {
               return (dxy)($$0 instanceof dxz.i ? new dxz.i($$2) : $$0);
            }
         }

         @Override
         public dxy apply(dxy $$0) {
            return this.d.computeIfAbsent($$0, this::a);
         }
      }

      this.c = $$0.i().a(new a());
      dxy.f $$4 = new dxy.f() {
         private final Map<dxy, dxy> a = new HashMap<>();

         private dxy a(dxy $$0) {
            if ($$0 instanceof dxz.j $$1) {
               return $$1.j().a();
            } else {
               return $$0 instanceof dxz.l $$2 ? $$2.k() : $$0;
            }
         }

         @Override
         public dxy apply(dxy $$0) {
            return this.a.computeIfAbsent($$0, this::a);
         }
      };
      this.d = new ddo.f(this.c.e().a($$4), this.c.f().a($$4), this.c.g().a($$4), this.c.h().a($$4), this.c.i().a($$4), this.c.j().a($$4), $$0.k());
   }

   public enk a(akj<enk.a> $$0) {
      return this.h.computeIfAbsent($$0, $$1 -> dyo.a(this.b, this.a, $$0));
   }

   public dys a(akk $$0) {
      return this.i.computeIfAbsent($$0, $$1 -> this.a.a($$0).e());
   }

   public dyl a() {
      return this.c;
   }

   public ddo.f b() {
      return this.d;
   }

   public dyx c() {
      return this.e;
   }

   public dys d() {
      return this.f;
   }

   public dys e() {
      return this.g;
   }
}
