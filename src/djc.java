import com.mojang.serialization.MapCodec;

public class djc extends dfa implements dhs, dii {
   public static final MapCodec<djc> a = b(djc::new);
   public static final dtb<jg> b = dst.T;

   @Override
   public MapCodec<djc> a() {
      return a;
   }

   protected djc(dsc.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, jg.k));
   }

   @Override
   protected void a(dse.a<dfa, dsd> $$0) {
      $$0.a(b);
   }

   @Override
   protected dsd a(dsd $$0, dln $$1) {
      return $$0.a(b, $$1.a().a($$0.c(b)));
   }

   @Override
   protected dsd a(dsd $$0, djx $$1) {
      return $$0.a(b, $$1.a().a($$0.c(b)));
   }

   @Override
   public dsd a(cyb $$0) {
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
   public dpi a(iz $$0, dsd $$1) {
      return new dqi($$0, $$1);
   }

   @Override
   protected bqv a(dsd $$0, dbz $$1, iz $$2, cmy $$3, evo $$4) {
      dpi $$5 = $$1.c_($$2);
      if ($$5 instanceof dqi && $$3.gz()) {
         $$3.a((dqi)$$5);
         return bqv.a($$1.B);
      } else {
         return bqv.e;
      }
   }

   public static boolean a(eml.c $$0, eml.c $$1) {
      je $$2 = m($$0.b());
      je $$3 = m($$1.b());
      je $$4 = n($$0.b());
      je $$5 = n($$1.b());
      dqi.a $$6 = dqi.a.a($$0.c().l("joint")).orElseGet(() -> $$2.o().d() ? dqi.a.b : dqi.a.a);
      boolean $$7 = $$6 == dqi.a.a;
      return $$2 == $$3.g() && ($$7 || $$4 == $$5) && $$0.c().l("target").equals($$1.c().l("name"));
   }

   public static je m(dsd $$0) {
      return $$0.c(b).a();
   }

   public static je n(dsd $$0) {
      return $$0.c(b).b();
   }
}
