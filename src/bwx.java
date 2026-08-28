import com.mojang.serialization.Codec;
import java.util.EnumMap;
import java.util.Map;
import java.util.Objects;
import java.util.Map.Entry;

public class bwx {
   public static final Codec<bwx> a = Codec.unboundedMap(bxd.l, czy.b).xmap($$0 -> {
      EnumMap<bxd, czy> $$1 = new EnumMap<>(bxd.class);
      $$1.putAll($$0);
      return new bwx($$1);
   }, $$0 -> {
      Map<bxd, czy> $$1 = new EnumMap<>($$0.b);
      $$1.values().removeIf(czy::f);
      return $$1;
   });
   private final EnumMap<bxd, czy> b;

   private bwx(EnumMap<bxd, czy> $$0) {
      this.b = $$0;
   }

   public bwx() {
      this(new EnumMap<>(bxd.class));
   }

   public czy a(bxd $$0, czy $$1) {
      $$1.h().l($$1);
      return Objects.requireNonNullElse(this.b.put($$0, $$1), czy.k);
   }

   public czy a(bxd $$0) {
      return this.b.getOrDefault($$0, czy.k);
   }

   public boolean a() {
      for (czy $$0 : this.b.values()) {
         if (!$$0.f()) {
            return false;
         }
      }

      return true;
   }

   public void a(bwt $$0) {
      for (Entry<bxd, czy> $$1 : this.b.entrySet()) {
         czy $$2 = $$1.getValue();
         if (!$$2.f()) {
            $$2.a($$0.dV(), $$0, $$1.getKey());
         }
      }
   }

   public void a(bwx $$0) {
      this.b.clear();
      this.b.putAll($$0.b);
   }

   public void a(bxu $$0) {
      for (czy $$1 : this.b.values()) {
         $$0.a($$1, true, false);
      }

      this.b();
   }

   public void b() {
      this.b.replaceAll(($$0, $$1) -> czy.k);
   }
}
