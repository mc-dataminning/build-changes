import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class dyg {
   final dyf a;
   private final jj<emw.a> b;
   private final dxy c;
   private final dde.f d;
   private final dyk e;
   private final dyf f;
   private final dyf g;
   private final Map<ald<emw.a>, emw> h;
   private final Map<ale, dyf> i;

   public static dyg a(jj.a $$0, ald<dxx> $$1, long $$2) {
      return a($$0.b(lq.aG).b($$1).a(), $$0.b(lq.aH), $$2);
   }

   public static dyg a(dxx $$0, jj<emw.a> $$1, long $$2) {
      return new dyg($$0, $$1, $$2);
   }

   private dyg(dxx $$0, jj<emw.a> $$1, final long $$2) {
      this.a = $$0.d().a($$2).e();
      this.b = $$1;
      this.f = this.a.a(new ale("aquifer")).e();
      this.g = this.a.a(new ale("ore")).e();
      this.h = new ConcurrentHashMap<>();
      this.i = new ConcurrentHashMap<>();
      this.e = new dyk(this, $$0.g(), $$0.l(), this.a);
      final boolean $$3 = $$0.n();

      class a implements dxl.f {
         private final Map<dxl, dxl> d = new HashMap<>();

         private azf a(long $$0) {
            return new dxt($$2 + $$0);
         }

         @Override
         public dxl.c a(dxl.c $$0) {
            ji<emw.a> $$1 = $$0.b();
            if ($$3) {
               if ($$1.a(dyb.a)) {
                  emw $$2 = emw.a(this.a(0L), new emw.a(-7, 1.0, 1.0));
                  return new dxl.c($$1, $$2);
               }

               if ($$1.a(dyb.b)) {
                  emw $$3 = emw.a(this.a(1L), new emw.a(-7, 1.0, 1.0));
                  return new dxl.c($$1, $$3);
               }

               if ($$1.a(dyb.j)) {
                  emw $$4 = emw.b(dyg.this.a.a(dyb.j.a()), new emw.a(0, 0.0));
                  return new dxl.c($$1, $$4);
               }
            }

            emw $$5 = dyg.this.a($$1.e().orElseThrow());
            return new dxl.c($$1, $$5);
         }

         private dxl a(dxl $$0) {
            if ($$0 instanceof emt $$1) {
               azf $$2 = $$3 ? this.a(0L) : dyg.this.a.a(new ale("terrain"));
               return $$1.a($$2);
            } else {
               return (dxl)($$0 instanceof dxm.i ? new dxm.i($$2) : $$0);
            }
         }

         @Override
         public dxl apply(dxl $$0) {
            return this.d.computeIfAbsent($$0, this::a);
         }
      }

      this.c = $$0.i().a(new a());
      dxl.f $$4 = new dxl.f() {
         private final Map<dxl, dxl> a = new HashMap<>();

         private dxl a(dxl $$0) {
            if ($$0 instanceof dxm.j $$1) {
               return $$1.j().a();
            } else {
               return $$0 instanceof dxm.l $$2 ? $$2.k() : $$0;
            }
         }

         @Override
         public dxl apply(dxl $$0) {
            return this.a.computeIfAbsent($$0, this::a);
         }
      };
      this.d = new dde.f(this.c.e().a($$4), this.c.f().a($$4), this.c.g().a($$4), this.c.h().a($$4), this.c.i().a($$4), this.c.j().a($$4), $$0.k());
   }

   public emw a(ald<emw.a> $$0) {
      return this.h.computeIfAbsent($$0, $$1 -> dyb.a(this.b, this.a, $$0));
   }

   public dyf a(ale $$0) {
      return this.i.computeIfAbsent($$0, $$1 -> this.a.a($$0).e());
   }

   public dxy a() {
      return this.c;
   }

   public dde.f b() {
      return this.d;
   }

   public dyk c() {
      return this.e;
   }

   public dyf d() {
      return this.f;
   }

   public dyf e() {
      return this.g;
   }
}
