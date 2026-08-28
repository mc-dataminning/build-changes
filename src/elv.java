import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class elv extends emc {
   public final axb<deu> a;
   public static final MapCodec<elv> b = axb.b(lq.f).xmap(elv::new, $$0 -> $$0.a).fieldOf("value");

   public elv(axb<deu> $$0) {
      this.a = $$0;
   }

   @Nullable
   @Override
   public emf.c a(dbw $$0, iz $$1, iz $$2, emf.c $$3, emf.c $$4, emb $$5) {
      return eat.a(this.a).test($$0.a_($$4.a())) ? $$4 : null;
   }

   @Override
   protected eme<?> a() {
      return eme.n;
   }
}
