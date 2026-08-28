import com.mojang.serialization.MapCodec;

public class dop extends dkl implements dnf, dnu {
   public static final MapCodec<dop> a = b(dop::new);
   public static final dyr<jo> b = dyk.U;

   @Override
   public MapCodec<dop> a() {
      return a;
   }

   protected dop(dxt.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jo.k));
   }

   @Override
   protected void a(dxv.a<dkl, dxu> $$0) {
      $$0.a(b);
   }

   @Override
   protected dxu a(dxu $$0, drb $$1) {
      return $$0.b(b, $$1.a().a($$0.c(b)));
   }

   @Override
   protected dxu a(dxu $$0, dpk $$1) {
      return $$0.b(b, $$1.a().a($$0.c(b)));
   }

   @Override
   public dxu a(dbf $$0) {
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
   public duw a(jh $$0, dxu $$1) {
      return new dvz($$0, $$1);
   }

   @Override
   protected bti a(dxu $$0, dhh $$1, jh $$2, cpw $$3, fbt $$4) {
      duw $$5 = $$1.c_($$2);
      if ($$5 instanceof dvz && $$3.gG()) {
         $$3.a((dvz)$$5);
         return bti.a;
      } else {
         return bti.e;
      }
   }

   public static boolean a(esl.a $$0, esl.a $$1) {
      jm $$2 = o($$0.a().b());
      jm $$3 = o($$1.a().b());
      jm $$4 = p($$0.a().b());
      jm $$5 = p($$1.a().b());
      dvz.a $$6 = $$0.b();
      boolean $$7 = $$6 == dvz.a.a;
      return $$2 == $$3.g() && ($$7 || $$4 == $$5) && $$0.e().equals($$1.c());
   }

   public static jm o(dxu $$0) {
      return $$0.c(b).a();
   }

   public static jm p(dxu $$0) {
      return $$0.c(b).b();
   }
}
