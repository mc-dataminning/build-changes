import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;

public class ett extends esy {
   public static final MapCodec<ett> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  xa.a.sizeLimitedListOf(256).fieldOf("lore").forGetter($$0x -> $$0x.b),
                  esx.a(256).forGetter($$0x -> $$0x.c),
                  erl.b.e.optionalFieldOf("entity").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, ett::new)
   );
   private final List<wy> b;
   private final esx c;
   private final Optional<erl.b> d;

   public ett(List<euw> $$0, List<wy> $$1, esx $$2, Optional<erl.b> $$3) {
      super($$0);
      this.b = List.copyOf($$1);
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public eta<ett> b() {
      return etb.A;
   }

   @Override
   public Set<eue<?>> a() {
      return this.d.<Set<eue<?>>>map($$0 -> Set.of($$0.a())).orElseGet(Set::of);
   }

   @Override
   public cuo a(cuo $$0, erl $$1) {
      $$0.a(kq.i, cxn.a, $$1x -> new cxn(this.a($$1x, $$1)));
      return $$0;
   }

   private List<wy> a(@Nullable cxn $$0, erl $$1) {
      if ($$0 == null && this.b.isEmpty()) {
         return List.of();
      } else {
         UnaryOperator<wy> $$2 = etu.a($$1, this.d.orElse(null));
         List<wy> $$3 = this.b.stream().map($$2).toList();
         return this.c.a($$0.a(), $$3, 256);
      }
   }

   public static ett.a c() {
      return new ett.a();
   }

   public static class a extends esy.a<ett.a> {
      private Optional<erl.b> a = Optional.empty();
      private final Builder<wy> b = ImmutableList.builder();
      private esx c = esx.a.b;

      public ett.a a(esx $$0) {
         this.c = $$0;
         return this;
      }

      public ett.a a(erl.b $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public ett.a a(wy $$0) {
         this.b.add($$0);
         return this;
      }

      protected ett.a a() {
         return this;
      }

      @Override
      public esz b() {
         return new ett(this.g(), this.b.build(), this.c, this.a);
      }
   }
}
