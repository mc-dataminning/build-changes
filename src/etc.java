import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;

public class etc extends esh {
   public static final MapCodec<etc> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  ww.a.sizeLimitedListOf(256).fieldOf("lore").forGetter($$0x -> $$0x.b),
                  esg.a(256).forGetter($$0x -> $$0x.c),
                  equ.b.e.optionalFieldOf("entity").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, etc::new)
   );
   private final List<wu> b;
   private final esg c;
   private final Optional<equ.b> d;

   public etc(List<euf> $$0, List<wu> $$1, esg $$2, Optional<equ.b> $$3) {
      super($$0);
      this.b = List.copyOf($$1);
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public esj<etc> b() {
      return esk.A;
   }

   @Override
   public Set<etn<?>> a() {
      return this.d.<Set<etn<?>>>map($$0 -> Set.of($$0.a())).orElseGet(Set::of);
   }

   @Override
   public cuc a(cuc $$0, equ $$1) {
      $$0.a(kn.i, cwy.a, $$1x -> new cwy(this.a($$1x, $$1)));
      return $$0;
   }

   private List<wu> a(@Nullable cwy $$0, equ $$1) {
      if ($$0 == null && this.b.isEmpty()) {
         return List.of();
      } else {
         UnaryOperator<wu> $$2 = etd.a($$1, this.d.orElse(null));
         List<wu> $$3 = this.b.stream().map($$2).toList();
         return this.c.a($$0.a(), $$3, 256);
      }
   }

   public static etc.a c() {
      return new etc.a();
   }

   public static class a extends esh.a<etc.a> {
      private Optional<equ.b> a = Optional.empty();
      private final Builder<wu> b = ImmutableList.builder();
      private esg c = esg.a.b;

      public etc.a a(esg $$0) {
         this.c = $$0;
         return this;
      }

      public etc.a a(equ.b $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public etc.a a(wu $$0) {
         this.b.add($$0);
         return this;
      }

      protected etc.a a() {
         return this;
      }

      @Override
      public esi b() {
         return new etc(this.g(), this.b.build(), this.c, this.a);
      }
   }
}
