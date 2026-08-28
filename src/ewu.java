import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class ewu extends exf {
   public static final MapCodec<ewu> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(ewu.a.e.fieldOf("source").forGetter($$0x -> $$0x.b)).apply($$0, ewu::new)
   );
   private final ewu.a b;

   private ewu(List<ezb> $$0, ewu.a $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public exh<ewu> b() {
      return exi.s;
   }

   @Override
   public Set<bai<?>> a() {
      return Set.of(this.b.g);
   }

   @Override
   public cwq a(cwq $$0, evs $$1) {
      if ($$1.c(this.b.g) instanceof bso $$3) {
         $$0.b(kv.g, $$3.an());
      }

      return $$0;
   }

   public static exf.a<?> a(ewu.a $$0) {
      return a($$1 -> new ewu($$1, $$0));
   }

   public static enum a implements azv {
      a("this", eym.a),
      b("attacking_entity", eym.d),
      c("last_damage_player", eym.b),
      d("block_entity", eym.h);

      public static final Codec<ewu.a> e = azv.a(ewu.a::values);
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
