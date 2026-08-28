import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;

public class ezt extends eyy {
   public static final MapCodec<ezt> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  wx.a.sizeLimitedListOf(256).fieldOf("lore").forGetter($$0x -> $$0x.b),
                  eyx.a(256).forGetter($$0x -> $$0x.c),
                  exl.b.e.optionalFieldOf("entity").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, ezt::new)
   );
   private final List<wv> b;
   private final eyx c;
   private final Optional<exl.b> d;

   public ezt(List<fau> $$0, List<wv> $$1, eyx $$2, Optional<exl.b> $$3) {
      super($$0);
      this.b = List.copyOf($$1);
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public eza<ezt> b() {
      return ezb.A;
   }

   @Override
   public Set<bat<?>> a() {
      return this.d.<Set<bat<?>>>map($$0 -> Set.of($$0.a())).orElseGet(Set::of);
   }

   @Override
   public cxy a(cxy $$0, exl $$1) {
      $$0.a(kx.j, dao.a, $$1x -> new dao(this.a($$1x, $$1)));
      return $$0;
   }

   private List<wv> a(@Nullable dao $$0, exl $$1) {
      if ($$0 == null && this.b.isEmpty()) {
         return List.of();
      } else {
         UnaryOperator<wv> $$2 = ezu.a($$1, this.d.orElse(null));
         List<wv> $$3 = this.b.stream().map($$2).toList();
         return this.c.a($$0.a(), $$3, 256);
      }
   }

   public static ezt.a c() {
      return new ezt.a();
   }

   public static class a extends eyy.a<ezt.a> {
      private Optional<exl.b> a = Optional.empty();
      private final Builder<wv> b = ImmutableList.builder();
      private eyx c = eyx.a.b;

      public ezt.a a(eyx $$0) {
         this.c = $$0;
         return this;
      }

      public ezt.a a(exl.b $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public ezt.a a(wv $$0) {
         this.b.add($$0);
         return this;
      }

      protected ezt.a a() {
         return this;
      }

      @Override
      public eyz b() {
         return new ezt(this.g(), this.b.build(), this.c, this.a);
      }
   }
}
