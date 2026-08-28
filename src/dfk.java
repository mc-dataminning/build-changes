import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dfk extends dlq {
   public static final MapCodec<dfk> a = b(dfk::new);
   public static final dsu b = dsq.R;

   @Override
   public MapCodec<dfk> a() {
      return a;
   }

   public dfk(drz.d $$0) {
      super($$0);
      this.k(this.o().a(b, je.c));
   }

   @Nullable
   @Override
   public dpf a(iz $$0, dsa $$1) {
      return new dpk($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dpf> dpg<T> a(dbw $$0, dsa $$1, dph<T> $$2) {
      return !$$0.B ? a($$2, dph.J, ($$0x, $$1x, $$2x, $$3) -> dxc.c.a($$0x, $$3.gs(), $$3.gt())) : null;
   }

   @Nullable
   @Override
   public dsa a(cxy $$0) {
      return super.a($$0).a(b, $$0.g());
   }

   @Override
   public int a(dsa $$0, dbc $$1, iz $$2, je $$3) {
      return $$3 != $$0.c(b) ? super.a($$0, $$1, $$2, $$3) : 0;
   }

   @Override
   protected void a(dsb.a<dex, dsa> $$0) {
      super.a($$0);
      $$0.a(b);
   }

   @Override
   public dsa a(dsa $$0, dlk $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dsa a(dsa $$0, dju $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   public int c() {
      return 10;
   }
}
