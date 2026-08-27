import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dmi extends dlq implements dkf {
   public static final MapCodec<dmi> a = b(dmi::new);
   public static final dqy c = dqx.C;

   @Override
   protected MapCodec<? extends dmi> a() {
      return a;
   }

   protected dmi(dqg.d $$0) {
      super($$0);
      this.k(this.n().a(c, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public dqh a(cwi $$0) {
      ema $$1 = $$0.q().b_($$0.a());
      return super.a($$0).a(c, Boolean.valueOf($$1.b(emb.c)));
   }

   @Override
   protected dqh a(dqh $$0, is $$1, dqh $$2, dae $$3, in $$4, in $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, emb.c, emb.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected ema b_(dqh $$0) {
      return $$0.c(c) ? emb.c.a(true) : super.b_($$0);
   }

   @Override
   protected void a(dqi.a<dde, dqh> $$0) {
      $$0.a(c);
   }
}
