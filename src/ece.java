import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class ece {
   final ecd a;
   private final jr<eqy.a> b;
   private final ebw c;
   private final dgx.f d;
   private final eci e;
   private final ecd f;
   private final ecd g;
   private final Map<ali<eqy.a>, eqy> h;
   private final Map<alj, ecd> i;

   public static ece a(jr.a $$0, ali<ebv> $$1, long $$2) {
      return a($$0.b(ma.aP).b($$1).a(), $$0.b(ma.aQ), $$2);
   }

   public static ece a(ebv $$0, jr<eqy.a> $$1, long $$2) {
      return new ece($$0, $$1, $$2);
   }

   private ece(ebv $$0, jr<eqy.a> $$1, final long $$2) {
      this.a = $$0.d().a($$2).e();
      this.b = $$1;
      this.f = this.a.a(alj.b("aquifer")).e();
      this.g = this.a.a(alj.b("ore")).e();
      this.h = new ConcurrentHashMap<>();
      this.i = new ConcurrentHashMap<>();
      this.e = new eci(this, $$0.g(), $$0.l(), this.a);
      final boolean $$3 = $$0.n();

      class a implements ebj.f {
         private final Map<ebj, ebj> d = new HashMap<>();

         private azu a(long $$0) {
            return new ebr($$2 + $$0);
         }

         @Override
         public ebj.c a(ebj.c $$0) {
            jq<eqy.a> $$1 = $$0.b();
            if ($$3) {
               if ($$1.a(ebz.a)) {
                  eqy $$2 = eqy.a(this.a(0L), new eqy.a(-7, 1.0, 1.0));
                  return new ebj.c($$1, $$2);
               }

               if ($$1.a(ebz.b)) {
                  eqy $$3 = eqy.a(this.a(1L), new eqy.a(-7, 1.0, 1.0));
                  return new ebj.c($$1, $$3);
               }

               if ($$1.a(ebz.j)) {
                  eqy $$4 = eqy.b(ece.this.a.a(ebz.j.a()), new eqy.a(0, 0.0));
                  return new ebj.c($$1, $$4);
               }
            }

            eqy $$5 = ece.this.a($$1.e().orElseThrow());
            return new ebj.c($$1, $$5);
         }

         private ebj a(ebj $$0) {
            if ($$0 instanceof eqv $$1) {
               azu $$2 = $$3 ? this.a(0L) : ece.this.a.a(alj.b("terrain"));
               return $$1.a($$2);
            } else {
               return (ebj)($$0 instanceof ebk.i ? new ebk.i($$2) : $$0);
            }
         }

         @Override
         public ebj apply(ebj $$0) {
            return this.d.computeIfAbsent($$0, this::a);
         }
      }

      this.c = $$0.i().a(new a());
      ebj.f $$4 = new ebj.f() {
         private final Map<ebj, ebj> a = new HashMap<>();

         private ebj a(ebj $$0) {
            if ($$0 instanceof ebk.j $$1) {
               return $$1.j().a();
            } else {
               return $$0 instanceof ebk.l $$2 ? $$2.k() : $$0;
            }
         }

         @Override
         public ebj apply(ebj $$0) {
            return this.a.computeIfAbsent($$0, this::a);
         }
      };
      this.d = new dgx.f(this.c.e().a($$4), this.c.f().a($$4), this.c.g().a($$4), this.c.h().a($$4), this.c.i().a($$4), this.c.j().a($$4), $$0.k());
   }

   public eqy a(ali<eqy.a> $$0) {
      return this.h.computeIfAbsent($$0, $$1 -> ebz.a(this.b, this.a, $$0));
   }

   public ecd a(alj $$0) {
      return this.i.computeIfAbsent($$0, $$1 -> this.a.a($$0).e());
   }

   public ebw a() {
      return this.c;
   }

   public dgx.f b() {
      return this.d;
   }

   public eci c() {
      return this.e;
   }

   public ecd d() {
      return this.f;
   }

   public ecd e() {
      return this.g;
   }
}
