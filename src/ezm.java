import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.stream.Stream;

public record ezm(Map<String, ewh> b, ewi.b c) implements ezr {
   public static final MapCodec<ezm> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.unboundedMap(Codec.STRING, ewh.a).fieldOf("scores").forGetter(ezm::c), ewi.b.e.fieldOf("entity").forGetter(ezm::d))
            .apply($$0, ezm::new)
   );

   @Override
   public ezs b() {
      return ezt.h;
   }

   @Override
   public Set<bbd<?>> a() {
      return Stream.concat(Stream.of(this.c.a()), this.b.values().stream().flatMap($$0 -> $$0.a().stream())).collect(ImmutableSet.toImmutableSet());
   }

   public boolean a(ewi $$0) {
      bvb $$1 = $$0.c(this.c.a());
      if ($$1 == null) {
         return false;
      } else {
         fcw $$2 = $$0.d().g();

         for (Entry<String, ewh> $$3 : this.b.entrySet()) {
            if (!this.a($$0, $$1, $$2, $$3.getKey(), $$3.getValue())) {
               return false;
            }
         }

         return true;
      }
   }

   protected boolean a(ewi $$0, bvb $$1, fcw $$2, String $$3, ewh $$4) {
      fco $$5 = $$2.a($$3);
      if ($$5 == null) {
         return false;
      } else {
         fcs $$6 = $$2.d($$1, $$5);
         return $$6 == null ? false : $$4.b($$0, $$6.a());
      }
   }

   public static ezm.a a(ewi.b $$0) {
      return new ezm.a($$0);
   }

   public Map<String, ewh> c() {
      return this.b;
   }

   public ewi.b d() {
      return this.c;
   }

   public static class a implements ezr.a {
      private final Builder<String, ewh> a = ImmutableMap.builder();
      private final ewi.b b;

      public a(ewi.b $$0) {
         this.b = $$0;
      }

      public ezm.a a(String $$0, ewh $$1) {
         this.a.put($$0, $$1);
         return this;
      }

      @Override
      public ezr build() {
         return new ezm(this.a.build(), this.b);
      }
   }
}
