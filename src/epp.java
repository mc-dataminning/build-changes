import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class epp extends epw {
   public final axq<die> a;
   public static final MapCodec<epp> b = axq.b(lz.f).xmap(epp::new, $$0 -> $$0.a).fieldOf("value");

   public epp(axq<die> $$0) {
      this.a = $$0;
   }

   @Nullable
   @Override
   public epz.c a(dfe $$0, jh $$1, jh $$2, epz.c $$3, epz.c $$4, epv $$5) {
      return eel.a(this.a).test($$0.a_($$4.a())) ? $$4 : null;
   }

   @Override
   protected epy<?> a() {
      return epy.n;
   }
}
