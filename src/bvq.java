import com.mojang.serialization.Codec;
import java.util.HashMap;
import java.util.Map;

public record bvq(Map<bwc, Float> f) {
   public static final float a = 0.085F;
   public static final float b = 1.0F;
   public static final int c = 2;
   public static final bvq d = new bvq(af.a(bwc.class, $$0 -> 0.085F));
   public static final Codec<bvq> e = Codec.unboundedMap(bwc.l, ays.n).xmap(bvq::b, bvq::a).xmap(bvq::new, bvq::a);

   private static Map<bwc, Float> a(Map<bwc, Float> $$0) {
      Map<bwc, Float> $$1 = new HashMap<>($$0);
      $$1.values().removeIf($$0x -> $$0x == 0.085F);
      return $$1;
   }

   private static Map<bwc, Float> b(Map<bwc, Float> $$0) {
      return af.a(bwc.class, $$1 -> $$0.getOrDefault($$1, 0.085F));
   }

   public bvq a(bwc $$0) {
      return this.a($$0, 2.0F);
   }

   public bvq a(bwc $$0, float $$1) {
      if ($$1 < 0.0F) {
         throw new IllegalArgumentException("Tried to set invalid equipment chance " + $$1 + " for " + $$0);
      } else {
         return this.b($$0) == $$1 ? this : new bvq(af.a(bwc.class, $$2 -> $$2 == $$0 ? $$1 : this.b($$2)));
      }
   }

   public float b(bwc $$0) {
      return this.f.getOrDefault($$0, 0.085F);
   }

   public boolean c(bwc $$0) {
      return this.b($$0) > 1.0F;
   }

   public Map<bwc, Float> a() {
      return this.f;
   }
}
