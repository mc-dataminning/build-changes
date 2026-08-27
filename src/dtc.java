import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class dtc {
   final dtb a;
   private final im<ehs.a> b;
   private final dsu c;
   private final cyj.f d;
   private final dtg e;
   private final dtb f;
   private final dtb g;
   private final Map<ajg<ehs.a>, ehs> h;
   private final Map<ajh, dtb> i;

   public static dtc a(im.a $$0, ajg<dst> $$1, long $$2) {
      return a($$0.b(kj.aB).b($$1).a(), $$0.b(kj.aC), $$2);
   }

   public static dtc a(dst $$0, im<ehs.a> $$1, long $$2) {
      return new dtc($$0, $$1, $$2);
   }

   private dtc(dst $$0, im<ehs.a> $$1, final long $$2) {
      this.a = $$0.d().a($$2).e();
      this.b = $$1;
      this.f = this.a.a(new ajh("aquifer")).e();
      this.g = this.a.a(new ajh("ore")).e();
      this.h = new ConcurrentHashMap<>();
      this.i = new ConcurrentHashMap<>();
      this.e = new dtg(this, $$0.g(), $$0.l(), this.a);
      final boolean $$3 = $$0.n();

      class a implements dsh.f {
         private final Map<dsh, dsh> d = new HashMap<>();

         private axd a(long $$0) {
            return new dsp($$2 + $$0);
         }

         @Override
         public dsh.c a(dsh.c $$0) {
            il<ehs.a> $$1 = $$0.b();
            if ($$3) {
               if ($$1.a(dsx.a)) {
                  ehs $$2 = ehs.a(this.a(0L), new ehs.a(-7, 1.0, 1.0));
                  return new dsh.c($$1, $$2);
               }

               if ($$1.a(dsx.b)) {
                  ehs $$3 = ehs.a(this.a(1L), new ehs.a(-7, 1.0, 1.0));
                  return new dsh.c($$1, $$3);
               }

               if ($$1.a(dsx.j)) {
                  ehs $$4 = ehs.b(dtc.this.a.a(dsx.j.a()), new ehs.a(0, 0.0));
                  return new dsh.c($$1, $$4);
               }
            }

            ehs $$5 = dtc.this.a($$1.e().orElseThrow());
            return new dsh.c($$1, $$5);
         }

         private dsh a(dsh $$0) {
            if ($$0 instanceof ehp $$1) {
               axd $$2 = $$3 ? this.a(0L) : dtc.this.a.a(new ajh("terrain"));
               return $$1.a($$2);
            } else {
               return (dsh)($$0 instanceof dsi.i ? new dsi.i($$2) : $$0);
            }
         }

         @Override
         public dsh apply(dsh $$0) {
            return this.d.computeIfAbsent($$0, this::a);
         }
      }

      this.c = $$0.i().a(new a());
      dsh.f $$4 = new dsh.f() {
         private final Map<dsh, dsh> b = new HashMap<>();

         private dsh a(dsh $$0) {
            if ($$0 instanceof dsi.j $$1) {
               return $$1.j().a();
            } else {
               return $$0 instanceof dsi.l $$2 ? $$2.k() : $$0;
            }
         }

         @Override
         public dsh apply(dsh $$0) {
            return this.b.computeIfAbsent($$0, this::a);
         }
      };
      this.d = new cyj.f(this.c.e().a($$4), this.c.f().a($$4), this.c.g().a($$4), this.c.h().a($$4), this.c.i().a($$4), this.c.j().a($$4), $$0.k());
   }

   public ehs a(ajg<ehs.a> $$0) {
      return this.h.computeIfAbsent($$0, $$1 -> dsx.a(this.b, this.a, $$0));
   }

   public dtb a(ajh $$0) {
      return this.i.computeIfAbsent($$0, $$1 -> this.a.a($$0).e());
   }

   public dsu a() {
      return this.c;
   }

   public cyj.f b() {
      return this.d;
   }

   public dtg c() {
      return this.e;
   }

   public dtb d() {
      return this.f;
   }

   public dtb e() {
      return this.g;
   }
}
