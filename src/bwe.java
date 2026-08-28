import com.mojang.serialization.Codec;
import java.util.EnumMap;
import java.util.Map;
import java.util.Objects;

public class bwe {
   public static final Codec<bwe> a = Codec.unboundedMap(bwk.l, cys.b).xmap($$0 -> {
      EnumMap<bwk, cys> $$1 = new EnumMap<>(bwk.class);
      $$1.putAll($$0);
      return new bwe($$1);
   }, $$0 -> {
      Map<bwk, cys> $$1 = new EnumMap<>($$0.b);
      $$1.values().removeIf(cys::f);
      return $$1;
   });
   private final EnumMap<bwk, cys> b;

   private bwe(EnumMap<bwk, cys> $$0) {
      this.b = $$0;
   }

   public bwe() {
      this(new EnumMap<>(bwk.class));
   }

   public cys a(bwk $$0, cys $$1) {
      return Objects.requireNonNullElse(this.b.put($$0, $$1), cys.k);
   }

   public cys a(bwk $$0) {
      return this.b.getOrDefault($$0, cys.k);
   }

   public boolean a() {
      for (cys $$0 : this.b.values()) {
         if (!$$0.f()) {
            return false;
         }
      }

      return true;
   }
}
