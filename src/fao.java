import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class fao extends faa {
   public static final MapCodec<fao> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  Codec.unboundedMap(dff.c, fct.a).optionalFieldOf("enchantments", Map.of()).forGetter($$0x -> $$0x.b),
                  Codec.BOOL.fieldOf("add").orElse(false).forGetter($$0x -> $$0x.c)
               )
            )
            .apply($$0, fao::new)
   );
   private final Map<je<dff>, fcs> b;
   private final boolean c;

   fao(List<fbw> $$0, Map<je<dff>, fcs> $$1, boolean $$2) {
      super($$0);
      this.b = Map.copyOf($$1);
      this.c = $$2;
   }

   @Override
   public fac<fao> b() {
      return fad.i;
   }

   @Override
   public Set<bav<?>> a() {
      return this.b.values().stream().flatMap($$0 -> $$0.a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public cys a(cys $$0, eyn $$1) {
      if ($$0.a(cyw.rA)) {
         $$0 = $$0.a((dio)cyw.vz);
      }

      dfh.a($$0, $$1x -> {
         if (this.c) {
            this.b.forEach(($$2, $$3) -> $$1x.a((je<dff>)$$2, azk.a($$1x.a((je<dff>)$$2) + $$3.a($$1), 0, 255)));
         } else {
            this.b.forEach(($$2, $$3) -> $$1x.a((je<dff>)$$2, azk.a($$3.a($$1), 0, 255)));
         }
      });
      return $$0;
   }

   public static class a extends faa.a<fao.a> {
      private final Builder<je<dff>, fcs> a = ImmutableMap.builder();
      private final boolean b;

      public a() {
         this(false);
      }

      public a(boolean $$0) {
         this.b = $$0;
      }

      protected fao.a a() {
         return this;
      }

      public fao.a a(je<dff> $$0, fcs $$1) {
         this.a.put($$0, $$1);
         return this;
      }

      @Override
      public fab b() {
         return new fao(this.g(), this.a.build(), this.b);
      }
   }
}
