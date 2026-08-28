import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;

public class eya extends exf {
   public static final MapCodec<eya> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  wr.a.sizeLimitedListOf(256).fieldOf("lore").forGetter($$0x -> $$0x.b),
                  exe.a(256).forGetter($$0x -> $$0x.c),
                  evs.b.e.optionalFieldOf("entity").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, eya::new)
   );
   private final List<wp> b;
   private final exe c;
   private final Optional<evs.b> d;

   public eya(List<ezb> $$0, List<wp> $$1, exe $$2, Optional<evs.b> $$3) {
      super($$0);
      this.b = List.copyOf($$1);
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public exh<eya> b() {
      return exi.A;
   }

   @Override
   public Set<bai<?>> a() {
      return this.d.<Set<bai<?>>>map($$0 -> Set.of($$0.a())).orElseGet(Set::of);
   }

   @Override
   public cwq a(cwq $$0, evs $$1) {
      $$0.a(kv.j, czj.a, $$1x -> new czj(this.a($$1x, $$1)));
      return $$0;
   }

   private List<wp> a(@Nullable czj $$0, evs $$1) {
      if ($$0 == null && this.b.isEmpty()) {
         return List.of();
      } else {
         UnaryOperator<wp> $$2 = eyb.a($$1, this.d.orElse(null));
         List<wp> $$3 = this.b.stream().map($$2).toList();
         return this.c.a($$0.a(), $$3, 256);
      }
   }

   public static eya.a c() {
      return new eya.a();
   }

   public static class a extends exf.a<eya.a> {
      private Optional<evs.b> a = Optional.empty();
      private final Builder<wp> b = ImmutableList.builder();
      private exe c = exe.a.b;

      public eya.a a(exe $$0) {
         this.c = $$0;
         return this;
      }

      public eya.a a(evs.b $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public eya.a a(wp $$0) {
         this.b.add($$0);
         return this;
      }

      protected eya.a a() {
         return this;
      }

      @Override
      public exg b() {
         return new eya(this.g(), this.b.build(), this.c, this.a);
      }
   }
}
