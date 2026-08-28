import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class exs extends exe {
   public static final MapCodec<exs> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  Codec.unboundedMap(dcz.c, ezx.a).optionalFieldOf("enchantments", Map.of()).forGetter($$0x -> $$0x.b),
                  Codec.BOOL.fieldOf("add").orElse(false).forGetter($$0x -> $$0x.c)
               )
            )
            .apply($$0, exs::new)
   );
   private final Map<jr<dcz>, ezw> b;
   private final boolean c;

   exs(List<eza> $$0, Map<jr<dcz>, ezw> $$1, boolean $$2) {
      super($$0);
      this.b = Map.copyOf($$1);
      this.c = $$2;
   }

   @Override
   public exg<exs> b() {
      return exh.i;
   }

   @Override
   public Set<bai<?>> a() {
      return this.b.values().stream().flatMap($$0 -> $$0.a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public cwp a(cwp $$0, evr $$1) {
      if ($$0.a(cwt.rw)) {
         $$0 = $$0.a((dgh)cwt.vv);
      }

      ddb.a($$0, $$1x -> {
         if (this.c) {
            this.b.forEach(($$2, $$3) -> $$1x.a((jr<dcz>)$$2, ayz.a($$1x.a((jr<dcz>)$$2) + $$3.a($$1), 0, 255)));
         } else {
            this.b.forEach(($$2, $$3) -> $$1x.a((jr<dcz>)$$2, ayz.a($$3.a($$1), 0, 255)));
         }
      });
      return $$0;
   }

   public static class a extends exe.a<exs.a> {
      private final Builder<jr<dcz>, ezw> a = ImmutableMap.builder();
      private final boolean b;

      public a() {
         this(false);
      }

      public a(boolean $$0) {
         this.b = $$0;
      }

      protected exs.a a() {
         return this;
      }

      public exs.a a(jr<dcz> $$0, ezw $$1) {
         this.a.put($$0, $$1);
         return this;
      }

      @Override
      public exf b() {
         return new exs(this.g(), this.a.build(), this.b);
      }
   }
}
