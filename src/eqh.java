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

public class eqh extends epo {
   public static final Codec<eqh> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  Codec.BOOL.fieldOf("replace").orElse(false).forGetter($$0x -> $$0x.b),
                  wu.a.listOf().fieldOf("lore").forGetter($$0x -> $$0x.c),
                  axe.a(eoa.b.e, "entity").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, eqh::new)
   );
   private final boolean b;
   private final List<ws> c;
   private final Optional<eoa.b> d;

   public eqh(List<erh> $$0, boolean $$1, List<ws> $$2, Optional<eoa.b> $$3) {
      super($$0);
      this.b = $$1;
      this.c = List.copyOf($$2);
      this.d = $$3;
   }

   @Override
   public epq b() {
      return epr.v;
   }

   @Override
   public Set<eqq<?>> a() {
      return this.d.<Set<eqq<?>>>map($$0 -> Set.of($$0.a())).orElseGet(Set::of);
   }

   @Override
   public csd a(csd $$0, eoa $$1) {
      $$0.a(jz.e, cuy.a, $$1x -> new cuy(this.a($$1x, $$1)));
      return $$0;
   }

   private List<ws> a(@Nullable cuy $$0, eoa $$1) {
      if ($$0 == null && this.c.isEmpty()) {
         return List.of();
      } else {
         UnaryOperator<ws> $$2 = eqi.a($$1, this.d.orElse(null));
         Stream<ws> $$3 = this.c.stream().map($$2);
         return !this.b && $$0 != null ? Stream.concat($$0.a().stream(), $$3).toList() : $$3.toList();
      }
   }

   public static eqh.a c() {
      return new eqh.a();
   }

   public static class a extends epo.a<eqh.a> {
      private boolean a;
      private Optional<eoa.b> b = Optional.empty();
      private final Builder<ws> c = ImmutableList.builder();

      public eqh.a a(boolean $$0) {
         this.a = $$0;
         return this;
      }

      public eqh.a a(eoa.b $$0) {
         this.b = Optional.of($$0);
         return this;
      }

      public eqh.a a(ws $$0) {
         this.c.add($$0);
         return this;
      }

      protected eqh.a a() {
         return this;
      }

      @Override
      public epp b() {
         return new eqh(this.g(), this.a, this.c.build(), this.b);
      }
   }
}
