import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.stream.Stream;

public record elw(Map<String, ejb> b, ejc.b c) implements emb {
   public static final Codec<elw> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.unboundedMap(Codec.STRING, ejb.a).fieldOf("scores").forGetter(elw::c), ejc.b.e.fieldOf("entity").forGetter(elw::d))
            .apply($$0, elw::new)
   );

   @Override
   public emc b() {
      return emd.i;
   }

   @Override
   public Set<elk<?>> a() {
      return Stream.concat(Stream.of(this.c.a()), this.b.values().stream().flatMap($$0 -> $$0.a().stream())).collect(ImmutableSet.toImmutableSet());
   }

   public boolean a(ejc $$0) {
      bnq $$1 = $$0.c(this.c.a());
      if ($$1 == null) {
         return false;
      } else {
         epd $$2 = $$0.d().f();

         for (Entry<String, ejb> $$3 : this.b.entrySet()) {
            if (!this.a($$0, $$1, $$2, $$3.getKey(), $$3.getValue())) {
               return false;
            }
         }

         return true;
      }
   }

   protected boolean a(ejc $$0, bnq $$1, epd $$2, String $$3, ejb $$4) {
      eov $$5 = $$2.a($$3);
      if ($$5 == null) {
         return false;
      } else {
         eoz $$6 = $$2.d($$1, $$5);
         return $$6 == null ? false : $$4.b($$0, $$6.a());
      }
   }

   public static elw.a a(ejc.b $$0) {
      return new elw.a($$0);
   }

   public Map<String, ejb> c() {
      return this.b;
   }

   public ejc.b d() {
      return this.c;
   }

   public static class a implements emb.a {
      private final Builder<String, ejb> a = ImmutableMap.builder();
      private final ejc.b b;

      public a(ejc.b $$0) {
         this.b = $$0;
      }

      public elw.a a(String $$0, ejb $$1) {
         this.a.put($$0, $$1);
         return this;
      }

      @Override
      public emb build() {
         return new elw(this.a.build(), this.b);
      }
   }
}
