import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class fbo extends fau {
   public static final MapCodec<fbo> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(cyz.e.fieldOf("item").forGetter($$0x -> $$0x.b)).apply($$0, fbo::new));
   private final je<cyz> b;

   private fbo(List<fcq> $$0, je<cyz> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public faw<fbo> b() {
      return fax.f;
   }

   @Override
   public czd a(czd $$0, ezh $$1) {
      return $$0.a(this.b.a());
   }
}
