import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.stream.Stream;

public record efk(Map<String, ecp> b, ecq.b c) implements efp {
   public static final Codec<efk> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.unboundedMap(Codec.STRING, ecp.a).fieldOf("scores").forGetter(efk::c), ecq.b.e.fieldOf("entity").forGetter(efk::d))
            .apply($$0, efk::new)
   );

   @Override
   public efq b() {
      return efr.i;
   }

   @Override
   public Set<eey<?>> a() {
      return Stream.concat(Stream.of(this.c.a()), this.b.values().stream().flatMap($$0 -> $$0.a().stream())).collect(ImmutableSet.toImmutableSet());
   }

   public boolean a(ecq $$0) {
      biq $$1 = $$0.c(this.c.a());
      if ($$1 == null) {
         return false;
      } else {
         eim $$2 = $$1.dL().I();

         for (Entry<String, ecp> $$3 : this.b.entrySet()) {
            if (!this.a($$0, $$1, $$2, $$3.getKey(), $$3.getValue())) {
               return false;
            }
         }

         return true;
      }
   }

   protected boolean a(ecq $$0, biq $$1, eim $$2, String $$3, ecp $$4) {
      eij $$5 = $$2.b($$3);
      if ($$5 == null) {
         return false;
      } else {
         String $$6 = $$1.cy();
         return !$$2.b($$6, $$5) ? false : $$4.b($$0, $$2.c($$6, $$5).b());
      }
   }

   public static efk.a a(ecq.b $$0) {
      return new efk.a($$0);
   }

   public Map<String, ecp> c() {
      return this.b;
   }

   public ecq.b d() {
      return this.c;
   }

   public static class a implements efp.a {
      private final Builder<String, ecp> a = ImmutableMap.builder();
      private final ecq.b b;

      public a(ecq.b $$0) {
         this.b = $$0;
      }

      public efk.a a(String $$0, ecp $$1) {
         this.a.put($$0, $$1);
         return this;
      }

      @Override
      public efp build() {
         return new efk(this.a.build(), this.b);
      }
   }
}
