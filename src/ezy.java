import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSet.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public class ezy extends fam {
   public static final MapCodec<ezy> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  mf.e.r().fieldOf("block").forGetter($$0x -> $$0x.b),
                  Codec.STRING.listOf().fieldOf("properties").forGetter($$0x -> $$0x.c.stream().map(ebc::f).toList())
               )
            )
            .apply($$0, ezy::new)
   );
   private final je<dma> b;
   private final Set<ebc<?>> c;

   ezy(List<fci> $$0, je<dma> $$1, Set<ebc<?>> $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   private ezy(List<fci> $$0, je<dma> $$1, List<String> $$2) {
      this($$0, $$1, $$2.stream().map($$1.a().l()::a).filter(Objects::nonNull).collect(Collectors.toSet()));
   }

   @Override
   public fao<ezy> b() {
      return fap.D;
   }

   @Override
   public Set<bax<?>> a() {
      return Set.of(fbt.g);
   }

   @Override
   protected cyy a(cyy $$0, eyz $$1) {
      dzz $$2 = $$1.c(fbt.g);
      if ($$2 != null) {
         $$0.a(kj.aq, day.a, $$1x -> {
            for (ebc<?> $$2x : this.c) {
               if ($$2.b($$2x)) {
                  $$1x = $$1x.a($$2x, $$2);
               }
            }

            return $$1x;
         });
      }

      return $$0;
   }

   public static ezy.a a(dma $$0) {
      return new ezy.a($$0);
   }

   public static class a extends fam.a<ezy.a> {
      private final je<dma> a;
      private final Builder<ebc<?>> b = ImmutableSet.builder();

      a(dma $$0) {
         this.a = $$0.p();
      }

      public ezy.a a(ebc<?> $$0) {
         if (!this.a.a().l().d().contains($$0)) {
            throw new IllegalStateException("Property " + $$0 + " is not present on block " + this.a);
         } else {
            this.b.add($$0);
            return this;
         }
      }

      protected ezy.a a() {
         return this;
      }

      @Override
      public fan b() {
         return new ezy(this.g(), this.a, this.b.build());
      }
   }
}
