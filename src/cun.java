import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cun extends dar {
   public static final MapCodec<cun> a = b(cun::new);
   public static final dgv b = dgr.R;

   @Override
   public MapCodec<cun> a() {
      return a;
   }

   public cun(dga.d $$0) {
      super($$0);
      this.k(this.o().a(b, hx.c));
   }

   @Nullable
   @Override
   public ddx a(ht $$0, dgb $$1) {
      return new dec($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends ddx> ddy<T> a(cqz $$0, dgb $$1, ddz<T> $$2) {
      return !$$0.B ? a($$2, ddz.J, ($$0x, $$1x, $$2x, $$3) -> dku.c.a($$0x, $$3.gg(), $$3.gh())) : null;
   }

   @Nullable
   @Override
   public dgb a(cmr $$0) {
      return super.a($$0).a(b, $$0.g());
   }

   @Override
   public int a(dgb $$0, cqf $$1, ht $$2, hx $$3) {
      return $$3 != $$0.c(b) ? super.a($$0, $$1, $$2, $$3) : 0;
   }

   @Override
   protected void a(dgc.a<cua, dgb> $$0) {
      super.a($$0);
      $$0.a(b);
   }

   @Override
   public dgb a(dgb $$0, dal $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dgb a(dgb $$0, cyv $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   public int c() {
      return 10;
   }
}
