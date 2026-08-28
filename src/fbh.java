import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;

public class fbh extends fam {
   public static final MapCodec<fbh> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  xa.a.sizeLimitedListOf(256).fieldOf("lore").forGetter($$0x -> $$0x.b),
                  fal.a(256).forGetter($$0x -> $$0x.c),
                  eyz.b.e.optionalFieldOf("entity").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, fbh::new)
   );
   private final List<wy> b;
   private final fal c;
   private final Optional<eyz.b> d;

   public fbh(List<fci> $$0, List<wy> $$1, fal $$2, Optional<eyz.b> $$3) {
      super($$0);
      this.b = List.copyOf($$1);
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public fao<fbh> b() {
      return fap.A;
   }

   @Override
   public Set<bax<?>> a() {
      return this.d.<Set<bax<?>>>map($$0 -> Set.of($$0.a())).orElseGet(Set::of);
   }

   @Override
   public cyy a(cyy $$0, eyz $$1) {
      $$0.a(kj.j, dbr.a, $$1x -> new dbr(this.a($$1x, $$1)));
      return $$0;
   }

   private List<wy> a(@Nullable dbr $$0, eyz $$1) {
      if ($$0 == null && this.b.isEmpty()) {
         return List.of();
      } else {
         UnaryOperator<wy> $$2 = fbi.a($$1, this.d.orElse(null));
         List<wy> $$3 = this.b.stream().map($$2).toList();
         return this.c.a($$0.a(), $$3, 256);
      }
   }

   public static fbh.a c() {
      return new fbh.a();
   }

   public static class a extends fam.a<fbh.a> {
      private Optional<eyz.b> a = Optional.empty();
      private final Builder<wy> b = ImmutableList.builder();
      private fal c = fal.a.b;

      public fbh.a a(fal $$0) {
         this.c = $$0;
         return this;
      }

      public fbh.a a(eyz.b $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public fbh.a a(wy $$0) {
         this.b.add($$0);
         return this;
      }

      protected fbh.a a() {
         return this;
      }

      @Override
      public fan b() {
         return new fbh(this.g(), this.b.build(), this.c, this.a);
      }
   }
}
