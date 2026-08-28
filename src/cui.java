import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record cui(jk<dlm> c) implements cum {
   public static final MapCodec<cui> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(jv.a(mi.aG).fieldOf("biomes").forGetter(cui::b)).apply($$0, cui::new));

   public boolean a(cuo $$0) {
      return this.c.a($$0.c());
   }

   @Override
   public MapCodec<cui> a() {
      return a;
   }

   public jk<dlm> b() {
      return this.c;
   }
}
