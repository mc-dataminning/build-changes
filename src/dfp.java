import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dfp extends dmj {
   public static final MapCodec<dfp> a = b(dfp::new);
   public static final dtw b = dts.R;

   @Override
   public MapCodec<dfp> a() {
      return a;
   }

   public dfp(dtb.d $$0) {
      super($$0);
      this.k(this.n().a(b, iw.c));
   }

   @Nullable
   @Override
   public dqc a(ir $$0, dtc $$1) {
      return new dqh($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dqc> dqd<T> a(dca $$0, dtc $$1, dqe<T> $$2) {
      return !$$0.C ? a($$2, dqe.K, ($$0x, $$1x, $$2x, $$3) -> dye.c.a($$0x, $$3.gA(), $$3.gB())) : null;
   }

   @Nullable
   @Override
   public dtc a(cyd $$0) {
      return super.a($$0).a(b, $$0.g());
   }

   @Override
   public int a(dtc $$0, dbg $$1, ir $$2, iw $$3) {
      return $$3 != $$0.c(b) ? super.a($$0, $$1, $$2, $$3) : 0;
   }

   @Override
   protected void a(dtd.a<dfc, dtc> $$0) {
      super.a($$0);
      $$0.a(b);
   }

   @Override
   public dtc a(dtc $$0, dmd $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dtc a(dtc $$0, dke $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   public int c() {
      return 10;
   }
}
