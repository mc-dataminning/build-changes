import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class dyh {
   final dyg a;
   private final jj<emx.a> b;
   private final dxz c;
   private final ddf.f d;
   private final dyl e;
   private final dyg f;
   private final dyg g;
   private final Map<ald<emx.a>, emx> h;
   private final Map<ale, dyg> i;

   public static dyh a(jj.a $$0, ald<dxy> $$1, long $$2) {
      return a($$0.b(lq.aG).b($$1).a(), $$0.b(lq.aH), $$2);
   }

   public static dyh a(dxy $$0, jj<emx.a> $$1, long $$2) {
      return new dyh($$0, $$1, $$2);
   }

   private dyh(dxy $$0, jj<emx.a> $$1, final long $$2) {
      this.a = $$0.d().a($$2).e();
      this.b = $$1;
      this.f = this.a.a(new ale("aquifer")).e();
      this.g = this.a.a(new ale("ore")).e();
      this.h = new ConcurrentHashMap<>();
      this.i = new ConcurrentHashMap<>();
      this.e = new dyl(this, $$0.g(), $$0.l(), this.a);
      final boolean $$3 = $$0.n();

      class a implements dxm.f {
         private final Map<dxm, dxm> d = new HashMap<>();

         private azg a(long $$0) {
            return new dxu($$2 + $$0);
         }

         @Override
         public dxm.c a(dxm.c $$0) {
            ji<emx.a> $$1 = $$0.b();
            if ($$3) {
               if ($$1.a(dyc.a)) {
                  emx $$2 = emx.a(this.a(0L), new emx.a(-7, 1.0, 1.0));
                  return new dxm.c($$1, $$2);
               }

               if ($$1.a(dyc.b)) {
                  emx $$3 = emx.a(this.a(1L), new emx.a(-7, 1.0, 1.0));
                  return new dxm.c($$1, $$3);
               }

               if ($$1.a(dyc.j)) {
                  emx $$4 = emx.b(dyh.this.a.a(dyc.j.a()), new emx.a(0, 0.0));
                  return new dxm.c($$1, $$4);
               }
            }

            emx $$5 = dyh.this.a($$1.e().orElseThrow());
            return new dxm.c($$1, $$5);
         }

         private dxm a(dxm $$0) {
            if ($$0 instanceof emu $$1) {
               azg $$2 = $$3 ? this.a(0L) : dyh.this.a.a(new ale("terrain"));
               return $$1.a($$2);
            } else {
               return (dxm)($$0 instanceof dxn.i ? new dxn.i($$2) : $$0);
            }
         }

         @Override
         public dxm apply(dxm $$0) {
            return this.d.computeIfAbsent($$0, this::a);
         }
      }

      this.c = $$0.i().a(new a());
      dxm.f $$4 = new dxm.f() {
         private final Map<dxm, dxm> a = new HashMap<>();

         private dxm a(dxm $$0) {
            if ($$0 instanceof dxn.j $$1) {
               return $$1.j().a();
            } else {
               return $$0 instanceof dxn.l $$2 ? $$2.k() : $$0;
            }
         }

         @Override
         public dxm apply(dxm $$0) {
            return this.a.computeIfAbsent($$0, this::a);
         }
      };
      this.d = new ddf.f(this.c.e().a($$4), this.c.f().a($$4), this.c.g().a($$4), this.c.h().a($$4), this.c.i().a($$4), this.c.j().a($$4), $$0.k());
   }

   public emx a(ald<emx.a> $$0) {
      return this.h.computeIfAbsent($$0, $$1 -> dyc.a(this.b, this.a, $$0));
   }

   public dyg a(ale $$0) {
      return this.i.computeIfAbsent($$0, $$1 -> this.a.a($$0).e());
   }

   public dxz a() {
      return this.c;
   }

   public ddf.f b() {
      return this.d;
   }

   public dyl c() {
      return this.e;
   }

   public dyg d() {
      return this.f;
   }

   public dyg e() {
      return this.g;
   }
}
