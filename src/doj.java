import com.mojang.serialization.MapCodec;

public class doj extends dke implements dmx, dno {
   public static final MapCodec<doj> a = b(doj::new);
   public static final dyo<jp> b = dyg.W;

   @Override
   public MapCodec<doj> a() {
      return a;
   }

   protected doj(dxp.d $$0) {
      super($$0);
      this.l(this.B.b().b(b, jp.k));
   }

   @Override
   protected void a(dxr.a<dke, dxq> $$0) {
      $$0.a(b);
   }

   @Override
   protected dxq a(dxq $$0, dqw $$1) {
      return $$0.b(b, $$1.a().a($$0.c(b)));
   }

   @Override
   protected dxq a(dxq $$0, dpf $$1) {
      return $$0.b(b, $$1.a().a($$0.c(b)));
   }

   @Override
   public dxq a(dax $$0) {
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
   public dus a(ji $$0, dxq $$1) {
      return new dvv($$0, $$1);
   }

   @Override
   protected bsy a(dxq $$0, dgz $$1, ji $$2, cpr $$3, fbt $$4) {
      dus $$5 = $$1.c_($$2);
      if ($$5 instanceof dvv && $$3.gI()) {
         $$3.a((dvv)$$5);
         return bsy.a;
      } else {
         return bsy.e;
      }
   }

   public static boolean a(esl.a $$0, esl.a $$1) {
      jn $$2 = o($$0.a().b());
      jn $$3 = o($$1.a().b());
      jn $$4 = p($$0.a().b());
      jn $$5 = p($$1.a().b());
      dvv.a $$6 = $$0.b();
      boolean $$7 = $$6 == dvv.a.a;
      return $$2 == $$3.g() && ($$7 || $$4 == $$5) && $$0.e().equals($$1.c());
   }

   public static jn o(dxq $$0) {
      return $$0.c(b).a();
   }

   public static jn p(dxq $$0) {
      return $$0.c(b).b();
   }
}
