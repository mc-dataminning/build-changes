import com.mojang.serialization.MapCodec;

public class dno extends djk implements dmd, dmt {
   public static final MapCodec<dno> a = b(dno::new);
   public static final dxs<jp> b = dxl.W;

   @Override
   public MapCodec<dno> a() {
      return a;
   }

   protected dno(dwu.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jp.k));
   }

   @Override
   protected void a(dww.a<djk, dwv> $$0) {
      $$0.a(b);
   }

   @Override
   protected dwv a(dwv $$0, dqc $$1) {
      return $$0.b(b, $$1.a().a($$0.c(b)));
   }

   @Override
   protected dwv a(dwv $$0, doj $$1) {
      return $$0.b(b, $$1.a().a($$0.c(b)));
   }

   @Override
   public dwv a(dae $$0) {
      jn $$1 = $$0.k();
      jn $$2;
      if ($$1.o() == jn.a.b) {
         $$2 = $$0.g().g();
      } else {
         $$2 = jn.b;
      }

      return this.m().b(b, jp.a($$1, $$2));
   }

   @Override
   public dtx a(ji $$0, dwv $$1) {
      return new dva($$0, $$1);
   }

   @Override
   protected bsi a(dwv $$0, dgg $$1, ji $$2, cov $$3, fau $$4) {
      dtx $$5 = $$1.c_($$2);
      if ($$5 instanceof dva && $$3.gG()) {
         $$3.a((dva)$$5);
         return bsi.a;
      } else {
         return bsi.e;
      }
   }

   public static boolean a(erm.a $$0, erm.a $$1) {
      jn $$2 = o($$0.a().b());
      jn $$3 = o($$1.a().b());
      jn $$4 = p($$0.a().b());
      jn $$5 = p($$1.a().b());
      dva.a $$6 = $$0.b();
      boolean $$7 = $$6 == dva.a.a;
      return $$2 == $$3.g() && ($$7 || $$4 == $$5) && $$0.e().equals($$1.c());
   }

   public static jn o(dwv $$0) {
      return $$0.c(b).a();
   }

   public static jn p(dwv $$0) {
      return $$0.c(b).b();
   }
}
