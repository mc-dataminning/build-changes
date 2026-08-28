import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class dyj {
   final dyi a;
   private final jj<emz.a> b;
   private final dyb c;
   private final ddh.f d;
   private final dyn e;
   private final dyi f;
   private final dyi g;
   private final Map<ale<emz.a>, emz> h;
   private final Map<alf, dyi> i;

   public static dyj a(jj.a $$0, ale<dya> $$1, long $$2) {
      return a($$0.b(lq.aG).b($$1).a(), $$0.b(lq.aH), $$2);
   }

   public static dyj a(dya $$0, jj<emz.a> $$1, long $$2) {
      return new dyj($$0, $$1, $$2);
   }

   private dyj(dya $$0, jj<emz.a> $$1, final long $$2) {
      this.a = $$0.d().a($$2).e();
      this.b = $$1;
      this.f = this.a.a(new alf("aquifer")).e();
      this.g = this.a.a(new alf("ore")).e();
      this.h = new ConcurrentHashMap<>();
      this.i = new ConcurrentHashMap<>();
      this.e = new dyn(this, $$0.g(), $$0.l(), this.a);
      final boolean $$3 = $$0.n();

      class a implements dxo.f {
         private final Map<dxo, dxo> d = new HashMap<>();

         private azh a(long $$0) {
            return new dxw($$2 + $$0);
         }

         @Override
         public dxo.c a(dxo.c $$0) {
            ji<emz.a> $$1 = $$0.b();
            if ($$3) {
               if ($$1.a(dye.a)) {
                  emz $$2 = emz.a(this.a(0L), new emz.a(-7, 1.0, 1.0));
                  return new dxo.c($$1, $$2);
               }

               if ($$1.a(dye.b)) {
                  emz $$3 = emz.a(this.a(1L), new emz.a(-7, 1.0, 1.0));
                  return new dxo.c($$1, $$3);
               }

               if ($$1.a(dye.j)) {
                  emz $$4 = emz.b(dyj.this.a.a(dye.j.a()), new emz.a(0, 0.0));
                  return new dxo.c($$1, $$4);
               }
            }

            emz $$5 = dyj.this.a($$1.e().orElseThrow());
            return new dxo.c($$1, $$5);
         }

         private dxo a(dxo $$0) {
            if ($$0 instanceof emw $$1) {
               azh $$2 = $$3 ? this.a(0L) : dyj.this.a.a(new alf("terrain"));
               return $$1.a($$2);
            } else {
               return (dxo)($$0 instanceof dxp.i ? new dxp.i($$2) : $$0);
            }
         }

         @Override
         public dxo apply(dxo $$0) {
            return this.d.computeIfAbsent($$0, this::a);
         }
      }

      this.c = $$0.i().a(new a());
      dxo.f $$4 = new dxo.f() {
         private final Map<dxo, dxo> a = new HashMap<>();

         private dxo a(dxo $$0) {
            if ($$0 instanceof dxp.j $$1) {
               return $$1.j().a();
            } else {
               return $$0 instanceof dxp.l $$2 ? $$2.k() : $$0;
            }
         }

         @Override
         public dxo apply(dxo $$0) {
            return this.a.computeIfAbsent($$0, this::a);
         }
      };
      this.d = new ddh.f(this.c.e().a($$4), this.c.f().a($$4), this.c.g().a($$4), this.c.h().a($$4), this.c.i().a($$4), this.c.j().a($$4), $$0.k());
   }

   public emz a(ale<emz.a> $$0) {
      return this.h.computeIfAbsent($$0, $$1 -> dye.a(this.b, this.a, $$0));
   }

   public dyi a(alf $$0) {
      return this.i.computeIfAbsent($$0, $$1 -> this.a.a($$0).e());
   }

   public dyb a() {
      return this.c;
   }

   public ddh.f b() {
      return this.d;
   }

   public dyn c() {
      return this.e;
   }

   public dyi d() {
      return this.f;
   }

   public dyi e() {
      return this.g;
   }
}
