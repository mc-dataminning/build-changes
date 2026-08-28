import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class exy extends exe {
   public static final MapCodec<exy> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(cwl.e.fieldOf("item").forGetter($$0x -> $$0x.b)).apply($$0, exy::new));
   private final jr<cwl> b;

   private exy(List<eza> $$0, jr<cwl> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public exg<exy> b() {
      return exh.f;
   }

   @Override
   public cwp a(cwp $$0, evr $$1) {
      return $$0.a(this.b.a());
   }
}
