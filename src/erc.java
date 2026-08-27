import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.stream.Stream;

public record erc(Map<String, enz> b, eoa.b c) implements erh {
   public static final Codec<erc> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.unboundedMap(Codec.STRING, enz.a).fieldOf("scores").forGetter(erc::c), eoa.b.e.fieldOf("entity").forGetter(erc::d))
            .apply($$0, erc::new)
   );

   @Override
   public eri b() {
      return erj.i;
   }

   @Override
   public Set<eqq<?>> a() {
      return Stream.concat(Stream.of(this.c.a()), this.b.values().stream().flatMap($$0 -> $$0.a().stream())).collect(ImmutableSet.toImmutableSet());
   }

   public boolean a(eoa $$0) {
      bql $$1 = $$0.c(this.c.a());
      if ($$1 == null) {
         return false;
      } else {
         euj $$2 = $$0.d().f();

         for (Entry<String, enz> $$3 : this.b.entrySet()) {
            if (!this.a($$0, $$1, $$2, $$3.getKey(), $$3.getValue())) {
               return false;
            }
         }

         return true;
      }
   }

   protected boolean a(eoa $$0, bql $$1, euj $$2, String $$3, enz $$4) {
      eub $$5 = $$2.a($$3);
      if ($$5 == null) {
         return false;
      } else {
         euf $$6 = $$2.d($$1, $$5);
         return $$6 == null ? false : $$4.b($$0, $$6.a());
      }
   }

   public static erc.a a(eoa.b $$0) {
      return new erc.a($$0);
   }

   public Map<String, enz> c() {
      return this.b;
   }

   public eoa.b d() {
      return this.c;
   }

   public static class a implements erh.a {
      private final Builder<String, enz> a = ImmutableMap.builder();
      private final eoa.b b;

      public a(eoa.b $$0) {
         this.b = $$0;
      }

      public erc.a a(String $$0, enz $$1) {
         this.a.put($$0, $$1);
         return this;
      }

      @Override
      public erh build() {
         return new erc(this.a.build(), this.b);
      }
   }
}
