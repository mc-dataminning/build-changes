import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.stream.Stream;

public record egc(Map<String, edh> b, edi.b c) implements egh {
   public static final Codec<egc> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.unboundedMap(Codec.STRING, edh.a).fieldOf("scores").forGetter(egc::c), edi.b.e.fieldOf("entity").forGetter(egc::d))
            .apply($$0, egc::new)
   );

   @Override
   public egi b() {
      return egj.i;
   }

   @Override
   public Set<efq<?>> a() {
      return Stream.concat(Stream.of(this.c.a()), this.b.values().stream().flatMap($$0 -> $$0.a().stream())).collect(ImmutableSet.toImmutableSet());
   }

   public boolean a(edi $$0) {
      bjt $$1 = $$0.c(this.c.a());
      if ($$1 == null) {
         return false;
      } else {
         eje $$2 = $$1.dL().I();

         for (Entry<String, edh> $$3 : this.b.entrySet()) {
            if (!this.a($$0, $$1, $$2, $$3.getKey(), $$3.getValue())) {
               return false;
            }
         }

         return true;
      }
   }

   protected boolean a(edi $$0, bjt $$1, eje $$2, String $$3, edh $$4) {
      ejb $$5 = $$2.b($$3);
      if ($$5 == null) {
         return false;
      } else {
         String $$6 = $$1.cx();
         return !$$2.b($$6, $$5) ? false : $$4.b($$0, $$2.c($$6, $$5).b());
      }
   }

   public static egc.a a(edi.b $$0) {
      return new egc.a($$0);
   }

   public Map<String, edh> c() {
      return this.b;
   }

   public edi.b d() {
      return this.c;
   }

   public static class a implements egh.a {
      private final Builder<String, edh> a = ImmutableMap.builder();
      private final edi.b b;

      public a(edi.b $$0) {
         this.b = $$0;
      }

      public egc.a a(String $$0, edh $$1) {
         this.a.put($$0, $$1);
         return this;
      }

      @Override
      public egh build() {
         return new egc(this.a.build(), this.b);
      }
   }
}
