import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class dyk {
   final dyj a;
   private final jj<ena.a> b;
   private final dyc c;
   private final ddi.f d;
   private final dyo e;
   private final dyj f;
   private final dyj g;
   private final Map<ale<ena.a>, ena> h;
   private final Map<alf, dyj> i;

   public static dyk a(jj.a $$0, ale<dyb> $$1, long $$2) {
      return a($$0.b(lq.aG).b($$1).a(), $$0.b(lq.aH), $$2);
   }

   public static dyk a(dyb $$0, jj<ena.a> $$1, long $$2) {
      return new dyk($$0, $$1, $$2);
   }

   private dyk(dyb $$0, jj<ena.a> $$1, final long $$2) {
      this.a = $$0.d().a($$2).e();
      this.b = $$1;
      this.f = this.a.a(new alf("aquifer")).e();
      this.g = this.a.a(new alf("ore")).e();
      this.h = new ConcurrentHashMap<>();
      this.i = new ConcurrentHashMap<>();
      this.e = new dyo(this, $$0.g(), $$0.l(), this.a);
      final boolean $$3 = $$0.n();

      class a implements dxp.f {
         private final Map<dxp, dxp> d = new HashMap<>();

         private azh a(long $$0) {
            return new dxx($$2 + $$0);
         }

         @Override
         public dxp.c a(dxp.c $$0) {
            ji<ena.a> $$1 = $$0.b();
            if ($$3) {
               if ($$1.a(dyf.a)) {
                  ena $$2 = ena.a(this.a(0L), new ena.a(-7, 1.0, 1.0));
                  return new dxp.c($$1, $$2);
               }

               if ($$1.a(dyf.b)) {
                  ena $$3 = ena.a(this.a(1L), new ena.a(-7, 1.0, 1.0));
                  return new dxp.c($$1, $$3);
               }

               if ($$1.a(dyf.j)) {
                  ena $$4 = ena.b(dyk.this.a.a(dyf.j.a()), new ena.a(0, 0.0));
                  return new dxp.c($$1, $$4);
               }
            }

            ena $$5 = dyk.this.a($$1.e().orElseThrow());
            return new dxp.c($$1, $$5);
         }

         private dxp a(dxp $$0) {
            if ($$0 instanceof emx $$1) {
               azh $$2 = $$3 ? this.a(0L) : dyk.this.a.a(new alf("terrain"));
               return $$1.a($$2);
            } else {
               return (dxp)($$0 instanceof dxq.i ? new dxq.i($$2) : $$0);
            }
         }

         @Override
         public dxp apply(dxp $$0) {
            return this.d.computeIfAbsent($$0, this::a);
         }
      }

      this.c = $$0.i().a(new a());
      dxp.f $$4 = new dxp.f() {
         private final Map<dxp, dxp> a = new HashMap<>();

         private dxp a(dxp $$0) {
            if ($$0 instanceof dxq.j $$1) {
               return $$1.j().a();
            } else {
               return $$0 instanceof dxq.l $$2 ? $$2.k() : $$0;
            }
         }

         @Override
         public dxp apply(dxp $$0) {
            return this.a.computeIfAbsent($$0, this::a);
         }
      };
      this.d = new ddi.f(this.c.e().a($$4), this.c.f().a($$4), this.c.g().a($$4), this.c.h().a($$4), this.c.i().a($$4), this.c.j().a($$4), $$0.k());
   }

   public ena a(ale<ena.a> $$0) {
      return this.h.computeIfAbsent($$0, $$1 -> dyf.a(this.b, this.a, $$0));
   }

   public dyj a(alf $$0) {
      return this.i.computeIfAbsent($$0, $$1 -> this.a.a($$0).e());
   }

   public dyc a() {
      return this.c;
   }

   public ddi.f b() {
      return this.d;
   }

   public dyo c() {
      return this.e;
   }

   public dyj d() {
      return this.f;
   }

   public dyj e() {
      return this.g;
   }
}
