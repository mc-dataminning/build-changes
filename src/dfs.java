import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dfs extends dly {
   public static final MapCodec<dfs> a = b(dfs::new);
   public static final dtb b = dsx.R;

   @Override
   public MapCodec<dfs> a() {
      return a;
   }

   public dfs(dsg.d $$0) {
      super($$0);
      this.k(this.o().a(b, jf.c));
   }

   @Nullable
   @Override
   public dpn a(ja $$0, dsh $$1) {
      return new dps($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dpn> dpo<T> a(dcd $$0, dsh $$1, dpp<T> $$2) {
      return !$$0.B ? a($$2, dpp.J, ($$0x, $$1x, $$2x, $$3) -> dxj.c.a($$0x, $$3.gp(), $$3.gq())) : null;
   }

   @Nullable
   @Override
   public dsh a(cxk $$0) {
      return super.a($$0).a(b, $$0.g());
   }

   @Override
   public int a(dsh $$0, dbj $$1, ja $$2, jf $$3) {
      return $$3 != $$0.c(b) ? super.a($$0, $$1, $$2, $$3) : 0;
   }

   @Override
   protected void a(dsi.a<dff, dsh> $$0) {
      super.a($$0);
      $$0.a(b);
   }

   @Override
   public dsh a(dsh $$0, dls $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dsh a(dsh $$0, dkc $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   public int c() {
      return 10;
   }
}
