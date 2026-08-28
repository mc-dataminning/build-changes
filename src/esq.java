import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSet.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public class esq extends ete {
   public static final MapCodec<esq> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  lt.e.s().fieldOf("block").forGetter($$0x -> $$0x.b),
                  Codec.STRING.listOf().fieldOf("properties").forGetter($$0x -> $$0x.c.stream().map(duf::f).toList())
               )
            )
            .apply($$0, esq::new)
   );
   private final jm<dfy> b;
   private final Set<duf<?>> c;

   esq(List<evc> $$0, jm<dfy> $$1, Set<duf<?>> $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   private esq(List<evc> $$0, jm<dfy> $$1, List<String> $$2) {
      this($$0, $$1, $$2.stream().map($$1.a().l()::a).filter(Objects::nonNull).collect(Collectors.toSet()));
   }

   @Override
   public etg<esq> b() {
      return eth.D;
   }

   @Override
   public Set<euk<?>> a() {
      return ImmutableSet.of(eun.g);
   }

   @Override
   protected cuq a(cuq $$0, err $$1) {
      dtc $$2 = $$1.c(eun.g);
      if ($$2 != null) {
         $$0.a(kq.ac, cxd.a, $$1x -> {
            for (duf<?> $$2x : this.c) {
               if ($$2.b($$2x)) {
                  $$1x = $$1x.a($$2x, $$2);
               }
            }

            return $$1x;
         });
      }

      return $$0;
   }

   public static esq.a a(dfy $$0) {
      return new esq.a($$0);
   }

   public static class a extends ete.a<esq.a> {
      private final jm<dfy> a;
      private final Builder<duf<?>> b = ImmutableSet.builder();

      a(dfy $$0) {
         this.a = $$0.s();
      }

      public esq.a a(duf<?> $$0) {
         if (!this.a.a().l().d().contains($$0)) {
            throw new IllegalStateException("Property " + $$0 + " is not present on block " + this.a);
         } else {
            this.b.add($$0);
            return this;
         }
      }

      protected esq.a a() {
         return this;
      }

      @Override
      public etf b() {
         return new esq(this.g(), this.a, this.b.build());
      }
   }
}
