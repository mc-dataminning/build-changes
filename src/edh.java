import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class edh {
   final edg a;
   private final js<esd.a> b;
   private final ecz c;
   private final dhu.f d;
   private final edl e;
   private final edg f;
   private final edg g;
   private final Map<aku<esd.a>, esd> h;
   private final Map<akv, edg> i;

   public static edh a(js.a $$0, aku<ecy> $$1, long $$2) {
      return a($$0.b(mc.aR).b($$1).a(), $$0.b(mc.aS), $$2);
   }

   public static edh a(ecy $$0, js<esd.a> $$1, long $$2) {
      return new edh($$0, $$1, $$2);
   }

   private edh(ecy $$0, js<esd.a> $$1, final long $$2) {
      this.a = $$0.d().a($$2).e();
      this.b = $$1;
      this.f = this.a.a(akv.b("aquifer")).e();
      this.g = this.a.a(akv.b("ore")).e();
      this.h = new ConcurrentHashMap<>();
      this.i = new ConcurrentHashMap<>();
      this.e = new edl(this, $$0.g(), $$0.l(), this.a);
      final boolean $$3 = $$0.n();

      class a implements ecm.f {
         private final Map<ecm, ecm> d = new HashMap<>();

         private azh a(long $$0) {
            return new ecu($$2 + $$0);
         }

         @Override
         public ecm.c a(ecm.c $$0) {
            jr<esd.a> $$1 = $$0.b();
            if ($$3) {
               if ($$1.a(edc.a)) {
                  esd $$2 = esd.a(this.a(0L), new esd.a(-7, 1.0, 1.0));
                  return new ecm.c($$1, $$2);
               }

               if ($$1.a(edc.b)) {
                  esd $$3 = esd.a(this.a(1L), new esd.a(-7, 1.0, 1.0));
                  return new ecm.c($$1, $$3);
               }

               if ($$1.a(edc.j)) {
                  esd $$4 = esd.b(edh.this.a.a(edc.j.a()), new esd.a(0, 0.0));
                  return new ecm.c($$1, $$4);
               }
            }

            esd $$5 = edh.this.a($$1.e().orElseThrow());
            return new ecm.c($$1, $$5);
         }

         private ecm a(ecm $$0) {
            if ($$0 instanceof esa $$1) {
               azh $$2 = $$3 ? this.a(0L) : edh.this.a.a(akv.b("terrain"));
               return $$1.a($$2);
            } else {
               return (ecm)($$0 instanceof ecn.i ? new ecn.i($$2) : $$0);
            }
         }

         @Override
         public ecm apply(ecm $$0) {
            return this.d.computeIfAbsent($$0, this::a);
         }
      }

      this.c = $$0.i().a(new a());
      ecm.f $$4 = new ecm.f() {
         private final Map<ecm, ecm> a = new HashMap<>();

         private ecm a(ecm $$0) {
            if ($$0 instanceof ecn.j $$1) {
               return $$1.j().a();
            } else {
               return $$0 instanceof ecn.l $$2 ? $$2.k() : $$0;
            }
         }

         @Override
         public ecm apply(ecm $$0) {
            return this.a.computeIfAbsent($$0, this::a);
         }
      };
      this.d = new dhu.f(this.c.e().a($$4), this.c.f().a($$4), this.c.g().a($$4), this.c.h().a($$4), this.c.i().a($$4), this.c.j().a($$4), $$0.k());
   }

   public esd a(aku<esd.a> $$0) {
      return this.h.computeIfAbsent($$0, $$1 -> edc.a(this.b, this.a, $$0));
   }

   public edg a(akv $$0) {
      return this.i.computeIfAbsent($$0, $$1 -> this.a.a($$0).e());
   }

   public ecz a() {
      return this.c;
   }

   public dhu.f b() {
      return this.d;
   }

   public edl c() {
      return this.e;
   }

   public edg d() {
      return this.f;
   }

   public edg e() {
      return this.g;
   }
}
