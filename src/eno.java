import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.stream.Stream;

public record eno(Map<String, ekt> b, eku.b c) implements ent {
   public static final Codec<eno> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.unboundedMap(Codec.STRING, ekt.a).fieldOf("scores").forGetter(eno::c), eku.b.e.fieldOf("entity").forGetter(eno::d))
            .apply($$0, eno::new)
   );

   @Override
   public enu b() {
      return env.i;
   }

   @Override
   public Set<enc<?>> a() {
      return Stream.concat(Stream.of(this.c.a()), this.b.values().stream().flatMap($$0 -> $$0.a().stream())).collect(ImmutableSet.toImmutableSet());
   }

   public boolean a(eku $$0) {
      bow $$1 = $$0.c(this.c.a());
      if ($$1 == null) {
         return false;
      } else {
         eqv $$2 = $$0.d().f();

         for (Entry<String, ekt> $$3 : this.b.entrySet()) {
            if (!this.a($$0, $$1, $$2, $$3.getKey(), $$3.getValue())) {
               return false;
            }
         }

         return true;
      }
   }

   protected boolean a(eku $$0, bow $$1, eqv $$2, String $$3, ekt $$4) {
      eqn $$5 = $$2.a($$3);
      if ($$5 == null) {
         return false;
      } else {
         eqr $$6 = $$2.d($$1, $$5);
         return $$6 == null ? false : $$4.b($$0, $$6.a());
      }
   }

   public static eno.a a(eku.b $$0) {
      return new eno.a($$0);
   }

   public Map<String, ekt> c() {
      return this.b;
   }

   public eku.b d() {
      return this.c;
   }

   public static class a implements ent.a {
      private final Builder<String, ekt> a = ImmutableMap.builder();
      private final eku.b b;

      public a(eku.b $$0) {
         this.b = $$0;
      }

      public eno.a a(String $$0, ekt $$1) {
         this.a.put($$0, $$1);
         return this;
      }

      @Override
      public ent build() {
         return new eno(this.a.build(), this.b);
      }
   }
}
