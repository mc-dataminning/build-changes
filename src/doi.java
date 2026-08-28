import com.mojang.serialization.MapCodec;

public class doi extends dke implements dmy, dnn {
   public static final MapCodec<doi> a = b(doi::new);
   public static final dyk<jo> b = dyd.U;

   @Override
   public MapCodec<doi> a() {
      return a;
   }

   protected doi(dxm.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jo.k));
   }

   @Override
   protected void a(dxo.a<dke, dxn> $$0) {
      $$0.a(b);
   }

   @Override
   protected dxn a(dxn $$0, dqu $$1) {
      return $$0.b(b, $$1.a().a($$0.c(b)));
   }

   @Override
   protected dxn a(dxn $$0, dpd $$1) {
      return $$0.b(b, $$1.a().a($$0.c(b)));
   }

   @Override
   public dxn a(dbb $$0) {
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
   public dup a(jh $$0, dxn $$1) {
      return new dvs($$0, $$1);
   }

   @Override
   protected bte a(dxn $$0, dha $$1, jh $$2, cps $$3, fbo $$4) {
      dup $$5 = $$1.c_($$2);
      if ($$5 instanceof dvs && $$3.gE()) {
         $$3.a((dvs)$$5);
         return bte.a;
      } else {
         return bte.e;
      }
   }

   public static boolean a(ese.a $$0, ese.a $$1) {
      jm $$2 = o($$0.a().b());
      jm $$3 = o($$1.a().b());
      jm $$4 = p($$0.a().b());
      jm $$5 = p($$1.a().b());
      dvs.a $$6 = $$0.b();
      boolean $$7 = $$6 == dvs.a.a;
      return $$2 == $$3.g() && ($$7 || $$4 == $$5) && $$0.e().equals($$1.c());
   }

   public static jm o(dxn $$0) {
      return $$0.c(b).a();
   }

   public static jm p(dxn $$0) {
      return $$0.c(b).b();
   }
}
