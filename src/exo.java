import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSet.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public class exo extends eyc {
   public static final MapCodec<exo> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  ma.e.r().fieldOf("block").forGetter($$0x -> $$0x.b),
                  Codec.STRING.listOf().fieldOf("properties").forGetter($$0x -> $$0x.c.stream().map(dyx::f).toList())
               )
            )
            .apply($$0, exo::new)
   );
   private final jq<dkm> b;
   private final Set<dyx<?>> c;

   exo(List<ezy> $$0, jq<dkm> $$1, Set<dyx<?>> $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   private exo(List<ezy> $$0, jq<dkm> $$1, List<String> $$2) {
      this($$0, $$1, $$2.stream().map($$1.a().l()::a).filter(Objects::nonNull).collect(Collectors.toSet()));
   }

   @Override
   public eye<exo> b() {
      return eyf.D;
   }

   @Override
   public Set<bbn<?>> a() {
      return Set.of(ezj.g);
   }

   @Override
   protected cxp a(cxp $$0, ewp $$1) {
      dxv $$2 = $$1.c(ezj.g);
      if ($$2 != null) {
         $$0.a(ku.am, czr.a, $$1x -> {
            for (dyx<?> $$2x : this.c) {
               if ($$2.b($$2x)) {
                  $$1x = $$1x.a($$2x, $$2);
               }
            }

            return $$1x;
         });
      }

      return $$0;
   }

   public static exo.a a(dkm $$0) {
      return new exo.a($$0);
   }

   public static class a extends eyc.a<exo.a> {
      private final jq<dkm> a;
      private final Builder<dyx<?>> b = ImmutableSet.builder();

      a(dkm $$0) {
         this.a = $$0.p();
      }

      public exo.a a(dyx<?> $$0) {
         if (!this.a.a().l().d().contains($$0)) {
            throw new IllegalStateException("Property " + $$0 + " is not present on block " + this.a);
         } else {
            this.b.add($$0);
            return this;
         }
      }

      protected exo.a a() {
         return this;
      }

      @Override
      public eyd b() {
         return new exo(this.g(), this.a, this.b.build());
      }
   }
}
