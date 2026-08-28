import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ehy extends eht {
   public static final MapCodec<ehy> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(bpa.b(eht.c).fieldOf("distribution").forGetter($$0x -> $$0x.b)).apply($$0, ehy::new)
   );
   private final bpa<eht> b;

   public ehy(bpa<eht> $$0) {
      this.b = $$0;
   }

   @Override
   public int a(ayv $$0, dzs $$1) {
      return this.b.a($$0).orElseThrow(IllegalStateException::new).a($$0, $$1);
   }

   @Override
   public ehu<?> a() {
      return ehu.f;
   }
}
