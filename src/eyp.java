import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;

public class eyp extends exu {
   public static final MapCodec<eyp> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  xx.a.sizeLimitedListOf(256).fieldOf("lore").forGetter($$0x -> $$0x.b),
                  ext.a(256).forGetter($$0x -> $$0x.c),
                  ewh.b.e.optionalFieldOf("entity").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, eyp::new)
   );
   private final List<xv> b;
   private final ext c;
   private final Optional<ewh.b> d;

   public eyp(List<ezs> $$0, List<xv> $$1, ext $$2, Optional<ewh.b> $$3) {
      super($$0);
      this.b = List.copyOf($$1);
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public exw<eyp> b() {
      return exx.A;
   }

   @Override
   public Set<eza<?>> a() {
      return this.d.<Set<eza<?>>>map($$0 -> Set.of($$0.a())).orElseGet(Set::of);
   }

   @Override
   public cxk a(cxk $$0, ewh $$1) {
      $$0.a(ku.j, dad.a, $$1x -> new dad(this.a($$1x, $$1)));
      return $$0;
   }

   private List<xv> a(@Nullable dad $$0, ewh $$1) {
      if ($$0 == null && this.b.isEmpty()) {
         return List.of();
      } else {
         UnaryOperator<xv> $$2 = eyq.a($$1, this.d.orElse(null));
         List<xv> $$3 = this.b.stream().map($$2).toList();
         return this.c.a($$0.a(), $$3, 256);
      }
   }

   public static eyp.a c() {
      return new eyp.a();
   }

   public static class a extends exu.a<eyp.a> {
      private Optional<ewh.b> a = Optional.empty();
      private final Builder<xv> b = ImmutableList.builder();
      private ext c = ext.a.b;

      public eyp.a a(ext $$0) {
         this.c = $$0;
         return this;
      }

      public eyp.a a(ewh.b $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public eyp.a a(xv $$0) {
         this.b.add($$0);
         return this;
      }

      protected eyp.a a() {
         return this;
      }

      @Override
      public exv b() {
         return new eyp(this.g(), this.b.build(), this.c, this.a);
      }
   }
}
