import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record csx(ji<djy> c) implements ctb {
   public static final MapCodec<csx> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(jt.a(mg.aG).fieldOf("biomes").forGetter(csx::b)).apply($$0, csx::new));

   public boolean a(ctd $$0) {
      return this.c.a($$0.c());
   }

   @Override
   public MapCodec<csx> a() {
      return a;
   }

   public ji<djy> b() {
      return this.c;
   }
}
