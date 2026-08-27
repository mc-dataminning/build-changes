import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.stream.Stream;

public record ehr(Map<String, eew> b, eex.b c) implements ehw {
   public static final Codec<ehr> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.unboundedMap(Codec.STRING, eew.a).fieldOf("scores").forGetter(ehr::c), eex.b.e.fieldOf("entity").forGetter(ehr::d))
            .apply($$0, ehr::new)
   );

   @Override
   public ehx b() {
      return ehy.i;
   }

   @Override
   public Set<ehf<?>> a() {
      return Stream.concat(Stream.of(this.c.a()), this.b.values().stream().flatMap($$0 -> $$0.a().stream())).collect(ImmutableSet.toImmutableSet());
   }

   public boolean a(eex $$0) {
      bkq $$1 = $$0.c(this.c.a());
      if ($$1 == null) {
         return false;
      } else {
         ekt $$2 = $$1.dN().J();

         for (Entry<String, eew> $$3 : this.b.entrySet()) {
            if (!this.a($$0, $$1, $$2, $$3.getKey(), $$3.getValue())) {
               return false;
            }
         }

         return true;
      }
   }

   protected boolean a(eex $$0, bkq $$1, ekt $$2, String $$3, eew $$4) {
      ekq $$5 = $$2.b($$3);
      if ($$5 == null) {
         return false;
      } else {
         String $$6 = $$1.cy();
         return !$$2.b($$6, $$5) ? false : $$4.b($$0, $$2.c($$6, $$5).b());
      }
   }

   public static ehr.a a(eex.b $$0) {
      return new ehr.a($$0);
   }

   public Map<String, eew> c() {
      return this.b;
   }

   public eex.b d() {
      return this.c;
   }

   public static class a implements ehw.a {
      private final Builder<String, eew> a = ImmutableMap.builder();
      private final eex.b b;

      public a(eex.b $$0) {
         this.b = $$0;
      }

      public ehr.a a(String $$0, eew $$1) {
         this.a.put($$0, $$1);
         return this;
      }

      @Override
      public ehw build() {
         return new ehr(this.a.build(), this.b);
      }
   }
}
