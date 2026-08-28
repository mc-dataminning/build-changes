import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class ehg {
   final ehf a;
   private final jg<ewd.a> b;
   private final egy c;
   private final dky.f d;
   private final ehk e;
   private final ehf f;
   private final ehf g;
   private final Map<alf<ewd.a>, ewd> h;
   private final Map<alg, ehf> i;

   public static ehg a(jg.a $$0, alf<egx> $$1, long $$2) {
      return a($$0.b(mh.aX).b($$1).a(), $$0.b(mh.aY), $$2);
   }

   public static ehg a(egx $$0, jg<ewd.a> $$1, long $$2) {
      return new ehg($$0, $$1, $$2);
   }

   private ehg(egx $$0, jg<ewd.a> $$1, final long $$2) {
      this.a = $$0.d().a($$2).e();
      this.b = $$1;
      this.f = this.a.a(alg.b("aquifer")).e();
      this.g = this.a.a(alg.b("ore")).e();
      this.h = new ConcurrentHashMap<>();
      this.i = new ConcurrentHashMap<>();
      this.e = new ehk(this, $$0.g(), $$0.l(), this.a);
      final boolean $$3 = $$0.n();

      class a implements egl.f {
         private final Map<egl, egl> d = new HashMap<>();

         private azv a(long $$0) {
            return new egt($$2 + $$0);
         }

         @Override
         public egl.c a(egl.c $$0) {
            jf<ewd.a> $$1 = $$0.b();
            if ($$3) {
               if ($$1.a(ehb.a)) {
                  ewd $$2 = ewd.a(this.a(0L), new ewd.a(-7, 1.0, 1.0));
                  return new egl.c($$1, $$2);
               }

               if ($$1.a(ehb.b)) {
                  ewd $$3 = ewd.a(this.a(1L), new ewd.a(-7, 1.0, 1.0));
                  return new egl.c($$1, $$3);
               }

               if ($$1.a(ehb.j)) {
                  ewd $$4 = ewd.b(ehg.this.a.a(ehb.j.a()), new ewd.a(0, 0.0));
                  return new egl.c($$1, $$4);
               }
            }

            ewd $$5 = ehg.this.a($$1.e().orElseThrow());
            return new egl.c($$1, $$5);
         }

         private egl a(egl $$0) {
            if ($$0 instanceof ewa $$1) {
               azv $$2 = $$3 ? this.a(0L) : ehg.this.a.a(alg.b("terrain"));
               return $$1.a($$2);
            } else {
               return (egl)($$0 instanceof egm.i ? new egm.i($$2) : $$0);
            }
         }

         @Override
         public egl apply(egl $$0) {
            return this.d.computeIfAbsent($$0, this::a);
         }
      }

      this.c = $$0.i().a(new a());
      egl.f $$4 = new egl.f() {
         private final Map<egl, egl> a = new HashMap<>();

         private egl a(egl $$0) {
            if ($$0 instanceof egm.j $$1) {
               return $$1.j().a();
            } else {
               return $$0 instanceof egm.l $$2 ? $$2.k() : $$0;
            }
         }

         @Override
         public egl apply(egl $$0) {
            return this.a.computeIfAbsent($$0, this::a);
         }
      };
      this.d = new dky.f(this.c.e().a($$4), this.c.f().a($$4), this.c.g().a($$4), this.c.h().a($$4), this.c.i().a($$4), this.c.j().a($$4), $$0.k());
   }

   public ewd a(alf<ewd.a> $$0) {
      return this.h.computeIfAbsent($$0, $$1 -> ehb.a(this.b, this.a, $$0));
   }

   public ehf a(alg $$0) {
      return this.i.computeIfAbsent($$0, $$1 -> this.a.a($$0).e());
   }

   public egy a() {
      return this.c;
   }

   public dky.f b() {
      return this.d;
   }

   public ehk c() {
      return this.e;
   }

   public ehf d() {
      return this.f;
   }

   public ehf e() {
      return this.g;
   }
}
