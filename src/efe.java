import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.stream.Stream;

public record efe(Map<String, ecj> b, eck.b c) implements efj {
   public static final Codec<efe> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.unboundedMap(Codec.STRING, ecj.a).fieldOf("scores").forGetter(efe::c), eck.b.e.fieldOf("entity").forGetter(efe::d))
            .apply($$0, efe::new)
   );

   @Override
   public efk b() {
      return efl.i;
   }

   @Override
   public Set<ees<?>> a() {
      return Stream.concat(Stream.of(this.c.a()), this.b.values().stream().flatMap($$0 -> $$0.a().stream())).collect(ImmutableSet.toImmutableSet());
   }

   public boolean a(eck $$0) {
      biw $$1 = $$0.c(this.c.a());
      if ($$1 == null) {
         return false;
      } else {
         eig $$2 = $$1.dL().I();

         for (Entry<String, ecj> $$3 : this.b.entrySet()) {
            if (!this.a($$0, $$1, $$2, $$3.getKey(), $$3.getValue())) {
               return false;
            }
         }

         return true;
      }
   }

   protected boolean a(eck $$0, biw $$1, eig $$2, String $$3, ecj $$4) {
      eid $$5 = $$2.b($$3);
      if ($$5 == null) {
         return false;
      } else {
         String $$6 = $$1.cx();
         return !$$2.b($$6, $$5) ? false : $$4.b($$0, $$2.c($$6, $$5).b());
      }
   }

   public static efe.a a(eck.b $$0) {
      return new efe.a($$0);
   }

   public Map<String, ecj> c() {
      return this.b;
   }

   public eck.b d() {
      return this.c;
   }

   public static class a implements efj.a {
      private final Builder<String, ecj> a = ImmutableMap.builder();
      private final eck.b b;

      public a(eck.b $$0) {
         this.b = $$0;
      }

      public efe.a a(String $$0, ecj $$1) {
         this.a.put($$0, $$1);
         return this;
      }

      @Override
      public efj build() {
         return new efe(this.a.build(), this.b);
      }
   }
}
