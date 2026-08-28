import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class fbi extends fau {
   public static final MapCodec<fbi> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  Codec.unboundedMap(dfq.c, fdn.a).optionalFieldOf("enchantments", Map.of()).forGetter($$0x -> $$0x.b),
                  Codec.BOOL.fieldOf("add").orElse(false).forGetter($$0x -> $$0x.c)
               )
            )
            .apply($$0, fbi::new)
   );
   private final Map<je<dfq>, fdm> b;
   private final boolean c;

   fbi(List<fcq> $$0, Map<je<dfq>, fdm> $$1, boolean $$2) {
      super($$0);
      this.b = Map.copyOf($$1);
      this.c = $$2;
   }

   @Override
   public faw<fbi> b() {
      return fax.i;
   }

   @Override
   public Set<bax<?>> a() {
      return this.b.values().stream().flatMap($$0 -> $$0.a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public czd a(czd $$0, ezh $$1) {
      if ($$0.a(czh.rF)) {
         $$0 = $$0.a((diz)czh.vG);
      }

      dfs.a($$0, $$1x -> {
         if (this.c) {
            this.b.forEach(($$2, $$3) -> $$1x.a((je<dfq>)$$2, azm.a($$1x.a((je<dfq>)$$2) + $$3.a($$1), 0, 255)));
         } else {
            this.b.forEach(($$2, $$3) -> $$1x.a((je<dfq>)$$2, azm.a($$3.a($$1), 0, 255)));
         }
      });
      return $$0;
   }

   public static class a extends fau.a<fbi.a> {
      private final Builder<je<dfq>, fdm> a = ImmutableMap.builder();
      private final boolean b;

      public a() {
         this(false);
      }

      public a(boolean $$0) {
         this.b = $$0;
      }

      protected fbi.a a() {
         return this;
      }

      public fbi.a a(je<dfq> $$0, fdm $$1) {
         this.a.put($$0, $$1);
         return this;
      }

      @Override
      public fav b() {
         return new fbi(this.g(), this.a.build(), this.b);
      }
   }
}
