import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;

public class eyx extends eyc {
   public static final MapCodec<eyx> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  xx.a.sizeLimitedListOf(256).fieldOf("lore").forGetter($$0x -> $$0x.b),
                  eyb.a(256).forGetter($$0x -> $$0x.c),
                  ewp.b.e.optionalFieldOf("entity").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, eyx::new)
   );
   private final List<xv> b;
   private final eyb c;
   private final Optional<ewp.b> d;

   public eyx(List<ezy> $$0, List<xv> $$1, eyb $$2, Optional<ewp.b> $$3) {
      super($$0);
      this.b = List.copyOf($$1);
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public eye<eyx> b() {
      return eyf.A;
   }

   @Override
   public Set<bbn<?>> a() {
      return this.d.<Set<bbn<?>>>map($$0 -> Set.of($$0.a())).orElseGet(Set::of);
   }

   @Override
   public cxp a(cxp $$0, ewp $$1) {
      $$0.a(ku.j, dai.a, $$1x -> new dai(this.a($$1x, $$1)));
      return $$0;
   }

   private List<xv> a(@Nullable dai $$0, ewp $$1) {
      if ($$0 == null && this.b.isEmpty()) {
         return List.of();
      } else {
         UnaryOperator<xv> $$2 = eyy.a($$1, this.d.orElse(null));
         List<xv> $$3 = this.b.stream().map($$2).toList();
         return this.c.a($$0.a(), $$3, 256);
      }
   }

   public static eyx.a c() {
      return new eyx.a();
   }

   public static class a extends eyc.a<eyx.a> {
      private Optional<ewp.b> a = Optional.empty();
      private final Builder<xv> b = ImmutableList.builder();
      private eyb c = eyb.a.b;

      public eyx.a a(eyb $$0) {
         this.c = $$0;
         return this;
      }

      public eyx.a a(ewp.b $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public eyx.a a(xv $$0) {
         this.b.add($$0);
         return this;
      }

      protected eyx.a a() {
         return this;
      }

      @Override
      public eyd b() {
         return new eyx(this.g(), this.b.build(), this.c, this.a);
      }
   }
}
