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

public record ezt(Map<String, ewo> b, ewp.b c) implements ezy {
   public static final MapCodec<ezt> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.unboundedMap(Codec.STRING, ewo.a).fieldOf("scores").forGetter(ezt::c), ewp.b.e.fieldOf("entity").forGetter(ezt::d))
            .apply($$0, ezt::new)
   );

   @Override
   public ezz b() {
      return faa.h;
   }

   @Override
   public Set<bbn<?>> a() {
      return Stream.concat(Stream.of(this.c.a()), this.b.values().stream().flatMap($$0 -> $$0.a().stream())).collect(ImmutableSet.toImmutableSet());
   }

   public boolean a(ewp $$0) {
      bvk $$1 = $$0.c(this.c.a());
      if ($$1 == null) {
         return false;
      } else {
         fdd $$2 = $$0.d().g();

         for (Entry<String, ewo> $$3 : this.b.entrySet()) {
            if (!this.a($$0, $$1, $$2, $$3.getKey(), $$3.getValue())) {
               return false;
            }
         }

         return true;
      }
   }

   protected boolean a(ewp $$0, bvk $$1, fdd $$2, String $$3, ewo $$4) {
      fcv $$5 = $$2.a($$3);
      if ($$5 == null) {
         return false;
      } else {
         fcz $$6 = $$2.d($$1, $$5);
         return $$6 == null ? false : $$4.b($$0, $$6.a());
      }
   }

   public static ezt.a a(ewp.b $$0) {
      return new ezt.a($$0);
   }

   public Map<String, ewo> c() {
      return this.b;
   }

   public ewp.b d() {
      return this.c;
   }

   public static class a implements ezy.a {
      private final Builder<String, ewo> a = ImmutableMap.builder();
      private final ewp.b b;

      public a(ewp.b $$0) {
         this.b = $$0;
      }

      public ezt.a a(String $$0, ewo $$1) {
         this.a.put($$0, $$1);
         return this;
      }

      @Override
      public ezy build() {
         return new ezt(this.a.build(), this.b);
      }
   }
}
