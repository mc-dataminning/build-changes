import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class erw extends esh {
   public static final MapCodec<erw> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(erw.a.e.fieldOf("source").forGetter($$0x -> $$0x.b)).apply($$0, erw::new)
   );
   private final erw.a b;

   private erw(List<euf> $$0, erw.a $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public esj<erw> b() {
      return esk.s;
   }

   @Override
   public Set<etn<?>> a() {
      return ImmutableSet.of(this.b.g);
   }

   @Override
   public cuc a(cuc $$0, equ $$1) {
      if ($$1.c(this.b.g) instanceof bql $$3) {
         $$0.b(kn.g, $$3.ai());
      }

      return $$0;
   }

   public static esh.a<?> a(erw.a $$0) {
      return a($$1 -> new erw($$1, $$0));
   }

   public static enum a implements azc {
      a("this", etq.a),
      b("attacking_entity", etq.d),
      c("last_damage_player", etq.b),
      d("block_entity", etq.h);

      public static final Codec<erw.a> e = azc.a(erw.a::values);
      private final String f;
      final etn<?> g;

      private a(final String $$0, final etn<?> $$1) {
         this.f = $$0;
         this.g = $$1;
      }

      @Override
      public String c() {
         return this.f;
      }
   }
}
