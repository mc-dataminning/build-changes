import com.mojang.serialization.MapCodec;

public class djb extends dez implements dhr, dih {
   public static final MapCodec<djb> a = b(djb::new);
   public static final dta<jg> b = dss.T;

   @Override
   public MapCodec<djb> a() {
      return a;
   }

   protected djb(dsb.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, jg.k));
   }

   @Override
   protected void a(dsd.a<dez, dsc> $$0) {
      $$0.a(b);
   }

   @Override
   protected dsc a(dsc $$0, dlm $$1) {
      return $$0.a(b, $$1.a().a($$0.c(b)));
   }

   @Override
   protected dsc a(dsc $$0, djw $$1) {
      return $$0.a(b, $$1.a().a($$0.c(b)));
   }

   @Override
   public dsc a(cya $$0) {
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
   public dph a(iz $$0, dsc $$1) {
      return new dqh($$0, $$1);
   }

   @Override
   protected bqu a(dsc $$0, dby $$1, iz $$2, cmx $$3, evn $$4) {
      dph $$5 = $$1.c_($$2);
      if ($$5 instanceof dqh && $$3.gz()) {
         $$3.a((dqh)$$5);
         return bqu.a($$1.B);
      } else {
         return bqu.e;
      }
   }

   public static boolean a(emk.c $$0, emk.c $$1) {
      je $$2 = m($$0.b());
      je $$3 = m($$1.b());
      je $$4 = n($$0.b());
      je $$5 = n($$1.b());
      dqh.a $$6 = dqh.a.a($$0.c().l("joint")).orElseGet(() -> $$2.o().d() ? dqh.a.b : dqh.a.a);
      boolean $$7 = $$6 == dqh.a.a;
      return $$2 == $$3.g() && ($$7 || $$4 == $$5) && $$0.c().l("target").equals($$1.c().l("name"));
   }

   public static je m(dsc $$0) {
      return $$0.c(b).a();
   }

   public static je n(dsc $$0) {
      return $$0.c(b).b();
   }
}
