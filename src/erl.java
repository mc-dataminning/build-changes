import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;

public class erl extends eqs {
   public static final MapCodec<erl> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  wz.a.sizeLimitedListOf(256).fieldOf("lore").forGetter($$0x -> $$0x.b),
                  eqr.a(256).forGetter($$0x -> $$0x.c),
                  eph.b.e.optionalFieldOf("entity").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, erl::new)
   );
   private final List<wx> b;
   private final eqr c;
   private final Optional<eph.b> d;

   public erl(List<esn> $$0, List<wx> $$1, eqr $$2, Optional<eph.b> $$3) {
      super($$0);
      this.b = List.copyOf($$1);
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public equ b() {
      return eqv.x;
   }

   @Override
   public Set<erw<?>> a() {
      return this.d.<Set<erw<?>>>map($$0 -> Set.of($$0.a())).orElseGet(Set::of);
   }

   @Override
   public ctq a(ctq $$0, eph $$1) {
      $$0.a(kb.h, cwn.a, $$1x -> new cwn(this.a($$1x, $$1)));
      return $$0;
   }

   private List<wx> a(@Nullable cwn $$0, eph $$1) {
      if ($$0 == null && this.b.isEmpty()) {
         return List.of();
      } else {
         UnaryOperator<wx> $$2 = erm.a($$1, this.d.orElse(null));
         List<wx> $$3 = this.b.stream().map($$2).toList();
         return this.c.a($$0.a(), $$3, 256);
      }
   }

   public static erl.a c() {
      return new erl.a();
   }

   public static class a extends eqs.a<erl.a> {
      private Optional<eph.b> a = Optional.empty();
      private final Builder<wx> b = ImmutableList.builder();
      private eqr c = eqr.a.a;

      public erl.a a(eqr $$0) {
         this.c = $$0;
         return this;
      }

      public erl.a a(eph.b $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public erl.a a(wx $$0) {
         this.b.add($$0);
         return this;
      }

      protected erl.a a() {
         return this;
      }

      @Override
      public eqt b() {
         return new erl(this.g(), this.b.build(), this.c, this.a);
      }
   }
}
