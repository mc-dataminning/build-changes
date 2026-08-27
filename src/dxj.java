import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class dxj {
   final dxi a;
   private final iy<elz.a> b;
   private final dxb c;
   private final dch.f d;
   private final dxn e;
   private final dxi f;
   private final dxi g;
   private final Map<akm<elz.a>, elz> h;
   private final Map<akn, dxi> i;

   public static dxj a(iy.a $$0, akm<dxa> $$1, long $$2) {
      return a($$0.b(lf.aG).b($$1).a(), $$0.b(lf.aH), $$2);
   }

   public static dxj a(dxa $$0, iy<elz.a> $$1, long $$2) {
      return new dxj($$0, $$1, $$2);
   }

   private dxj(dxa $$0, iy<elz.a> $$1, final long $$2) {
      this.a = $$0.d().a($$2).e();
      this.b = $$1;
      this.f = this.a.a(new akn("aquifer")).e();
      this.g = this.a.a(new akn("ore")).e();
      this.h = new ConcurrentHashMap<>();
      this.i = new ConcurrentHashMap<>();
      this.e = new dxn(this, $$0.g(), $$0.l(), this.a);
      final boolean $$3 = $$0.n();

      class a implements dwo.f {
         private final Map<dwo, dwo> d = new HashMap<>();

         private aym a(long $$0) {
            return new dww($$2 + $$0);
         }

         @Override
         public dwo.c a(dwo.c $$0) {
            ix<elz.a> $$1 = $$0.b();
            if ($$3) {
               if ($$1.a(dxe.a)) {
                  elz $$2 = elz.a(this.a(0L), new elz.a(-7, 1.0, 1.0));
                  return new dwo.c($$1, $$2);
               }

               if ($$1.a(dxe.b)) {
                  elz $$3 = elz.a(this.a(1L), new elz.a(-7, 1.0, 1.0));
                  return new dwo.c($$1, $$3);
               }

               if ($$1.a(dxe.j)) {
                  elz $$4 = elz.b(dxj.this.a.a(dxe.j.a()), new elz.a(0, 0.0));
                  return new dwo.c($$1, $$4);
               }
            }

            elz $$5 = dxj.this.a($$1.e().orElseThrow());
            return new dwo.c($$1, $$5);
         }

         private dwo a(dwo $$0) {
            if ($$0 instanceof elw $$1) {
               aym $$2 = $$3 ? this.a(0L) : dxj.this.a.a(new akn("terrain"));
               return $$1.a($$2);
            } else {
               return (dwo)($$0 instanceof dwp.i ? new dwp.i($$2) : $$0);
            }
         }

         @Override
         public dwo apply(dwo $$0) {
            return this.d.computeIfAbsent($$0, this::a);
         }
      }

      this.c = $$0.i().a(new a());
      dwo.f $$4 = new dwo.f() {
         private final Map<dwo, dwo> a = new HashMap<>();

         private dwo a(dwo $$0) {
            if ($$0 instanceof dwp.j $$1) {
               return $$1.j().a();
            } else {
               return $$0 instanceof dwp.l $$2 ? $$2.k() : $$0;
            }
         }

         @Override
         public dwo apply(dwo $$0) {
            return this.a.computeIfAbsent($$0, this::a);
         }
      };
      this.d = new dch.f(this.c.e().a($$4), this.c.f().a($$4), this.c.g().a($$4), this.c.h().a($$4), this.c.i().a($$4), this.c.j().a($$4), $$0.k());
   }

   public elz a(akm<elz.a> $$0) {
      return this.h.computeIfAbsent($$0, $$1 -> dxe.a(this.b, this.a, $$0));
   }

   public dxi a(akn $$0) {
      return this.i.computeIfAbsent($$0, $$1 -> this.a.a($$0).e());
   }

   public dxb a() {
      return this.c;
   }

   public dch.f b() {
      return this.d;
   }

   public dxn c() {
      return this.e;
   }

   public dxi d() {
      return this.f;
   }

   public dxi e() {
      return this.g;
   }
}
