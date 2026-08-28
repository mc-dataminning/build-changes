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

public record fdn(Map<String, fai> b, faj.b c) implements fds {
   public static final MapCodec<fdn> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.unboundedMap(Codec.STRING, fai.a).fieldOf("scores").forGetter(fdn::c), faj.b.e.fieldOf("entity").forGetter(fdn::d))
            .apply($$0, fdn::new)
   );

   @Override
   public fdt b() {
      return fdu.h;
   }

   @Override
   public Set<bbb<?>> a() {
      return Stream.concat(Stream.of(this.c.a()), this.b.values().stream().flatMap($$0 -> $$0.a().stream())).collect(ImmutableSet.toImmutableSet());
   }

   public boolean a(faj $$0) {
      bwv $$1 = $$0.c(this.c.a());
      if ($$1 == null) {
         return false;
      } else {
         fgx $$2 = $$0.d().g();

         for (Entry<String, fai> $$3 : this.b.entrySet()) {
            if (!this.a($$0, $$1, $$2, $$3.getKey(), $$3.getValue())) {
               return false;
            }
         }

         return true;
      }
   }

   protected boolean a(faj $$0, bwv $$1, fgx $$2, String $$3, fai $$4) {
      fgp $$5 = $$2.a($$3);
      if ($$5 == null) {
         return false;
      } else {
         fgt $$6 = $$2.d($$1, $$5);
         return $$6 == null ? false : $$4.b($$0, $$6.a());
      }
   }

   public static fdn.a a(faj.b $$0) {
      return new fdn.a($$0);
   }

   public Map<String, fai> c() {
      return this.b;
   }

   public faj.b d() {
      return this.c;
   }

   public static class a implements fds.a {
      private final Builder<String, fai> a = ImmutableMap.builder();
      private final faj.b b;

      public a(faj.b $$0) {
         this.b = $$0;
      }

      public fdn.a a(String $$0, fai $$1) {
         this.a.put($$0, $$1);
         return this;
      }

      @Override
      public fds build() {
         return new fdn(this.a.build(), this.b);
      }
   }
}
