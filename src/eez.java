import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class eez {
   final eey a;
   private final jt<etw.a> b;
   private final eer c;
   private final djb.f d;
   private final efd e;
   private final eey f;
   private final eey g;
   private final Map<alc<etw.a>, etw> h;
   private final Map<ald, eey> i;

   public static eez a(jt.a $$0, alc<eeq> $$1, long $$2) {
      return a($$0.b(me.aV).b($$1).a(), $$0.b(me.aW), $$2);
   }

   public static eez a(eeq $$0, jt<etw.a> $$1, long $$2) {
      return new eez($$0, $$1, $$2);
   }

   private eez(eeq $$0, jt<etw.a> $$1, final long $$2) {
      this.a = $$0.d().a($$2).e();
      this.b = $$1;
      this.f = this.a.a(ald.b("aquifer")).e();
      this.g = this.a.a(ald.b("ore")).e();
      this.h = new ConcurrentHashMap<>();
      this.i = new ConcurrentHashMap<>();
      this.e = new efd(this, $$0.g(), $$0.l(), this.a);
      final boolean $$3 = $$0.n();

      class a implements eee.f {
         private final Map<eee, eee> d = new HashMap<>();

         private azs a(long $$0) {
            return new eem($$2 + $$0);
         }

         @Override
         public eee.c a(eee.c $$0) {
            js<etw.a> $$1 = $$0.b();
            if ($$3) {
               if ($$1.a(eeu.a)) {
                  etw $$2 = etw.a(this.a(0L), new etw.a(-7, 1.0, 1.0));
                  return new eee.c($$1, $$2);
               }

               if ($$1.a(eeu.b)) {
                  etw $$3 = etw.a(this.a(1L), new etw.a(-7, 1.0, 1.0));
                  return new eee.c($$1, $$3);
               }

               if ($$1.a(eeu.j)) {
                  etw $$4 = etw.b(eez.this.a.a(eeu.j.a()), new etw.a(0, 0.0));
                  return new eee.c($$1, $$4);
               }
            }

            etw $$5 = eez.this.a($$1.e().orElseThrow());
            return new eee.c($$1, $$5);
         }

         private eee a(eee $$0) {
            if ($$0 instanceof ett $$1) {
               azs $$2 = $$3 ? this.a(0L) : eez.this.a.a(ald.b("terrain"));
               return $$1.a($$2);
            } else {
               return (eee)($$0 instanceof eef.i ? new eef.i($$2) : $$0);
            }
         }

         @Override
         public eee apply(eee $$0) {
            return this.d.computeIfAbsent($$0, this::a);
         }
      }

      this.c = $$0.i().a(new a());
      eee.f $$4 = new eee.f() {
         private final Map<eee, eee> a = new HashMap<>();

         private eee a(eee $$0) {
            if ($$0 instanceof eef.j $$1) {
               return $$1.j().a();
            } else {
               return $$0 instanceof eef.l $$2 ? $$2.k() : $$0;
            }
         }

         @Override
         public eee apply(eee $$0) {
            return this.a.computeIfAbsent($$0, this::a);
         }
      };
      this.d = new djb.f(this.c.e().a($$4), this.c.f().a($$4), this.c.g().a($$4), this.c.h().a($$4), this.c.i().a($$4), this.c.j().a($$4), $$0.k());
   }

   public etw a(alc<etw.a> $$0) {
      return this.h.computeIfAbsent($$0, $$1 -> eeu.a(this.b, this.a, $$0));
   }

   public eey a(ald $$0) {
      return this.i.computeIfAbsent($$0, $$1 -> this.a.a($$0).e());
   }

   public eer a() {
      return this.c;
   }

   public djb.f b() {
      return this.d;
   }

   public efd c() {
      return this.e;
   }

   public eey d() {
      return this.f;
   }

   public eey e() {
      return this.g;
   }
}
