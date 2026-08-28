import com.mojang.serialization.MapCodec;

public class dnq extends djm implements dmf, dmv {
   public static final MapCodec<dnq> a = b(dnq::new);
   public static final dxu<jp> b = dxn.W;

   @Override
   public MapCodec<dnq> a() {
      return a;
   }

   protected dnq(dww.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jp.k));
   }

   @Override
   protected void a(dwy.a<djm, dwx> $$0) {
      $$0.a(b);
   }

   @Override
   protected dwx a(dwx $$0, dqe $$1) {
      return $$0.b(b, $$1.a().a($$0.c(b)));
   }

   @Override
   protected dwx a(dwx $$0, dol $$1) {
      return $$0.b(b, $$1.a().a($$0.c(b)));
   }

   @Override
   public dwx a(dag $$0) {
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
   public dtz a(ji $$0, dwx $$1) {
      return new dvc($$0, $$1);
   }

   @Override
   protected bsj a(dwx $$0, dgi $$1, ji $$2, cox $$3, faw $$4) {
      dtz $$5 = $$1.c_($$2);
      if ($$5 instanceof dvc && $$3.gG()) {
         $$3.a((dvc)$$5);
         return bsj.a;
      } else {
         return bsj.e;
      }
   }

   public static boolean a(ero.a $$0, ero.a $$1) {
      jn $$2 = o($$0.a().b());
      jn $$3 = o($$1.a().b());
      jn $$4 = p($$0.a().b());
      jn $$5 = p($$1.a().b());
      dvc.a $$6 = $$0.b();
      boolean $$7 = $$6 == dvc.a.a;
      return $$2 == $$3.g() && ($$7 || $$4 == $$5) && $$0.e().equals($$1.c());
   }

   public static jn o(dwx $$0) {
      return $$0.c(b).a();
   }

   public static jn p(dwx $$0) {
      return $$0.c(b).b();
   }
}
