import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class diw extends dpc {
   public static final MapCodec<diw> a = b(diw::new);
   public static final dwl<jm> b = dwe.R;

   @Override
   public MapCodec<diw> a() {
      return a;
   }

   public diw(dvn.d $$0) {
      super($$0);
      this.l(this.m().b(b, jm.c));
   }

   @Nullable
   @Override
   public dsr a(jh $$0, dvo $$1) {
      return new dsw($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dsr> dss<T> a(dff $$0, dvo $$1, dst<T> $$2) {
      return !$$0.C ? a($$2, dst.J, ($$0x, $$1x, $$2x, $$3) -> eat.c.a($$0x, $$3.gx(), $$3.gy())) : null;
   }

   @Nullable
   @Override
   public dvo a(czw $$0) {
      return super.a($$0).b(b, $$0.g());
   }

   @Override
   public int a(dvo $$0, dek $$1, jh $$2, jm $$3) {
      return $$3 != $$0.c(b) ? super.a($$0, $$1, $$2, $$3) : 0;
   }

   @Override
   protected void a(dvp.a<dij, dvo> $$0) {
      super.a($$0);
      $$0.a(b);
   }

   @Override
   public dvo a(dvo $$0, dow $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   public dvo a(dvo $$0, dnf $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   public int c() {
      return 10;
   }
}
