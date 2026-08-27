import com.mojang.serialization.MapCodec;

public class dgx extends dde implements dkf {
   public static final MapCodec<dgx> a = b(dgx::new);
   private static final eui b = dde.a(4.0, 0.0, 4.0, 12.0, 8.0, 12.0);

   public dgx(dqg.d $$0) {
      super($$0);
      this.k(this.E.b().a(dqx.C, Boolean.valueOf(false)));
   }

   @Override
   public MapCodec<dgx> a() {
      return a;
   }

   @Override
   protected void a(dqi.a<dde, dqh> $$0) {
      $$0.a(dqx.C);
   }

   @Override
   protected ema b_(dqh $$0) {
      return $$0.c(dqx.C) ? emb.c.a(false) : super.b_($$0);
   }

   @Override
   protected eui a(dqh $$0, czj $$1, in $$2, etu $$3) {
      return b;
   }

   @Override
   protected boolean a(dqh $$0, emp $$1) {
      return false;
   }
}
