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

public record eto(Map<String, eqi> b, eqj.b c) implements ett {
   public static final MapCodec<eto> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.unboundedMap(Codec.STRING, eqi.a).fieldOf("scores").forGetter(eto::c), eqj.b.e.fieldOf("entity").forGetter(eto::d))
            .apply($$0, eto::new)
   );

   @Override
   public etu b() {
      return etv.j;
   }

   @Override
   public Set<etc<?>> a() {
      return Stream.concat(Stream.of(this.c.a()), this.b.values().stream().flatMap($$0 -> $$0.a().stream())).collect(ImmutableSet.toImmutableSet());
   }

   public boolean a(eqj $$0) {
      bsv $$1 = $$0.c(this.c.a());
      if ($$1 == null) {
         return false;
      } else {
         eww $$2 = $$0.d().f();

         for (Entry<String, eqi> $$3 : this.b.entrySet()) {
            if (!this.a($$0, $$1, $$2, $$3.getKey(), $$3.getValue())) {
               return false;
            }
         }

         return true;
      }
   }

   protected boolean a(eqj $$0, bsv $$1, eww $$2, String $$3, eqi $$4) {
      ewo $$5 = $$2.a($$3);
      if ($$5 == null) {
         return false;
      } else {
         ews $$6 = $$2.d($$1, $$5);
         return $$6 == null ? false : $$4.b($$0, $$6.a());
      }
   }

   public static eto.a a(eqj.b $$0) {
      return new eto.a($$0);
   }

   public Map<String, eqi> c() {
      return this.b;
   }

   public eqj.b d() {
      return this.c;
   }

   public static class a implements ett.a {
      private final Builder<String, eqi> a = ImmutableMap.builder();
      private final eqj.b b;

      public a(eqj.b $$0) {
         this.b = $$0;
      }

      public eto.a a(String $$0, eqi $$1) {
         this.a.put($$0, $$1);
         return this;
      }

      @Override
      public ett build() {
         return new eto(this.a.build(), this.b);
      }
   }
}
