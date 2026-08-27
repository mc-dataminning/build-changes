import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class dkw {
   final dkv a;
   private final hf<dzf.a> b;
   private final dko c;
   private final cqs.f d;
   private final dla e;
   private final dkv f;
   private final dkv g;
   private final Map<aeq<dzf.a>, dzf> h;
   private final Map<aer, dkv> i;

   public static dkw a(hf.a $$0, aeq<dkn> $$1, long $$2) {
      return a($$0.b(jc.aw).b($$1).a(), $$0.b(jc.ax), $$2);
   }

   public static dkw a(dkn $$0, hf<dzf.a> $$1, long $$2) {
      return new dkw($$0, $$1, $$2);
   }

   private dkw(dkn $$0, hf<dzf.a> $$1, final long $$2) {
      this.a = $$0.d().a($$2).e();
      this.b = $$1;
      this.f = this.a.a(new aer("aquifer")).e();
      this.g = this.a.a(new aer("ore")).e();
      this.h = new ConcurrentHashMap<>();
      this.i = new ConcurrentHashMap<>();
      this.e = new dla(this, $$0.g(), $$0.l(), this.a);
      final boolean $$3 = $$0.n();

      class a implements dkb.f {
         private final Map<dkb, dkb> d = new HashMap<>();

         private aru a(long $$0) {
            return new dkj($$2 + $$0);
         }

         @Override
         public dkb.c a(dkb.c $$0) {
            he<dzf.a> $$1 = $$0.b();
            if ($$3) {
               if ($$1.a(dkr.a)) {
                  dzf $$2 = dzf.a(this.a(0L), new dzf.a(-7, 1.0, 1.0));
                  return new dkb.c($$1, $$2);
               }

               if ($$1.a(dkr.b)) {
                  dzf $$3 = dzf.a(this.a(1L), new dzf.a(-7, 1.0, 1.0));
                  return new dkb.c($$1, $$3);
               }

               if ($$1.a(dkr.j)) {
                  dzf $$4 = dzf.b(dkw.this.a.a(dkr.j.a()), new dzf.a(0, 0.0));
                  return new dkb.c($$1, $$4);
               }
            }

            dzf $$5 = dkw.this.a($$1.e().orElseThrow());
            return new dkb.c($$1, $$5);
         }

         private dkb a(dkb $$0) {
            if ($$0 instanceof dzc $$1) {
               aru $$2 = $$3 ? this.a(0L) : dkw.this.a.a(new aer("terrain"));
               return $$1.a($$2);
            } else {
               return (dkb)($$0 instanceof dkc.i ? new dkc.i($$2) : $$0);
            }
         }

         @Override
         public dkb apply(dkb $$0) {
            return this.d.computeIfAbsent($$0, this::a);
         }
      }

      this.c = $$0.i().a(new a());
      dkb.f $$4 = new dkb.f() {
         private final Map<dkb, dkb> b = new HashMap<>();

         private dkb a(dkb $$0) {
            if ($$0 instanceof dkc.j $$1) {
               return $$1.j().a();
            } else {
               return $$0 instanceof dkc.l $$2 ? $$2.k() : $$0;
            }
         }

         @Override
         public dkb apply(dkb $$0) {
            return this.b.computeIfAbsent($$0, this::a);
         }
      };
      this.d = new cqs.f(this.c.e().a($$4), this.c.f().a($$4), this.c.g().a($$4), this.c.h().a($$4), this.c.i().a($$4), this.c.j().a($$4), $$0.k());
   }

   public dzf a(aeq<dzf.a> $$0) {
      return this.h.computeIfAbsent($$0, $$1 -> dkr.a(this.b, this.a, $$0));
   }

   public dkv a(aer $$0) {
      return this.i.computeIfAbsent($$0, $$1 -> this.a.a($$0).e());
   }

   public dko a() {
      return this.c;
   }

   public cqs.f b() {
      return this.d;
   }

   public dla c() {
      return this.e;
   }

   public dkv d() {
      return this.f;
   }

   public dkv e() {
      return this.g;
   }
}
