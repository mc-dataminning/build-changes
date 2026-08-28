import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class fbs extends fau {
   public static final MapCodec<fbs> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(dax.a.fieldOf("id").forGetter($$0x -> $$0x.b)).apply($$0, fbs::new));
   private final je<dax> b;

   private fbs(List<fcq> $$0, je<dax> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public faw<fbs> b() {
      return fax.F;
   }

   @Override
   public czd a(czd $$0, ezh $$1) {
      $$0.a(kj.R, daz.a, this.b, daz::b);
      return $$0;
   }

   public static fau.a<?> a(je<dax> $$0) {
      return a($$1 -> new fbs($$1, $$0));
   }
}
