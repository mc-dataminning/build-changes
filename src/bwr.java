import com.mojang.serialization.Codec;
import java.util.HashMap;
import java.util.Map;

public record bwr(Map<bxd, Float> f) {
   public static final float a = 0.085F;
   public static final float b = 1.0F;
   public static final int c = 2;
   public static final bwr d = new bwr(ag.a(bxd.class, $$0 -> 0.085F));
   public static final Codec<bwr> e = Codec.unboundedMap(bxd.l, ayw.n).xmap(bwr::b, bwr::a).xmap(bwr::new, bwr::a);

   private static Map<bxd, Float> a(Map<bxd, Float> $$0) {
      Map<bxd, Float> $$1 = new HashMap<>($$0);
      $$1.values().removeIf($$0x -> $$0x == 0.085F);
      return $$1;
   }

   private static Map<bxd, Float> b(Map<bxd, Float> $$0) {
      return ag.a(bxd.class, $$1 -> $$0.getOrDefault($$1, 0.085F));
   }

   public bwr a(bxd $$0) {
      return this.a($$0, 2.0F);
   }

   public bwr a(bxd $$0, float $$1) {
      if ($$1 < 0.0F) {
         throw new IllegalArgumentException("Tried to set invalid equipment chance " + $$1 + " for " + $$0);
      } else {
         return this.b($$0) == $$1 ? this : new bwr(ag.a(bxd.class, $$2 -> $$2 == $$0 ? $$1 : this.b($$2)));
      }
   }

   public float b(bxd $$0) {
      return this.f.getOrDefault($$0, 0.085F);
   }

   public boolean c(bxd $$0) {
      return this.b($$0) > 1.0F;
   }

   public Map<bxd, Float> a() {
      return this.f;
   }
}
