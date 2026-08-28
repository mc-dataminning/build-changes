import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;

public class eyw extends eyb {
   public static final MapCodec<eyw> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  wr.a.sizeLimitedListOf(256).fieldOf("lore").forGetter($$0x -> $$0x.b),
                  eya.a(256).forGetter($$0x -> $$0x.c),
                  ewo.b.e.optionalFieldOf("entity").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, eyw::new)
   );
   private final List<wp> b;
   private final eya c;
   private final Optional<ewo.b> d;

   public eyw(List<ezx> $$0, List<wp> $$1, eya $$2, Optional<ewo.b> $$3) {
      super($$0);
      this.b = List.copyOf($$1);
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public eyd<eyw> b() {
      return eye.A;
   }

   @Override
   public Set<bai<?>> a() {
      return this.d.<Set<bai<?>>>map($$0 -> Set.of($$0.a())).orElseGet(Set::of);
   }

   @Override
   public cxh a(cxh $$0, ewo $$1) {
      $$0.a(kv.j, czy.a, $$1x -> new czy(this.a($$1x, $$1)));
      return $$0;
   }

   private List<wp> a(@Nullable czy $$0, ewo $$1) {
      if ($$0 == null && this.b.isEmpty()) {
         return List.of();
      } else {
         UnaryOperator<wp> $$2 = eyx.a($$1, this.d.orElse(null));
         List<wp> $$3 = this.b.stream().map($$2).toList();
         return this.c.a($$0.a(), $$3, 256);
      }
   }

   public static eyw.a c() {
      return new eyw.a();
   }

   public static class a extends eyb.a<eyw.a> {
      private Optional<ewo.b> a = Optional.empty();
      private final Builder<wp> b = ImmutableList.builder();
      private eya c = eya.a.b;

      public eyw.a a(eya $$0) {
         this.c = $$0;
         return this;
      }

      public eyw.a a(ewo.b $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public eyw.a a(wp $$0) {
         this.b.add($$0);
         return this;
      }

      protected eyw.a a() {
         return this;
      }

      @Override
      public eyc b() {
         return new eyw(this.g(), this.b.build(), this.c, this.a);
      }
   }
}
