import com.mojang.serialization.Codec;
import java.util.EnumMap;
import java.util.Map;
import java.util.Objects;

public class bvw {
   public static final Codec<bvw> a = Codec.unboundedMap(bwc.l, cxy.b).xmap($$0 -> {
      EnumMap<bwc, cxy> $$1 = new EnumMap<>(bwc.class);
      $$1.putAll($$0);
      return new bvw($$1);
   }, $$0 -> {
      Map<bwc, cxy> $$1 = new EnumMap<>($$0.b);
      $$1.values().removeIf(cxy::f);
      return $$1;
   });
   private final EnumMap<bwc, cxy> b;

   private bvw(EnumMap<bwc, cxy> $$0) {
      this.b = $$0;
   }

   public bvw() {
      this(new EnumMap<>(bwc.class));
   }

   public cxy a(bwc $$0, cxy $$1) {
      return Objects.requireNonNullElse(this.b.put($$0, $$1), cxy.k);
   }

   public cxy a(bwc $$0) {
      return this.b.getOrDefault($$0, cxy.k);
   }

   public boolean a() {
      for (cxy $$0 : this.b.values()) {
         if (!$$0.f()) {
            return false;
         }
      }

      return true;
   }
}
