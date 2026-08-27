import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class dvf {
   final dve a;
   private final im<ejv.a> b;
   private final dux c;
   private final daf.f d;
   private final dvj e;
   private final dve f;
   private final dve g;
   private final Map<ajs<ejv.a>, ejv> h;
   private final Map<ajt, dve> i;

   public static dvf a(im.a $$0, ajs<duw> $$1, long $$2) {
      return a($$0.b(ks.aC).b($$1).a(), $$0.b(ks.aD), $$2);
   }

   public static dvf a(duw $$0, im<ejv.a> $$1, long $$2) {
      return new dvf($$0, $$1, $$2);
   }

   private dvf(duw $$0, im<ejv.a> $$1, final long $$2) {
      this.a = $$0.d().a($$2).e();
      this.b = $$1;
      this.f = this.a.a(new ajt("aquifer")).e();
      this.g = this.a.a(new ajt("ore")).e();
      this.h = new ConcurrentHashMap<>();
      this.i = new ConcurrentHashMap<>();
      this.e = new dvj(this, $$0.g(), $$0.l(), this.a);
      final boolean $$3 = $$0.n();

      class a implements duk.f {
         private final Map<duk, duk> d = new HashMap<>();

         private axr a(long $$0) {
            return new dus($$2 + $$0);
         }

         @Override
         public duk.c a(duk.c $$0) {
            il<ejv.a> $$1 = $$0.b();
            if ($$3) {
               if ($$1.a(dva.a)) {
                  ejv $$2 = ejv.a(this.a(0L), new ejv.a(-7, 1.0, 1.0));
                  return new duk.c($$1, $$2);
               }

               if ($$1.a(dva.b)) {
                  ejv $$3 = ejv.a(this.a(1L), new ejv.a(-7, 1.0, 1.0));
                  return new duk.c($$1, $$3);
               }

               if ($$1.a(dva.j)) {
                  ejv $$4 = ejv.b(dvf.this.a.a(dva.j.a()), new ejv.a(0, 0.0));
                  return new duk.c($$1, $$4);
               }
            }

            ejv $$5 = dvf.this.a($$1.e().orElseThrow());
            return new duk.c($$1, $$5);
         }

         private duk a(duk $$0) {
            if ($$0 instanceof ejs $$1) {
               axr $$2 = $$3 ? this.a(0L) : dvf.this.a.a(new ajt("terrain"));
               return $$1.a($$2);
            } else {
               return (duk)($$0 instanceof dul.i ? new dul.i($$2) : $$0);
            }
         }

         @Override
         public duk apply(duk $$0) {
            return this.d.computeIfAbsent($$0, this::a);
         }
      }

      this.c = $$0.i().a(new a());
      duk.f $$4 = new duk.f() {
         private final Map<duk, duk> b = new HashMap<>();

         private duk a(duk $$0) {
            if ($$0 instanceof dul.j $$1) {
               return $$1.j().a();
            } else {
               return $$0 instanceof dul.l $$2 ? $$2.k() : $$0;
            }
         }

         @Override
         public duk apply(duk $$0) {
            return this.b.computeIfAbsent($$0, this::a);
         }
      };
      this.d = new daf.f(this.c.e().a($$4), this.c.f().a($$4), this.c.g().a($$4), this.c.h().a($$4), this.c.i().a($$4), this.c.j().a($$4), $$0.k());
   }

   public ejv a(ajs<ejv.a> $$0) {
      return this.h.computeIfAbsent($$0, $$1 -> dva.a(this.b, this.a, $$0));
   }

   public dve a(ajt $$0) {
      return this.i.computeIfAbsent($$0, $$1 -> this.a.a($$0).e());
   }

   public dux a() {
      return this.c;
   }

   public daf.f b() {
      return this.d;
   }

   public dvj c() {
      return this.e;
   }

   public dve d() {
      return this.f;
   }

   public dve e() {
      return this.g;
   }
}
