import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.stream.Stream;

public record ehf(Map<String, eek> b, eel.b c) implements ehk {
   public static final Codec<ehf> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.unboundedMap(Codec.STRING, eek.a).fieldOf("scores").forGetter(ehf::c), eel.b.e.fieldOf("entity").forGetter(ehf::d))
            .apply($$0, ehf::new)
   );

   @Override
   public ehl b() {
      return ehm.i;
   }

   @Override
   public Set<egt<?>> a() {
      return Stream.concat(Stream.of(this.c.a()), this.b.values().stream().flatMap($$0 -> $$0.a().stream())).collect(ImmutableSet.toImmutableSet());
   }

   public boolean a(eel $$0) {
      bki $$1 = $$0.c(this.c.a());
      if ($$1 == null) {
         return false;
      } else {
         ekh $$2 = $$1.dL().I();

         for (Entry<String, eek> $$3 : this.b.entrySet()) {
            if (!this.a($$0, $$1, $$2, $$3.getKey(), $$3.getValue())) {
               return false;
            }
         }

         return true;
      }
   }

   protected boolean a(eel $$0, bki $$1, ekh $$2, String $$3, eek $$4) {
      eke $$5 = $$2.b($$3);
      if ($$5 == null) {
         return false;
      } else {
         String $$6 = $$1.cx();
         return !$$2.b($$6, $$5) ? false : $$4.b($$0, $$2.c($$6, $$5).b());
      }
   }

   public static ehf.a a(eel.b $$0) {
      return new ehf.a($$0);
   }

   public Map<String, eek> c() {
      return this.b;
   }

   public eel.b d() {
      return this.c;
   }

   public static class a implements ehk.a {
      private final Builder<String, eek> a = ImmutableMap.builder();
      private final eel.b b;

      public a(eel.b $$0) {
         this.b = $$0;
      }

      public ehf.a a(String $$0, eek $$1) {
         this.a.put($$0, $$1);
         return this;
      }

      @Override
      public ehk build() {
         return new ehf(this.a.build(), this.b);
      }
   }
}
