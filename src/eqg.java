import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSet.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public class eqg extends eqs {
   public static final MapCodec<eqg> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  le.e.r().fieldOf("block").forGetter($$0x -> $$0x.b),
                  Codec.STRING.listOf().fieldOf("properties").forGetter($$0x -> $$0x.c.stream().map(dsg::f).toList())
               )
            )
            .apply($$0, eqg::new)
   );
   private final ix<dea> b;
   private final Set<dsg<?>> c;

   eqg(List<esn> $$0, ix<dea> $$1, Set<dsg<?>> $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   private eqg(List<esn> $$0, ix<dea> $$1, List<String> $$2) {
      this($$0, $$1, $$2.stream().map($$1.a().l()::a).filter(Objects::nonNull).collect(Collectors.toSet()));
   }

   @Override
   public equ b() {
      return eqv.A;
   }

   @Override
   public Set<erw<?>> a() {
      return ImmutableSet.of(erz.g);
   }

   @Override
   protected ctq a(ctq $$0, eph $$1) {
      drd $$2 = $$1.c(erz.g);
      if ($$2 != null) {
         $$0.a(kb.aa, cwb.a, $$1x -> {
            for (dsg<?> $$2x : this.c) {
               if ($$2.b($$2x)) {
                  $$1x = $$1x.a($$2x, $$2);
               }
            }

            return $$1x;
         });
      }

      return $$0;
   }

   public static eqg.a a(dea $$0) {
      return new eqg.a($$0);
   }

   public static class a extends eqs.a<eqg.a> {
      private final ix<dea> a;
      private final Builder<dsg<?>> b = ImmutableSet.builder();

      a(dea $$0) {
         this.a = $$0.q();
      }

      public eqg.a a(dsg<?> $$0) {
         if (!this.a.a().l().d().contains($$0)) {
            throw new IllegalStateException("Property " + $$0 + " is not present on block " + this.a);
         } else {
            this.b.add($$0);
            return this;
         }
      }

      protected eqg.a a() {
         return this;
      }

      @Override
      public eqt b() {
         return new eqg(this.g(), this.a, this.b.build());
      }
   }
}
