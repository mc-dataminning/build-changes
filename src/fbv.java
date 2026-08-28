import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class fbv extends fbb {
   public static final MapCodec<fbv> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(czg.e.fieldOf("item").forGetter($$0x -> $$0x.b)).apply($$0, fbv::new));
   private final jf<czg> b;

   private fbv(List<fcx> $$0, jf<czg> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public fbd<fbv> b() {
      return fbe.f;
   }

   @Override
   public czk a(czk $$0, ezo $$1) {
      return $$0.a(this.b.a());
   }
}
