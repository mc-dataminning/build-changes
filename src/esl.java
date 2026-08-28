import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;

public class esl extends erp {
   public static final MapCodec<esl> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  xn.a.sizeLimitedListOf(256).fieldOf("lore").forGetter($$0x -> $$0x.b),
                  ero.a(256).forGetter($$0x -> $$0x.c),
                  eqd.b.e.optionalFieldOf("entity").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, esl::new)
   );
   private final List<xl> b;
   private final ero c;
   private final Optional<eqd.b> d;

   public esl(List<etn> $$0, List<xl> $$1, ero $$2, Optional<eqd.b> $$3) {
      super($$0);
      this.b = List.copyOf($$1);
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public err<esl> b() {
      return ers.A;
   }

   @Override
   public Set<esw<?>> a() {
      return this.d.<Set<esw<?>>>map($$0 -> Set.of($$0.a())).orElseGet(Set::of);
   }

   @Override
   public cuk a(cuk $$0, eqd $$1) {
      $$0.a(km.h, cxh.a, $$1x -> new cxh(this.a($$1x, $$1)));
      return $$0;
   }

   private List<xl> a(@Nullable cxh $$0, eqd $$1) {
      if ($$0 == null && this.b.isEmpty()) {
         return List.of();
      } else {
         UnaryOperator<xl> $$2 = esm.a($$1, this.d.orElse(null));
         List<xl> $$3 = this.b.stream().map($$2).toList();
         return this.c.a($$0.a(), $$3, 256);
      }
   }

   public static esl.a c() {
      return new esl.a();
   }

   public static class a extends erp.a<esl.a> {
      private Optional<eqd.b> a = Optional.empty();
      private final Builder<xl> b = ImmutableList.builder();
      private ero c = ero.a.b;

      public esl.a a(ero $$0) {
         this.c = $$0;
         return this;
      }

      public esl.a a(eqd.b $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public esl.a a(xl $$0) {
         this.b.add($$0);
         return this;
      }

      protected esl.a a() {
         return this;
      }

      @Override
      public erq b() {
         return new esl(this.g(), this.b.build(), this.c, this.a);
      }
   }
}
