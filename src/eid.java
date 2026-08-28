import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class eid {
   final eic a;
   private final jh<exd.a> b;
   private final ehv c;
   private final dlv.f d;
   private final eih e;
   private final eic f;
   private final eic g;
   private final Map<alq<exd.a>, exd> h;
   private final Map<alr, eic> i;

   public static eid a(jh.a $$0, alq<ehu> $$1, long $$2) {
      return a($$0.b(mi.aX).b($$1).a(), $$0.b(mi.aY), $$2);
   }

   public static eid a(ehu $$0, jh<exd.a> $$1, long $$2) {
      return new eid($$0, $$1, $$2);
   }

   private eid(ehu $$0, jh<exd.a> $$1, final long $$2) {
      this.a = $$0.d().a($$2).e();
      this.b = $$1;
      this.f = this.a.a(alr.b("aquifer")).e();
      this.g = this.a.a(alr.b("ore")).e();
      this.h = new ConcurrentHashMap<>();
      this.i = new ConcurrentHashMap<>();
      this.e = new eih(this, $$0.g(), $$0.l(), this.a);
      final boolean $$3 = $$0.n();

      class a implements ehi.f {
         private final Map<ehi, ehi> d = new HashMap<>();

         private bai a(long $$0) {
            return new ehq($$2 + $$0);
         }

         @Override
         public ehi.c a(ehi.c $$0) {
            jg<exd.a> $$1 = $$0.b();
            if ($$3) {
               if ($$1.a(ehy.a)) {
                  exd $$2 = exd.a(this.a(0L), new exd.a(-7, 1.0, 1.0));
                  return new ehi.c($$1, $$2);
               }

               if ($$1.a(ehy.b)) {
                  exd $$3 = exd.a(this.a(1L), new exd.a(-7, 1.0, 1.0));
                  return new ehi.c($$1, $$3);
               }

               if ($$1.a(ehy.j)) {
                  exd $$4 = exd.b(eid.this.a.a(ehy.j.a()), new exd.a(0, 0.0));
                  return new ehi.c($$1, $$4);
               }
            }

            exd $$5 = eid.this.a($$1.e().orElseThrow());
            return new ehi.c($$1, $$5);
         }

         private ehi a(ehi $$0) {
            if ($$0 instanceof exa $$1) {
               bai $$2 = $$3 ? this.a(0L) : eid.this.a.a(alr.b("terrain"));
               return $$1.a($$2);
            } else {
               return (ehi)($$0 instanceof ehj.i ? new ehj.i($$2) : $$0);
            }
         }

         @Override
         public ehi apply(ehi $$0) {
            return this.d.computeIfAbsent($$0, this::a);
         }
      }

      this.c = $$0.i().a(new a());
      ehi.f $$4 = new ehi.f() {
         private final Map<ehi, ehi> a = new HashMap<>();

         private ehi a(ehi $$0) {
            if ($$0 instanceof ehj.j $$1) {
               return $$1.j().a();
            } else {
               return $$0 instanceof ehj.l $$2 ? $$2.k() : $$0;
            }
         }

         @Override
         public ehi apply(ehi $$0) {
            return this.a.computeIfAbsent($$0, this::a);
         }
      };
      this.d = new dlv.f(this.c.e().a($$4), this.c.f().a($$4), this.c.g().a($$4), this.c.h().a($$4), this.c.i().a($$4), this.c.j().a($$4), $$0.k());
   }

   public exd a(alq<exd.a> $$0) {
      return this.h.computeIfAbsent($$0, $$1 -> ehy.a(this.b, this.a, $$0));
   }

   public eic a(alr $$0) {
      return this.i.computeIfAbsent($$0, $$1 -> this.a.a($$0).e());
   }

   public ehv a() {
      return this.c;
   }

   public dlv.f b() {
      return this.d;
   }

   public eih c() {
      return this.e;
   }

   public eic d() {
      return this.f;
   }

   public eic e() {
      return this.g;
   }
}
