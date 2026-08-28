import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class eht {
   final ehs a;
   private final jh<ewt.a> b;
   private final ehl c;
   private final dll.f d;
   private final ehx e;
   private final ehs f;
   private final ehs g;
   private final Map<alj<ewt.a>, ewt> h;
   private final Map<alk, ehs> i;

   public static eht a(jh.a $$0, alj<ehk> $$1, long $$2) {
      return a($$0.b(mi.aX).b($$1).a(), $$0.b(mi.aY), $$2);
   }

   public static eht a(ehk $$0, jh<ewt.a> $$1, long $$2) {
      return new eht($$0, $$1, $$2);
   }

   private eht(ehk $$0, jh<ewt.a> $$1, final long $$2) {
      this.a = $$0.d().a($$2).e();
      this.b = $$1;
      this.f = this.a.a(alk.b("aquifer")).e();
      this.g = this.a.a(alk.b("ore")).e();
      this.h = new ConcurrentHashMap<>();
      this.i = new ConcurrentHashMap<>();
      this.e = new ehx(this, $$0.g(), $$0.l(), this.a);
      final boolean $$3 = $$0.n();

      class a implements egy.f {
         private final Map<egy, egy> d = new HashMap<>();

         private azz a(long $$0) {
            return new ehg($$2 + $$0);
         }

         @Override
         public egy.c a(egy.c $$0) {
            jg<ewt.a> $$1 = $$0.b();
            if ($$3) {
               if ($$1.a(eho.a)) {
                  ewt $$2 = ewt.a(this.a(0L), new ewt.a(-7, 1.0, 1.0));
                  return new egy.c($$1, $$2);
               }

               if ($$1.a(eho.b)) {
                  ewt $$3 = ewt.a(this.a(1L), new ewt.a(-7, 1.0, 1.0));
                  return new egy.c($$1, $$3);
               }

               if ($$1.a(eho.j)) {
                  ewt $$4 = ewt.b(eht.this.a.a(eho.j.a()), new ewt.a(0, 0.0));
                  return new egy.c($$1, $$4);
               }
            }

            ewt $$5 = eht.this.a($$1.e().orElseThrow());
            return new egy.c($$1, $$5);
         }

         private egy a(egy $$0) {
            if ($$0 instanceof ewq $$1) {
               azz $$2 = $$3 ? this.a(0L) : eht.this.a.a(alk.b("terrain"));
               return $$1.a($$2);
            } else {
               return (egy)($$0 instanceof egz.i ? new egz.i($$2) : $$0);
            }
         }

         @Override
         public egy apply(egy $$0) {
            return this.d.computeIfAbsent($$0, this::a);
         }
      }

      this.c = $$0.i().a(new a());
      egy.f $$4 = new egy.f() {
         private final Map<egy, egy> a = new HashMap<>();

         private egy a(egy $$0) {
            if ($$0 instanceof egz.j $$1) {
               return $$1.j().a();
            } else {
               return $$0 instanceof egz.l $$2 ? $$2.k() : $$0;
            }
         }

         @Override
         public egy apply(egy $$0) {
            return this.a.computeIfAbsent($$0, this::a);
         }
      };
      this.d = new dll.f(this.c.e().a($$4), this.c.f().a($$4), this.c.g().a($$4), this.c.h().a($$4), this.c.i().a($$4), this.c.j().a($$4), $$0.k());
   }

   public ewt a(alj<ewt.a> $$0) {
      return this.h.computeIfAbsent($$0, $$1 -> eho.a(this.b, this.a, $$0));
   }

   public ehs a(alk $$0) {
      return this.i.computeIfAbsent($$0, $$1 -> this.a.a($$0).e());
   }

   public ehl a() {
      return this.c;
   }

   public dll.f b() {
      return this.d;
   }

   public ehx c() {
      return this.e;
   }

   public ehs d() {
      return this.f;
   }

   public ehs e() {
      return this.g;
   }
}
