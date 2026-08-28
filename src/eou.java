import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class eou extends epb {
   public final axj<dhj> a;
   public static final MapCodec<eou> b = axj.b(lv.f).xmap(eou::new, $$0 -> $$0.a).fieldOf("value");

   public eou(axj<dhj> $$0) {
      this.a = $$0;
   }

   @Nullable
   @Override
   public epe.c a(dej $$0, je $$1, je $$2, epe.c $$3, epe.c $$4, epa $$5) {
      return edq.a(this.a).test($$0.a_($$4.a())) ? $$4 : null;
   }

   @Override
   protected epd<?> a() {
      return epd.n;
   }
}
