import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public class ede extends edl {
   public final asx<cwy> a;
   public static final Codec<ede> b = asx.b(ke.f).xmap(ede::new, $$0 -> $$0.a);

   public ede(asx<cwy> $$0) {
      this.a = $$0;
   }

   @Nullable
   @Override
   public edo.c a(cua $$0, hx $$1, hx $$2, edo.c $$3, edo.c $$4, edk $$5) {
      return dsc.a(this.a).test($$0.a_($$4.a())) ? $$4 : null;
   }

   @Override
   protected edn<?> a() {
      return edn.n;
   }
}
