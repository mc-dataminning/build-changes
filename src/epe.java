import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class epe extends eoo {
   public static final Codec<epe> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  Codec.BOOL.fieldOf("replace").orElse(false).forGetter($$0x -> $$0x.b),
                  wi.a.listOf().fieldOf("lore").forGetter($$0x -> $$0x.c),
                  aws.a(enb.b.e, "entity").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, epe::new)
   );
   private final boolean b;
   private final List<wg> c;
   private final Optional<enb.b> d;

   public epe(List<eqc> $$0, boolean $$1, List<wg> $$2, Optional<enb.b> $$3) {
      super($$0);
      this.b = $$1;
      this.c = List.copyOf($$2);
      this.d = $$3;
   }

   @Override
   public eoq b() {
      return eor.v;
   }

   @Override
   public Set<epl<?>> a() {
      return this.d.<Set<epl<?>>>map($$0 -> Set.of($$0.a())).orElseGet(Set::of);
   }

   @Override
   public crj a(crj $$0, enb $$1) {
      $$0.a(jp.e, cub.a, $$1x -> new cub(this.a($$1x, $$1)));
      return $$0;
   }

   private List<wg> a(@Nullable cub $$0, enb $$1) {
      if ($$0 == null && this.c.isEmpty()) {
         return List.of();
      } else {
         UnaryOperator<wg> $$2 = epf.a($$1, this.d.orElse(null));
         Stream<wg> $$3 = this.c.stream().map($$2);
         return !this.b && $$0 != null ? Stream.concat($$0.a().stream(), $$3).toList() : $$3.toList();
      }
   }

   public static epe.a c() {
      return new epe.a();
   }

   public static class a extends eoo.a<epe.a> {
      private boolean a;
      private Optional<enb.b> b = Optional.empty();
      private final Builder<wg> c = ImmutableList.builder();

      public epe.a a(boolean $$0) {
         this.a = $$0;
         return this;
      }

      public epe.a a(enb.b $$0) {
         this.b = Optional.of($$0);
         return this;
      }

      public epe.a a(wg $$0) {
         this.c.add($$0);
         return this;
      }

      protected epe.a a() {
         return this;
      }

      @Override
      public eop b() {
         return new epe(this.g(), this.a, this.c.build(), this.b);
      }
   }
}
