import com.mojang.serialization.Codec;
import java.util.HashMap;
import java.util.Map;

public record bxc(Map<bxo, Float> f) {
   public static final float a = 0.085F;
   public static final float b = 1.0F;
   public static final int c = 2;
   public static final bxc d = new bxc(ag.a(bxo.class, $$0 -> 0.085F));
   public static final Codec<bxc> e = Codec.unboundedMap(bxo.l, azg.n).xmap(bxc::b, bxc::a).xmap(bxc::new, bxc::a);

   private static Map<bxo, Float> a(Map<bxo, Float> $$0) {
      Map<bxo, Float> $$1 = new HashMap<>($$0);
      $$1.values().removeIf($$0x -> $$0x == 0.085F);
      return $$1;
   }

   private static Map<bxo, Float> b(Map<bxo, Float> $$0) {
      return ag.a(bxo.class, $$1 -> $$0.getOrDefault($$1, 0.085F));
   }

   public bxc a(bxo $$0) {
      return this.a($$0, 2.0F);
   }

   public bxc a(bxo $$0, float $$1) {
      if ($$1 < 0.0F) {
         throw new IllegalArgumentException("Tried to set invalid equipment chance " + $$1 + " for " + $$0);
      } else {
         return this.b($$0) == $$1 ? this : new bxc(ag.a(bxo.class, $$2 -> $$2 == $$0 ? $$1 : this.b($$2)));
      }
   }

   public float b(bxo $$0) {
      return this.f.getOrDefault($$0, 0.085F);
   }

   public boolean c(bxo $$0) {
      return this.b($$0) > 1.0F;
   }

   public Map<bxo, Float> a() {
      return this.f;
   }
}
