import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class fbv extends fcg {
   public static final MapCodec<fbv> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(fbv.a.e.fieldOf("source").forGetter($$0x -> $$0x.b)).apply($$0, fbv::new)
   );
   private final fbv.a b;

   private fbv(List<fec> $$0, fbv.a $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public fci<fbv> b() {
      return fcj.s;
   }

   @Override
   public Set<bbk<?>> a() {
      return Set.of(this.b.g);
   }

   @Override
   public dak a(dak $$0, fat $$1) {
      if ($$1.c(this.b.g) instanceof bvf $$3) {
         $$0.b(kl.g, $$3.aj());
      }

      return $$0;
   }

   public static fcg.a<?> a(fbv.a $$0) {
      return a($$1 -> new fbv($$1, $$0));
   }

   public static enum a implements bax {
      a("this", fdn.a),
      b("attacking_entity", fdn.d),
      c("last_damage_player", fdn.b),
      d("block_entity", fdn.h);

      public static final Codec<fbv.a> e = bax.a(fbv.a::values);
      private final String f;
      final bbk<?> g;

      private a(final String $$0, final bbk<?> $$1) {
         this.f = $$0;
         this.g = $$1;
      }

      @Override
      public String c() {
         return this.f;
      }
   }
}
