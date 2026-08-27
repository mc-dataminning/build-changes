import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dtw extends dtr {
   public static final Codec<dtw> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(bfk.b(dtr.c).fieldOf("distribution").forGetter($$0x -> $$0x.b)).apply($$0, dtw::new)
   );
   private final bfk<dtr> b;

   public dtw(bfk<dtr> $$0) {
      this.b = $$0;
   }

   @Override
   public int a(ase $$0, dlr $$1) {
      return this.b.a($$0).orElseThrow(IllegalStateException::new).a($$0, $$1);
   }

   @Override
   public dts<?> a() {
      return dts.f;
   }
}
