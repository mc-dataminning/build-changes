import com.mojang.serialization.MapCodec;

public class des extends dde {
   public static final MapCodec<des> a = b(des::new);
   public static final dqy b = dqx.w;
   public static final dqy c = dqx.r;

   @Override
   protected MapCodec<? extends des> a() {
      return a;
   }

   public des(dqg.d $$0) {
      super($$0);
      this.k(this.n().a(c, Boolean.valueOf(false)).a(b, Boolean.valueOf(false)));
   }

   @Override
   protected void b(dqh $$0, dad $$1, in $$2, dqh $$3, boolean $$4) {
      if ($$3.b() != $$0.b() && $$1 instanceof aqh $$5) {
         this.a($$0, $$5, $$2);
      }
   }

   @Override
   protected void a(dqh $$0, dad $$1, in $$2, dde $$3, in $$4, boolean $$5) {
      if ($$1 instanceof aqh $$6) {
         this.a($$0, $$6, $$2);
      }
   }

   public void a(dqh $$0, aqh $$1, in $$2) {
      boolean $$3 = $$1.C($$2);
      if ($$3 != $$0.c(b)) {
         dqh $$4 = $$0;
         if (!$$0.c(b)) {
            $$4 = $$0.a(c);
            $$1.a(null, $$2, $$4.c(c) ? avc.fB : avc.fC, avd.e);
         }

         $$1.a($$2, $$4.a(b, Boolean.valueOf($$3)), 3);
      }
   }

   @Override
   protected void a(dqi.a<dde, dqh> $$0) {
      $$0.a(c, b);
   }

   @Override
   protected boolean c_(dqh $$0) {
      return true;
   }

   @Override
   protected int a(dqh $$0, dad $$1, in $$2) {
      return $$1.a_($$2).c(c) ? 15 : 0;
   }
}
