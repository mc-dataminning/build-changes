import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eta extends esj {
   public static final MapCodec<eta> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(awm.b(lr.I).fieldOf("options").forGetter($$0x -> $$0x.b)).apply($$0, eta::new)
   );
   private final awm<ctv> b;

   private eta(List<euh> $$0, awm<ctv> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public esl<eta> b() {
      return esm.G;
   }

   @Override
   public cud a(cud $$0, eqw $$1) {
      ctw.a($$0, this.b, $$1.b());
      return $$0;
   }

   public static esj.a<?> a(awm<ctv> $$0) {
      return a($$1 -> new eta($$1, $$0));
   }
}
