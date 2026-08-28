import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSet.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public class ets extends eug {
   public static final MapCodec<ets> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  lu.e.r().fieldOf("block").forGetter($$0x -> $$0x.b),
                  Codec.STRING.listOf().fieldOf("properties").forGetter($$0x -> $$0x.c.stream().map(dvd::f).toList())
               )
            )
            .apply($$0, ets::new)
   );
   private final jn<dgv> b;
   private final Set<dvd<?>> c;

   ets(List<ewe> $$0, jn<dgv> $$1, Set<dvd<?>> $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   private ets(List<ewe> $$0, jn<dgv> $$1, List<String> $$2) {
      this($$0, $$1, $$2.stream().map($$1.a().l()::a).filter(Objects::nonNull).collect(Collectors.toSet()));
   }

   @Override
   public eui<ets> b() {
      return euj.D;
   }

   @Override
   public Set<evm<?>> a() {
      return ImmutableSet.of(evp.g);
   }

   @Override
   protected cvl a(cvl $$0, est $$1) {
      dua $$2 = $$1.c(evp.g);
      if ($$2 != null) {
         $$0.a(kr.ae, cxw.a, $$1x -> {
            for (dvd<?> $$2x : this.c) {
               if ($$2.b($$2x)) {
                  $$1x = $$1x.a($$2x, $$2);
               }
            }

            return $$1x;
         });
      }

      return $$0;
   }

   public static ets.a a(dgv $$0) {
      return new ets.a($$0);
   }

   public static class a extends eug.a<ets.a> {
      private final jn<dgv> a;
      private final Builder<dvd<?>> b = ImmutableSet.builder();

      a(dgv $$0) {
         this.a = $$0.s();
      }

      public ets.a a(dvd<?> $$0) {
         if (!this.a.a().l().d().contains($$0)) {
            throw new IllegalStateException("Property " + $$0 + " is not present on block " + this.a);
         } else {
            this.b.add($$0);
            return this;
         }
      }

      protected ets.a a() {
         return this;
      }

      @Override
      public euh b() {
         return new ets(this.g(), this.a, this.b.build());
      }
   }
}
