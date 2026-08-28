import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class evx extends evj {
   public static final MapCodec<evx> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  Codec.unboundedMap(dbm.c, eye.a).optionalFieldOf("enchantments", Map.of()).forGetter($$0x -> $$0x.b),
                  Codec.BOOL.fieldOf("add").orElse(false).forGetter($$0x -> $$0x.c)
               )
            )
            .apply($$0, evx::new)
   );
   private final Map<jp<dbm>, eyd> b;
   private final boolean c;

   evx(List<exh> $$0, Map<jp<dbm>, eyd> $$1, boolean $$2) {
      super($$0);
      this.b = Map.copyOf($$1);
      this.c = $$2;
   }

   @Override
   public evl<evx> b() {
      return evm.i;
   }

   @Override
   public Set<ewp<?>> a() {
      return this.b.values().stream().flatMap($$0 -> $$0.a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public cvx a(cvx $$0, etw $$1) {
      if ($$0.a(cwb.qQ)) {
         $$0 = $$0.a((deu)cwb.uy);
         $$0.b(kt.H, $$0.c(kt.l));
      }

      dbo.a($$0, $$1x -> {
         if (this.c) {
            this.b.forEach(($$2, $$3) -> $$1x.a((jp<dbm>)$$2, azj.a($$1x.a((jp<dbm>)$$2) + $$3.a($$1), 0, 255)));
         } else {
            this.b.forEach(($$2, $$3) -> $$1x.a((jp<dbm>)$$2, azj.a($$3.a($$1), 0, 255)));
         }
      });
      return $$0;
   }

   public static class a extends evj.a<evx.a> {
      private final Builder<jp<dbm>, eyd> a = ImmutableMap.builder();
      private final boolean b;

      public a() {
         this(false);
      }

      public a(boolean $$0) {
         this.b = $$0;
      }

      protected evx.a a() {
         return this;
      }

      public evx.a a(jp<dbm> $$0, eyd $$1) {
         this.a.put($$0, $$1);
         return this;
      }

      @Override
      public evk b() {
         return new evx(this.g(), this.a.build(), this.b);
      }
   }
}
