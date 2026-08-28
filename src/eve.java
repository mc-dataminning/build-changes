import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class eve extends evp {
   public static final MapCodec<eve> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(eve.a.e.fieldOf("source").forGetter($$0x -> $$0x.b)).apply($$0, eve::new)
   );
   private final eve.a b;

   private eve(List<exn> $$0, eve.a $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public evr<eve> b() {
      return evs.s;
   }

   @Override
   public Set<ewv<?>> a() {
      return ImmutableSet.of(this.b.g);
   }

   @Override
   public cwb a(cwb $$0, euc $$1) {
      if ($$1.c(this.b.g) instanceof bsg $$3) {
         $$0.b(ku.g, $$3.ao());
      }

      return $$0;
   }

   public static evp.a<?> a(eve.a $$0) {
      return a($$1 -> new eve($$1, $$0));
   }

   public static enum a implements bag {
      a("this", ewy.a),
      b("attacking_entity", ewy.d),
      c("last_damage_player", ewy.b),
      d("block_entity", ewy.h);

      public static final Codec<eve.a> e = bag.a(eve.a::values);
      private final String f;
      final ewv<?> g;

      private a(final String $$0, final ewv<?> $$1) {
         this.f = $$0;
         this.g = $$1;
      }

      @Override
      public String c() {
         return this.f;
      }
   }
}
