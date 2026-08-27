import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dcl extends diq {
   public static final MapCodec<dcl> a = b(dcl::new);
   public static final dpt b = dpp.R;

   @Override
   public MapCodec<dcl> a() {
      return a;
   }

   public dcl(doy.d $$0) {
      super($$0);
      this.k(this.n().a(b, ih.c));
   }

   @Nullable
   @Override
   public dmf a(ib $$0, doz $$1) {
      return new dmk($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dmf> dmg<T> a(cyx $$0, doz $$1, dmh<T> $$2) {
      return !$$0.B ? a($$2, dmh.J, ($$0x, $$1x, $$2x, $$3) -> dub.c.a($$0x, $$3.gp(), $$3.gq())) : null;
   }

   @Nullable
   @Override
   public doz a(cuo $$0) {
      return super.a($$0).a(b, $$0.g());
   }

   @Override
   public int a(doz $$0, cyd $$1, ib $$2, ih $$3) {
      return $$3 != $$0.c(b) ? super.a($$0, $$1, $$2, $$3) : 0;
   }

   @Override
   protected void a(dpa.a<dby, doz> $$0) {
      super.a($$0);
      $$0.a(b);
   }

   @Override
   public doz a(doz $$0, dik $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public doz a(doz $$0, dgu $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   public int c() {
      return 10;
   }
}
