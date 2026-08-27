import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class del extends dkr {
   public static final MapCodec<del> a = b(del::new);
   public static final drv b = drr.R;

   @Override
   public MapCodec<del> a() {
      return a;
   }

   public del(dra.d $$0) {
      super($$0);
      this.k(this.n().a(b, it.c));
   }

   @Nullable
   @Override
   public dog a(io $$0, drb $$1) {
      return new dol($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dog> doh<T> a(dax $$0, drb $$1, doi<T> $$2) {
      return !$$0.B ? a($$2, doi.J, ($$0x, $$1x, $$2x, $$3) -> dwd.c.a($$0x, $$3.gr(), $$3.gs())) : null;
   }

   @Nullable
   @Override
   public drb a(cwz $$0) {
      return super.a($$0).a(b, $$0.g());
   }

   @Override
   public int a(drb $$0, dad $$1, io $$2, it $$3) {
      return $$3 != $$0.c(b) ? super.a($$0, $$1, $$2, $$3) : 0;
   }

   @Override
   protected void a(drc.a<ddy, drb> $$0) {
      super.a($$0);
      $$0.a(b);
   }

   @Override
   public drb a(drb $$0, dkl $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public drb a(drb $$0, div $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   public int c() {
      return 10;
   }
}
