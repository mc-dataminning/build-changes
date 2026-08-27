import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class dli {
   final dlh a;
   private final hh<dzr.a> b;
   private final dla c;
   private final cre.f d;
   private final dlm e;
   private final dlh f;
   private final dlh g;
   private final Map<aex<dzr.a>, dzr> h;
   private final Map<aey, dlh> i;

   public static dli a(hh.a $$0, aex<dkz> $$1, long $$2) {
      return a($$0.b(je.aw).b($$1).a(), $$0.b(je.ax), $$2);
   }

   public static dli a(dkz $$0, hh<dzr.a> $$1, long $$2) {
      return new dli($$0, $$1, $$2);
   }

   private dli(dkz $$0, hh<dzr.a> $$1, final long $$2) {
      this.a = $$0.d().a($$2).e();
      this.b = $$1;
      this.f = this.a.a(new aey("aquifer")).e();
      this.g = this.a.a(new aey("ore")).e();
      this.h = new ConcurrentHashMap<>();
      this.i = new ConcurrentHashMap<>();
      this.e = new dlm(this, $$0.g(), $$0.l(), this.a);
      final boolean $$3 = $$0.n();

      class a implements dkn.f {
         private final Map<dkn, dkn> d = new HashMap<>();

         private ase a(long $$0) {
            return new dkv($$2 + $$0);
         }

         @Override
         public dkn.c a(dkn.c $$0) {
            hg<dzr.a> $$1 = $$0.b();
            if ($$3) {
               if ($$1.a(dld.a)) {
                  dzr $$2 = dzr.a(this.a(0L), new dzr.a(-7, 1.0, 1.0));
                  return new dkn.c($$1, $$2);
               }

               if ($$1.a(dld.b)) {
                  dzr $$3 = dzr.a(this.a(1L), new dzr.a(-7, 1.0, 1.0));
                  return new dkn.c($$1, $$3);
               }

               if ($$1.a(dld.j)) {
                  dzr $$4 = dzr.b(dli.this.a.a(dld.j.a()), new dzr.a(0, 0.0));
                  return new dkn.c($$1, $$4);
               }
            }

            dzr $$5 = dli.this.a($$1.e().orElseThrow());
            return new dkn.c($$1, $$5);
         }

         private dkn a(dkn $$0) {
            if ($$0 instanceof dzo $$1) {
               ase $$2 = $$3 ? this.a(0L) : dli.this.a.a(new aey("terrain"));
               return $$1.a($$2);
            } else {
               return (dkn)($$0 instanceof dko.i ? new dko.i($$2) : $$0);
            }
         }

         @Override
         public dkn apply(dkn $$0) {
            return this.d.computeIfAbsent($$0, this::a);
         }
      }

      this.c = $$0.i().a(new a());
      dkn.f $$4 = new dkn.f() {
         private final Map<dkn, dkn> b = new HashMap<>();

         private dkn a(dkn $$0) {
            if ($$0 instanceof dko.j $$1) {
               return $$1.j().a();
            } else {
               return $$0 instanceof dko.l $$2 ? $$2.k() : $$0;
            }
         }

         @Override
         public dkn apply(dkn $$0) {
            return this.b.computeIfAbsent($$0, this::a);
         }
      };
      this.d = new cre.f(this.c.e().a($$4), this.c.f().a($$4), this.c.g().a($$4), this.c.h().a($$4), this.c.i().a($$4), this.c.j().a($$4), $$0.k());
   }

   public dzr a(aex<dzr.a> $$0) {
      return this.h.computeIfAbsent($$0, $$1 -> dld.a(this.b, this.a, $$0));
   }

   public dlh a(aey $$0) {
      return this.i.computeIfAbsent($$0, $$1 -> this.a.a($$0).e());
   }

   public dla a() {
      return this.c;
   }

   public cre.f b() {
      return this.d;
   }

   public dlm c() {
      return this.e;
   }

   public dlh d() {
      return this.f;
   }

   public dlh e() {
      return this.g;
   }
}
