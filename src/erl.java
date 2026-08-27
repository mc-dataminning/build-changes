import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.stream.Stream;

public record erl(Map<String, eok> b, eol.b c) implements erq {
   public static final Codec<erl> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.unboundedMap(Codec.STRING, eok.a).fieldOf("scores").forGetter(erl::c), eol.b.e.fieldOf("entity").forGetter(erl::d))
            .apply($$0, erl::new)
   );

   @Override
   public err b() {
      return ers.j;
   }

   @Override
   public Set<eqz<?>> a() {
      return Stream.concat(Stream.of(this.c.a()), this.b.values().stream().flatMap($$0 -> $$0.a().stream())).collect(ImmutableSet.toImmutableSet());
   }

   public boolean a(eol $$0) {
      brh $$1 = $$0.c(this.c.a());
      if ($$1 == null) {
         return false;
      } else {
         eut $$2 = $$0.d().f();

         for (Entry<String, eok> $$3 : this.b.entrySet()) {
            if (!this.a($$0, $$1, $$2, $$3.getKey(), $$3.getValue())) {
               return false;
            }
         }

         return true;
      }
   }

   protected boolean a(eol $$0, brh $$1, eut $$2, String $$3, eok $$4) {
      eul $$5 = $$2.a($$3);
      if ($$5 == null) {
         return false;
      } else {
         eup $$6 = $$2.d($$1, $$5);
         return $$6 == null ? false : $$4.b($$0, $$6.a());
      }
   }

   public static erl.a a(eol.b $$0) {
      return new erl.a($$0);
   }

   public Map<String, eok> c() {
      return this.b;
   }

   public eol.b d() {
      return this.c;
   }

   public static class a implements erq.a {
      private final Builder<String, eok> a = ImmutableMap.builder();
      private final eol.b b;

      public a(eol.b $$0) {
         this.b = $$0;
      }

      public erl.a a(String $$0, eok $$1) {
         this.a.put($$0, $$1);
         return this;
      }

      @Override
      public erq build() {
         return new erl(this.a.build(), this.b);
      }
   }
}
