import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dfn extends dlt {
   public static final MapCodec<dfn> a = b(dfn::new);
   public static final dsx b = dst.R;

   @Override
   public MapCodec<dfn> a() {
      return a;
   }

   public dfn(dsc.d $$0) {
      super($$0);
      this.k(this.o().a(b, je.c));
   }

   @Nullable
   @Override
   public dpi a(iz $$0, dsd $$1) {
      return new dpn($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dpi> dpj<T> a(dbz $$0, dsd $$1, dpk<T> $$2) {
      return !$$0.B ? a($$2, dpk.J, ($$0x, $$1x, $$2x, $$3) -> dxf.c.a($$0x, $$3.gs(), $$3.gt())) : null;
   }

   @Nullable
   @Override
   public dsd a(cyb $$0) {
      return super.a($$0).a(b, $$0.g());
   }

   @Override
   public int a(dsd $$0, dbf $$1, iz $$2, je $$3) {
      return $$3 != $$0.c(b) ? super.a($$0, $$1, $$2, $$3) : 0;
   }

   @Override
   protected void a(dse.a<dfa, dsd> $$0) {
      super.a($$0);
      $$0.a(b);
   }

   @Override
   public dsd a(dsd $$0, dln $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dsd a(dsd $$0, djx $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   public int c() {
      return 10;
   }
}
