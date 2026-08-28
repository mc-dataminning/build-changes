import com.mojang.serialization.Codec;
import java.util.EnumMap;
import java.util.Map;
import java.util.Objects;
import java.util.Map.Entry;

public class bxi {
   public static final Codec<bxi> a = Codec.unboundedMap(bxo.l, dak.b).xmap($$0 -> {
      EnumMap<bxo, dak> $$1 = new EnumMap<>(bxo.class);
      $$1.putAll($$0);
      return new bxi($$1);
   }, $$0 -> {
      Map<bxo, dak> $$1 = new EnumMap<>($$0.b);
      $$1.values().removeIf(dak::f);
      return $$1;
   });
   private final EnumMap<bxo, dak> b;

   private bxi(EnumMap<bxo, dak> $$0) {
      this.b = $$0;
   }

   public bxi() {
      this(new EnumMap<>(bxo.class));
   }

   public dak a(bxo $$0, dak $$1) {
      $$1.h().l($$1);
      return Objects.requireNonNullElse(this.b.put($$0, $$1), dak.l);
   }

   public dak a(bxo $$0) {
      return this.b.getOrDefault($$0, dak.l);
   }

   public boolean a() {
      for (dak $$0 : this.b.values()) {
         if (!$$0.f()) {
            return false;
         }
      }

      return true;
   }

   public void a(bxe $$0) {
      for (Entry<bxo, dak> $$1 : this.b.entrySet()) {
         dak $$2 = $$1.getValue();
         if (!$$2.f()) {
            $$2.a($$0.dV(), $$0, $$1.getKey());
         }
      }
   }

   public void a(bxi $$0) {
      this.b.clear();
      this.b.putAll($$0.b);
   }

   public void a(byf $$0) {
      for (dak $$1 : this.b.values()) {
         $$0.a($$1, true, false);
      }

      this.b();
   }

   public void b() {
      this.b.replaceAll(($$0, $$1) -> dak.l);
   }
}
