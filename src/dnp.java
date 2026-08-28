import com.mojang.serialization.MapCodec;

public class dnp extends djl implements dme, dmu {
   public static final MapCodec<dnp> a = b(dnp::new);
   public static final dxt<jp> b = dxm.W;

   @Override
   public MapCodec<dnp> a() {
      return a;
   }

   protected dnp(dwv.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jp.k));
   }

   @Override
   protected void a(dwx.a<djl, dww> $$0) {
      $$0.a(b);
   }

   @Override
   protected dww a(dww $$0, dqd $$1) {
      return $$0.b(b, $$1.a().a($$0.c(b)));
   }

   @Override
   protected dww a(dww $$0, dok $$1) {
      return $$0.b(b, $$1.a().a($$0.c(b)));
   }

   @Override
   public dww a(daf $$0) {
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
   public dty a(ji $$0, dww $$1) {
      return new dvb($$0, $$1);
   }

   @Override
   protected bsj a(dww $$0, dgh $$1, ji $$2, cow $$3, fav $$4) {
      dty $$5 = $$1.c_($$2);
      if ($$5 instanceof dvb && $$3.gG()) {
         $$3.a((dvb)$$5);
         return bsj.a;
      } else {
         return bsj.e;
      }
   }

   public static boolean a(ern.a $$0, ern.a $$1) {
      jn $$2 = o($$0.a().b());
      jn $$3 = o($$1.a().b());
      jn $$4 = p($$0.a().b());
      jn $$5 = p($$1.a().b());
      dvb.a $$6 = $$0.b();
      boolean $$7 = $$6 == dvb.a.a;
      return $$2 == $$3.g() && ($$7 || $$4 == $$5) && $$0.e().equals($$1.c());
   }

   public static jn o(dww $$0) {
      return $$0.c(b).a();
   }

   public static jn p(dww $$0) {
      return $$0.c(b).b();
   }
}
