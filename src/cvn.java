import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cvn extends dbs {
   public static final MapCodec<cvn> a = b(cvn::new);
   public static final dic b = dhy.R;

   @Override
   public MapCodec<cvn> a() {
      return a;
   }

   public cvn(dhh.d $$0) {
      super($$0);
      this.k(this.o().a(b, hx.c));
   }

   @Nullable
   @Override
   public dfd a(ht $$0, dhi $$1) {
      return new dfi($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dfd> dfe<T> a(csa $$0, dhi $$1, dff<T> $$2) {
      return !$$0.B ? a($$2, dff.J, ($$0x, $$1x, $$2x, $$3) -> dmb.c.a($$0x, $$3.gh(), $$3.gi())) : null;
   }

   @Nullable
   @Override
   public dhi a(cnr $$0) {
      return super.a($$0).a(b, $$0.g());
   }

   @Override
   public int a(dhi $$0, crg $$1, ht $$2, hx $$3) {
      return $$3 != $$0.c(b) ? super.a($$0, $$1, $$2, $$3) : 0;
   }

   @Override
   protected void a(dhj.a<cva, dhi> $$0) {
      super.a($$0);
      $$0.a(b);
   }

   @Override
   public dhi a(dhi $$0, dbm $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dhi a(dhi $$0, czw $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   public int c() {
      return 10;
   }
}
