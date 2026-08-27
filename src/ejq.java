import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.stream.Stream;

public record ejq(Map<String, egv> b, egw.b c) implements ejv {
   public static final Codec<ejq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.unboundedMap(Codec.STRING, egv.a).fieldOf("scores").forGetter(ejq::c), egw.b.e.fieldOf("entity").forGetter(ejq::d))
            .apply($$0, ejq::new)
   );

   @Override
   public ejw b() {
      return ejx.i;
   }

   @Override
   public Set<eje<?>> a() {
      return Stream.concat(Stream.of(this.c.a()), this.b.values().stream().flatMap($$0 -> $$0.a().stream())).collect(ImmutableSet.toImmutableSet());
   }

   public boolean a(egw $$0) {
      blv $$1 = $$0.c(this.c.a());
      if ($$1 == null) {
         return false;
      } else {
         emx $$2 = $$1.dM().K();

         for (Entry<String, egv> $$3 : this.b.entrySet()) {
            if (!this.a($$0, $$1, $$2, $$3.getKey(), $$3.getValue())) {
               return false;
            }
         }

         return true;
      }
   }

   protected boolean a(egw $$0, blv $$1, emx $$2, String $$3, egv $$4) {
      emp $$5 = $$2.a($$3);
      if ($$5 == null) {
         return false;
      } else {
         emt $$6 = $$2.d($$1, $$5);
         return $$6 == null ? false : $$4.b($$0, $$6.a());
      }
   }

   public static ejq.a a(egw.b $$0) {
      return new ejq.a($$0);
   }

   public Map<String, egv> c() {
      return this.b;
   }

   public egw.b d() {
      return this.c;
   }

   public static class a implements ejv.a {
      private final Builder<String, egv> a = ImmutableMap.builder();
      private final egw.b b;

      public a(egw.b $$0) {
         this.b = $$0;
      }

      public ejq.a a(String $$0, egv $$1) {
         this.a.put($$0, $$1);
         return this;
      }

      @Override
      public ejv build() {
         return new ejq(this.a.build(), this.b);
      }
   }
}
