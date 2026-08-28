import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class edg {
   final edf a;
   private final js<esc.a> b;
   private final ecy c;
   private final dht.f d;
   private final edk e;
   private final edf f;
   private final edf g;
   private final Map<akt<esc.a>, esc> h;
   private final Map<aku, edf> i;

   public static edg a(js.a $$0, akt<ecx> $$1, long $$2) {
      return a($$0.b(mc.aR).b($$1).a(), $$0.b(mc.aS), $$2);
   }

   public static edg a(ecx $$0, js<esc.a> $$1, long $$2) {
      return new edg($$0, $$1, $$2);
   }

   private edg(ecx $$0, js<esc.a> $$1, final long $$2) {
      this.a = $$0.d().a($$2).e();
      this.b = $$1;
      this.f = this.a.a(aku.b("aquifer")).e();
      this.g = this.a.a(aku.b("ore")).e();
      this.h = new ConcurrentHashMap<>();
      this.i = new ConcurrentHashMap<>();
      this.e = new edk(this, $$0.g(), $$0.l(), this.a);
      final boolean $$3 = $$0.n();

      class a implements ecl.f {
         private final Map<ecl, ecl> d = new HashMap<>();

         private azh a(long $$0) {
            return new ect($$2 + $$0);
         }

         @Override
         public ecl.c a(ecl.c $$0) {
            jr<esc.a> $$1 = $$0.b();
            if ($$3) {
               if ($$1.a(edb.a)) {
                  esc $$2 = esc.a(this.a(0L), new esc.a(-7, 1.0, 1.0));
                  return new ecl.c($$1, $$2);
               }

               if ($$1.a(edb.b)) {
                  esc $$3 = esc.a(this.a(1L), new esc.a(-7, 1.0, 1.0));
                  return new ecl.c($$1, $$3);
               }

               if ($$1.a(edb.j)) {
                  esc $$4 = esc.b(edg.this.a.a(edb.j.a()), new esc.a(0, 0.0));
                  return new ecl.c($$1, $$4);
               }
            }

            esc $$5 = edg.this.a($$1.e().orElseThrow());
            return new ecl.c($$1, $$5);
         }

         private ecl a(ecl $$0) {
            if ($$0 instanceof erz $$1) {
               azh $$2 = $$3 ? this.a(0L) : edg.this.a.a(aku.b("terrain"));
               return $$1.a($$2);
            } else {
               return (ecl)($$0 instanceof ecm.i ? new ecm.i($$2) : $$0);
            }
         }

         @Override
         public ecl apply(ecl $$0) {
            return this.d.computeIfAbsent($$0, this::a);
         }
      }

      this.c = $$0.i().a(new a());
      ecl.f $$4 = new ecl.f() {
         private final Map<ecl, ecl> a = new HashMap<>();

         private ecl a(ecl $$0) {
            if ($$0 instanceof ecm.j $$1) {
               return $$1.j().a();
            } else {
               return $$0 instanceof ecm.l $$2 ? $$2.k() : $$0;
            }
         }

         @Override
         public ecl apply(ecl $$0) {
            return this.a.computeIfAbsent($$0, this::a);
         }
      };
      this.d = new dht.f(this.c.e().a($$4), this.c.f().a($$4), this.c.g().a($$4), this.c.h().a($$4), this.c.i().a($$4), this.c.j().a($$4), $$0.k());
   }

   public esc a(akt<esc.a> $$0) {
      return this.h.computeIfAbsent($$0, $$1 -> edb.a(this.b, this.a, $$0));
   }

   public edf a(aku $$0) {
      return this.i.computeIfAbsent($$0, $$1 -> this.a.a($$0).e());
   }

   public ecy a() {
      return this.c;
   }

   public dht.f b() {
      return this.d;
   }

   public edk c() {
      return this.e;
   }

   public edf d() {
      return this.f;
   }

   public edf e() {
      return this.g;
   }
}
