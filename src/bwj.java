import com.mojang.serialization.Codec;
import java.util.EnumMap;
import java.util.Map;
import java.util.Objects;
import java.util.Map.Entry;

public class bwj {
   public static final Codec<bwj> a = Codec.unboundedMap(bwp.l, czd.b).xmap($$0 -> {
      EnumMap<bwp, czd> $$1 = new EnumMap<>(bwp.class);
      $$1.putAll($$0);
      return new bwj($$1);
   }, $$0 -> {
      Map<bwp, czd> $$1 = new EnumMap<>($$0.b);
      $$1.values().removeIf(czd::f);
      return $$1;
   });
   private final EnumMap<bwp, czd> b;

   private bwj(EnumMap<bwp, czd> $$0) {
      this.b = $$0;
   }

   public bwj() {
      this(new EnumMap<>(bwp.class));
   }

   public czd a(bwp $$0, czd $$1) {
      $$1.h().l($$1);
      return Objects.requireNonNullElse(this.b.put($$0, $$1), czd.k);
   }

   public czd a(bwp $$0) {
      return this.b.getOrDefault($$0, czd.k);
   }

   public boolean a() {
      for (czd $$0 : this.b.values()) {
         if (!$$0.f()) {
            return false;
         }
      }

      return true;
   }

   public void a(bwf $$0) {
      for (Entry<bwp, czd> $$1 : this.b.entrySet()) {
         czd $$2 = $$1.getValue();
         if (!$$2.f()) {
            $$2.a($$0.dV(), $$0, $$1.getKey());
         }
      }
   }

   public void a(bwj $$0) {
      this.b.clear();
      this.b.putAll($$0.b);
   }

   public void a(bxe $$0) {
      for (czd $$1 : this.b.values()) {
         $$0.a($$1, true, false);
      }

      this.b();
   }

   public void b() {
      this.b.replaceAll(($$0, $$1) -> czd.k);
   }
}
