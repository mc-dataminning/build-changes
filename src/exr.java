import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class exr extends exd {
   public static final MapCodec<exr> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  Codec.unboundedMap(dcy.c, ezw.a).optionalFieldOf("enchantments", Map.of()).forGetter($$0x -> $$0x.b),
                  Codec.BOOL.fieldOf("add").orElse(false).forGetter($$0x -> $$0x.c)
               )
            )
            .apply($$0, exr::new)
   );
   private final Map<jr<dcy>, ezv> b;
   private final boolean c;

   exr(List<eyz> $$0, Map<jr<dcy>, ezv> $$1, boolean $$2) {
      super($$0);
      this.b = Map.copyOf($$1);
      this.c = $$2;
   }

   @Override
   public exf<exr> b() {
      return exg.i;
   }

   @Override
   public Set<bai<?>> a() {
      return this.b.values().stream().flatMap($$0 -> $$0.a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public cwo a(cwo $$0, evq $$1) {
      if ($$0.a(cws.rw)) {
         $$0 = $$0.a((dgg)cws.vv);
      }

      dda.a($$0, $$1x -> {
         if (this.c) {
            this.b.forEach(($$2, $$3) -> $$1x.a((jr<dcy>)$$2, ayz.a($$1x.a((jr<dcy>)$$2) + $$3.a($$1), 0, 255)));
         } else {
            this.b.forEach(($$2, $$3) -> $$1x.a((jr<dcy>)$$2, ayz.a($$3.a($$1), 0, 255)));
         }
      });
      return $$0;
   }

   public static class a extends exd.a<exr.a> {
      private final Builder<jr<dcy>, ezv> a = ImmutableMap.builder();
      private final boolean b;

      public a() {
         this(false);
      }

      public a(boolean $$0) {
         this.b = $$0;
      }

      protected exr.a a() {
         return this;
      }

      public exr.a a(jr<dcy> $$0, ezv $$1) {
         this.a.put($$0, $$1);
         return this;
      }

      @Override
      public exe b() {
         return new exr(this.g(), this.a.build(), this.b);
      }
   }
}
