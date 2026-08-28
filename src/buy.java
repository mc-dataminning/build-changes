import com.mojang.serialization.Codec;
import java.util.HashMap;
import java.util.Map;

public record buy(Map<bvj, Float> f) {
   public static final float a = 0.085F;
   public static final float b = 1.0F;
   public static final int c = 2;
   public static final buy d = new buy(af.a(bvj.class, $$0 -> 0.085F));
   public static final Codec<buy> e = Codec.unboundedMap(bvj.k, ayi.n).xmap(buy::b, buy::a).xmap(buy::new, buy::a);

   private static Map<bvj, Float> a(Map<bvj, Float> $$0) {
      Map<bvj, Float> $$1 = new HashMap<>($$0);
      $$1.values().removeIf($$0x -> $$0x == 0.085F);
      return $$1;
   }

   private static Map<bvj, Float> b(Map<bvj, Float> $$0) {
      return af.a(bvj.class, $$1 -> $$0.getOrDefault($$1, 0.085F));
   }

   public buy a(bvj $$0) {
      return this.a($$0, 2.0F);
   }

   public buy a(bvj $$0, float $$1) {
      if ($$1 < 0.0F) {
         throw new IllegalArgumentException("Tried to set invalid equipment chance " + $$1 + " for " + $$0);
      } else {
         return this.b($$0) == $$1 ? this : new buy(af.a(bvj.class, $$2 -> $$2 == $$0 ? $$1 : this.b($$2)));
      }
   }

   public float b(bvj $$0) {
      return this.f.getOrDefault($$0, 0.085F);
   }

   public boolean c(bvj $$0) {
      return this.b($$0) > 1.0F;
   }

   public Map<bvj, Float> a() {
      return this.f;
   }
}
