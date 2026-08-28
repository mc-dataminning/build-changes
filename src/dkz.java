import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dkz extends drh {
   public static final MapCodec<dkz> a = b(dkz::new);
   public static final dyr<jm> b = dyk.S;

   @Override
   public MapCodec<dkz> a() {
      return a;
   }

   public dkz(dxt.d $$0) {
      super($$0);
      this.l(this.m().b(b, jm.c));
   }

   @Nullable
   @Override
   public duw a(jh $$0, dxu $$1) {
      return new dvb($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends duw> dux<T> a(dhh $$0, dxu $$1, duy<T> $$2) {
      return !$$0.C ? a($$2, duy.K, ($$0x, $$1x, $$2x, $$3) -> ecz.c.a($$0x, $$3.gp(), $$3.gq())) : null;
   }

   @Nullable
   @Override
   public dxu a(dbf $$0) {
      return super.a($$0).b(b, $$0.g());
   }

   @Override
   public int a(dxu $$0, dgm $$1, jh $$2, jm $$3) {
      return $$3 != $$0.c(b) ? super.a($$0, $$1, $$2, $$3) : 0;
   }

   @Override
   protected void a(dxv.a<dkl, dxu> $$0) {
      super.a($$0);
      $$0.a(b);
   }

   @Override
   public dxu a(dxu $$0, drb $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   public dxu a(dxu $$0, dpk $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   public int c() {
      return 10;
   }
}
