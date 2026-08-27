import com.mojang.serialization.MapCodec;

public class dhg extends dde implements dfw, dgm {
   public static final MapCodec<dhg> a = b(dhg::new);
   public static final drf<iu> b = dqx.T;

   @Override
   public MapCodec<dhg> a() {
      return a;
   }

   protected dhg(dqg.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, iu.k));
   }

   @Override
   protected void a(dqi.a<dde, dqh> $$0) {
      $$0.a(b);
   }

   @Override
   protected dqh a(dqh $$0, djr $$1) {
      return $$0.a(b, $$1.a().a($$0.c(b)));
   }

   @Override
   protected dqh a(dqh $$0, dib $$1) {
      return $$0.a(b, $$1.a().a($$0.c(b)));
   }

   @Override
   public dqh a(cwi $$0) {
      is $$1 = $$0.k();
      is $$2;
      if ($$1.o() == is.a.b) {
         $$2 = $$0.g().g();
      } else {
         $$2 = is.b;
      }

      return this.n().a(b, iu.a($$1, $$2));
   }

   @Override
   public dnm a(in $$0, dqh $$1) {
      return new dom($$0, $$1);
   }

   @Override
   protected bpm a(dqh $$0, dad $$1, in $$2, clh $$3, etl $$4) {
      dnm $$5 = $$1.c_($$2);
      if ($$5 instanceof dom && $$3.gx()) {
         $$3.a((dom)$$5);
         return bpm.a($$1.B);
      } else {
         return bpm.d;
      }
   }

   public static boolean a(ekp.c $$0, ekp.c $$1) {
      is $$2 = m($$0.b());
      is $$3 = m($$1.b());
      is $$4 = n($$0.b());
      is $$5 = n($$1.b());
      dom.a $$6 = dom.a.a($$0.c().l("joint")).orElseGet(() -> $$2.o().d() ? dom.a.b : dom.a.a);
      boolean $$7 = $$6 == dom.a.a;
      return $$2 == $$3.g() && ($$7 || $$4 == $$5) && $$0.c().l("target").equals($$1.c().l("name"));
   }

   public static is m(dqh $$0) {
      return $$0.c(b).a();
   }

   public static is n(dqh $$0) {
      return $$0.c(b).b();
   }
}
