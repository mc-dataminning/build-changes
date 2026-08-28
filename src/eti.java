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

public record eti(Map<String, eqc> b, eqd.b c) implements etn {
   public static final MapCodec<eti> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.unboundedMap(Codec.STRING, eqc.a).fieldOf("scores").forGetter(eti::c), eqd.b.e.fieldOf("entity").forGetter(eti::d))
            .apply($$0, eti::new)
   );

   @Override
   public eto b() {
      return etp.j;
   }

   @Override
   public Set<esw<?>> a() {
      return Stream.concat(Stream.of(this.c.a()), this.b.values().stream().flatMap($$0 -> $$0.a().stream())).collect(ImmutableSet.toImmutableSet());
   }

   public boolean a(eqd $$0) {
      bsp $$1 = $$0.c(this.c.a());
      if ($$1 == null) {
         return false;
      } else {
         ewq $$2 = $$0.d().f();

         for (Entry<String, eqc> $$3 : this.b.entrySet()) {
            if (!this.a($$0, $$1, $$2, $$3.getKey(), $$3.getValue())) {
               return false;
            }
         }

         return true;
      }
   }

   protected boolean a(eqd $$0, bsp $$1, ewq $$2, String $$3, eqc $$4) {
      ewi $$5 = $$2.a($$3);
      if ($$5 == null) {
         return false;
      } else {
         ewm $$6 = $$2.d($$1, $$5);
         return $$6 == null ? false : $$4.b($$0, $$6.a());
      }
   }

   public static eti.a a(eqd.b $$0) {
      return new eti.a($$0);
   }

   public Map<String, eqc> c() {
      return this.b;
   }

   public eqd.b d() {
      return this.c;
   }

   public static class a implements etn.a {
      private final Builder<String, eqc> a = ImmutableMap.builder();
      private final eqd.b b;

      public a(eqd.b $$0) {
         this.b = $$0;
      }

      public eti.a a(String $$0, eqc $$1) {
         this.a.put($$0, $$1);
         return this;
      }

      @Override
      public etn build() {
         return new eti(this.a.build(), this.b);
      }
   }
}
