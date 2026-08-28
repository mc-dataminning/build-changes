import com.mojang.serialization.MapCodec;

public class diz extends dex implements dhp, dif {
   public static final MapCodec<diz> a = b(diz::new);
   public static final dsy<jg> b = dsq.T;

   @Override
   public MapCodec<diz> a() {
      return a;
   }

   protected diz(drz.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, jg.k));
   }

   @Override
   protected void a(dsb.a<dex, dsa> $$0) {
      $$0.a(b);
   }

   @Override
   protected dsa a(dsa $$0, dlk $$1) {
      return $$0.a(b, $$1.a().a($$0.c(b)));
   }

   @Override
   protected dsa a(dsa $$0, dju $$1) {
      return $$0.a(b, $$1.a().a($$0.c(b)));
   }

   @Override
   public dsa a(cxy $$0) {
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
   public dpf a(iz $$0, dsa $$1) {
      return new dqf($$0, $$1);
   }

   @Override
   protected bqs a(dsa $$0, dbw $$1, iz $$2, cmv $$3, evl $$4) {
      dpf $$5 = $$1.c_($$2);
      if ($$5 instanceof dqf && $$3.gz()) {
         $$3.a((dqf)$$5);
         return bqs.a($$1.B);
      } else {
         return bqs.e;
      }
   }

   public static boolean a(emi.c $$0, emi.c $$1) {
      je $$2 = m($$0.b());
      je $$3 = m($$1.b());
      je $$4 = n($$0.b());
      je $$5 = n($$1.b());
      dqf.a $$6 = dqf.a.a($$0.c().l("joint")).orElseGet(() -> $$2.o().d() ? dqf.a.b : dqf.a.a);
      boolean $$7 = $$6 == dqf.a.a;
      return $$2 == $$3.g() && ($$7 || $$4 == $$5) && $$0.c().l("target").equals($$1.c().l("name"));
   }

   public static je m(dsa $$0) {
      return $$0.c(b).a();
   }

   public static je n(dsa $$0) {
      return $$0.c(b).b();
   }
}
