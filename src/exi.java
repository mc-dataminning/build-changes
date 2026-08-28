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

public record exi(Map<String, eub> b, euc.b c) implements exn {
   public static final MapCodec<exi> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.unboundedMap(Codec.STRING, eub.a).fieldOf("scores").forGetter(exi::c), euc.b.e.fieldOf("entity").forGetter(exi::d))
            .apply($$0, exi::new)
   );

   @Override
   public exo b() {
      return exp.h;
   }

   @Override
   public Set<ewv<?>> a() {
      return Stream.concat(Stream.of(this.c.a()), this.b.values().stream().flatMap($$0 -> $$0.a().stream())).collect(ImmutableSet.toImmutableSet());
   }

   public boolean a(euc $$0) {
      bue $$1 = $$0.c(this.c.a());
      if ($$1 == null) {
         return false;
      } else {
         fas $$2 = $$0.d().f();

         for (Entry<String, eub> $$3 : this.b.entrySet()) {
            if (!this.a($$0, $$1, $$2, $$3.getKey(), $$3.getValue())) {
               return false;
            }
         }

         return true;
      }
   }

   protected boolean a(euc $$0, bue $$1, fas $$2, String $$3, eub $$4) {
      fak $$5 = $$2.a($$3);
      if ($$5 == null) {
         return false;
      } else {
         fao $$6 = $$2.d($$1, $$5);
         return $$6 == null ? false : $$4.b($$0, $$6.a());
      }
   }

   public static exi.a a(euc.b $$0) {
      return new exi.a($$0);
   }

   public Map<String, eub> c() {
      return this.b;
   }

   public euc.b d() {
      return this.c;
   }

   public static class a implements exn.a {
      private final Builder<String, eub> a = ImmutableMap.builder();
      private final euc.b b;

      public a(euc.b $$0) {
         this.b = $$0;
      }

      public exi.a a(String $$0, eub $$1) {
         this.a.put($$0, $$1);
         return this;
      }

      @Override
      public exn build() {
         return new exi(this.a.build(), this.b);
      }
   }
}
