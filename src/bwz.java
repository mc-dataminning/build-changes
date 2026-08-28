import com.mojang.serialization.Codec;
import java.util.EnumMap;
import java.util.Map;
import java.util.Objects;
import java.util.Map.Entry;

public class bwz {
   public static final Codec<bwz> a = Codec.unboundedMap(bxf.l, daa.b).xmap($$0 -> {
      EnumMap<bxf, daa> $$1 = new EnumMap<>(bxf.class);
      $$1.putAll($$0);
      return new bwz($$1);
   }, $$0 -> {
      Map<bxf, daa> $$1 = new EnumMap<>($$0.b);
      $$1.values().removeIf(daa::f);
      return $$1;
   });
   private final EnumMap<bxf, daa> b;

   private bwz(EnumMap<bxf, daa> $$0) {
      this.b = $$0;
   }

   public bwz() {
      this(new EnumMap<>(bxf.class));
   }

   public daa a(bxf $$0, daa $$1) {
      $$1.h().l($$1);
      return Objects.requireNonNullElse(this.b.put($$0, $$1), daa.k);
   }

   public daa a(bxf $$0) {
      return this.b.getOrDefault($$0, daa.k);
   }

   public boolean a() {
      for (daa $$0 : this.b.values()) {
         if (!$$0.f()) {
            return false;
         }
      }

      return true;
   }

   public void a(bwv $$0) {
      for (Entry<bxf, daa> $$1 : this.b.entrySet()) {
         daa $$2 = $$1.getValue();
         if (!$$2.f()) {
            $$2.a($$0.dV(), $$0, $$1.getKey());
         }
      }
   }

   public void a(bwz $$0) {
      this.b.clear();
      this.b.putAll($$0.b);
   }

   public void a(bxw $$0) {
      for (daa $$1 : this.b.values()) {
         $$0.a($$1, true, false);
      }

      this.b();
   }

   public void b() {
      this.b.replaceAll(($$0, $$1) -> daa.k);
   }
}
