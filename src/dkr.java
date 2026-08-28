import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dkr extends drb {
   public static final MapCodec<dkr> a = b(dkr::new);
   public static final dyl<jm> b = dye.U;

   @Override
   public MapCodec<dkr> a() {
      return a;
   }

   public dkr(dxn.d $$0) {
      super($$0);
      this.l(this.m().b(b, jm.c));
   }

   @Nullable
   @Override
   public duq a(jh $$0, dxo $$1) {
      return new duv($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends duq> dur<T> a(dgz $$0, dxo $$1, dus<T> $$2) {
      return !$$0.C ? a($$2, dus.K, ($$0x, $$1x, $$2x, $$3) -> ect.c.a($$0x, $$3.gp(), $$3.gq())) : null;
   }

   @Nullable
   @Override
   public dxo a(dax $$0) {
      return super.a($$0).b(b, $$0.g());
   }

   @Override
   public int a(dxo $$0, dge $$1, jh $$2, jm $$3) {
      return $$3 != $$0.c(b) ? super.a($$0, $$1, $$2, $$3) : 0;
   }

   @Override
   protected void a(dxp.a<dkd, dxo> $$0) {
      super.a($$0);
      $$0.a(b);
   }

   @Override
   public dxo a(dxo $$0, dqv $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   public dxo a(dxo $$0, dpc $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   public int c() {
      return 10;
   }
}
