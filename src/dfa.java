import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class dfa extends dez.a {
   public static final Codec<dfa> b = a(jb.f.q(), csm::n).stable();

   public dfa(csm $$0, ImmutableMap<dgd<?>, Comparable<?>> $$1, MapCodec<dfa> $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected dfa x() {
      return this;
   }
}
