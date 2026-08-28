import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class egz extends ehf {
   final axp<dlu> a;
   public static final MapCodec<egz> e = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(axp.a(mg.i).fieldOf("tag").forGetter($$0x -> $$0x.a)).apply($$0, egz::new)
   );

   protected egz(jz $$0, axp<dlu> $$1) {
      super($$0);
      this.a = $$1;
   }

   @Override
   protected boolean a(dzo $$0) {
      return $$0.a(this.a);
   }

   @Override
   public egv<?> a() {
      return egv.b;
   }
}
