import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.stream.Stream;

public record fcl(Map<String, ezg> b, ezh.b c) implements fcq {
   public static final MapCodec<fcl> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.unboundedMap(Codec.STRING, ezg.a).fieldOf("scores").forGetter(fcl::c), ezh.b.e.fieldOf("entity").forGetter(fcl::d))
            .apply($$0, fcl::new)
   );

   @Override
   public fcr b() {
      return fcs.h;
   }

   @Override
   public Set<bax<?>> a() {
      return Stream.concat(Stream.of(this.c.a()), this.b.values().stream().flatMap($$0 -> $$0.a().stream())).collect(ImmutableSet.toImmutableSet());
   }

   public boolean a(ezh $$0) {
      bwf $$1 = $$0.c(this.c.a());
      if ($$1 == null) {
         return false;
      } else {
         ffv $$2 = $$0.d().g();

         for (Entry<String, ezg> $$3 : this.b.entrySet()) {
            if (!this.a($$0, $$1, $$2, $$3.getKey(), $$3.getValue())) {
               return false;
            }
         }

         return true;
      }
   }

   protected boolean a(ezh $$0, bwf $$1, ffv $$2, String $$3, ezg $$4) {
      ffn $$5 = $$2.a($$3);
      if ($$5 == null) {
         return false;
      } else {
         ffr $$6 = $$2.d($$1, $$5);
         return $$6 == null ? false : $$4.b($$0, $$6.a());
      }
   }

   public static fcl.a a(ezh.b $$0) {
      return new fcl.a($$0);
   }

   public Map<String, ezg> c() {
      return this.b;
   }

   public ezh.b d() {
      return this.c;
   }

   public static class a implements fcq.a {
      private final Builder<String, ezg> a = ImmutableMap.builder();
      private final ezh.b b;

      public a(ezh.b $$0) {
         this.b = $$0;
      }

      public fcl.a a(String $$0, ezg $$1) {
         this.a.put($$0, $$1);
         return this;
      }

      @Override
      public fcq build() {
         return new fcl(this.a.build(), this.b);
      }
   }
}
