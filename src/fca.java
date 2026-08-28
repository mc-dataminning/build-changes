import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class fca extends fbg {
   public static final MapCodec<fca> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(czj.e.fieldOf("item").forGetter($$0x -> $$0x.b)).apply($$0, fca::new));
   private final jf<czj> b;

   private fca(List<fdc> $$0, jf<czj> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public fbi<fca> b() {
      return fbj.f;
   }

   @Override
   public czn a(czn $$0, ezt $$1) {
      return $$0.a(this.b.a());
   }
}
