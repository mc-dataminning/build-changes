import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dfh extends dln {
   public static final MapCodec<dfh> a = b(dfh::new);
   public static final dsr b = dsn.R;

   @Override
   public MapCodec<dfh> a() {
      return a;
   }

   public dfh(drw.d $$0) {
      super($$0);
      this.k(this.n().a(b, je.c));
   }

   @Nullable
   @Override
   public dpc a(iz $$0, drx $$1) {
      return new dph($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dpc> dpd<T> a(dbt $$0, drx $$1, dpe<T> $$2) {
      return !$$0.B ? a($$2, dpe.J, ($$0x, $$1x, $$2x, $$3) -> dwz.c.a($$0x, $$3.gs(), $$3.gt())) : null;
   }

   @Nullable
   @Override
   public drx a(cxv $$0) {
      return super.a($$0).a(b, $$0.g());
   }

   @Override
   public int a(drx $$0, daz $$1, iz $$2, je $$3) {
      return $$3 != $$0.c(b) ? super.a($$0, $$1, $$2, $$3) : 0;
   }

   @Override
   protected void a(dry.a<deu, drx> $$0) {
      super.a($$0);
      $$0.a(b);
   }

   @Override
   public drx a(drx $$0, dlh $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public drx a(drx $$0, djr $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   public int c() {
      return 10;
   }
}
