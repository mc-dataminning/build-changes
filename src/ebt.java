import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class ebt {
   final ebs a;
   private final jr<eqn.a> b;
   private final ebl c;
   private final dgl.f d;
   private final ebx e;
   private final ebs f;
   private final ebs g;
   private final Map<alh<eqn.a>, eqn> h;
   private final Map<ali, ebs> i;

   public static ebt a(jr.a $$0, alh<ebk> $$1, long $$2) {
      return a($$0.b(lz.aP).b($$1).a(), $$0.b(lz.aQ), $$2);
   }

   public static ebt a(ebk $$0, jr<eqn.a> $$1, long $$2) {
      return new ebt($$0, $$1, $$2);
   }

   private ebt(ebk $$0, jr<eqn.a> $$1, final long $$2) {
      this.a = $$0.d().a($$2).e();
      this.b = $$1;
      this.f = this.a.a(ali.b("aquifer")).e();
      this.g = this.a.a(ali.b("ore")).e();
      this.h = new ConcurrentHashMap<>();
      this.i = new ConcurrentHashMap<>();
      this.e = new ebx(this, $$0.g(), $$0.l(), this.a);
      final boolean $$3 = $$0.n();

      class a implements eay.f {
         private final Map<eay, eay> d = new HashMap<>();

         private azs a(long $$0) {
            return new ebg($$2 + $$0);
         }

         @Override
         public eay.c a(eay.c $$0) {
            jq<eqn.a> $$1 = $$0.b();
            if ($$3) {
               if ($$1.a(ebo.a)) {
                  eqn $$2 = eqn.a(this.a(0L), new eqn.a(-7, 1.0, 1.0));
                  return new eay.c($$1, $$2);
               }

               if ($$1.a(ebo.b)) {
                  eqn $$3 = eqn.a(this.a(1L), new eqn.a(-7, 1.0, 1.0));
                  return new eay.c($$1, $$3);
               }

               if ($$1.a(ebo.j)) {
                  eqn $$4 = eqn.b(ebt.this.a.a(ebo.j.a()), new eqn.a(0, 0.0));
                  return new eay.c($$1, $$4);
               }
            }

            eqn $$5 = ebt.this.a($$1.e().orElseThrow());
            return new eay.c($$1, $$5);
         }

         private eay a(eay $$0) {
            if ($$0 instanceof eqk $$1) {
               azs $$2 = $$3 ? this.a(0L) : ebt.this.a.a(ali.b("terrain"));
               return $$1.a($$2);
            } else {
               return (eay)($$0 instanceof eaz.i ? new eaz.i($$2) : $$0);
            }
         }

         @Override
         public eay apply(eay $$0) {
            return this.d.computeIfAbsent($$0, this::a);
         }
      }

      this.c = $$0.i().a(new a());
      eay.f $$4 = new eay.f() {
         private final Map<eay, eay> a = new HashMap<>();

         private eay a(eay $$0) {
            if ($$0 instanceof eaz.j $$1) {
               return $$1.j().a();
            } else {
               return $$0 instanceof eaz.l $$2 ? $$2.k() : $$0;
            }
         }

         @Override
         public eay apply(eay $$0) {
            return this.a.computeIfAbsent($$0, this::a);
         }
      };
      this.d = new dgl.f(this.c.e().a($$4), this.c.f().a($$4), this.c.g().a($$4), this.c.h().a($$4), this.c.i().a($$4), this.c.j().a($$4), $$0.k());
   }

   public eqn a(alh<eqn.a> $$0) {
      return this.h.computeIfAbsent($$0, $$1 -> ebo.a(this.b, this.a, $$0));
   }

   public ebs a(ali $$0) {
      return this.i.computeIfAbsent($$0, $$1 -> this.a.a($$0).e());
   }

   public ebl a() {
      return this.c;
   }

   public dgl.f b() {
      return this.d;
   }

   public ebx c() {
      return this.e;
   }

   public ebs d() {
      return this.f;
   }

   public ebs e() {
      return this.g;
   }
}
