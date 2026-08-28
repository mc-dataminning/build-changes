import com.mojang.serialization.MapCodec;

public class dmf extends die implements dkw, dll {
   public static final MapCodec<dmf> a = b(dmf::new);
   public static final dwh<jo> b = dvz.T;

   @Override
   public MapCodec<dmf> a() {
      return a;
   }

   protected dmf(dvi.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jo.k));
   }

   @Override
   protected void a(dvk.a<die, dvj> $$0) {
      $$0.a(b);
   }

   @Override
   protected dvj a(dvj $$0, dor $$1) {
      return $$0.b(b, $$1.a().a($$0.c(b)));
   }

   @Override
   protected dvj a(dvj $$0, dna $$1) {
      return $$0.b(b, $$1.a().a($$0.c(b)));
   }

   @Override
   public dvj a(czs $$0) {
      jm $$1 = $$0.k();
      jm $$2;
      if ($$1.o() == jm.a.b) {
         $$2 = $$0.g().g();
      } else {
         $$2 = jm.b;
      }

      return this.m().b(b, jo.a($$1, $$2));
   }

   @Override
   public dsm a(jh $$0, dvj $$1) {
      return new dto($$0, $$1);
   }

   @Override
   protected bsd a(dvj $$0, dfb $$1, jh $$2, com $$3, ezj $$4) {
      dsm $$5 = $$1.c_($$2);
      if ($$5 instanceof dto && $$3.gH()) {
         $$3.a((dto)$$5);
         return bsd.a;
      } else {
         return bsd.e;
      }
   }

   public static boolean a(epz.c $$0, epz.c $$1) {
      jm $$2 = o($$0.b());
      jm $$3 = o($$1.b());
      jm $$4 = p($$0.b());
      jm $$5 = p($$1.b());
      dto.a $$6 = dto.a.a($$0.c().l("joint")).orElseGet(() -> $$2.o().d() ? dto.a.b : dto.a.a);
      boolean $$7 = $$6 == dto.a.a;
      return $$2 == $$3.g() && ($$7 || $$4 == $$5) && $$0.c().l("target").equals($$1.c().l("name"));
   }

   public static jm o(dvj $$0) {
      return $$0.c(b).a();
   }

   public static jm p(dvj $$0) {
      return $$0.c(b).b();
   }
}
