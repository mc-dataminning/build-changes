import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class dxh {
   final dxg a;
   private final iy<elx.a> b;
   private final dwz c;
   private final dcf.f d;
   private final dxl e;
   private final dxg f;
   private final dxg g;
   private final Map<akl<elx.a>, elx> h;
   private final Map<akm, dxg> i;

   public static dxh a(iy.a $$0, akl<dwy> $$1, long $$2) {
      return a($$0.b(lf.aG).b($$1).a(), $$0.b(lf.aH), $$2);
   }

   public static dxh a(dwy $$0, iy<elx.a> $$1, long $$2) {
      return new dxh($$0, $$1, $$2);
   }

   private dxh(dwy $$0, iy<elx.a> $$1, final long $$2) {
      this.a = $$0.d().a($$2).e();
      this.b = $$1;
      this.f = this.a.a(new akm("aquifer")).e();
      this.g = this.a.a(new akm("ore")).e();
      this.h = new ConcurrentHashMap<>();
      this.i = new ConcurrentHashMap<>();
      this.e = new dxl(this, $$0.g(), $$0.l(), this.a);
      final boolean $$3 = $$0.n();

      class a implements dwm.f {
         private final Map<dwm, dwm> d = new HashMap<>();

         private ayk a(long $$0) {
            return new dwu($$2 + $$0);
         }

         @Override
         public dwm.c a(dwm.c $$0) {
            ix<elx.a> $$1 = $$0.b();
            if ($$3) {
               if ($$1.a(dxc.a)) {
                  elx $$2 = elx.a(this.a(0L), new elx.a(-7, 1.0, 1.0));
                  return new dwm.c($$1, $$2);
               }

               if ($$1.a(dxc.b)) {
                  elx $$3 = elx.a(this.a(1L), new elx.a(-7, 1.0, 1.0));
                  return new dwm.c($$1, $$3);
               }

               if ($$1.a(dxc.j)) {
                  elx $$4 = elx.b(dxh.this.a.a(dxc.j.a()), new elx.a(0, 0.0));
                  return new dwm.c($$1, $$4);
               }
            }

            elx $$5 = dxh.this.a($$1.e().orElseThrow());
            return new dwm.c($$1, $$5);
         }

         private dwm a(dwm $$0) {
            if ($$0 instanceof elu $$1) {
               ayk $$2 = $$3 ? this.a(0L) : dxh.this.a.a(new akm("terrain"));
               return $$1.a($$2);
            } else {
               return (dwm)($$0 instanceof dwn.i ? new dwn.i($$2) : $$0);
            }
         }

         @Override
         public dwm apply(dwm $$0) {
            return this.d.computeIfAbsent($$0, this::a);
         }
      }

      this.c = $$0.i().a(new a());
      dwm.f $$4 = new dwm.f() {
         private final Map<dwm, dwm> b = new HashMap<>();

         private dwm a(dwm $$0) {
            if ($$0 instanceof dwn.j $$1) {
               return $$1.j().a();
            } else {
               return $$0 instanceof dwn.l $$2 ? $$2.k() : $$0;
            }
         }

         @Override
         public dwm apply(dwm $$0) {
            return this.b.computeIfAbsent($$0, this::a);
         }
      };
      this.d = new dcf.f(this.c.e().a($$4), this.c.f().a($$4), this.c.g().a($$4), this.c.h().a($$4), this.c.i().a($$4), this.c.j().a($$4), $$0.k());
   }

   public elx a(akl<elx.a> $$0) {
      return this.h.computeIfAbsent($$0, $$1 -> dxc.a(this.b, this.a, $$0));
   }

   public dxg a(akm $$0) {
      return this.i.computeIfAbsent($$0, $$1 -> this.a.a($$0).e());
   }

   public dwz a() {
      return this.c;
   }

   public dcf.f b() {
      return this.d;
   }

   public dxl c() {
      return this.e;
   }

   public dxg d() {
      return this.f;
   }

   public dxg e() {
      return this.g;
   }
}
