import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ecl extends ecr {
   final axp<dhy> a;
   public static final MapCodec<ecl> e = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(axp.a(ly.f).fieldOf("tag").forGetter($$0x -> $$0x.a)).apply($$0, ecl::new)
   );

   protected ecl(kk $$0, axp<dhy> $$1) {
      super($$0);
      this.a = $$1;
   }

   @Override
   protected boolean a(dvd $$0) {
      return $$0.a(this.a);
   }

   @Override
   public ech<?> a() {
      return ech.b;
   }
}
