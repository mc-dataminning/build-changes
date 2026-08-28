import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class emb extends emi {
   public final axf<dfa> a;
   public static final MapCodec<emb> b = axf.b(lq.f).xmap(emb::new, $$0 -> $$0.a).fieldOf("value");

   public emb(axf<dfa> $$0) {
      this.a = $$0;
   }

   @Nullable
   @Override
   public eml.c a(dcc $$0, iz $$1, iz $$2, eml.c $$3, eml.c $$4, emh $$5) {
      return eaz.a(this.a).test($$0.a_($$4.a())) ? $$4 : null;
   }

   @Override
   protected emk<?> a() {
      return emk.n;
   }
}
