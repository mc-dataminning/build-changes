import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.stream.Stream;

public record elp(Map<String, eiu> b, eiv.b c) implements elu {
   public static final Codec<elp> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.unboundedMap(Codec.STRING, eiu.a).fieldOf("scores").forGetter(elp::c), eiv.b.e.fieldOf("entity").forGetter(elp::d))
            .apply($$0, elp::new)
   );

   @Override
   public elv b() {
      return elw.i;
   }

   @Override
   public Set<eld<?>> a() {
      return Stream.concat(Stream.of(this.c.a()), this.b.values().stream().flatMap($$0 -> $$0.a().stream())).collect(ImmutableSet.toImmutableSet());
   }

   public boolean a(eiv $$0) {
      bno $$1 = $$0.c(this.c.a());
      if ($$1 == null) {
         return false;
      } else {
         eow $$2 = $$0.d().f();

         for (Entry<String, eiu> $$3 : this.b.entrySet()) {
            if (!this.a($$0, $$1, $$2, $$3.getKey(), $$3.getValue())) {
               return false;
            }
         }

         return true;
      }
   }

   protected boolean a(eiv $$0, bno $$1, eow $$2, String $$3, eiu $$4) {
      eoo $$5 = $$2.a($$3);
      if ($$5 == null) {
         return false;
      } else {
         eos $$6 = $$2.d($$1, $$5);
         return $$6 == null ? false : $$4.b($$0, $$6.a());
      }
   }

   public static elp.a a(eiv.b $$0) {
      return new elp.a($$0);
   }

   public Map<String, eiu> c() {
      return this.b;
   }

   public eiv.b d() {
      return this.c;
   }

   public static class a implements elu.a {
      private final Builder<String, eiu> a = ImmutableMap.builder();
      private final eiv.b b;

      public a(eiv.b $$0) {
         this.b = $$0;
      }

      public elp.a a(String $$0, eiu $$1) {
         this.a.put($$0, $$1);
         return this;
      }

      @Override
      public elu build() {
         return new elp(this.a.build(), this.b);
      }
   }
}
