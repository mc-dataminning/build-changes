import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.stream.Stream;

public record eff(Map<String, eck> b, ecl.b c) implements efk {
   public static final Codec<eff> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.unboundedMap(Codec.STRING, eck.a).fieldOf("scores").forGetter(eff::c), ecl.b.e.fieldOf("entity").forGetter(eff::d))
            .apply($$0, eff::new)
   );

   @Override
   public efl b() {
      return efm.i;
   }

   @Override
   public Set<eet<?>> a() {
      return Stream.concat(Stream.of(this.c.a()), this.b.values().stream().flatMap($$0 -> $$0.a().stream())).collect(ImmutableSet.toImmutableSet());
   }

   public boolean a(ecl $$0) {
      bil $$1 = $$0.c(this.c.a());
      if ($$1 == null) {
         return false;
      } else {
         eih $$2 = $$1.dK().I();

         for (Entry<String, eck> $$3 : this.b.entrySet()) {
            if (!this.a($$0, $$1, $$2, $$3.getKey(), $$3.getValue())) {
               return false;
            }
         }

         return true;
      }
   }

   protected boolean a(ecl $$0, bil $$1, eih $$2, String $$3, eck $$4) {
      eie $$5 = $$2.b($$3);
      if ($$5 == null) {
         return false;
      } else {
         String $$6 = $$1.cx();
         return !$$2.b($$6, $$5) ? false : $$4.b($$0, $$2.c($$6, $$5).b());
      }
   }

   public static eff.a a(ecl.b $$0) {
      return new eff.a($$0);
   }

   public Map<String, eck> c() {
      return this.b;
   }

   public ecl.b d() {
      return this.c;
   }

   public static class a implements efk.a {
      private final Builder<String, eck> a = ImmutableMap.builder();
      private final ecl.b b;

      public a(ecl.b $$0) {
         this.b = $$0;
      }

      public eff.a a(String $$0, eck $$1) {
         this.a.put($$0, $$1);
         return this;
      }

      @Override
      public efk build() {
         return new eff(this.a.build(), this.b);
      }
   }
}
