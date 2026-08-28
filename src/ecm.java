import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class ecm extends ecr {
   private final jt<dhy> e;
   public static final MapCodec<ecm> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(ke.a(ly.f).fieldOf("blocks").forGetter($$0x -> $$0x.e)).apply($$0, ecm::new)
   );

   public ecm(kk $$0, jt<dhy> $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   protected boolean a(dvd $$0) {
      return $$0.a(this.e);
   }

   @Override
   public ech<?> a() {
      return ech.a;
   }
}
