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

public record evz(Map<String, ess> b, est.b c) implements ewe {
   public static final MapCodec<evz> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.unboundedMap(Codec.STRING, ess.a).fieldOf("scores").forGetter(evz::c), est.b.e.fieldOf("entity").forGetter(evz::d))
            .apply($$0, evz::new)
   );

   @Override
   public ewf b() {
      return ewg.h;
   }

   @Override
   public Set<evm<?>> a() {
      return Stream.concat(Stream.of(this.c.a()), this.b.values().stream().flatMap($$0 -> $$0.a().stream())).collect(ImmutableSet.toImmutableSet());
   }

   public boolean a(est $$0) {
      btj $$1 = $$0.c(this.c.a());
      if ($$1 == null) {
         return false;
      } else {
         ezi $$2 = $$0.d().f();

         for (Entry<String, ess> $$3 : this.b.entrySet()) {
            if (!this.a($$0, $$1, $$2, $$3.getKey(), $$3.getValue())) {
               return false;
            }
         }

         return true;
      }
   }

   protected boolean a(est $$0, btj $$1, ezi $$2, String $$3, ess $$4) {
      eza $$5 = $$2.a($$3);
      if ($$5 == null) {
         return false;
      } else {
         eze $$6 = $$2.d($$1, $$5);
         return $$6 == null ? false : $$4.b($$0, $$6.a());
      }
   }

   public static evz.a a(est.b $$0) {
      return new evz.a($$0);
   }

   public Map<String, ess> c() {
      return this.b;
   }

   public est.b d() {
      return this.c;
   }

   public static class a implements ewe.a {
      private final Builder<String, ess> a = ImmutableMap.builder();
      private final est.b b;

      public a(est.b $$0) {
         this.b = $$0;
      }

      public evz.a a(String $$0, ess $$1) {
         this.a.put($$0, $$1);
         return this;
      }

      @Override
      public ewe build() {
         return new evz(this.a.build(), this.b);
      }
   }
}
