import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class dkx {
   final dkw a;
   private final hf<dzg.a> b;
   private final dkp c;
   private final cqt.f d;
   private final dlb e;
   private final dkw f;
   private final dkw g;
   private final Map<aeq<dzg.a>, dzg> h;
   private final Map<aer, dkw> i;

   public static dkx a(hf.a $$0, aeq<dko> $$1, long $$2) {
      return a($$0.b(jc.aw).b($$1).a(), $$0.b(jc.ax), $$2);
   }

   public static dkx a(dko $$0, hf<dzg.a> $$1, long $$2) {
      return new dkx($$0, $$1, $$2);
   }

   private dkx(dko $$0, hf<dzg.a> $$1, final long $$2) {
      this.a = $$0.d().a($$2).e();
      this.b = $$1;
      this.f = this.a.a(new aer("aquifer")).e();
      this.g = this.a.a(new aer("ore")).e();
      this.h = new ConcurrentHashMap<>();
      this.i = new ConcurrentHashMap<>();
      this.e = new dlb(this, $$0.g(), $$0.l(), this.a);
      final boolean $$3 = $$0.n();

      class a implements dkc.f {
         private final Map<dkc, dkc> d = new HashMap<>();

         private aru a(long $$0) {
            return new dkk($$2 + $$0);
         }

         @Override
         public dkc.c a(dkc.c $$0) {
            he<dzg.a> $$1 = $$0.b();
            if ($$3) {
               if ($$1.a(dks.a)) {
                  dzg $$2 = dzg.a(this.a(0L), new dzg.a(-7, 1.0, 1.0));
                  return new dkc.c($$1, $$2);
               }

               if ($$1.a(dks.b)) {
                  dzg $$3 = dzg.a(this.a(1L), new dzg.a(-7, 1.0, 1.0));
                  return new dkc.c($$1, $$3);
               }

               if ($$1.a(dks.j)) {
                  dzg $$4 = dzg.b(dkx.this.a.a(dks.j.a()), new dzg.a(0, 0.0));
                  return new dkc.c($$1, $$4);
               }
            }

            dzg $$5 = dkx.this.a($$1.e().orElseThrow());
            return new dkc.c($$1, $$5);
         }

         private dkc a(dkc $$0) {
            if ($$0 instanceof dzd $$1) {
               aru $$2 = $$3 ? this.a(0L) : dkx.this.a.a(new aer("terrain"));
               return $$1.a($$2);
            } else {
               return (dkc)($$0 instanceof dkd.i ? new dkd.i($$2) : $$0);
            }
         }

         @Override
         public dkc apply(dkc $$0) {
            return this.d.computeIfAbsent($$0, this::a);
         }
      }

      this.c = $$0.i().a(new a());
      dkc.f $$4 = new dkc.f() {
         private final Map<dkc, dkc> b = new HashMap<>();

         private dkc a(dkc $$0) {
            if ($$0 instanceof dkd.j $$1) {
               return $$1.j().a();
            } else {
               return $$0 instanceof dkd.l $$2 ? $$2.k() : $$0;
            }
         }

         @Override
         public dkc apply(dkc $$0) {
            return this.b.computeIfAbsent($$0, this::a);
         }
      };
      this.d = new cqt.f(this.c.e().a($$4), this.c.f().a($$4), this.c.g().a($$4), this.c.h().a($$4), this.c.i().a($$4), this.c.j().a($$4), $$0.k());
   }

   public dzg a(aeq<dzg.a> $$0) {
      return this.h.computeIfAbsent($$0, $$1 -> dks.a(this.b, this.a, $$0));
   }

   public dkw a(aer $$0) {
      return this.i.computeIfAbsent($$0, $$1 -> this.a.a($$0).e());
   }

   public dkp a() {
      return this.c;
   }

   public cqt.f b() {
      return this.d;
   }

   public dlb c() {
      return this.e;
   }

   public dkw d() {
      return this.f;
   }

   public dkw e() {
      return this.g;
   }
}
