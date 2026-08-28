import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dgl extends dms {
   public static final MapCodec<dgl> a = b(dgl::new);
   public static final dtw b = dts.R;

   @Override
   public MapCodec<dgl> a() {
      return a;
   }

   public dgl(dtb.d $$0) {
      super($$0);
      this.k(this.o().a(b, ji.c));
   }

   @Nullable
   @Override
   public dqh a(jd $$0, dtc $$1) {
      return new dqm($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dqh> dqi<T> a(dcw $$0, dtc $$1, dqj<T> $$2) {
      return !$$0.B ? a($$2, dqj.J, ($$0x, $$1x, $$2x, $$3) -> dyi.c.a($$0x, $$3.gm(), $$3.gn())) : null;
   }

   @Nullable
   @Override
   public dtc a(cyd $$0) {
      return super.a($$0).a(b, $$0.g());
   }

   @Override
   public int a(dtc $$0, dcc $$1, jd $$2, ji $$3) {
      return $$3 != $$0.c(b) ? super.a($$0, $$1, $$2, $$3) : 0;
   }

   @Override
   protected void a(dtd.a<dfy, dtc> $$0) {
      super.a($$0);
      $$0.a(b);
   }

   @Override
   public dtc a(dtc $$0, dmm $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dtc a(dtc $$0, dkv $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   public int c() {
      return 10;
   }
}
