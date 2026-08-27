import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cvg extends dbl {
   public static final MapCodec<cvg> a = b(cvg::new);
   public static final dhq b = dhm.R;

   @Override
   public MapCodec<cvg> a() {
      return a;
   }

   public cvg(dgv.d $$0) {
      super($$0);
      this.k(this.o().a(b, hx.c));
   }

   @Nullable
   @Override
   public der a(ht $$0, dgw $$1) {
      return new dew($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends der> des<T> a(crs $$0, dgw $$1, det<T> $$2) {
      return !$$0.B ? a($$2, det.J, ($$0x, $$1x, $$2x, $$3) -> dlp.c.a($$0x, $$3.gg(), $$3.gh())) : null;
   }

   @Nullable
   @Override
   public dgw a(cnj $$0) {
      return super.a($$0).a(b, $$0.g());
   }

   @Override
   public int a(dgw $$0, cqy $$1, ht $$2, hx $$3) {
      return $$3 != $$0.c(b) ? super.a($$0, $$1, $$2, $$3) : 0;
   }

   @Override
   protected void a(dgx.a<cut, dgw> $$0) {
      super.a($$0);
      $$0.a(b);
   }

   @Override
   public dgw a(dgw $$0, dbf $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dgw a(dgw $$0, czp $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   public int c() {
      return 10;
   }
}
