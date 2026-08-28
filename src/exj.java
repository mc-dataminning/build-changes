import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class exj extends exu {
   public static final MapCodec<exj> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(exj.a.e.fieldOf("source").forGetter($$0x -> $$0x.b)).apply($$0, exj::new)
   );
   private final exj.a b;

   private exj(List<ezs> $$0, exj.a $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public exw<exj> b() {
      return exx.s;
   }

   @Override
   public Set<eza<?>> a() {
      return ImmutableSet.of(this.b.g);
   }

   @Override
   public cxk a(cxk $$0, ewh $$1) {
      if ($$1.c(this.b.g) instanceof bth $$3) {
         $$0.b(ku.g, $$3.an());
      }

      return $$0;
   }

   public static exu.a<?> a(exj.a $$0) {
      return a($$1 -> new exj($$1, $$0));
   }

   public static enum a implements bba {
      a("this", ezd.a),
      b("attacking_entity", ezd.d),
      c("last_damage_player", ezd.b),
      d("block_entity", ezd.h);

      public static final Codec<exj.a> e = bba.a(exj.a::values);
      private final String f;
      final eza<?> g;

      private a(final String $$0, final eza<?> $$1) {
         this.f = $$0;
         this.g = $$1;
      }

      @Override
      public String c() {
         return this.f;
      }
   }
}
