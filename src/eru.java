import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class eru extends esb {
   public final ayk<dke> a;
   public static final MapCodec<eru> b = ayk.b(mb.f).xmap(eru::new, $$0 -> $$0.a).fieldOf("value");

   public eru(ayk<dke> $$0) {
      this.a = $$0;
   }

   @Nullable
   @Override
   public ese.d a(dhd $$0, jh $$1, jh $$2, ese.d $$3, ese.d $$4, esa $$5) {
      return ego.a(this.a).test($$0.a_($$4.a())) ? $$4 : null;
   }

   @Override
   protected esd<?> a() {
      return esd.n;
   }
}
