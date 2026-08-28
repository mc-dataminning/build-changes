import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dfo extends dlu {
   public static final MapCodec<dfo> a = b(dfo::new);
   public static final dsy b = dsu.R;

   @Override
   public MapCodec<dfo> a() {
      return a;
   }

   public dfo(dsd.d $$0) {
      super($$0);
      this.k(this.o().a(b, je.c));
   }

   @Nullable
   @Override
   public dpj a(iz $$0, dse $$1) {
      return new dpo($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dpj> dpk<T> a(dca $$0, dse $$1, dpl<T> $$2) {
      return !$$0.B ? a($$2, dpl.J, ($$0x, $$1x, $$2x, $$3) -> dxg.c.a($$0x, $$3.gs(), $$3.gt())) : null;
   }

   @Nullable
   @Override
   public dse a(cyc $$0) {
      return super.a($$0).a(b, $$0.g());
   }

   @Override
   public int a(dse $$0, dbg $$1, iz $$2, je $$3) {
      return $$3 != $$0.c(b) ? super.a($$0, $$1, $$2, $$3) : 0;
   }

   @Override
   protected void a(dsf.a<dfb, dse> $$0) {
      super.a($$0);
      $$0.a(b);
   }

   @Override
   public dse a(dse $$0, dlo $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dse a(dse $$0, djy $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   public int c() {
      return 10;
   }
}
