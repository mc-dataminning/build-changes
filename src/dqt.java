import com.mojang.serialization.MapCodec;

public class dqt extends dmm implements dpg, dpy {
   public static final MapCodec<dqt> a = b(dqt::new);
   public static final ebm<jd> b = ebe.W;

   @Override
   public MapCodec<dqt> a() {
      return a;
   }

   protected dqt(ean.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, jd.k));
   }

   @Override
   protected void a(eap.a<dmm, eao> $$0) {
      $$0.a(b);
   }

   @Override
   protected eao a(eao $$0, dtg $$1) {
      return $$0.b(b, $$1.a().a($$0.c(b)));
   }

   @Override
   protected eao a(eao $$0, drp $$1) {
      return $$0.b(b, $$1.a().a($$0.c(b)));
   }

   @Override
   public eao a(ddd $$0) {
      jb $$1 = $$0.k();
      jb $$2;
      if ($$1.o() == jb.a.b) {
         $$2 = $$0.g().g();
      } else {
         $$2 = jb.b;
      }

      return this.m().b(b, jd.a($$1, $$2));
   }

   @Override
   public dxm a(iv $$0, eao $$1) {
      return new dyq($$0, $$1);
   }

   @Override
   protected bug a(eao $$0, djh $$1, iv $$2, crj $$3, fet $$4) {
      dxm $$5 = $$1.c_($$2);
      if ($$5 instanceof dyq && $$3.gF()) {
         $$3.a((dyq)$$5);
         return bug.a;
      } else {
         return bug.e;
      }
   }

   public static boolean a(evk.a $$0, evk.a $$1) {
      jb $$2 = o($$0.a().b());
      jb $$3 = o($$1.a().b());
      jb $$4 = p($$0.a().b());
      jb $$5 = p($$1.a().b());
      dyq.a $$6 = $$0.b();
      boolean $$7 = $$6 == dyq.a.a;
      return $$2 == $$3.g() && ($$7 || $$4 == $$5) && $$0.e().equals($$1.c());
   }

   public static jb o(eao $$0) {
      return $$0.c(b).a();
   }

   public static jb p(eao $$0) {
      return $$0.c(b).b();
   }
}
