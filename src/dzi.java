import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class dzi {
   final dzh a;
   private final jb<eoh.a> b;
   private final dza c;
   private final ddi.f d;
   private final dzm e;
   private final dzh f;
   private final dzh g;
   private final Map<aks<eoh.a>, eoh> h;
   private final Map<akt, dzh> i;

   public static dzi a(jb.a $$0, aks<dyz> $$1, long $$2) {
      return a($$0.b(li.aG).b($$1).a(), $$0.b(li.aH), $$2);
   }

   public static dzi a(dyz $$0, jb<eoh.a> $$1, long $$2) {
      return new dzi($$0, $$1, $$2);
   }

   private dzi(dyz $$0, jb<eoh.a> $$1, final long $$2) {
      this.a = $$0.d().a($$2).e();
      this.b = $$1;
      this.f = this.a.a(new akt("aquifer")).e();
      this.g = this.a.a(new akt("ore")).e();
      this.h = new ConcurrentHashMap<>();
      this.i = new ConcurrentHashMap<>();
      this.e = new dzm(this, $$0.g(), $$0.l(), this.a);
      final boolean $$3 = $$0.o();

      class a implements dyn.f {
         private final Map<dyn, dyn> d = new HashMap<>();

         private ayt a(long $$0) {
            return new dyv($$2 + $$0);
         }

         @Override
         public dyn.c a(dyn.c $$0) {
            ja<eoh.a> $$1 = $$0.b();
            if ($$3) {
               if ($$1.a(dzd.a)) {
                  eoh $$2 = eoh.a(this.a(0L), new eoh.a(-7, 1.0, 1.0));
                  return new dyn.c($$1, $$2);
               }

               if ($$1.a(dzd.b)) {
                  eoh $$3 = eoh.a(this.a(1L), new eoh.a(-7, 1.0, 1.0));
                  return new dyn.c($$1, $$3);
               }

               if ($$1.a(dzd.j)) {
                  eoh $$4 = eoh.b(dzi.this.a.a(dzd.j.a()), new eoh.a(0, 0.0));
                  return new dyn.c($$1, $$4);
               }
            }

            eoh $$5 = dzi.this.a($$1.e().orElseThrow());
            return new dyn.c($$1, $$5);
         }

         private dyn a(dyn $$0) {
            if ($$0 instanceof eoe $$1) {
               ayt $$2 = $$3 ? this.a(0L) : dzi.this.a.a(new akt("terrain"));
               return $$1.a($$2);
            } else {
               return (dyn)($$0 instanceof dyo.i ? new dyo.i($$2) : $$0);
            }
         }

         @Override
         public dyn apply(dyn $$0) {
            return this.d.computeIfAbsent($$0, this::a);
         }
      }

      this.c = $$0.i().a(new a());
      dyn.f $$4 = new dyn.f() {
         private final Map<dyn, dyn> b = new HashMap<>();

         private dyn a(dyn $$0) {
            if ($$0 instanceof dyo.j $$1) {
               return $$1.j().a();
            } else {
               return $$0 instanceof dyo.l $$2 ? $$2.k() : $$0;
            }
         }

         @Override
         public dyn apply(dyn $$0) {
            return this.b.computeIfAbsent($$0, this::a);
         }
      };
      this.d = new ddi.f(this.c.e().a($$4), this.c.f().a($$4), this.c.g().a($$4), this.c.h().a($$4), this.c.i().a($$4), this.c.j().a($$4), $$0.k());
   }

   public eoh a(aks<eoh.a> $$0) {
      return this.h.computeIfAbsent($$0, $$1 -> dzd.a(this.b, this.a, $$0));
   }

   public dzh a(akt $$0) {
      return this.i.computeIfAbsent($$0, $$1 -> this.a.a($$0).e());
   }

   public dza a() {
      return this.c;
   }

   public ddi.f b() {
      return this.d;
   }

   public dzm c() {
      return this.e;
   }

   public dzh d() {
      return this.f;
   }

   public dzh e() {
      return this.g;
   }
}
