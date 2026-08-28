import com.mojang.serialization.Codec;
import java.util.HashMap;
import java.util.Map;

public record bwg(Map<bws, Float> f) {
   public static final float a = 0.085F;
   public static final float b = 1.0F;
   public static final int c = 2;
   public static final bwg d = new bwg(ag.a(bws.class, $$0 -> 0.085F));
   public static final Codec<bwg> e = Codec.unboundedMap(bws.l, ayu.n).xmap(bwg::b, bwg::a).xmap(bwg::new, bwg::a);

   private static Map<bws, Float> a(Map<bws, Float> $$0) {
      Map<bws, Float> $$1 = new HashMap<>($$0);
      $$1.values().removeIf($$0x -> $$0x == 0.085F);
      return $$1;
   }

   private static Map<bws, Float> b(Map<bws, Float> $$0) {
      return ag.a(bws.class, $$1 -> $$0.getOrDefault($$1, 0.085F));
   }

   public bwg a(bws $$0) {
      return this.a($$0, 2.0F);
   }

   public bwg a(bws $$0, float $$1) {
      if ($$1 < 0.0F) {
         throw new IllegalArgumentException("Tried to set invalid equipment chance " + $$1 + " for " + $$0);
      } else {
         return this.b($$0) == $$1 ? this : new bwg(ag.a(bws.class, $$2 -> $$2 == $$0 ? $$1 : this.b($$2)));
      }
   }

   public float b(bws $$0) {
      return this.f.getOrDefault($$0, 0.085F);
   }

   public boolean c(bws $$0) {
      return this.b($$0) > 1.0F;
   }

   public Map<bws, Float> a() {
      return this.f;
   }
}
