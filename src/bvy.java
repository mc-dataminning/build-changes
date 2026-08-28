import com.mojang.serialization.Codec;
import java.util.HashMap;
import java.util.Map;

public record bvy(Map<bwk, Float> f) {
   public static final float a = 0.085F;
   public static final float b = 1.0F;
   public static final int c = 2;
   public static final bvy d = new bvy(af.a(bwk.class, $$0 -> 0.085F));
   public static final Codec<bvy> e = Codec.unboundedMap(bwk.l, ays.n).xmap(bvy::b, bvy::a).xmap(bvy::new, bvy::a);

   private static Map<bwk, Float> a(Map<bwk, Float> $$0) {
      Map<bwk, Float> $$1 = new HashMap<>($$0);
      $$1.values().removeIf($$0x -> $$0x == 0.085F);
      return $$1;
   }

   private static Map<bwk, Float> b(Map<bwk, Float> $$0) {
      return af.a(bwk.class, $$1 -> $$0.getOrDefault($$1, 0.085F));
   }

   public bvy a(bwk $$0) {
      return this.a($$0, 2.0F);
   }

   public bvy a(bwk $$0, float $$1) {
      if ($$1 < 0.0F) {
         throw new IllegalArgumentException("Tried to set invalid equipment chance " + $$1 + " for " + $$0);
      } else {
         return this.b($$0) == $$1 ? this : new bvy(af.a(bwk.class, $$2 -> $$2 == $$0 ? $$1 : this.b($$2)));
      }
   }

   public float b(bwk $$0) {
      return this.f.getOrDefault($$0, 0.085F);
   }

   public boolean c(bwk $$0) {
      return this.b($$0) > 1.0F;
   }

   public Map<bwk, Float> a() {
      return this.f;
   }
}
