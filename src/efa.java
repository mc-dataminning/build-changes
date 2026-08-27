import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.stream.Stream;

public record efa(Map<String, ecf> b, ecg.b c) implements eff {
   public static final Codec<efa> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.unboundedMap(Codec.STRING, ecf.a).fieldOf("scores").forGetter(efa::c), ecg.b.e.fieldOf("entity").forGetter(efa::d))
            .apply($$0, efa::new)
   );

   @Override
   public efg b() {
      return efh.i;
   }

   @Override
   public Set<eeo<?>> a() {
      return Stream.concat(Stream.of(this.c.a()), this.b.values().stream().flatMap($$0 -> $$0.a().stream())).collect(ImmutableSet.toImmutableSet());
   }

   public boolean a(ecg $$0) {
      bii $$1 = $$0.c(this.c.a());
      if ($$1 == null) {
         return false;
      } else {
         eic $$2 = $$1.dK().I();

         for (Entry<String, ecf> $$3 : this.b.entrySet()) {
            if (!this.a($$0, $$1, $$2, $$3.getKey(), $$3.getValue())) {
               return false;
            }
         }

         return true;
      }
   }

   protected boolean a(ecg $$0, bii $$1, eic $$2, String $$3, ecf $$4) {
      ehz $$5 = $$2.b($$3);
      if ($$5 == null) {
         return false;
      } else {
         String $$6 = $$1.cx();
         return !$$2.b($$6, $$5) ? false : $$4.b($$0, $$2.c($$6, $$5).b());
      }
   }

   public static efa.a a(ecg.b $$0) {
      return new efa.a($$0);
   }

   public Map<String, ecf> c() {
      return this.b;
   }

   public ecg.b d() {
      return this.c;
   }

   public static class a implements eff.a {
      private final Builder<String, ecf> a = ImmutableMap.builder();
      private final ecg.b b;

      public a(ecg.b $$0) {
         this.b = $$0;
      }

      public efa.a a(String $$0, ecf $$1) {
         this.a.put($$0, $$1);
         return this;
      }

      @Override
      public eff build() {
         return new efa(this.a.build(), this.b);
      }
   }
}
