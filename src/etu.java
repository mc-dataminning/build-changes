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

public record etu(Map<String, eqn> b, eqo.b c) implements etz {
   public static final MapCodec<etu> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.unboundedMap(Codec.STRING, eqn.a).fieldOf("scores").forGetter(etu::c), eqo.b.e.fieldOf("entity").forGetter(etu::d))
            .apply($$0, etu::new)
   );

   @Override
   public eua b() {
      return eub.h;
   }

   @Override
   public Set<eth<?>> a() {
      return Stream.concat(Stream.of(this.c.a()), this.b.values().stream().flatMap($$0 -> $$0.a().stream())).collect(ImmutableSet.toImmutableSet());
   }

   public boolean a(eqo $$0) {
      bsd $$1 = $$0.c(this.c.a());
      if ($$1 == null) {
         return false;
      } else {
         exd $$2 = $$0.d().f();

         for (Entry<String, eqn> $$3 : this.b.entrySet()) {
            if (!this.a($$0, $$1, $$2, $$3.getKey(), $$3.getValue())) {
               return false;
            }
         }

         return true;
      }
   }

   protected boolean a(eqo $$0, bsd $$1, exd $$2, String $$3, eqn $$4) {
      ewv $$5 = $$2.a($$3);
      if ($$5 == null) {
         return false;
      } else {
         ewz $$6 = $$2.d($$1, $$5);
         return $$6 == null ? false : $$4.b($$0, $$6.a());
      }
   }

   public static etu.a a(eqo.b $$0) {
      return new etu.a($$0);
   }

   public Map<String, eqn> c() {
      return this.b;
   }

   public eqo.b d() {
      return this.c;
   }

   public static class a implements etz.a {
      private final Builder<String, eqn> a = ImmutableMap.builder();
      private final eqo.b b;

      public a(eqo.b $$0) {
         this.b = $$0;
      }

      public etu.a a(String $$0, eqn $$1) {
         this.a.put($$0, $$1);
         return this;
      }

      @Override
      public etz build() {
         return new etu(this.a.build(), this.b);
      }
   }
}
