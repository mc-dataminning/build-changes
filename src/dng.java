import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dng extends dts {
   public static final MapCodec<dng> a = b(dng::new);
   public static final ebr<jb> b = ebj.T;

   @Override
   public MapCodec<dng> a() {
      return a;
   }

   public dng(eas.d $$0) {
      super($$0);
      this.l(this.m().b(b, jb.c));
   }

   @Nullable
   @Override
   public dxr a(iv $$0, eat $$1) {
      return new dxx($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dxr> dxs<T> a(djm $$0, eat $$1, dxt<T> $$2) {
      return !$$0.C ? a($$2, dxt.K, ($$0x, $$1x, $$2x, $$3) -> egc.c.a($$0x, $$3.x(), $$3.gt())) : null;
   }

   @Nullable
   @Override
   public eat a(ddg $$0) {
      return super.a($$0).b(b, $$0.g());
   }

   @Override
   public int a(eat $$0, diq $$1, iv $$2, jb $$3) {
      return $$3 != $$0.c(b) ? super.a($$0, $$1, $$2, $$3) : 0;
   }

   @Override
   protected void a(eau.a<dmr, eat> $$0) {
      super.a($$0);
      $$0.a(b);
   }

   @Override
   public eat a(eat $$0, dtl $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   public eat a(eat $$0, dru $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   public int c() {
      return 10;
   }
}
