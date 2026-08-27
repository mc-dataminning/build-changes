import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;

public class eqp extends epw {
   public static final Codec<eqp> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  axh.a(ww.a.listOf(), 256).fieldOf("lore").forGetter($$0x -> $$0x.b),
                  epv.a(256).forGetter($$0x -> $$0x.c),
                  axh.a(eol.b.e, "entity").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, eqp::new)
   );
   private final List<wu> b;
   private final epv c;
   private final Optional<eol.b> d;

   public eqp(List<erq> $$0, List<wu> $$1, epv $$2, Optional<eol.b> $$3) {
      super($$0);
      this.b = List.copyOf($$1);
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public epy b() {
      return epz.x;
   }

   @Override
   public Set<eqz<?>> a() {
      return this.d.<Set<eqz<?>>>map($$0 -> Set.of($$0.a())).orElseGet(Set::of);
   }

   @Override
   public csz a(csz $$0, eol $$1) {
      $$0.a(ka.g, cvu.a, $$1x -> new cvu(this.a($$1x, $$1)));
      return $$0;
   }

   private List<wu> a(@Nullable cvu $$0, eol $$1) {
      if ($$0 == null && this.b.isEmpty()) {
         return List.of();
      } else {
         UnaryOperator<wu> $$2 = eqq.a($$1, this.d.orElse(null));
         List<wu> $$3 = this.b.stream().map($$2).toList();
         return this.c.a($$0.a(), $$3, 256);
      }
   }

   public static eqp.a c() {
      return new eqp.a();
   }

   public static class a extends epw.a<eqp.a> {
      private Optional<eol.b> a = Optional.empty();
      private final Builder<wu> b = ImmutableList.builder();
      private epv c = epv.a.a;

      public eqp.a a(epv $$0) {
         this.c = $$0;
         return this;
      }

      public eqp.a a(eol.b $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public eqp.a a(wu $$0) {
         this.b.add($$0);
         return this;
      }

      protected eqp.a a() {
         return this;
      }

      @Override
      public epx b() {
         return new eqp(this.g(), this.b.build(), this.c, this.a);
      }
   }
}
