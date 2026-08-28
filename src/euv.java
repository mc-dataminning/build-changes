import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSet.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public class euv extends evj {
   public static final MapCodec<euv> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  lx.e.r().fieldOf("block").forGetter($$0x -> $$0x.b),
                  Codec.STRING.listOf().fieldOf("properties").forGetter($$0x -> $$0x.c.stream().map(dwg::f).toList())
               )
            )
            .apply($$0, euv::new)
   );
   private final jp<dhy> b;
   private final Set<dwg<?>> c;

   euv(List<exh> $$0, jp<dhy> $$1, Set<dwg<?>> $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   private euv(List<exh> $$0, jp<dhy> $$1, List<String> $$2) {
      this($$0, $$1, $$2.stream().map($$1.a().l()::a).filter(Objects::nonNull).collect(Collectors.toSet()));
   }

   @Override
   public evl<euv> b() {
      return evm.D;
   }

   @Override
   public Set<ewp<?>> a() {
      return ImmutableSet.of(ews.g);
   }

   @Override
   protected cvx a(cvx $$0, etw $$1) {
      dvd $$2 = $$1.c(ews.g);
      if ($$2 != null) {
         $$0.a(kt.al, cxz.a, $$1x -> {
            for (dwg<?> $$2x : this.c) {
               if ($$2.b($$2x)) {
                  $$1x = $$1x.a($$2x, $$2);
               }
            }

            return $$1x;
         });
      }

      return $$0;
   }

   public static euv.a a(dhy $$0) {
      return new euv.a($$0);
   }

   public static class a extends evj.a<euv.a> {
      private final jp<dhy> a;
      private final Builder<dwg<?>> b = ImmutableSet.builder();

      a(dhy $$0) {
         this.a = $$0.p();
      }

      public euv.a a(dwg<?> $$0) {
         if (!this.a.a().l().d().contains($$0)) {
            throw new IllegalStateException("Property " + $$0 + " is not present on block " + this.a);
         } else {
            this.b.add($$0);
            return this;
         }
      }

      protected euv.a a() {
         return this;
      }

      @Override
      public evk b() {
         return new euv(this.g(), this.a, this.b.build());
      }
   }
}
