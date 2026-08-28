import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class fba extends fam {
   public static final MapCodec<fba> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  Codec.unboundedMap(dfl.c, fdf.a).optionalFieldOf("enchantments", Map.of()).forGetter($$0x -> $$0x.b),
                  Codec.BOOL.fieldOf("add").orElse(false).forGetter($$0x -> $$0x.c)
               )
            )
            .apply($$0, fba::new)
   );
   private final Map<je<dfl>, fde> b;
   private final boolean c;

   fba(List<fci> $$0, Map<je<dfl>, fde> $$1, boolean $$2) {
      super($$0);
      this.b = Map.copyOf($$1);
      this.c = $$2;
   }

   @Override
   public fao<fba> b() {
      return fap.i;
   }

   @Override
   public Set<bax<?>> a() {
      return this.b.values().stream().flatMap($$0 -> $$0.a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public cyy a(cyy $$0, eyz $$1) {
      if ($$0.a(czc.rC)) {
         $$0 = $$0.a((diu)czc.vB);
      }

      dfn.a($$0, $$1x -> {
         if (this.c) {
            this.b.forEach(($$2, $$3) -> $$1x.a((je<dfl>)$$2, azm.a($$1x.a((je<dfl>)$$2) + $$3.a($$1), 0, 255)));
         } else {
            this.b.forEach(($$2, $$3) -> $$1x.a((je<dfl>)$$2, azm.a($$3.a($$1), 0, 255)));
         }
      });
      return $$0;
   }

   public static class a extends fam.a<fba.a> {
      private final Builder<je<dfl>, fde> a = ImmutableMap.builder();
      private final boolean b;

      public a() {
         this(false);
      }

      public a(boolean $$0) {
         this.b = $$0;
      }

      protected fba.a a() {
         return this;
      }

      public fba.a a(je<dfl> $$0, fde $$1) {
         this.a.put($$0, $$1);
         return this;
      }

      @Override
      public fan b() {
         return new fba(this.g(), this.a.build(), this.b);
      }
   }
}
