import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eir extends eix {
   final axv<dne> a;
   public static final MapCodec<eir> e = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(axv.a(mi.i).fieldOf("tag").forGetter($$0x -> $$0x.a)).apply($$0, eir::new)
   );

   protected eir(kb $$0, axv<dne> $$1) {
      super($$0);
      this.a = $$1;
   }

   @Override
   protected boolean a(ebg $$0) {
      return $$0.a(this.a);
   }

   @Override
   public ein<?> a() {
      return ein.b;
   }
}
