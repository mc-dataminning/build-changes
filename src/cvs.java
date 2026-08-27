import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cvs extends dbx {
   public static final MapCodec<cvs> a = b(cvs::new);
   public static final dih b = did.R;

   @Override
   public MapCodec<cvs> a() {
      return a;
   }

   public cvs(dhm.d $$0) {
      super($$0);
      this.k(this.o().a(b, ib.c));
   }

   @Nullable
   @Override
   public dfi a(hx $$0, dhn $$1) {
      return new dfn($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dfi> dfj<T> a(csf $$0, dhn $$1, dfk<T> $$2) {
      return !$$0.B ? a($$2, dfk.J, ($$0x, $$1x, $$2x, $$3) -> dmg.c.a($$0x, $$3.gh(), $$3.gi())) : null;
   }

   @Nullable
   @Override
   public dhn a(cnw $$0) {
      return super.a($$0).a(b, $$0.g());
   }

   @Override
   public int a(dhn $$0, crl $$1, hx $$2, ib $$3) {
      return $$3 != $$0.c(b) ? super.a($$0, $$1, $$2, $$3) : 0;
   }

   @Override
   protected void a(dho.a<cvf, dhn> $$0) {
      super.a($$0);
      $$0.a(b);
   }

   @Override
   public dhn a(dhn $$0, dbr $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dhn a(dhn $$0, dab $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   public int c() {
      return 10;
   }
}
