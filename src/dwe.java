import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class dwe {
   final dwd a;
   private final iw<eku.a> b;
   private final dvw c;
   private final dbc.f d;
   private final dwi e;
   private final dwd f;
   private final dwd g;
   private final Map<ake<eku.a>, eku> h;
   private final Map<akf, dwd> i;

   public static dwe a(iw.a $$0, ake<dvv> $$1, long $$2) {
      return a($$0.b(ld.aF).b($$1).a(), $$0.b(ld.aG), $$2);
   }

   public static dwe a(dvv $$0, iw<eku.a> $$1, long $$2) {
      return new dwe($$0, $$1, $$2);
   }

   private dwe(dvv $$0, iw<eku.a> $$1, final long $$2) {
      this.a = $$0.d().a($$2).e();
      this.b = $$1;
      this.f = this.a.a(new akf("aquifer")).e();
      this.g = this.a.a(new akf("ore")).e();
      this.h = new ConcurrentHashMap<>();
      this.i = new ConcurrentHashMap<>();
      this.e = new dwi(this, $$0.g(), $$0.l(), this.a);
      final boolean $$3 = $$0.n();

      class a implements dvj.f {
         private final Map<dvj, dvj> d = new HashMap<>();

         private ayd a(long $$0) {
            return new dvr($$2 + $$0);
         }

         @Override
         public dvj.c a(dvj.c $$0) {
            iv<eku.a> $$1 = $$0.b();
            if ($$3) {
               if ($$1.a(dvz.a)) {
                  eku $$2 = eku.a(this.a(0L), new eku.a(-7, 1.0, 1.0));
                  return new dvj.c($$1, $$2);
               }

               if ($$1.a(dvz.b)) {
                  eku $$3 = eku.a(this.a(1L), new eku.a(-7, 1.0, 1.0));
                  return new dvj.c($$1, $$3);
               }

               if ($$1.a(dvz.j)) {
                  eku $$4 = eku.b(dwe.this.a.a(dvz.j.a()), new eku.a(0, 0.0));
                  return new dvj.c($$1, $$4);
               }
            }

            eku $$5 = dwe.this.a($$1.e().orElseThrow());
            return new dvj.c($$1, $$5);
         }

         private dvj a(dvj $$0) {
            if ($$0 instanceof ekr $$1) {
               ayd $$2 = $$3 ? this.a(0L) : dwe.this.a.a(new akf("terrain"));
               return $$1.a($$2);
            } else {
               return (dvj)($$0 instanceof dvk.i ? new dvk.i($$2) : $$0);
            }
         }

         @Override
         public dvj apply(dvj $$0) {
            return this.d.computeIfAbsent($$0, this::a);
         }
      }

      this.c = $$0.i().a(new a());
      dvj.f $$4 = new dvj.f() {
         private final Map<dvj, dvj> b = new HashMap<>();

         private dvj a(dvj $$0) {
            if ($$0 instanceof dvk.j $$1) {
               return $$1.j().a();
            } else {
               return $$0 instanceof dvk.l $$2 ? $$2.k() : $$0;
            }
         }

         @Override
         public dvj apply(dvj $$0) {
            return this.b.computeIfAbsent($$0, this::a);
         }
      };
      this.d = new dbc.f(this.c.e().a($$4), this.c.f().a($$4), this.c.g().a($$4), this.c.h().a($$4), this.c.i().a($$4), this.c.j().a($$4), $$0.k());
   }

   public eku a(ake<eku.a> $$0) {
      return this.h.computeIfAbsent($$0, $$1 -> dvz.a(this.b, this.a, $$0));
   }

   public dwd a(akf $$0) {
      return this.i.computeIfAbsent($$0, $$1 -> this.a.a($$0).e());
   }

   public dvw a() {
      return this.c;
   }

   public dbc.f b() {
      return this.d;
   }

   public dwi c() {
      return this.e;
   }

   public dwd d() {
      return this.f;
   }

   public dwd e() {
      return this.g;
   }
}
