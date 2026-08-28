import com.mojang.serialization.MapCodec;

public class djh extends dff implements dhx, din {
   public static final MapCodec<djh> a = b(djh::new);
   public static final dtf<jh> b = dsx.T;

   @Override
   public MapCodec<djh> a() {
      return a;
   }

   protected djh(dsg.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, jh.k));
   }

   @Override
   protected void a(dsi.a<dff, dsh> $$0) {
      $$0.a(b);
   }

   @Override
   protected dsh a(dsh $$0, dls $$1) {
      return $$0.a(b, $$1.a().a($$0.c(b)));
   }

   @Override
   protected dsh a(dsh $$0, dkc $$1) {
      return $$0.a(b, $$1.a().a($$0.c(b)));
   }

   @Override
   public dsh a(cxk $$0) {
      jf $$1 = $$0.k();
      jf $$2;
      if ($$1.o() == jf.a.b) {
         $$2 = $$0.g().g();
      } else {
         $$2 = jf.b;
      }

      return this.o().a(b, jh.a($$1, $$2));
   }

   @Override
   public dpn a(ja $$0, dsh $$1) {
      return new dqn($$0, $$1);
   }

   @Override
   protected bqd a(dsh $$0, dcd $$1, ja $$2, cmh $$3, evv $$4) {
      dpn $$5 = $$1.c_($$2);
      if ($$5 instanceof dqn && $$3.gv()) {
         $$3.a((dqn)$$5);
         return bqd.a($$1.B);
      } else {
         return bqd.e;
      }
   }

   public static boolean a(emq.c $$0, emq.c $$1) {
      jf $$2 = m($$0.b());
      jf $$3 = m($$1.b());
      jf $$4 = n($$0.b());
      jf $$5 = n($$1.b());
      dqn.a $$6 = dqn.a.a($$0.c().l("joint")).orElseGet(() -> $$2.o().d() ? dqn.a.b : dqn.a.a);
      boolean $$7 = $$6 == dqn.a.a;
      return $$2 == $$3.g() && ($$7 || $$4 == $$5) && $$0.c().l("target").equals($$1.c().l("name"));
   }

   public static jf m(dsh $$0) {
      return $$0.c(b).a();
   }

   public static jf n(dsh $$0) {
      return $$0.c(b).b();
   }
}
