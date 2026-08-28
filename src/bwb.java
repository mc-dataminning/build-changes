import com.mojang.serialization.Codec;
import java.util.HashMap;
import java.util.Map;

public record bwb(Map<bwn, Float> f) {
   public static final float a = 0.085F;
   public static final float b = 1.0F;
   public static final int c = 2;
   public static final bwb d = new bwb(af.a(bwn.class, $$0 -> 0.085F));
   public static final Codec<bwb> e = Codec.unboundedMap(bwn.l, ayu.n).xmap(bwb::b, bwb::a).xmap(bwb::new, bwb::a);

   private static Map<bwn, Float> a(Map<bwn, Float> $$0) {
      Map<bwn, Float> $$1 = new HashMap<>($$0);
      $$1.values().removeIf($$0x -> $$0x == 0.085F);
      return $$1;
   }

   private static Map<bwn, Float> b(Map<bwn, Float> $$0) {
      return af.a(bwn.class, $$1 -> $$0.getOrDefault($$1, 0.085F));
   }

   public bwb a(bwn $$0) {
      return this.a($$0, 2.0F);
   }

   public bwb a(bwn $$0, float $$1) {
      if ($$1 < 0.0F) {
         throw new IllegalArgumentException("Tried to set invalid equipment chance " + $$1 + " for " + $$0);
      } else {
         return this.b($$0) == $$1 ? this : new bwb(af.a(bwn.class, $$2 -> $$2 == $$0 ? $$1 : this.b($$2)));
      }
   }

   public float b(bwn $$0) {
      return this.f.getOrDefault($$0, 0.085F);
   }

   public boolean c(bwn $$0) {
      return this.b($$0) > 1.0F;
   }

   public Map<bwn, Float> a() {
      return this.f;
   }
}
