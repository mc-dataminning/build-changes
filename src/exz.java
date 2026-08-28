import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;

public class exz extends exe {
   public static final MapCodec<exz> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  wr.a.sizeLimitedListOf(256).fieldOf("lore").forGetter($$0x -> $$0x.b),
                  exd.a(256).forGetter($$0x -> $$0x.c),
                  evr.b.e.optionalFieldOf("entity").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, exz::new)
   );
   private final List<wp> b;
   private final exd c;
   private final Optional<evr.b> d;

   public exz(List<eza> $$0, List<wp> $$1, exd $$2, Optional<evr.b> $$3) {
      super($$0);
      this.b = List.copyOf($$1);
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public exg<exz> b() {
      return exh.A;
   }

   @Override
   public Set<bai<?>> a() {
      return this.d.<Set<bai<?>>>map($$0 -> Set.of($$0.a())).orElseGet(Set::of);
   }

   @Override
   public cwp a(cwp $$0, evr $$1) {
      $$0.a(kv.j, czi.a, $$1x -> new czi(this.a($$1x, $$1)));
      return $$0;
   }

   private List<wp> a(@Nullable czi $$0, evr $$1) {
      if ($$0 == null && this.b.isEmpty()) {
         return List.of();
      } else {
         UnaryOperator<wp> $$2 = eya.a($$1, this.d.orElse(null));
         List<wp> $$3 = this.b.stream().map($$2).toList();
         return this.c.a($$0.a(), $$3, 256);
      }
   }

   public static exz.a c() {
      return new exz.a();
   }

   public static class a extends exe.a<exz.a> {
      private Optional<evr.b> a = Optional.empty();
      private final Builder<wp> b = ImmutableList.builder();
      private exd c = exd.a.b;

      public exz.a a(exd $$0) {
         this.c = $$0;
         return this;
      }

      public exz.a a(evr.b $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public exz.a a(wp $$0) {
         this.b.add($$0);
         return this;
      }

      protected exz.a a() {
         return this;
      }

      @Override
      public exf b() {
         return new exz(this.g(), this.b.build(), this.c, this.a);
      }
   }
}
