import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class eec {
   final eeb a;
   private final js<esz.a> b;
   private final edu c;
   private final dil.f d;
   private final eeg e;
   private final eeb f;
   private final eeb g;
   private final Map<akt<esz.a>, esz> h;
   private final Map<aku, eeb> i;

   public static eec a(js.a $$0, akt<edt> $$1, long $$2) {
      return a($$0.b(mc.aS).b($$1).a(), $$0.b(mc.aT), $$2);
   }

   public static eec a(edt $$0, js<esz.a> $$1, long $$2) {
      return new eec($$0, $$1, $$2);
   }

   private eec(edt $$0, js<esz.a> $$1, final long $$2) {
      this.a = $$0.d().a($$2).e();
      this.b = $$1;
      this.f = this.a.a(aku.b("aquifer")).e();
      this.g = this.a.a(aku.b("ore")).e();
      this.h = new ConcurrentHashMap<>();
      this.i = new ConcurrentHashMap<>();
      this.e = new eeg(this, $$0.g(), $$0.l(), this.a);
      final boolean $$3 = $$0.n();

      class a implements edh.f {
         private final Map<edh, edh> d = new HashMap<>();

         private azh a(long $$0) {
            return new edp($$2 + $$0);
         }

         @Override
         public edh.c a(edh.c $$0) {
            jr<esz.a> $$1 = $$0.b();
            if ($$3) {
               if ($$1.a(edx.a)) {
                  esz $$2 = esz.a(this.a(0L), new esz.a(-7, 1.0, 1.0));
                  return new edh.c($$1, $$2);
               }

               if ($$1.a(edx.b)) {
                  esz $$3 = esz.a(this.a(1L), new esz.a(-7, 1.0, 1.0));
                  return new edh.c($$1, $$3);
               }

               if ($$1.a(edx.j)) {
                  esz $$4 = esz.b(eec.this.a.a(edx.j.a()), new esz.a(0, 0.0));
                  return new edh.c($$1, $$4);
               }
            }

            esz $$5 = eec.this.a($$1.e().orElseThrow());
            return new edh.c($$1, $$5);
         }

         private edh a(edh $$0) {
            if ($$0 instanceof esw $$1) {
               azh $$2 = $$3 ? this.a(0L) : eec.this.a.a(aku.b("terrain"));
               return $$1.a($$2);
            } else {
               return (edh)($$0 instanceof edi.i ? new edi.i($$2) : $$0);
            }
         }

         @Override
         public edh apply(edh $$0) {
            return this.d.computeIfAbsent($$0, this::a);
         }
      }

      this.c = $$0.i().a(new a());
      edh.f $$4 = new edh.f() {
         private final Map<edh, edh> a = new HashMap<>();

         private edh a(edh $$0) {
            if ($$0 instanceof edi.j $$1) {
               return $$1.j().a();
            } else {
               return $$0 instanceof edi.l $$2 ? $$2.k() : $$0;
            }
         }

         @Override
         public edh apply(edh $$0) {
            return this.a.computeIfAbsent($$0, this::a);
         }
      };
      this.d = new dil.f(this.c.e().a($$4), this.c.f().a($$4), this.c.g().a($$4), this.c.h().a($$4), this.c.i().a($$4), this.c.j().a($$4), $$0.k());
   }

   public esz a(akt<esz.a> $$0) {
      return this.h.computeIfAbsent($$0, $$1 -> edx.a(this.b, this.a, $$0));
   }

   public eeb a(aku $$0) {
      return this.i.computeIfAbsent($$0, $$1 -> this.a.a($$0).e());
   }

   public edu a() {
      return this.c;
   }

   public dil.f b() {
      return this.d;
   }

   public eeg c() {
      return this.e;
   }

   public eeb d() {
      return this.f;
   }

   public eeb e() {
      return this.g;
   }
}
