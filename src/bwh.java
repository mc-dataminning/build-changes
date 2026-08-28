import com.mojang.serialization.Codec;
import java.util.EnumMap;
import java.util.Map;
import java.util.Objects;

public class bwh {
   public static final Codec<bwh> a = Codec.unboundedMap(bwn.l, cyy.b).xmap($$0 -> {
      EnumMap<bwn, cyy> $$1 = new EnumMap<>(bwn.class);
      $$1.putAll($$0);
      return new bwh($$1);
   }, $$0 -> {
      Map<bwn, cyy> $$1 = new EnumMap<>($$0.b);
      $$1.values().removeIf(cyy::f);
      return $$1;
   });
   private final EnumMap<bwn, cyy> b;

   private bwh(EnumMap<bwn, cyy> $$0) {
      this.b = $$0;
   }

   public bwh() {
      this(new EnumMap<>(bwn.class));
   }

   public cyy a(bwn $$0, cyy $$1) {
      return Objects.requireNonNullElse(this.b.put($$0, $$1), cyy.k);
   }

   public cyy a(bwn $$0) {
      return this.b.getOrDefault($$0, cyy.k);
   }

   public boolean a() {
      for (cyy $$0 : this.b.values()) {
         if (!$$0.f()) {
            return false;
         }
      }

      return true;
   }
}
