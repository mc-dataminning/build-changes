import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSet.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public class evm extends ewa {
   public static final MapCodec<evm> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  lz.e.r().fieldOf("block").forGetter($$0x -> $$0x.b),
                  Codec.STRING.listOf().fieldOf("properties").forGetter($$0x -> $$0x.c.stream().map(dwx::f).toList())
               )
            )
            .apply($$0, evm::new)
   );
   private final jq<diq> b;
   private final Set<dwx<?>> c;

   evm(List<exy> $$0, jq<diq> $$1, Set<dwx<?>> $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   private evm(List<exy> $$0, jq<diq> $$1, List<String> $$2) {
      this($$0, $$1, $$2.stream().map($$1.a().l()::a).filter(Objects::nonNull).collect(Collectors.toSet()));
   }

   @Override
   public ewc<evm> b() {
      return ewd.D;
   }

   @Override
   public Set<exg<?>> a() {
      return ImmutableSet.of(exj.g);
   }

   @Override
   protected cwm a(cwm $$0, eun $$1) {
      dvv $$2 = $$1.c(exj.g);
      if ($$2 != null) {
         $$0.a(ku.am, cyo.a, $$1x -> {
            for (dwx<?> $$2x : this.c) {
               if ($$2.b($$2x)) {
                  $$1x = $$1x.a($$2x, $$2);
               }
            }

            return $$1x;
         });
      }

      return $$0;
   }

   public static evm.a a(diq $$0) {
      return new evm.a($$0);
   }

   public static class a extends ewa.a<evm.a> {
      private final jq<diq> a;
      private final Builder<dwx<?>> b = ImmutableSet.builder();

      a(diq $$0) {
         this.a = $$0.p();
      }

      public evm.a a(dwx<?> $$0) {
         if (!this.a.a().l().d().contains($$0)) {
            throw new IllegalStateException("Property " + $$0 + " is not present on block " + this.a);
         } else {
            this.b.add($$0);
            return this;
         }
      }

      protected evm.a a() {
         return this;
      }

      @Override
      public ewb b() {
         return new evm(this.g(), this.a, this.b.build());
      }
   }
}
