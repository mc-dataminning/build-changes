import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class edf {
   final ede a;
   private final js<esb.a> b;
   private final ecx c;
   private final dhs.f d;
   private final edj e;
   private final ede f;
   private final ede g;
   private final Map<aku<esb.a>, esb> h;
   private final Map<akv, ede> i;

   public static edf a(js.a $$0, aku<ecw> $$1, long $$2) {
      return a($$0.b(mc.aR).b($$1).a(), $$0.b(mc.aS), $$2);
   }

   public static edf a(ecw $$0, js<esb.a> $$1, long $$2) {
      return new edf($$0, $$1, $$2);
   }

   private edf(ecw $$0, js<esb.a> $$1, final long $$2) {
      this.a = $$0.d().a($$2).e();
      this.b = $$1;
      this.f = this.a.a(akv.b("aquifer")).e();
      this.g = this.a.a(akv.b("ore")).e();
      this.h = new ConcurrentHashMap<>();
      this.i = new ConcurrentHashMap<>();
      this.e = new edj(this, $$0.g(), $$0.l(), this.a);
      final boolean $$3 = $$0.n();

      class a implements eck.f {
         private final Map<eck, eck> d = new HashMap<>();

         private azh a(long $$0) {
            return new ecs($$2 + $$0);
         }

         @Override
         public eck.c a(eck.c $$0) {
            jr<esb.a> $$1 = $$0.b();
            if ($$3) {
               if ($$1.a(eda.a)) {
                  esb $$2 = esb.a(this.a(0L), new esb.a(-7, 1.0, 1.0));
                  return new eck.c($$1, $$2);
               }

               if ($$1.a(eda.b)) {
                  esb $$3 = esb.a(this.a(1L), new esb.a(-7, 1.0, 1.0));
                  return new eck.c($$1, $$3);
               }

               if ($$1.a(eda.j)) {
                  esb $$4 = esb.b(edf.this.a.a(eda.j.a()), new esb.a(0, 0.0));
                  return new eck.c($$1, $$4);
               }
            }

            esb $$5 = edf.this.a($$1.e().orElseThrow());
            return new eck.c($$1, $$5);
         }

         private eck a(eck $$0) {
            if ($$0 instanceof ery $$1) {
               azh $$2 = $$3 ? this.a(0L) : edf.this.a.a(akv.b("terrain"));
               return $$1.a($$2);
            } else {
               return (eck)($$0 instanceof ecl.i ? new ecl.i($$2) : $$0);
            }
         }

         @Override
         public eck apply(eck $$0) {
            return this.d.computeIfAbsent($$0, this::a);
         }
      }

      this.c = $$0.i().a(new a());
      eck.f $$4 = new eck.f() {
         private final Map<eck, eck> a = new HashMap<>();

         private eck a(eck $$0) {
            if ($$0 instanceof ecl.j $$1) {
               return $$1.j().a();
            } else {
               return $$0 instanceof ecl.l $$2 ? $$2.k() : $$0;
            }
         }

         @Override
         public eck apply(eck $$0) {
            return this.a.computeIfAbsent($$0, this::a);
         }
      };
      this.d = new dhs.f(this.c.e().a($$4), this.c.f().a($$4), this.c.g().a($$4), this.c.h().a($$4), this.c.i().a($$4), this.c.j().a($$4), $$0.k());
   }

   public esb a(aku<esb.a> $$0) {
      return this.h.computeIfAbsent($$0, $$1 -> eda.a(this.b, this.a, $$0));
   }

   public ede a(akv $$0) {
      return this.i.computeIfAbsent($$0, $$1 -> this.a.a($$0).e());
   }

   public ecx a() {
      return this.c;
   }

   public dhs.f b() {
      return this.d;
   }

   public edj c() {
      return this.e;
   }

   public ede d() {
      return this.f;
   }

   public ede e() {
      return this.g;
   }
}
