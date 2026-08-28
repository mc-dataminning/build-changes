import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class dyd {
   final dyc a;
   private final jj<emt.a> b;
   private final dxv c;
   private final ddb.f d;
   private final dyh e;
   private final dyc f;
   private final dyc g;
   private final Map<ala<emt.a>, emt> h;
   private final Map<alb, dyc> i;

   public static dyd a(jj.a $$0, ala<dxu> $$1, long $$2) {
      return a($$0.b(lq.aG).b($$1).a(), $$0.b(lq.aH), $$2);
   }

   public static dyd a(dxu $$0, jj<emt.a> $$1, long $$2) {
      return new dyd($$0, $$1, $$2);
   }

   private dyd(dxu $$0, jj<emt.a> $$1, final long $$2) {
      this.a = $$0.d().a($$2).e();
      this.b = $$1;
      this.f = this.a.a(new alb("aquifer")).e();
      this.g = this.a.a(new alb("ore")).e();
      this.h = new ConcurrentHashMap<>();
      this.i = new ConcurrentHashMap<>();
      this.e = new dyh(this, $$0.g(), $$0.l(), this.a);
      final boolean $$3 = $$0.n();

      class a implements dxi.f {
         private final Map<dxi, dxi> d = new HashMap<>();

         private azc a(long $$0) {
            return new dxq($$2 + $$0);
         }

         @Override
         public dxi.c a(dxi.c $$0) {
            ji<emt.a> $$1 = $$0.b();
            if ($$3) {
               if ($$1.a(dxy.a)) {
                  emt $$2 = emt.a(this.a(0L), new emt.a(-7, 1.0, 1.0));
                  return new dxi.c($$1, $$2);
               }

               if ($$1.a(dxy.b)) {
                  emt $$3 = emt.a(this.a(1L), new emt.a(-7, 1.0, 1.0));
                  return new dxi.c($$1, $$3);
               }

               if ($$1.a(dxy.j)) {
                  emt $$4 = emt.b(dyd.this.a.a(dxy.j.a()), new emt.a(0, 0.0));
                  return new dxi.c($$1, $$4);
               }
            }

            emt $$5 = dyd.this.a($$1.e().orElseThrow());
            return new dxi.c($$1, $$5);
         }

         private dxi a(dxi $$0) {
            if ($$0 instanceof emq $$1) {
               azc $$2 = $$3 ? this.a(0L) : dyd.this.a.a(new alb("terrain"));
               return $$1.a($$2);
            } else {
               return (dxi)($$0 instanceof dxj.i ? new dxj.i($$2) : $$0);
            }
         }

         @Override
         public dxi apply(dxi $$0) {
            return this.d.computeIfAbsent($$0, this::a);
         }
      }

      this.c = $$0.i().a(new a());
      dxi.f $$4 = new dxi.f() {
         private final Map<dxi, dxi> a = new HashMap<>();

         private dxi a(dxi $$0) {
            if ($$0 instanceof dxj.j $$1) {
               return $$1.j().a();
            } else {
               return $$0 instanceof dxj.l $$2 ? $$2.k() : $$0;
            }
         }

         @Override
         public dxi apply(dxi $$0) {
            return this.a.computeIfAbsent($$0, this::a);
         }
      };
      this.d = new ddb.f(this.c.e().a($$4), this.c.f().a($$4), this.c.g().a($$4), this.c.h().a($$4), this.c.i().a($$4), this.c.j().a($$4), $$0.k());
   }

   public emt a(ala<emt.a> $$0) {
      return this.h.computeIfAbsent($$0, $$1 -> dxy.a(this.b, this.a, $$0));
   }

   public dyc a(alb $$0) {
      return this.i.computeIfAbsent($$0, $$1 -> this.a.a($$0).e());
   }

   public dxv a() {
      return this.c;
   }

   public ddb.f b() {
      return this.d;
   }

   public dyh c() {
      return this.e;
   }

   public dyc d() {
      return this.f;
   }

   public dyc e() {
      return this.g;
   }
}
