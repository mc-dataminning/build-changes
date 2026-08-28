import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;

public class fbw extends fbb {
   public static final MapCodec<fbw> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  xa.a.sizeLimitedListOf(256).fieldOf("lore").forGetter($$0x -> $$0x.b),
                  fba.a(256).forGetter($$0x -> $$0x.c),
                  ezo.b.e.optionalFieldOf("entity").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, fbw::new)
   );
   private final List<wy> b;
   private final fba c;
   private final Optional<ezo.b> d;

   public fbw(List<fcx> $$0, List<wy> $$1, fba $$2, Optional<ezo.b> $$3) {
      super($$0);
      this.b = List.copyOf($$1);
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public fbd<fbw> b() {
      return fbe.A;
   }

   @Override
   public Set<bax<?>> a() {
      return this.d.<Set<bax<?>>>map($$0 -> Set.of($$0.a())).orElseGet(Set::of);
   }

   @Override
   public czk a(czk $$0, ezo $$1) {
      $$0.a(kk.j, dcd.a, $$1x -> new dcd(this.a($$1x, $$1)));
      return $$0;
   }

   private List<wy> a(@Nullable dcd $$0, ezo $$1) {
      if ($$0 == null && this.b.isEmpty()) {
         return List.of();
      } else {
         UnaryOperator<wy> $$2 = fbx.a($$1, this.d.orElse(null));
         List<wy> $$3 = this.b.stream().map($$2).toList();
         return this.c.a($$0.a(), $$3, 256);
      }
   }

   public static fbw.a c() {
      return new fbw.a();
   }

   public static class a extends fbb.a<fbw.a> {
      private Optional<ezo.b> a = Optional.empty();
      private final Builder<wy> b = ImmutableList.builder();
      private fba c = fba.a.b;

      public fbw.a a(fba $$0) {
         this.c = $$0;
         return this;
      }

      public fbw.a a(ezo.b $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public fbw.a a(wy $$0) {
         this.b.add($$0);
         return this;
      }

      protected fbw.a a() {
         return this;
      }

      @Override
      public fbc b() {
         return new fbw(this.g(), this.b.build(), this.c, this.a);
      }
   }
}
