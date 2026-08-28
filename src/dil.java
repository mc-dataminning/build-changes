import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dil extends dor {
   public static final MapCodec<dil> a = b(dil::new);
   public static final dvx b = dvt.R;

   @Override
   public MapCodec<dil> a() {
      return a;
   }

   public dil(dvc.d $$0) {
      super($$0);
      this.l(this.m().b(b, jl.c));
   }

   @Nullable
   @Override
   public dsg a(jg $$0, dvd $$1) {
      return new dsl($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dsg> dsh<T> a(dev $$0, dvd $$1, dsi<T> $$2) {
      return !$$0.C ? a($$2, dsi.J, ($$0x, $$1x, $$2x, $$3) -> eaj.c.a($$0x, $$3.gx(), $$3.gy())) : null;
   }

   @Nullable
   @Override
   public dvd a(czm $$0) {
      return super.a($$0).b(b, $$0.g());
   }

   @Override
   public int a(dvd $$0, dea $$1, jg $$2, jl $$3) {
      return $$3 != $$0.c(b) ? super.a($$0, $$1, $$2, $$3) : 0;
   }

   @Override
   protected void a(dve.a<dhy, dvd> $$0) {
      super.a($$0);
      $$0.a(b);
   }

   @Override
   public dvd a(dvd $$0, dol $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   public dvd a(dvd $$0, dmu $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   public int c() {
      return 10;
   }
}
