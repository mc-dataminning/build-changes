import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class dmt {
   final dms a;
   private final ic<ebj.a> b;
   private final dml c;
   private final csz.f d;
   private final dmx e;
   private final dms f;
   private final dms g;
   private final Map<agf<ebj.a>, ebj> h;
   private final Map<agg, dms> i;

   public static dmt a(ic.a $$0, agf<dmk> $$1, long $$2) {
      return a($$0.b(jz.ay).b($$1).a(), $$0.b(jz.az), $$2);
   }

   public static dmt a(dmk $$0, ic<ebj.a> $$1, long $$2) {
      return new dmt($$0, $$1, $$2);
   }

   private dmt(dmk $$0, ic<ebj.a> $$1, final long $$2) {
      this.a = $$0.d().a($$2).e();
      this.b = $$1;
      this.f = this.a.a(new agg("aquifer")).e();
      this.g = this.a.a(new agg("ore")).e();
      this.h = new ConcurrentHashMap<>();
      this.i = new ConcurrentHashMap<>();
      this.e = new dmx(this, $$0.g(), $$0.l(), this.a);
      final boolean $$3 = $$0.n();

      class a implements dly.f {
         private final Map<dly, dly> d = new HashMap<>();

         private ato a(long $$0) {
            return new dmg($$2 + $$0);
         }

         @Override
         public dly.c a(dly.c $$0) {
            ib<ebj.a> $$1 = $$0.b();
            if ($$3) {
               if ($$1.a(dmo.a)) {
                  ebj $$2 = ebj.a(this.a(0L), new ebj.a(-7, 1.0, 1.0));
                  return new dly.c($$1, $$2);
               }

               if ($$1.a(dmo.b)) {
                  ebj $$3 = ebj.a(this.a(1L), new ebj.a(-7, 1.0, 1.0));
                  return new dly.c($$1, $$3);
               }

               if ($$1.a(dmo.j)) {
                  ebj $$4 = ebj.b(dmt.this.a.a(dmo.j.a()), new ebj.a(0, 0.0));
                  return new dly.c($$1, $$4);
               }
            }

            ebj $$5 = dmt.this.a($$1.e().orElseThrow());
            return new dly.c($$1, $$5);
         }

         private dly a(dly $$0) {
            if ($$0 instanceof ebg $$1) {
               ato $$2 = $$3 ? this.a(0L) : dmt.this.a.a(new agg("terrain"));
               return $$1.a($$2);
            } else {
               return (dly)($$0 instanceof dlz.i ? new dlz.i($$2) : $$0);
            }
         }

         @Override
         public dly apply(dly $$0) {
            return this.d.computeIfAbsent($$0, this::a);
         }
      }

      this.c = $$0.i().a(new a());
      dly.f $$4 = new dly.f() {
         private final Map<dly, dly> b = new HashMap<>();

         private dly a(dly $$0) {
            if ($$0 instanceof dlz.j $$1) {
               return $$1.j().a();
            } else {
               return $$0 instanceof dlz.l $$2 ? $$2.k() : $$0;
            }
         }

         @Override
         public dly apply(dly $$0) {
            return this.b.computeIfAbsent($$0, this::a);
         }
      };
      this.d = new csz.f(this.c.e().a($$4), this.c.f().a($$4), this.c.g().a($$4), this.c.h().a($$4), this.c.i().a($$4), this.c.j().a($$4), $$0.k());
   }

   public ebj a(agf<ebj.a> $$0) {
      return this.h.computeIfAbsent($$0, $$1 -> dmo.a(this.b, this.a, $$0));
   }

   public dms a(agg $$0) {
      return this.i.computeIfAbsent($$0, $$1 -> this.a.a($$0).e());
   }

   public dml a() {
      return this.c;
   }

   public csz.f b() {
      return this.d;
   }

   public dmx c() {
      return this.e;
   }

   public dms d() {
      return this.f;
   }

   public dms e() {
      return this.g;
   }
}
