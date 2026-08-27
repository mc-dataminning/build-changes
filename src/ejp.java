import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.stream.Stream;

public record ejp(Map<String, egu> b, egv.b c) implements eju {
   public static final Codec<ejp> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.unboundedMap(Codec.STRING, egu.a).fieldOf("scores").forGetter(ejp::c), egv.b.e.fieldOf("entity").forGetter(ejp::d))
            .apply($$0, ejp::new)
   );

   @Override
   public ejv b() {
      return ejw.i;
   }

   @Override
   public Set<ejd<?>> a() {
      return Stream.concat(Stream.of(this.c.a()), this.b.values().stream().flatMap($$0 -> $$0.a().stream())).collect(ImmutableSet.toImmutableSet());
   }

   public boolean a(egv $$0) {
      blu $$1 = $$0.c(this.c.a());
      if ($$1 == null) {
         return false;
      } else {
         emw $$2 = $$1.dM().K();

         for (Entry<String, egu> $$3 : this.b.entrySet()) {
            if (!this.a($$0, $$1, $$2, $$3.getKey(), $$3.getValue())) {
               return false;
            }
         }

         return true;
      }
   }

   protected boolean a(egv $$0, blu $$1, emw $$2, String $$3, egu $$4) {
      emo $$5 = $$2.a($$3);
      if ($$5 == null) {
         return false;
      } else {
         ems $$6 = $$2.d($$1, $$5);
         return $$6 == null ? false : $$4.b($$0, $$6.a());
      }
   }

   public static ejp.a a(egv.b $$0) {
      return new ejp.a($$0);
   }

   public Map<String, egu> c() {
      return this.b;
   }

   public egv.b d() {
      return this.c;
   }

   public static class a implements eju.a {
      private final Builder<String, egu> a = ImmutableMap.builder();
      private final egv.b b;

      public a(egv.b $$0) {
         this.b = $$0;
      }

      public ejp.a a(String $$0, egu $$1) {
         this.a.put($$0, $$1);
         return this;
      }

      @Override
      public eju build() {
         return new ejp(this.a.build(), this.b);
      }
   }
}
