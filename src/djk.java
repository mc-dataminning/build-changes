import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class djk extends dkd implements drj {
   public static final MapCodec<djk> a = b(djk::new);
   public static final dyf b = dye.J;

   @Override
   public MapCodec<djk> a() {
      return a;
   }

   protected djk(dxn.d $$0) {
      super($$0);
      this.l(this.m().b(b, Boolean.valueOf(false)));
   }

   @Override
   protected boolean e_(dxo $$0) {
      return $$0.y().c();
   }

   @Override
   protected dqo a_(dxo $$0) {
      return dqo.a;
   }

   @Override
   protected float c(dxo $$0, dge $$1, jh $$2) {
      return 1.0F;
   }

   @Override
   protected dxo a(dxo $$0, dhc $$1, dho $$2, jh $$3, jm $$4, jh $$5, dxo $$6, bac $$7) {
      if ($$0.c(b)) {
         $$2.a($$3, etr.c, etr.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected etq b_(dxo $$0) {
      return $$0.c(b) ? etr.c.a(false) : super.b_($$0);
   }

   @Nullable
   @Override
   public dxo a(dax $$0) {
      return this.m().b(b, Boolean.valueOf($$0.q().b_($$0.a()).a() == etr.c));
   }

   @Override
   protected void a(dxp.a<dkd, dxo> $$0) {
      $$0.a(b);
   }

   @Override
   public cxg a(@Nullable cpo $$0, dha $$1, jh $$2, dxo $$3) {
      return $$0 != null && $$0.b() ? drj.super.a($$0, $$1, $$2, $$3) : cxg.j;
   }

   @Override
   public boolean a(@Nullable cpo $$0, dge $$1, jh $$2, dxo $$3, etp $$4) {
      return $$0 != null && $$0.b() ? drj.super.a($$0, $$1, $$2, $$3, $$4) : false;
   }
}
