import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;

public class eyq extends exv {
   public static final MapCodec<eyq> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  xm.a.sizeLimitedListOf(256).fieldOf("lore").forGetter($$0x -> $$0x.b),
                  exu.a(256).forGetter($$0x -> $$0x.c),
                  ewi.b.e.optionalFieldOf("entity").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, eyq::new)
   );
   private final List<xk> b;
   private final exu c;
   private final Optional<ewi.b> d;

   public eyq(List<ezr> $$0, List<xk> $$1, exu $$2, Optional<ewi.b> $$3) {
      super($$0);
      this.b = List.copyOf($$1);
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public exx<eyq> b() {
      return exy.A;
   }

   @Override
   public Set<bbd<?>> a() {
      return this.d.<Set<bbd<?>>>map($$0 -> Set.of($$0.a())).orElseGet(Set::of);
   }

   @Override
   public cxg a(cxg $$0, ewi $$1) {
      $$0.a(ku.j, czz.a, $$1x -> new czz(this.a($$1x, $$1)));
      return $$0;
   }

   private List<xk> a(@Nullable czz $$0, ewi $$1) {
      if ($$0 == null && this.b.isEmpty()) {
         return List.of();
      } else {
         UnaryOperator<xk> $$2 = eyr.a($$1, this.d.orElse(null));
         List<xk> $$3 = this.b.stream().map($$2).toList();
         return this.c.a($$0.a(), $$3, 256);
      }
   }

   public static eyq.a c() {
      return new eyq.a();
   }

   public static class a extends exv.a<eyq.a> {
      private Optional<ewi.b> a = Optional.empty();
      private final Builder<xk> b = ImmutableList.builder();
      private exu c = exu.a.b;

      public eyq.a a(exu $$0) {
         this.c = $$0;
         return this;
      }

      public eyq.a a(ewi.b $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public eyq.a a(xk $$0) {
         this.b.add($$0);
         return this;
      }

      protected eyq.a a() {
         return this;
      }

      @Override
      public exw b() {
         return new eyq(this.g(), this.b.build(), this.c, this.a);
      }
   }
}
