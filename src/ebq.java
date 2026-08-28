import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;

public class ebq extends ebp.a {
   public static final Codec<ebq> a = a(mh.e.q(), dno::m).stable();

   public ebq(dno $$0, Reference2ObjectArrayMap<ect<?>, Comparable<?>> $$1, MapCodec<ebq> $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected ebq B() {
      return this;
   }
}
