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

public record euc(Map<String, eqv> b, eqw.b c) implements euh {
   public static final MapCodec<euc> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.unboundedMap(Codec.STRING, eqv.a).fieldOf("scores").forGetter(euc::c), eqw.b.e.fieldOf("entity").forGetter(euc::d))
            .apply($$0, euc::new)
   );

   @Override
   public eui b() {
      return euj.h;
   }

   @Override
   public Set<etp<?>> a() {
      return Stream.concat(Stream.of(this.c.a()), this.b.values().stream().flatMap($$0 -> $$0.a().stream())).collect(ImmutableSet.toImmutableSet());
   }

   public boolean a(eqw $$0) {
      bsh $$1 = $$0.c(this.c.a());
      if ($$1 == null) {
         return false;
      } else {
         exl $$2 = $$0.d().f();

         for (Entry<String, eqv> $$3 : this.b.entrySet()) {
            if (!this.a($$0, $$1, $$2, $$3.getKey(), $$3.getValue())) {
               return false;
            }
         }

         return true;
      }
   }

   protected boolean a(eqw $$0, bsh $$1, exl $$2, String $$3, eqv $$4) {
      exd $$5 = $$2.a($$3);
      if ($$5 == null) {
         return false;
      } else {
         exh $$6 = $$2.d($$1, $$5);
         return $$6 == null ? false : $$4.b($$0, $$6.a());
      }
   }

   public static euc.a a(eqw.b $$0) {
      return new euc.a($$0);
   }

   public Map<String, eqv> c() {
      return this.b;
   }

   public eqw.b d() {
      return this.c;
   }

   public static class a implements euh.a {
      private final Builder<String, eqv> a = ImmutableMap.builder();
      private final eqw.b b;

      public a(eqw.b $$0) {
         this.b = $$0;
      }

      public euc.a a(String $$0, eqv $$1) {
         this.a.put($$0, $$1);
         return this;
      }

      @Override
      public euh build() {
         return new euc(this.a.build(), this.b);
      }
   }
}
