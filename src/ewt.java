import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class ewt extends exe {
   public static final MapCodec<ewt> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(ewt.a.e.fieldOf("source").forGetter($$0x -> $$0x.b)).apply($$0, ewt::new)
   );
   private final ewt.a b;

   private ewt(List<eza> $$0, ewt.a $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public exg<ewt> b() {
      return exh.s;
   }

   @Override
   public Set<bai<?>> a() {
      return Set.of(this.b.g);
   }

   @Override
   public cwp a(cwp $$0, evr $$1) {
      if ($$1.c(this.b.g) instanceof bsm $$3) {
         $$0.b(kv.g, $$3.an());
      }

      return $$0;
   }

   public static exe.a<?> a(ewt.a $$0) {
      return a($$1 -> new ewt($$1, $$0));
   }

   public static enum a implements azv {
      a("this", eyl.a),
      b("attacking_entity", eyl.d),
      c("last_damage_player", eyl.b),
      d("block_entity", eyl.h);

      public static final Codec<ewt.a> e = azv.a(ewt.a::values);
      private final String f;
      final bai<?> g;

      private a(final String $$0, final bai<?> $$1) {
         this.f = $$0;
         this.g = $$1;
      }

      @Override
      public String c() {
         return this.f;
      }
   }
}
