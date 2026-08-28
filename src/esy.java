import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class esy extends esh {
   public static final MapCodec<esy> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(awm.b(lr.I).fieldOf("options").forGetter($$0x -> $$0x.b)).apply($$0, esy::new)
   );
   private final awm<ctu> b;

   private esy(List<euf> $$0, awm<ctu> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public esj<esy> b() {
      return esk.G;
   }

   @Override
   public cuc a(cuc $$0, equ $$1) {
      ctv.a($$0, this.b, $$1.b());
      return $$0;
   }

   public static esh.a<?> a(awm<ctu> $$0) {
      return a($$1 -> new esy($$1, $$0));
   }
}
