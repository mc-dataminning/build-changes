import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;

public class fdb extends fcg {
   public static final MapCodec<fdb> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  xi.a.sizeLimitedListOf(256).fieldOf("lore").forGetter($$0x -> $$0x.b),
                  fcf.a(256).forGetter($$0x -> $$0x.c),
                  fat.b.e.optionalFieldOf("entity").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, fdb::new)
   );
   private final List<xg> b;
   private final fcf c;
   private final Optional<fat.b> d;

   public fdb(List<fec> $$0, List<xg> $$1, fcf $$2, Optional<fat.b> $$3) {
      super($$0);
      this.b = List.copyOf($$1);
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public fci<fdb> b() {
      return fcj.A;
   }

   @Override
   public Set<bbk<?>> a() {
      return this.d.<Set<bbk<?>>>map($$0 -> Set.of($$0.a())).orElseGet(Set::of);
   }

   @Override
   public dak a(dak $$0, fat $$1) {
      $$0.a(kl.j, ddd.a, $$1x -> new ddd(this.a($$1x, $$1)));
      return $$0;
   }

   private List<xg> a(@Nullable ddd $$0, fat $$1) {
      if ($$0 == null && this.b.isEmpty()) {
         return List.of();
      } else {
         UnaryOperator<xg> $$2 = fdc.a($$1, this.d.orElse(null));
         List<xg> $$3 = this.b.stream().map($$2).toList();
         return this.c.a($$0.a(), $$3, 256);
      }
   }

   public static fdb.a c() {
      return new fdb.a();
   }

   public static class a extends fcg.a<fdb.a> {
      private Optional<fat.b> a = Optional.empty();
      private final Builder<xg> b = ImmutableList.builder();
      private fcf c = fcf.a.b;

      public fdb.a a(fcf $$0) {
         this.c = $$0;
         return this;
      }

      public fdb.a a(fat.b $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public fdb.a a(xg $$0) {
         this.b.add($$0);
         return this;
      }

      protected fdb.a a() {
         return this;
      }

      @Override
      public fch b() {
         return new fdb(this.g(), this.b.build(), this.c, this.a);
      }
   }
}
