import com.mojang.serialization.Codec;
import java.util.HashMap;
import java.util.Map;

public record bwt(Map<bxf, Float> f) {
   public static final float a = 0.085F;
   public static final float b = 1.0F;
   public static final int c = 2;
   public static final bwt d = new bwt(ag.a(bxf.class, $$0 -> 0.085F));
   public static final Codec<bwt> e = Codec.unboundedMap(bxf.l, ayy.n).xmap(bwt::b, bwt::a).xmap(bwt::new, bwt::a);

   private static Map<bxf, Float> a(Map<bxf, Float> $$0) {
      Map<bxf, Float> $$1 = new HashMap<>($$0);
      $$1.values().removeIf($$0x -> $$0x == 0.085F);
      return $$1;
   }

   private static Map<bxf, Float> b(Map<bxf, Float> $$0) {
      return ag.a(bxf.class, $$1 -> $$0.getOrDefault($$1, 0.085F));
   }

   public bwt a(bxf $$0) {
      return this.a($$0, 2.0F);
   }

   public bwt a(bxf $$0, float $$1) {
      if ($$1 < 0.0F) {
         throw new IllegalArgumentException("Tried to set invalid equipment chance " + $$1 + " for " + $$0);
      } else {
         return this.b($$0) == $$1 ? this : new bwt(ag.a(bxf.class, $$2 -> $$2 == $$0 ? $$1 : this.b($$2)));
      }
   }

   public float b(bxf $$0) {
      return this.f.getOrDefault($$0, 0.085F);
   }

   public boolean c(bxf $$0) {
      return this.b($$0) > 1.0F;
   }

   public Map<bxf, Float> a() {
      return this.f;
   }
}
