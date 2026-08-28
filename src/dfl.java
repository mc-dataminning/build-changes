import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dfl extends dlr {
   public static final MapCodec<dfl> a = b(dfl::new);
   public static final dsv b = dsr.R;

   @Override
   public MapCodec<dfl> a() {
      return a;
   }

   public dfl(dsa.d $$0) {
      super($$0);
      this.k(this.o().a(b, je.c));
   }

   @Nullable
   @Override
   public dpg a(iz $$0, dsb $$1) {
      return new dpl($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dpg> dph<T> a(dbx $$0, dsb $$1, dpi<T> $$2) {
      return !$$0.B ? a($$2, dpi.J, ($$0x, $$1x, $$2x, $$3) -> dxd.c.a($$0x, $$3.gs(), $$3.gt())) : null;
   }

   @Nullable
   @Override
   public dsb a(cxz $$0) {
      return super.a($$0).a(b, $$0.g());
   }

   @Override
   public int a(dsb $$0, dbd $$1, iz $$2, je $$3) {
      return $$3 != $$0.c(b) ? super.a($$0, $$1, $$2, $$3) : 0;
   }

   @Override
   protected void a(dsc.a<dey, dsb> $$0) {
      super.a($$0);
      $$0.a(b);
   }

   @Override
   public dsb a(dsb $$0, dll $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dsb a(dsb $$0, djv $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   public int c() {
      return 10;
   }
}
