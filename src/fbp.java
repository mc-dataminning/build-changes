import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;

public class fbp extends fau {
   public static final MapCodec<fbp> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  xa.a.sizeLimitedListOf(256).fieldOf("lore").forGetter($$0x -> $$0x.b),
                  fat.a(256).forGetter($$0x -> $$0x.c),
                  ezh.b.e.optionalFieldOf("entity").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, fbp::new)
   );
   private final List<wy> b;
   private final fat c;
   private final Optional<ezh.b> d;

   public fbp(List<fcq> $$0, List<wy> $$1, fat $$2, Optional<ezh.b> $$3) {
      super($$0);
      this.b = List.copyOf($$1);
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public faw<fbp> b() {
      return fax.A;
   }

   @Override
   public Set<bax<?>> a() {
      return this.d.<Set<bax<?>>>map($$0 -> Set.of($$0.a())).orElseGet(Set::of);
   }

   @Override
   public czd a(czd $$0, ezh $$1) {
      $$0.a(kj.j, dbw.a, $$1x -> new dbw(this.a($$1x, $$1)));
      return $$0;
   }

   private List<wy> a(@Nullable dbw $$0, ezh $$1) {
      if ($$0 == null && this.b.isEmpty()) {
         return List.of();
      } else {
         UnaryOperator<wy> $$2 = fbq.a($$1, this.d.orElse(null));
         List<wy> $$3 = this.b.stream().map($$2).toList();
         return this.c.a($$0.a(), $$3, 256);
      }
   }

   public static fbp.a c() {
      return new fbp.a();
   }

   public static class a extends fau.a<fbp.a> {
      private Optional<ezh.b> a = Optional.empty();
      private final Builder<wy> b = ImmutableList.builder();
      private fat c = fat.a.b;

      public fbp.a a(fat $$0) {
         this.c = $$0;
         return this;
      }

      public fbp.a a(ezh.b $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public fbp.a a(wy $$0) {
         this.b.add($$0);
         return this;
      }

      protected fbp.a a() {
         return this;
      }

      @Override
      public fav b() {
         return new fbp(this.g(), this.b.build(), this.c, this.a);
      }
   }
}
