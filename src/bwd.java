import com.mojang.serialization.Codec;
import java.util.HashMap;
import java.util.Map;

public record bwd(Map<bwp, Float> f) {
   public static final float a = 0.085F;
   public static final float b = 1.0F;
   public static final int c = 2;
   public static final bwd d = new bwd(af.a(bwp.class, $$0 -> 0.085F));
   public static final Codec<bwd> e = Codec.unboundedMap(bwp.l, ayu.n).xmap(bwd::b, bwd::a).xmap(bwd::new, bwd::a);

   private static Map<bwp, Float> a(Map<bwp, Float> $$0) {
      Map<bwp, Float> $$1 = new HashMap<>($$0);
      $$1.values().removeIf($$0x -> $$0x == 0.085F);
      return $$1;
   }

   private static Map<bwp, Float> b(Map<bwp, Float> $$0) {
      return af.a(bwp.class, $$1 -> $$0.getOrDefault($$1, 0.085F));
   }

   public bwd a(bwp $$0) {
      return this.a($$0, 2.0F);
   }

   public bwd a(bwp $$0, float $$1) {
      if ($$1 < 0.0F) {
         throw new IllegalArgumentException("Tried to set invalid equipment chance " + $$1 + " for " + $$0);
      } else {
         return this.b($$0) == $$1 ? this : new bwd(af.a(bwp.class, $$2 -> $$2 == $$0 ? $$1 : this.b($$2)));
      }
   }

   public float b(bwp $$0) {
      return this.f.getOrDefault($$0, 0.085F);
   }

   public boolean c(bwp $$0) {
      return this.b($$0) > 1.0F;
   }

   public Map<bwp, Float> a() {
      return this.f;
   }
}
