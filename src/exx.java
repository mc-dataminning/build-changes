import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;

public class exx extends exc {
   public static final MapCodec<exx> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  wq.a.sizeLimitedListOf(256).fieldOf("lore").forGetter($$0x -> $$0x.b),
                  exb.a(256).forGetter($$0x -> $$0x.c),
                  evp.b.e.optionalFieldOf("entity").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, exx::new)
   );
   private final List<wo> b;
   private final exb c;
   private final Optional<evp.b> d;

   public exx(List<eyy> $$0, List<wo> $$1, exb $$2, Optional<evp.b> $$3) {
      super($$0);
      this.b = List.copyOf($$1);
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public exe<exx> b() {
      return exf.A;
   }

   @Override
   public Set<bah<?>> a() {
      return this.d.<Set<bah<?>>>map($$0 -> Set.of($$0.a())).orElseGet(Set::of);
   }

   @Override
   public cwn a(cwn $$0, evp $$1) {
      $$0.a(kv.j, czg.a, $$1x -> new czg(this.a($$1x, $$1)));
      return $$0;
   }

   private List<wo> a(@Nullable czg $$0, evp $$1) {
      if ($$0 == null && this.b.isEmpty()) {
         return List.of();
      } else {
         UnaryOperator<wo> $$2 = exy.a($$1, this.d.orElse(null));
         List<wo> $$3 = this.b.stream().map($$2).toList();
         return this.c.a($$0.a(), $$3, 256);
      }
   }

   public static exx.a c() {
      return new exx.a();
   }

   public static class a extends exc.a<exx.a> {
      private Optional<evp.b> a = Optional.empty();
      private final Builder<wo> b = ImmutableList.builder();
      private exb c = exb.a.b;

      public exx.a a(exb $$0) {
         this.c = $$0;
         return this;
      }

      public exx.a a(evp.b $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public exx.a a(wo $$0) {
         this.b.add($$0);
         return this;
      }

      protected exx.a a() {
         return this;
      }

      @Override
      public exd b() {
         return new exx(this.g(), this.b.build(), this.c, this.a);
      }
   }
}
