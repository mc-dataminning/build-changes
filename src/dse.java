import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class dse {
   final dsd a;
   private final im<egu.a> b;
   private final drw c;
   private final cxm.f d;
   private final dsi e;
   private final dsd f;
   private final dsd g;
   private final Map<ajb<egu.a>, egu> h;
   private final Map<ajc, dsd> i;

   public static dse a(im.a $$0, ajb<drv> $$1, long $$2) {
      return a($$0.b(ki.aB).b($$1).a(), $$0.b(ki.aC), $$2);
   }

   public static dse a(drv $$0, im<egu.a> $$1, long $$2) {
      return new dse($$0, $$1, $$2);
   }

   private dse(drv $$0, im<egu.a> $$1, final long $$2) {
      this.a = $$0.d().a($$2).e();
      this.b = $$1;
      this.f = this.a.a(new ajc("aquifer")).e();
      this.g = this.a.a(new ajc("ore")).e();
      this.h = new ConcurrentHashMap<>();
      this.i = new ConcurrentHashMap<>();
      this.e = new dsi(this, $$0.g(), $$0.l(), this.a);
      final boolean $$3 = $$0.n();

      class a implements drj.f {
         private final Map<drj, drj> d = new HashMap<>();

         private awt a(long $$0) {
            return new drr($$2 + $$0);
         }

         @Override
         public drj.c a(drj.c $$0) {
            il<egu.a> $$1 = $$0.b();
            if ($$3) {
               if ($$1.a(drz.a)) {
                  egu $$2 = egu.a(this.a(0L), new egu.a(-7, 1.0, 1.0));
                  return new drj.c($$1, $$2);
               }

               if ($$1.a(drz.b)) {
                  egu $$3 = egu.a(this.a(1L), new egu.a(-7, 1.0, 1.0));
                  return new drj.c($$1, $$3);
               }

               if ($$1.a(drz.j)) {
                  egu $$4 = egu.b(dse.this.a.a(drz.j.a()), new egu.a(0, 0.0));
                  return new drj.c($$1, $$4);
               }
            }

            egu $$5 = dse.this.a($$1.e().orElseThrow());
            return new drj.c($$1, $$5);
         }

         private drj a(drj $$0) {
            if ($$0 instanceof egr $$1) {
               awt $$2 = $$3 ? this.a(0L) : dse.this.a.a(new ajc("terrain"));
               return $$1.a($$2);
            } else {
               return (drj)($$0 instanceof drk.i ? new drk.i($$2) : $$0);
            }
         }

         @Override
         public drj apply(drj $$0) {
            return this.d.computeIfAbsent($$0, this::a);
         }
      }

      this.c = $$0.i().a(new a());
      drj.f $$4 = new drj.f() {
         private final Map<drj, drj> b = new HashMap<>();

         private drj a(drj $$0) {
            if ($$0 instanceof drk.j $$1) {
               return $$1.j().a();
            } else {
               return $$0 instanceof drk.l $$2 ? $$2.k() : $$0;
            }
         }

         @Override
         public drj apply(drj $$0) {
            return this.b.computeIfAbsent($$0, this::a);
         }
      };
      this.d = new cxm.f(this.c.e().a($$4), this.c.f().a($$4), this.c.g().a($$4), this.c.h().a($$4), this.c.i().a($$4), this.c.j().a($$4), $$0.k());
   }

   public egu a(ajb<egu.a> $$0) {
      return this.h.computeIfAbsent($$0, $$1 -> drz.a(this.b, this.a, $$0));
   }

   public dsd a(ajc $$0) {
      return this.i.computeIfAbsent($$0, $$1 -> this.a.a($$0).e());
   }

   public drw a() {
      return this.c;
   }

   public cxm.f b() {
      return this.d;
   }

   public dsi c() {
      return this.e;
   }

   public dsd d() {
      return this.f;
   }

   public dsd e() {
      return this.g;
   }
}
