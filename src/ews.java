import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class ews extends exd {
   public static final MapCodec<ews> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(ews.a.e.fieldOf("source").forGetter($$0x -> $$0x.b)).apply($$0, ews::new)
   );
   private final ews.a b;

   private ews(List<eyz> $$0, ews.a $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public exf<ews> b() {
      return exg.s;
   }

   @Override
   public Set<bai<?>> a() {
      return Set.of(this.b.g);
   }

   @Override
   public cwo a(cwo $$0, evq $$1) {
      if ($$1.c(this.b.g) instanceof bsm $$3) {
         $$0.b(kv.g, $$3.an());
      }

      return $$0;
   }

   public static exd.a<?> a(ews.a $$0) {
      return a($$1 -> new ews($$1, $$0));
   }

   public static enum a implements azv {
      a("this", eyk.a),
      b("attacking_entity", eyk.d),
      c("last_damage_player", eyk.b),
      d("block_entity", eyk.h);

      public static final Codec<ews.a> e = azv.a(ews.a::values);
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
