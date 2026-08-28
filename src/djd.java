import com.mojang.serialization.MapCodec;

public class djd extends dfb implements dht, dij {
   public static final MapCodec<djd> a = b(djd::new);
   public static final dtc<jg> b = dsu.T;

   @Override
   public MapCodec<djd> a() {
      return a;
   }

   protected djd(dsd.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, jg.k));
   }

   @Override
   protected void a(dsf.a<dfb, dse> $$0) {
      $$0.a(b);
   }

   @Override
   protected dse a(dse $$0, dlo $$1) {
      return $$0.a(b, $$1.a().a($$0.c(b)));
   }

   @Override
   protected dse a(dse $$0, djy $$1) {
      return $$0.a(b, $$1.a().a($$0.c(b)));
   }

   @Override
   public dse a(cyc $$0) {
      je $$1 = $$0.k();
      je $$2;
      if ($$1.o() == je.a.b) {
         $$2 = $$0.g().g();
      } else {
         $$2 = je.b;
      }

      return this.o().a(b, jg.a($$1, $$2));
   }

   @Override
   public dpj a(iz $$0, dse $$1) {
      return new dqj($$0, $$1);
   }

   @Override
   protected bqw a(dse $$0, dca $$1, iz $$2, cmz $$3, evp $$4) {
      dpj $$5 = $$1.c_($$2);
      if ($$5 instanceof dqj && $$3.gz()) {
         $$3.a((dqj)$$5);
         return bqw.a($$1.B);
      } else {
         return bqw.e;
      }
   }

   public static boolean a(emm.c $$0, emm.c $$1) {
      je $$2 = m($$0.b());
      je $$3 = m($$1.b());
      je $$4 = n($$0.b());
      je $$5 = n($$1.b());
      dqj.a $$6 = dqj.a.a($$0.c().l("joint")).orElseGet(() -> $$2.o().d() ? dqj.a.b : dqj.a.a);
      boolean $$7 = $$6 == dqj.a.a;
      return $$2 == $$3.g() && ($$7 || $$4 == $$5) && $$0.c().l("target").equals($$1.c().l("name"));
   }

   public static je m(dse $$0) {
      return $$0.c(b).a();
   }

   public static je n(dse $$0) {
      return $$0.c(b).b();
   }
}
