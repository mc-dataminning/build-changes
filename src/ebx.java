import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class ebx {
   final ebw a;
   private final jr<eqr.a> b;
   private final ebp c;
   private final dgq.f d;
   private final ecb e;
   private final ebw f;
   private final ebw g;
   private final Map<alk<eqr.a>, eqr> h;
   private final Map<all, ebw> i;

   public static ebx a(jr.a $$0, alk<ebo> $$1, long $$2) {
      return a($$0.b(ma.aP).b($$1).a(), $$0.b(ma.aQ), $$2);
   }

   public static ebx a(ebo $$0, jr<eqr.a> $$1, long $$2) {
      return new ebx($$0, $$1, $$2);
   }

   private ebx(ebo $$0, jr<eqr.a> $$1, final long $$2) {
      this.a = $$0.d().a($$2).e();
      this.b = $$1;
      this.f = this.a.a(all.b("aquifer")).e();
      this.g = this.a.a(all.b("ore")).e();
      this.h = new ConcurrentHashMap<>();
      this.i = new ConcurrentHashMap<>();
      this.e = new ecb(this, $$0.g(), $$0.l(), this.a);
      final boolean $$3 = $$0.n();

      class a implements ebc.f {
         private final Map<ebc, ebc> d = new HashMap<>();

         private azv a(long $$0) {
            return new ebk($$2 + $$0);
         }

         @Override
         public ebc.c a(ebc.c $$0) {
            jq<eqr.a> $$1 = $$0.b();
            if ($$3) {
               if ($$1.a(ebs.a)) {
                  eqr $$2 = eqr.a(this.a(0L), new eqr.a(-7, 1.0, 1.0));
                  return new ebc.c($$1, $$2);
               }

               if ($$1.a(ebs.b)) {
                  eqr $$3 = eqr.a(this.a(1L), new eqr.a(-7, 1.0, 1.0));
                  return new ebc.c($$1, $$3);
               }

               if ($$1.a(ebs.j)) {
                  eqr $$4 = eqr.b(ebx.this.a.a(ebs.j.a()), new eqr.a(0, 0.0));
                  return new ebc.c($$1, $$4);
               }
            }

            eqr $$5 = ebx.this.a($$1.e().orElseThrow());
            return new ebc.c($$1, $$5);
         }

         private ebc a(ebc $$0) {
            if ($$0 instanceof eqo $$1) {
               azv $$2 = $$3 ? this.a(0L) : ebx.this.a.a(all.b("terrain"));
               return $$1.a($$2);
            } else {
               return (ebc)($$0 instanceof ebd.i ? new ebd.i($$2) : $$0);
            }
         }

         @Override
         public ebc apply(ebc $$0) {
            return this.d.computeIfAbsent($$0, this::a);
         }
      }

      this.c = $$0.i().a(new a());
      ebc.f $$4 = new ebc.f() {
         private final Map<ebc, ebc> a = new HashMap<>();

         private ebc a(ebc $$0) {
            if ($$0 instanceof ebd.j $$1) {
               return $$1.j().a();
            } else {
               return $$0 instanceof ebd.l $$2 ? $$2.k() : $$0;
            }
         }

         @Override
         public ebc apply(ebc $$0) {
            return this.a.computeIfAbsent($$0, this::a);
         }
      };
      this.d = new dgq.f(this.c.e().a($$4), this.c.f().a($$4), this.c.g().a($$4), this.c.h().a($$4), this.c.i().a($$4), this.c.j().a($$4), $$0.k());
   }

   public eqr a(alk<eqr.a> $$0) {
      return this.h.computeIfAbsent($$0, $$1 -> ebs.a(this.b, this.a, $$0));
   }

   public ebw a(all $$0) {
      return this.i.computeIfAbsent($$0, $$1 -> this.a.a($$0).e());
   }

   public ebp a() {
      return this.c;
   }

   public dgq.f b() {
      return this.d;
   }

   public ecb c() {
      return this.e;
   }

   public ebw d() {
      return this.f;
   }

   public ebw e() {
      return this.g;
   }
}
