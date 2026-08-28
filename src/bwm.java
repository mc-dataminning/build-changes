import com.mojang.serialization.Codec;
import java.util.EnumMap;
import java.util.Map;
import java.util.Objects;
import java.util.Map.Entry;

public class bwm {
   public static final Codec<bwm> a = Codec.unboundedMap(bws.l, czn.b).xmap($$0 -> {
      EnumMap<bws, czn> $$1 = new EnumMap<>(bws.class);
      $$1.putAll($$0);
      return new bwm($$1);
   }, $$0 -> {
      Map<bws, czn> $$1 = new EnumMap<>($$0.b);
      $$1.values().removeIf(czn::f);
      return $$1;
   });
   private final EnumMap<bws, czn> b;

   private bwm(EnumMap<bws, czn> $$0) {
      this.b = $$0;
   }

   public bwm() {
      this(new EnumMap<>(bws.class));
   }

   public czn a(bws $$0, czn $$1) {
      $$1.h().l($$1);
      return Objects.requireNonNullElse(this.b.put($$0, $$1), czn.k);
   }

   public czn a(bws $$0) {
      return this.b.getOrDefault($$0, czn.k);
   }

   public boolean a() {
      for (czn $$0 : this.b.values()) {
         if (!$$0.f()) {
            return false;
         }
      }

      return true;
   }

   public void a(bwi $$0) {
      for (Entry<bws, czn> $$1 : this.b.entrySet()) {
         czn $$2 = $$1.getValue();
         if (!$$2.f()) {
            $$2.a($$0.dU(), $$0, $$1.getKey());
         }
      }
   }

   public void a(bwm $$0) {
      this.b.clear();
      this.b.putAll($$0.b);
   }

   public void a(bxj $$0) {
      for (czn $$1 : this.b.values()) {
         $$0.a($$1, true, false);
      }

      this.b();
   }

   public void b() {
      this.b.replaceAll(($$0, $$1) -> czn.k);
   }
}
