import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.stream.Stream;

public record ejj(Map<String, ego> b, egp.b c) implements ejo {
   public static final Codec<ejj> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.unboundedMap(Codec.STRING, ego.a).fieldOf("scores").forGetter(ejj::c), egp.b.e.fieldOf("entity").forGetter(ejj::d))
            .apply($$0, ejj::new)
   );

   @Override
   public ejp b() {
      return ejq.i;
   }

   @Override
   public Set<eix<?>> a() {
      return Stream.concat(Stream.of(this.c.a()), this.b.values().stream().flatMap($$0 -> $$0.a().stream())).collect(ImmutableSet.toImmutableSet());
   }

   public boolean a(egp $$0) {
      blp $$1 = $$0.c(this.c.a());
      if ($$1 == null) {
         return false;
      } else {
         emq $$2 = $$1.dM().K();

         for (Entry<String, ego> $$3 : this.b.entrySet()) {
            if (!this.a($$0, $$1, $$2, $$3.getKey(), $$3.getValue())) {
               return false;
            }
         }

         return true;
      }
   }

   protected boolean a(egp $$0, blp $$1, emq $$2, String $$3, ego $$4) {
      emi $$5 = $$2.a($$3);
      if ($$5 == null) {
         return false;
      } else {
         emm $$6 = $$2.d($$1, $$5);
         return $$6 == null ? false : $$4.b($$0, $$6.a());
      }
   }

   public static ejj.a a(egp.b $$0) {
      return new ejj.a($$0);
   }

   public Map<String, ego> c() {
      return this.b;
   }

   public egp.b d() {
      return this.c;
   }

   public static class a implements ejo.a {
      private final Builder<String, ego> a = ImmutableMap.builder();
      private final egp.b b;

      public a(egp.b $$0) {
         this.b = $$0;
      }

      public ejj.a a(String $$0, ego $$1) {
         this.a.put($$0, $$1);
         return this;
      }

      @Override
      public ejo build() {
         return new ejj(this.a.build(), this.b);
      }
   }
}
