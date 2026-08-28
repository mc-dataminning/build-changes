import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class exw extends exc {
   public static final MapCodec<exw> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(cwj.e.fieldOf("item").forGetter($$0x -> $$0x.b)).apply($$0, exw::new));
   private final jr<cwj> b;

   private exw(List<eyy> $$0, jr<cwj> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public exe<exw> b() {
      return exf.f;
   }

   @Override
   public cwn a(cwn $$0, evp $$1) {
      return $$0.a(this.b.a());
   }
}
