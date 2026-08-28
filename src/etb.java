import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class etb extends esh {
   public static final MapCodec<etb> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(akh.a(lr.K).fieldOf("item").forGetter($$0x -> $$0x.b)).apply($$0, etb::new)
   );
   private final jj<ctx> b;

   private etb(List<euf> $$0, jj<ctx> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public esj<etb> b() {
      return esk.f;
   }

   @Override
   public cuc a(cuc $$0, equ $$1) {
      return $$0.a(this.b.a());
   }
}
