import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dfv extends dmb {
   public static final MapCodec<dfv> a = b(dfv::new);
   public static final dtf b = dtb.R;

   @Override
   public MapCodec<dfv> a() {
      return a;
   }

   public dfv(dsk.d $$0) {
      super($$0);
      this.k(this.o().a(b, jf.c));
   }

   @Nullable
   @Override
   public dpq a(ja $$0, dsl $$1) {
      return new dpv($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dpq> dpr<T> a(dcg $$0, dsl $$1, dps<T> $$2) {
      return !$$0.B ? a($$2, dps.J, ($$0x, $$1x, $$2x, $$3) -> dxq.c.a($$0x, $$3.gp(), $$3.gq())) : null;
   }

   @Nullable
   @Override
   public dsl a(cxn $$0) {
      return super.a($$0).a(b, $$0.g());
   }

   @Override
   public int a(dsl $$0, dbm $$1, ja $$2, jf $$3) {
      return $$3 != $$0.c(b) ? super.a($$0, $$1, $$2, $$3) : 0;
   }

   @Override
   protected void a(dsm.a<dfi, dsl> $$0) {
      super.a($$0);
      $$0.a(b);
   }

   @Override
   public dsl a(dsl $$0, dlv $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dsl a(dsl $$0, dkf $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   public int c() {
      return 10;
   }
}
