import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class ebc {
   final ebb a;
   private final jp<epw.a> b;
   private final eau c;
   private final dft.f d;
   private final ebg e;
   private final ebb f;
   private final ebb g;
   private final Map<ald<epw.a>, epw> h;
   private final Map<ale, ebb> i;

   public static ebc a(jp.a $$0, ald<eat> $$1, long $$2) {
      return a($$0.b(lw.aQ).b($$1).a(), $$0.b(lw.aR), $$2);
   }

   public static ebc a(eat $$0, jp<epw.a> $$1, long $$2) {
      return new ebc($$0, $$1, $$2);
   }

   private ebc(eat $$0, jp<epw.a> $$1, final long $$2) {
      this.a = $$0.d().a($$2).e();
      this.b = $$1;
      this.f = this.a.a(ale.b("aquifer")).e();
      this.g = this.a.a(ale.b("ore")).e();
      this.h = new ConcurrentHashMap<>();
      this.i = new ConcurrentHashMap<>();
      this.e = new ebg(this, $$0.g(), $$0.l(), this.a);
      final boolean $$3 = $$0.n();

      class a implements eah.f {
         private final Map<eah, eah> d = new HashMap<>();

         private azn a(long $$0) {
            return new eap($$2 + $$0);
         }

         @Override
         public eah.c a(eah.c $$0) {
            jo<epw.a> $$1 = $$0.b();
            if ($$3) {
               if ($$1.a(eax.a)) {
                  epw $$2 = epw.a(this.a(0L), new epw.a(-7, 1.0, 1.0));
                  return new eah.c($$1, $$2);
               }

               if ($$1.a(eax.b)) {
                  epw $$3 = epw.a(this.a(1L), new epw.a(-7, 1.0, 1.0));
                  return new eah.c($$1, $$3);
               }

               if ($$1.a(eax.j)) {
                  epw $$4 = epw.b(ebc.this.a.a(eax.j.a()), new epw.a(0, 0.0));
                  return new eah.c($$1, $$4);
               }
            }

            epw $$5 = ebc.this.a($$1.e().orElseThrow());
            return new eah.c($$1, $$5);
         }

         private eah a(eah $$0) {
            if ($$0 instanceof ept $$1) {
               azn $$2 = $$3 ? this.a(0L) : ebc.this.a.a(ale.b("terrain"));
               return $$1.a($$2);
            } else {
               return (eah)($$0 instanceof eai.i ? new eai.i($$2) : $$0);
            }
         }

         @Override
         public eah apply(eah $$0) {
            return this.d.computeIfAbsent($$0, this::a);
         }
      }

      this.c = $$0.i().a(new a());
      eah.f $$4 = new eah.f() {
         private final Map<eah, eah> a = new HashMap<>();

         private eah a(eah $$0) {
            if ($$0 instanceof eai.j $$1) {
               return $$1.j().a();
            } else {
               return $$0 instanceof eai.l $$2 ? $$2.k() : $$0;
            }
         }

         @Override
         public eah apply(eah $$0) {
            return this.a.computeIfAbsent($$0, this::a);
         }
      };
      this.d = new dft.f(this.c.e().a($$4), this.c.f().a($$4), this.c.g().a($$4), this.c.h().a($$4), this.c.i().a($$4), this.c.j().a($$4), $$0.k());
   }

   public epw a(ald<epw.a> $$0) {
      return this.h.computeIfAbsent($$0, $$1 -> eax.a(this.b, this.a, $$0));
   }

   public ebb a(ale $$0) {
      return this.i.computeIfAbsent($$0, $$1 -> this.a.a($$0).e());
   }

   public eau a() {
      return this.c;
   }

   public dft.f b() {
      return this.d;
   }

   public ebg c() {
      return this.e;
   }

   public ebb d() {
      return this.f;
   }

   public ebb e() {
      return this.g;
   }
}
