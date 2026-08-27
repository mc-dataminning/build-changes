import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;

public class erj extends eqq {
   public static final MapCodec<erj> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  wz.a.sizeLimitedListOf(256).fieldOf("lore").forGetter($$0x -> $$0x.b),
                  eqp.a(256).forGetter($$0x -> $$0x.c),
                  epf.b.e.optionalFieldOf("entity").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, erj::new)
   );
   private final List<wx> b;
   private final eqp c;
   private final Optional<epf.b> d;

   public erj(List<esl> $$0, List<wx> $$1, eqp $$2, Optional<epf.b> $$3) {
      super($$0);
      this.b = List.copyOf($$1);
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public eqs b() {
      return eqt.x;
   }

   @Override
   public Set<eru<?>> a() {
      return this.d.<Set<eru<?>>>map($$0 -> Set.of($$0.a())).orElseGet(Set::of);
   }

   @Override
   public cto a(cto $$0, epf $$1) {
      $$0.a(kb.h, cwl.a, $$1x -> new cwl(this.a($$1x, $$1)));
      return $$0;
   }

   private List<wx> a(@Nullable cwl $$0, epf $$1) {
      if ($$0 == null && this.b.isEmpty()) {
         return List.of();
      } else {
         UnaryOperator<wx> $$2 = erk.a($$1, this.d.orElse(null));
         List<wx> $$3 = this.b.stream().map($$2).toList();
         return this.c.a($$0.a(), $$3, 256);
      }
   }

   public static erj.a c() {
      return new erj.a();
   }

   public static class a extends eqq.a<erj.a> {
      private Optional<epf.b> a = Optional.empty();
      private final Builder<wx> b = ImmutableList.builder();
      private eqp c = eqp.a.a;

      public erj.a a(eqp $$0) {
         this.c = $$0;
         return this;
      }

      public erj.a a(epf.b $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public erj.a a(wx $$0) {
         this.b.add($$0);
         return this;
      }

      protected erj.a a() {
         return this;
      }

      @Override
      public eqr b() {
         return new erj(this.g(), this.b.build(), this.c, this.a);
      }
   }
}
