import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class esr extends etc {
   public static final MapCodec<esr> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(esr.a.e.fieldOf("source").forGetter($$0x -> $$0x.b)).apply($$0, esr::new)
   );
   private final esr.a b;

   private esr(List<eva> $$0, esr.a $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public ete<esr> b() {
      return etf.s;
   }

   @Override
   public Set<eui<?>> a() {
      return ImmutableSet.of(this.b.g);
   }

   @Override
   public cuq a(cuq $$0, erp $$1) {
      if ($$1.c(this.b.g) instanceof bqw $$3) {
         $$0.b(kq.g, $$3.aj());
      }

      return $$0;
   }

   public static etc.a<?> a(esr.a $$0) {
      return a($$1 -> new esr($$1, $$0));
   }

   public static enum a implements azk {
      a("this", eul.a),
      b("attacking_entity", eul.d),
      c("last_damage_player", eul.b),
      d("block_entity", eul.h);

      public static final Codec<esr.a> e = azk.a(esr.a::values);
      private final String f;
      final eui<?> g;

      private a(final String $$0, final eui<?> $$1) {
         this.f = $$0;
         this.g = $$1;
      }

      @Override
      public String c() {
         return this.f;
      }
   }
}
