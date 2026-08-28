import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class djz extends dqj {
   public static final MapCodec<djz> a = b(djz::new);
   public static final dxt<jn> b = dxm.U;

   @Override
   public MapCodec<djz> a() {
      return a;
   }

   public djz(dwv.d $$0) {
      super($$0);
      this.l(this.m().b(b, jn.c));
   }

   @Nullable
   @Override
   public dty a(ji $$0, dww $$1) {
      return new dud($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dty> dtz<T> a(dgh $$0, dww $$1, dua<T> $$2) {
      return !$$0.C ? a($$2, dua.K, ($$0x, $$1x, $$2x, $$3) -> ecb.c.a($$0x, $$3.gt(), $$3.gu())) : null;
   }

   @Nullable
   @Override
   public dww a(daf $$0) {
      return super.a($$0).b(b, $$0.g());
   }

   @Override
   public int a(dww $$0, dfm $$1, ji $$2, jn $$3) {
      return $$3 != $$0.c(b) ? super.a($$0, $$1, $$2, $$3) : 0;
   }

   @Override
   protected void a(dwx.a<djl, dww> $$0) {
      super.a($$0);
      $$0.a(b);
   }

   @Override
   public dww a(dww $$0, dqd $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   public dww a(dww $$0, dok $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   public int c() {
      return 10;
   }
}
