import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dnb extends dtn {
   public static final MapCodec<dnb> a = b(dnb::new);
   public static final ebm<jb> b = ebe.T;

   @Override
   public MapCodec<dnb> a() {
      return a;
   }

   public dnb(ean.d $$0) {
      super($$0);
      this.l(this.m().b(b, jb.c));
   }

   @Nullable
   @Override
   public dxm a(iv $$0, eao $$1) {
      return new dxs($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dxm> dxn<T> a(djh $$0, eao $$1, dxo<T> $$2) {
      return !$$0.C ? a($$2, dxo.K, ($$0x, $$1x, $$2x, $$3) -> efx.c.a($$0x, $$3.x(), $$3.gt())) : null;
   }

   @Nullable
   @Override
   public eao a(ddd $$0) {
      return super.a($$0).b(b, $$0.g());
   }

   @Override
   public int a(eao $$0, din $$1, iv $$2, jb $$3) {
      return $$3 != $$0.c(b) ? super.a($$0, $$1, $$2, $$3) : 0;
   }

   @Override
   protected void a(eap.a<dmm, eao> $$0) {
      super.a($$0);
      $$0.a(b);
   }

   @Override
   public eao a(eao $$0, dtg $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   public eao a(eao $$0, drp $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   public int c() {
      return 10;
   }
}
