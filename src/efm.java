import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.stream.Stream;

public record efm(Map<String, ecr> b, ecs.b c) implements efr {
   public static final Codec<efm> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.unboundedMap(Codec.STRING, ecr.a).fieldOf("scores").forGetter(efm::c), ecs.b.e.fieldOf("entity").forGetter(efm::d))
            .apply($$0, efm::new)
   );

   @Override
   public efs b() {
      return eft.i;
   }

   @Override
   public Set<efa<?>> a() {
      return Stream.concat(Stream.of(this.c.a()), this.b.values().stream().flatMap($$0 -> $$0.a().stream())).collect(ImmutableSet.toImmutableSet());
   }

   public boolean a(ecs $$0) {
      bis $$1 = $$0.c(this.c.a());
      if ($$1 == null) {
         return false;
      } else {
         eio $$2 = $$1.dL().I();

         for (Entry<String, ecr> $$3 : this.b.entrySet()) {
            if (!this.a($$0, $$1, $$2, $$3.getKey(), $$3.getValue())) {
               return false;
            }
         }

         return true;
      }
   }

   protected boolean a(ecs $$0, bis $$1, eio $$2, String $$3, ecr $$4) {
      eil $$5 = $$2.b($$3);
      if ($$5 == null) {
         return false;
      } else {
         String $$6 = $$1.cx();
         return !$$2.b($$6, $$5) ? false : $$4.b($$0, $$2.c($$6, $$5).b());
      }
   }

   public static efm.a a(ecs.b $$0) {
      return new efm.a($$0);
   }

   public Map<String, ecr> c() {
      return this.b;
   }

   public ecs.b d() {
      return this.c;
   }

   public static class a implements efr.a {
      private final Builder<String, ecr> a = ImmutableMap.builder();
      private final ecs.b b;

      public a(ecs.b $$0) {
         this.b = $$0;
      }

      public efm.a a(String $$0, ecr $$1) {
         this.a.put($$0, $$1);
         return this;
      }

      @Override
      public efr build() {
         return new efm(this.a.build(), this.b);
      }
   }
}
