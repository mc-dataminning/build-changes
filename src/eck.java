import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eck implements ecg {
   public static final MapCodec<eck> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(kk.v(16).optionalFieldOf("offset", jg.c).forGetter($$0x -> $$0x.e)).apply($$0, eck::new)
   );
   private final kk e;

   public eck(kk $$0) {
      this.e = $$0;
   }

   public boolean a(dfs $$0, jg $$1) {
      return !$$0.s($$1.a(this.e));
   }

   @Override
   public ech<?> a() {
      return ech.h;
   }
}
