import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;

public class exy extends exd {
   public static final MapCodec<exy> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  wr.a.sizeLimitedListOf(256).fieldOf("lore").forGetter($$0x -> $$0x.b),
                  exc.a(256).forGetter($$0x -> $$0x.c),
                  evq.b.e.optionalFieldOf("entity").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, exy::new)
   );
   private final List<wp> b;
   private final exc c;
   private final Optional<evq.b> d;

   public exy(List<eyz> $$0, List<wp> $$1, exc $$2, Optional<evq.b> $$3) {
      super($$0);
      this.b = List.copyOf($$1);
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public exf<exy> b() {
      return exg.A;
   }

   @Override
   public Set<bai<?>> a() {
      return this.d.<Set<bai<?>>>map($$0 -> Set.of($$0.a())).orElseGet(Set::of);
   }

   @Override
   public cwo a(cwo $$0, evq $$1) {
      $$0.a(kv.j, czh.a, $$1x -> new czh(this.a($$1x, $$1)));
      return $$0;
   }

   private List<wp> a(@Nullable czh $$0, evq $$1) {
      if ($$0 == null && this.b.isEmpty()) {
         return List.of();
      } else {
         UnaryOperator<wp> $$2 = exz.a($$1, this.d.orElse(null));
         List<wp> $$3 = this.b.stream().map($$2).toList();
         return this.c.a($$0.a(), $$3, 256);
      }
   }

   public static exy.a c() {
      return new exy.a();
   }

   public static class a extends exd.a<exy.a> {
      private Optional<evq.b> a = Optional.empty();
      private final Builder<wp> b = ImmutableList.builder();
      private exc c = exc.a.b;

      public exy.a a(exc $$0) {
         this.c = $$0;
         return this;
      }

      public exy.a a(evq.b $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public exy.a a(wp $$0) {
         this.b.add($$0);
         return this;
      }

      protected exy.a a() {
         return this;
      }

      @Override
      public exe b() {
         return new exy(this.g(), this.b.build(), this.c, this.a);
      }
   }
}
