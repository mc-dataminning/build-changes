import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class ehr {
   final ehq a;
   private final jg<ewr.a> b;
   private final ehj c;
   private final dlj.f d;
   private final ehv e;
   private final ehq f;
   private final ehq g;
   private final Map<alh<ewr.a>, ewr> h;
   private final Map<ali, ehq> i;

   public static ehr a(jg.a $$0, alh<ehi> $$1, long $$2) {
      return a($$0.b(mh.aX).b($$1).a(), $$0.b(mh.aY), $$2);
   }

   public static ehr a(ehi $$0, jg<ewr.a> $$1, long $$2) {
      return new ehr($$0, $$1, $$2);
   }

   private ehr(ehi $$0, jg<ewr.a> $$1, final long $$2) {
      this.a = $$0.d().a($$2).e();
      this.b = $$1;
      this.f = this.a.a(ali.b("aquifer")).e();
      this.g = this.a.a(ali.b("ore")).e();
      this.h = new ConcurrentHashMap<>();
      this.i = new ConcurrentHashMap<>();
      this.e = new ehv(this, $$0.g(), $$0.l(), this.a);
      final boolean $$3 = $$0.n();

      class a implements egw.f {
         private final Map<egw, egw> d = new HashMap<>();

         private azx a(long $$0) {
            return new ehe($$2 + $$0);
         }

         @Override
         public egw.c a(egw.c $$0) {
            jf<ewr.a> $$1 = $$0.b();
            if ($$3) {
               if ($$1.a(ehm.a)) {
                  ewr $$2 = ewr.a(this.a(0L), new ewr.a(-7, 1.0, 1.0));
                  return new egw.c($$1, $$2);
               }

               if ($$1.a(ehm.b)) {
                  ewr $$3 = ewr.a(this.a(1L), new ewr.a(-7, 1.0, 1.0));
                  return new egw.c($$1, $$3);
               }

               if ($$1.a(ehm.j)) {
                  ewr $$4 = ewr.b(ehr.this.a.a(ehm.j.a()), new ewr.a(0, 0.0));
                  return new egw.c($$1, $$4);
               }
            }

            ewr $$5 = ehr.this.a($$1.e().orElseThrow());
            return new egw.c($$1, $$5);
         }

         private egw a(egw $$0) {
            if ($$0 instanceof ewo $$1) {
               azx $$2 = $$3 ? this.a(0L) : ehr.this.a.a(ali.b("terrain"));
               return $$1.a($$2);
            } else {
               return (egw)($$0 instanceof egx.i ? new egx.i($$2) : $$0);
            }
         }

         @Override
         public egw apply(egw $$0) {
            return this.d.computeIfAbsent($$0, this::a);
         }
      }

      this.c = $$0.i().a(new a());
      egw.f $$4 = new egw.f() {
         private final Map<egw, egw> a = new HashMap<>();

         private egw a(egw $$0) {
            if ($$0 instanceof egx.j $$1) {
               return $$1.j().a();
            } else {
               return $$0 instanceof egx.l $$2 ? $$2.k() : $$0;
            }
         }

         @Override
         public egw apply(egw $$0) {
            return this.a.computeIfAbsent($$0, this::a);
         }
      };
      this.d = new dlj.f(this.c.e().a($$4), this.c.f().a($$4), this.c.g().a($$4), this.c.h().a($$4), this.c.i().a($$4), this.c.j().a($$4), $$0.k());
   }

   public ewr a(alh<ewr.a> $$0) {
      return this.h.computeIfAbsent($$0, $$1 -> ehm.a(this.b, this.a, $$0));
   }

   public ehq a(ali $$0) {
      return this.i.computeIfAbsent($$0, $$1 -> this.a.a($$0).e());
   }

   public ehj a() {
      return this.c;
   }

   public dlj.f b() {
      return this.d;
   }

   public ehv c() {
      return this.e;
   }

   public ehq d() {
      return this.f;
   }

   public ehq e() {
      return this.g;
   }
}
