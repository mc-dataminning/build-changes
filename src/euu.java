import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class euu extends eug {
   public static final MapCodec<euu> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  Codec.unboundedMap(daw.c, exb.a).optionalFieldOf("enchantments", Map.of()).forGetter($$0x -> $$0x.b),
                  Codec.BOOL.fieldOf("add").orElse(false).forGetter($$0x -> $$0x.c)
               )
            )
            .apply($$0, euu::new)
   );
   private final Map<jn<daw>, exa> b;
   private final boolean c;

   euu(List<ewe> $$0, Map<jn<daw>, exa> $$1, boolean $$2) {
      super($$0);
      this.b = Map.copyOf($$1);
      this.c = $$2;
   }

   @Override
   public eui<euu> b() {
      return euj.i;
   }

   @Override
   public Set<evm<?>> a() {
      return this.b.values().stream().flatMap($$0 -> $$0.a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public cvl a(cvl $$0, est $$1) {
      if ($$0.a(cvo.qQ)) {
         $$0 = $$0.a((ddr)cvo.uy);
         $$0.b(kr.A, $$0.c(kr.k));
      }

      day.a($$0, $$1x -> {
         if (this.c) {
            this.b.forEach(($$2, $$3) -> $$1x.a((jn<daw>)$$2, azc.a($$1x.a((jn<daw>)$$2) + $$3.a($$1), 0, 255)));
         } else {
            this.b.forEach(($$2, $$3) -> $$1x.a((jn<daw>)$$2, azc.a($$3.a($$1), 0, 255)));
         }
      });
      return $$0;
   }

   public static class a extends eug.a<euu.a> {
      private final Builder<jn<daw>, exa> a = ImmutableMap.builder();
      private final boolean b;

      public a() {
         this(false);
      }

      public a(boolean $$0) {
         this.b = $$0;
      }

      protected euu.a a() {
         return this;
      }

      public euu.a a(jn<daw> $$0, exa $$1) {
         this.a.put($$0, $$1);
         return this;
      }

      @Override
      public euh b() {
         return new euu(this.g(), this.a.build(), this.b);
      }
   }
}
