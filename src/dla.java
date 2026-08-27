import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class dla {
   final dkz a;
   private final hf<dzj.a> b;
   private final dks c;
   private final cri.f d;
   private final dle e;
   private final dkz f;
   private final dkz g;
   private final Map<aey<dzj.a>, dzj> h;
   private final Map<aez, dkz> i;

   public static dla a(hf.a $$0, aey<dkr> $$1, long $$2) {
      return a($$0.b(jc.ax).b($$1).a(), $$0.b(jc.ay), $$2);
   }

   public static dla a(dkr $$0, hf<dzj.a> $$1, long $$2) {
      return new dla($$0, $$1, $$2);
   }

   private dla(dkr $$0, hf<dzj.a> $$1, final long $$2) {
      this.a = $$0.d().a($$2).e();
      this.b = $$1;
      this.f = this.a.a(new aez("aquifer")).e();
      this.g = this.a.a(new aez("ore")).e();
      this.h = new ConcurrentHashMap<>();
      this.i = new ConcurrentHashMap<>();
      this.e = new dle(this, $$0.g(), $$0.l(), this.a);
      final boolean $$3 = $$0.n();

      class a implements dkf.f {
         private final Map<dkf, dkf> d = new HashMap<>();

         private ash a(long $$0) {
            return new dkn($$2 + $$0);
         }

         @Override
         public dkf.c a(dkf.c $$0) {
            he<dzj.a> $$1 = $$0.b();
            if ($$3) {
               if ($$1.a(dkv.a)) {
                  dzj $$2 = dzj.a(this.a(0L), new dzj.a(-7, 1.0, 1.0));
                  return new dkf.c($$1, $$2);
               }

               if ($$1.a(dkv.b)) {
                  dzj $$3 = dzj.a(this.a(1L), new dzj.a(-7, 1.0, 1.0));
                  return new dkf.c($$1, $$3);
               }

               if ($$1.a(dkv.j)) {
                  dzj $$4 = dzj.b(dla.this.a.a(dkv.j.a()), new dzj.a(0, 0.0));
                  return new dkf.c($$1, $$4);
               }
            }

            dzj $$5 = dla.this.a($$1.e().orElseThrow());
            return new dkf.c($$1, $$5);
         }

         private dkf a(dkf $$0) {
            if ($$0 instanceof dzg $$1) {
               ash $$2 = $$3 ? this.a(0L) : dla.this.a.a(new aez("terrain"));
               return $$1.a($$2);
            } else {
               return (dkf)($$0 instanceof dkg.i ? new dkg.i($$2) : $$0);
            }
         }

         @Override
         public dkf apply(dkf $$0) {
            return this.d.computeIfAbsent($$0, this::a);
         }
      }

      this.c = $$0.i().a(new a());
      dkf.f $$4 = new dkf.f() {
         private final Map<dkf, dkf> b = new HashMap<>();

         private dkf a(dkf $$0) {
            if ($$0 instanceof dkg.j $$1) {
               return $$1.j().a();
            } else {
               return $$0 instanceof dkg.l $$2 ? $$2.k() : $$0;
            }
         }

         @Override
         public dkf apply(dkf $$0) {
            return this.b.computeIfAbsent($$0, this::a);
         }
      };
      this.d = new cri.f(this.c.e().a($$4), this.c.f().a($$4), this.c.g().a($$4), this.c.h().a($$4), this.c.i().a($$4), this.c.j().a($$4), $$0.k());
   }

   public dzj a(aey<dzj.a> $$0) {
      return this.h.computeIfAbsent($$0, $$1 -> dkv.a(this.b, this.a, $$0));
   }

   public dkz a(aez $$0) {
      return this.i.computeIfAbsent($$0, $$1 -> this.a.a($$0).e());
   }

   public dks a() {
      return this.c;
   }

   public cri.f b() {
      return this.d;
   }

   public dle c() {
      return this.e;
   }

   public dkz d() {
      return this.f;
   }

   public dkz e() {
      return this.g;
   }
}
