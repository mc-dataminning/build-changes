import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class dyi {
   final dyh a;
   private final jj<emy.a> b;
   private final dya c;
   private final ddg.f d;
   private final dym e;
   private final dyh f;
   private final dyh g;
   private final Map<ale<emy.a>, emy> h;
   private final Map<alf, dyh> i;

   public static dyi a(jj.a $$0, ale<dxz> $$1, long $$2) {
      return a($$0.b(lq.aG).b($$1).a(), $$0.b(lq.aH), $$2);
   }

   public static dyi a(dxz $$0, jj<emy.a> $$1, long $$2) {
      return new dyi($$0, $$1, $$2);
   }

   private dyi(dxz $$0, jj<emy.a> $$1, final long $$2) {
      this.a = $$0.d().a($$2).e();
      this.b = $$1;
      this.f = this.a.a(new alf("aquifer")).e();
      this.g = this.a.a(new alf("ore")).e();
      this.h = new ConcurrentHashMap<>();
      this.i = new ConcurrentHashMap<>();
      this.e = new dym(this, $$0.g(), $$0.l(), this.a);
      final boolean $$3 = $$0.n();

      class a implements dxn.f {
         private final Map<dxn, dxn> d = new HashMap<>();

         private azh a(long $$0) {
            return new dxv($$2 + $$0);
         }

         @Override
         public dxn.c a(dxn.c $$0) {
            ji<emy.a> $$1 = $$0.b();
            if ($$3) {
               if ($$1.a(dyd.a)) {
                  emy $$2 = emy.a(this.a(0L), new emy.a(-7, 1.0, 1.0));
                  return new dxn.c($$1, $$2);
               }

               if ($$1.a(dyd.b)) {
                  emy $$3 = emy.a(this.a(1L), new emy.a(-7, 1.0, 1.0));
                  return new dxn.c($$1, $$3);
               }

               if ($$1.a(dyd.j)) {
                  emy $$4 = emy.b(dyi.this.a.a(dyd.j.a()), new emy.a(0, 0.0));
                  return new dxn.c($$1, $$4);
               }
            }

            emy $$5 = dyi.this.a($$1.e().orElseThrow());
            return new dxn.c($$1, $$5);
         }

         private dxn a(dxn $$0) {
            if ($$0 instanceof emv $$1) {
               azh $$2 = $$3 ? this.a(0L) : dyi.this.a.a(new alf("terrain"));
               return $$1.a($$2);
            } else {
               return (dxn)($$0 instanceof dxo.i ? new dxo.i($$2) : $$0);
            }
         }

         @Override
         public dxn apply(dxn $$0) {
            return this.d.computeIfAbsent($$0, this::a);
         }
      }

      this.c = $$0.i().a(new a());
      dxn.f $$4 = new dxn.f() {
         private final Map<dxn, dxn> a = new HashMap<>();

         private dxn a(dxn $$0) {
            if ($$0 instanceof dxo.j $$1) {
               return $$1.j().a();
            } else {
               return $$0 instanceof dxo.l $$2 ? $$2.k() : $$0;
            }
         }

         @Override
         public dxn apply(dxn $$0) {
            return this.a.computeIfAbsent($$0, this::a);
         }
      };
      this.d = new ddg.f(this.c.e().a($$4), this.c.f().a($$4), this.c.g().a($$4), this.c.h().a($$4), this.c.i().a($$4), this.c.j().a($$4), $$0.k());
   }

   public emy a(ale<emy.a> $$0) {
      return this.h.computeIfAbsent($$0, $$1 -> dyd.a(this.b, this.a, $$0));
   }

   public dyh a(alf $$0) {
      return this.i.computeIfAbsent($$0, $$1 -> this.a.a($$0).e());
   }

   public dya a() {
      return this.c;
   }

   public ddg.f b() {
      return this.d;
   }

   public dym c() {
      return this.e;
   }

   public dyh d() {
      return this.f;
   }

   public dyh e() {
      return this.g;
   }
}
