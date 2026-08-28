import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dnr extends dud {
   public static final MapCodec<dnr> a = b(dnr::new);
   public static final ecc<jb> b = ebu.T;

   @Override
   public MapCodec<dnr> a() {
      return a;
   }

   public dnr(ebd.d $$0) {
      super($$0);
      this.l(this.m().b(b, jb.c));
   }

   @Nullable
   @Override
   public dyc a(iv $$0, ebe $$1) {
      return new dyi($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dyc> dyd<T> a(djx $$0, ebe $$1, dye<T> $$2) {
      return !$$0.C ? a($$2, dye.K, ($$0x, $$1x, $$2x, $$3) -> egn.c.a($$0x, $$3.x(), $$3.gu())) : null;
   }

   @Nullable
   @Override
   public ebe a(ddr $$0) {
      return super.a($$0).b(b, $$0.g());
   }

   @Override
   public int a(ebe $$0, djb $$1, iv $$2, jb $$3) {
      return $$3 != $$0.c(b) ? super.a($$0, $$1, $$2, $$3) : 0;
   }

   @Override
   protected void a(ebf.a<dnc, ebe> $$0) {
      super.a($$0);
      $$0.a(b);
   }

   @Override
   public ebe a(ebe $$0, dtw $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   public ebe a(ebe $$0, dsf $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   public int c() {
      return 10;
   }
}
