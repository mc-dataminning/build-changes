import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class ely extends emf {
   public final axe<dex> a;
   public static final MapCodec<ely> b = axe.b(lq.f).xmap(ely::new, $$0 -> $$0.a).fieldOf("value");

   public ely(axe<dex> $$0) {
      this.a = $$0;
   }

   @Nullable
   @Override
   public emi.c a(dbz $$0, iz $$1, iz $$2, emi.c $$3, emi.c $$4, eme $$5) {
      return eaw.a(this.a).test($$0.a_($$4.a())) ? $$4 : null;
   }

   @Override
   protected emh<?> a() {
      return emh.n;
   }
}
