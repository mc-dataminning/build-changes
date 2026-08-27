import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import java.util.Set;

public class emf implements emb {
   private static final emf b = new emf();
   public static final Codec<emf> a = Codec.unit(b);

   private emf() {
   }

   @Override
   public emc b() {
      return emd.h;
   }

   @Override
   public Set<elk<?>> a() {
      return ImmutableSet.of(eln.b);
   }

   public boolean a(ejc $$0) {
      return $$0.a(eln.b);
   }

   public static emb.a c() {
      return () -> b;
   }
}
