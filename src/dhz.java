import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dhz extends dog {
   public static final MapCodec<dhz> a = b(dhz::new);
   public static final dvm b = dvi.R;

   @Override
   public MapCodec<dhz> a() {
      return a;
   }

   public dhz(dur.d $$0) {
      super($$0);
      this.l(this.n().b(b, jk.c));
   }

   @Nullable
   @Override
   public drv a(jf $$0, dus $$1) {
      return new dsa($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends drv> drw<T> a(dej $$0, dus $$1, drx<T> $$2) {
      return !$$0.B ? a($$2, drx.J, ($$0x, $$1x, $$2x, $$3) -> dzy.c.a($$0x, $$3.gq(), $$3.gr())) : null;
   }

   @Nullable
   @Override
   public dus a(czn $$0) {
      return super.a($$0).b(b, $$0.g());
   }

   @Override
   public int a(dus $$0, ddo $$1, jf $$2, jk $$3) {
      return $$3 != $$0.c(b) ? super.a($$0, $$1, $$2, $$3) : 0;
   }

   @Override
   protected void a(dut.a<dhm, dus> $$0) {
      super.a($$0);
      $$0.a(b);
   }

   @Override
   public dus a(dus $$0, doa $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   public dus a(dus $$0, dmj $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   public int c() {
      return 10;
   }
}
