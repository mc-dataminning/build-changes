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

public record fbr(Map<String, eym> b, eyn.b c) implements fbw {
   public static final MapCodec<fbr> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.unboundedMap(Codec.STRING, eym.a).fieldOf("scores").forGetter(fbr::c), eyn.b.e.fieldOf("entity").forGetter(fbr::d))
            .apply($$0, fbr::new)
   );

   @Override
   public fbx b() {
      return fby.h;
   }

   @Override
   public Set<bav<?>> a() {
      return Stream.concat(Stream.of(this.c.a()), this.b.values().stream().flatMap($$0 -> $$0.a().stream())).collect(ImmutableSet.toImmutableSet());
   }

   public boolean a(eyn $$0) {
      bwa $$1 = $$0.c(this.c.a());
      if ($$1 == null) {
         return false;
      } else {
         ffb $$2 = $$0.d().g();

         for (Entry<String, eym> $$3 : this.b.entrySet()) {
            if (!this.a($$0, $$1, $$2, $$3.getKey(), $$3.getValue())) {
               return false;
            }
         }

         return true;
      }
   }

   protected boolean a(eyn $$0, bwa $$1, ffb $$2, String $$3, eym $$4) {
      fet $$5 = $$2.a($$3);
      if ($$5 == null) {
         return false;
      } else {
         fex $$6 = $$2.d($$1, $$5);
         return $$6 == null ? false : $$4.b($$0, $$6.a());
      }
   }

   public static fbr.a a(eyn.b $$0) {
      return new fbr.a($$0);
   }

   public Map<String, eym> c() {
      return this.b;
   }

   public eyn.b d() {
      return this.c;
   }

   public static class a implements fbw.a {
      private final Builder<String, eym> a = ImmutableMap.builder();
      private final eyn.b b;

      public a(eyn.b $$0) {
         this.b = $$0;
      }

      public fbr.a a(String $$0, eym $$1) {
         this.a.put($$0, $$1);
         return this;
      }

      @Override
      public fbw build() {
         return new fbr(this.a.build(), this.b);
      }
   }
}
