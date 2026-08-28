import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class eyn extends eyy {
   public static final MapCodec<eyn> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(eyn.a.e.fieldOf("source").forGetter($$0x -> $$0x.b)).apply($$0, eyn::new)
   );
   private final eyn.a b;

   private eyn(List<fau> $$0, eyn.a $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public eza<eyn> b() {
      return ezb.s;
   }

   @Override
   public Set<bat<?>> a() {
      return Set.of(this.b.g);
   }

   @Override
   public cxy a(cxy $$0, exl $$1) {
      if ($$1.c(this.b.g) instanceof btt $$3) {
         $$0.b(kx.g, $$3.an());
      }

      return $$0;
   }

   public static eyy.a<?> a(eyn.a $$0) {
      return a($$1 -> new eyn($$1, $$0));
   }

   public static enum a implements bag {
      a("this", faf.a),
      b("attacking_entity", faf.d),
      c("last_damage_player", faf.b),
      d("block_entity", faf.h);

      public static final Codec<eyn.a> e = bag.a(eyn.a::values);
      private final String f;
      final bat<?> g;

      private a(final String $$0, final bat<?> $$1) {
         this.f = $$0;
         this.g = $$1;
      }

      @Override
      public String c() {
         return this.f;
      }
   }
}
