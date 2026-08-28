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

public record ezn(Map<String, ewg> b, ewh.b c) implements ezs {
   public static final MapCodec<ezn> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.unboundedMap(Codec.STRING, ewg.a).fieldOf("scores").forGetter(ezn::c), ewh.b.e.fieldOf("entity").forGetter(ezn::d))
            .apply($$0, ezn::new)
   );

   @Override
   public ezt b() {
      return ezu.h;
   }

   @Override
   public Set<eza<?>> a() {
      return Stream.concat(Stream.of(this.c.a()), this.b.values().stream().flatMap($$0 -> $$0.a().stream())).collect(ImmutableSet.toImmutableSet());
   }

   public boolean a(ewh $$0) {
      bvf $$1 = $$0.c(this.c.a());
      if ($$1 == null) {
         return false;
      } else {
         fcx $$2 = $$0.d().g();

         for (Entry<String, ewg> $$3 : this.b.entrySet()) {
            if (!this.a($$0, $$1, $$2, $$3.getKey(), $$3.getValue())) {
               return false;
            }
         }

         return true;
      }
   }

   protected boolean a(ewh $$0, bvf $$1, fcx $$2, String $$3, ewg $$4) {
      fcp $$5 = $$2.a($$3);
      if ($$5 == null) {
         return false;
      } else {
         fct $$6 = $$2.d($$1, $$5);
         return $$6 == null ? false : $$4.b($$0, $$6.a());
      }
   }

   public static ezn.a a(ewh.b $$0) {
      return new ezn.a($$0);
   }

   public Map<String, ewg> c() {
      return this.b;
   }

   public ewh.b d() {
      return this.c;
   }

   public static class a implements ezs.a {
      private final Builder<String, ewg> a = ImmutableMap.builder();
      private final ewh.b b;

      public a(ewh.b $$0) {
         this.b = $$0;
      }

      public ezn.a a(String $$0, ewg $$1) {
         this.a.put($$0, $$1);
         return this;
      }

      @Override
      public ezs build() {
         return new ezn(this.a.build(), this.b);
      }
   }
}
