import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.stream.Stream;

public record epx(Map<String, ena> b, enb.b c) implements eqc {
   public static final Codec<epx> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.unboundedMap(Codec.STRING, ena.a).fieldOf("scores").forGetter(epx::c), enb.b.e.fieldOf("entity").forGetter(epx::d))
            .apply($$0, epx::new)
   );

   @Override
   public eqd b() {
      return eqe.i;
   }

   @Override
   public Set<epl<?>> a() {
      return Stream.concat(Stream.of(this.c.a()), this.b.values().stream().flatMap($$0 -> $$0.a().stream())).collect(ImmutableSet.toImmutableSet());
   }

   public boolean a(enb $$0) {
      bpv $$1 = $$0.c(this.c.a());
      if ($$1 == null) {
         return false;
      } else {
         ete $$2 = $$0.d().f();

         for (Entry<String, ena> $$3 : this.b.entrySet()) {
            if (!this.a($$0, $$1, $$2, $$3.getKey(), $$3.getValue())) {
               return false;
            }
         }

         return true;
      }
   }

   protected boolean a(enb $$0, bpv $$1, ete $$2, String $$3, ena $$4) {
      esw $$5 = $$2.a($$3);
      if ($$5 == null) {
         return false;
      } else {
         eta $$6 = $$2.d($$1, $$5);
         return $$6 == null ? false : $$4.b($$0, $$6.a());
      }
   }

   public static epx.a a(enb.b $$0) {
      return new epx.a($$0);
   }

   public Map<String, ena> c() {
      return this.b;
   }

   public enb.b d() {
      return this.c;
   }

   public static class a implements eqc.a {
      private final Builder<String, ena> a = ImmutableMap.builder();
      private final enb.b b;

      public a(enb.b $$0) {
         this.b = $$0;
      }

      public epx.a a(String $$0, ena $$1) {
         this.a.put($$0, $$1);
         return this;
      }

      @Override
      public eqc build() {
         return new epx(this.a.build(), this.b);
      }
   }
}
