import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class exr extends eyc {
   public static final MapCodec<exr> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(exr.a.e.fieldOf("source").forGetter($$0x -> $$0x.b)).apply($$0, exr::new)
   );
   private final exr.a b;

   private exr(List<ezy> $$0, exr.a $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public eye<exr> b() {
      return eyf.s;
   }

   @Override
   public Set<bbn<?>> a() {
      return Set.of(this.b.g);
   }

   @Override
   public cxp a(cxp $$0, ewp $$1) {
      if ($$1.c(this.b.g) instanceof btm $$3) {
         $$0.b(ku.g, $$3.an());
      }

      return $$0;
   }

   public static eyc.a<?> a(exr.a $$0) {
      return a($$1 -> new exr($$1, $$0));
   }

   public static enum a implements bba {
      a("this", ezj.a),
      b("attacking_entity", ezj.d),
      c("last_damage_player", ezj.b),
      d("block_entity", ezj.h);

      public static final Codec<exr.a> e = bba.a(exr.a::values);
      private final String f;
      final bbn<?> g;

      private a(final String $$0, final bbn<?> $$1) {
         this.f = $$0;
         this.g = $$1;
      }

      @Override
      public String c() {
         return this.f;
      }
   }
}
