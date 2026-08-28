import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class ehb {
   final eha a;
   private final jg<evy.a> b;
   private final egt c;
   private final dkt.f d;
   private final ehf e;
   private final eha f;
   private final eha g;
   private final Map<alf<evy.a>, evy> h;
   private final Map<alg, eha> i;

   public static ehb a(jg.a $$0, alf<egs> $$1, long $$2) {
      return a($$0.b(mh.aX).b($$1).a(), $$0.b(mh.aY), $$2);
   }

   public static ehb a(egs $$0, jg<evy.a> $$1, long $$2) {
      return new ehb($$0, $$1, $$2);
   }

   private ehb(egs $$0, jg<evy.a> $$1, final long $$2) {
      this.a = $$0.d().a($$2).e();
      this.b = $$1;
      this.f = this.a.a(alg.b("aquifer")).e();
      this.g = this.a.a(alg.b("ore")).e();
      this.h = new ConcurrentHashMap<>();
      this.i = new ConcurrentHashMap<>();
      this.e = new ehf(this, $$0.g(), $$0.l(), this.a);
      final boolean $$3 = $$0.n();

      class a implements egg.f {
         private final Map<egg, egg> d = new HashMap<>();

         private azv a(long $$0) {
            return new ego($$2 + $$0);
         }

         @Override
         public egg.c a(egg.c $$0) {
            jf<evy.a> $$1 = $$0.b();
            if ($$3) {
               if ($$1.a(egw.a)) {
                  evy $$2 = evy.a(this.a(0L), new evy.a(-7, 1.0, 1.0));
                  return new egg.c($$1, $$2);
               }

               if ($$1.a(egw.b)) {
                  evy $$3 = evy.a(this.a(1L), new evy.a(-7, 1.0, 1.0));
                  return new egg.c($$1, $$3);
               }

               if ($$1.a(egw.j)) {
                  evy $$4 = evy.b(ehb.this.a.a(egw.j.a()), new evy.a(0, 0.0));
                  return new egg.c($$1, $$4);
               }
            }

            evy $$5 = ehb.this.a($$1.e().orElseThrow());
            return new egg.c($$1, $$5);
         }

         private egg a(egg $$0) {
            if ($$0 instanceof evv $$1) {
               azv $$2 = $$3 ? this.a(0L) : ehb.this.a.a(alg.b("terrain"));
               return $$1.a($$2);
            } else {
               return (egg)($$0 instanceof egh.i ? new egh.i($$2) : $$0);
            }
         }

         @Override
         public egg apply(egg $$0) {
            return this.d.computeIfAbsent($$0, this::a);
         }
      }

      this.c = $$0.i().a(new a());
      egg.f $$4 = new egg.f() {
         private final Map<egg, egg> a = new HashMap<>();

         private egg a(egg $$0) {
            if ($$0 instanceof egh.j $$1) {
               return $$1.j().a();
            } else {
               return $$0 instanceof egh.l $$2 ? $$2.k() : $$0;
            }
         }

         @Override
         public egg apply(egg $$0) {
            return this.a.computeIfAbsent($$0, this::a);
         }
      };
      this.d = new dkt.f(this.c.e().a($$4), this.c.f().a($$4), this.c.g().a($$4), this.c.h().a($$4), this.c.i().a($$4), this.c.j().a($$4), $$0.k());
   }

   public evy a(alf<evy.a> $$0) {
      return this.h.computeIfAbsent($$0, $$1 -> egw.a(this.b, this.a, $$0));
   }

   public eha a(alg $$0) {
      return this.i.computeIfAbsent($$0, $$1 -> this.a.a($$0).e());
   }

   public egt a() {
      return this.c;
   }

   public dkt.f b() {
      return this.d;
   }

   public ehf c() {
      return this.e;
   }

   public eha d() {
      return this.f;
   }

   public eha e() {
      return this.g;
   }
}
