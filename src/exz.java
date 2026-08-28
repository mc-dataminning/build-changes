import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class exz extends exf {
   public static final MapCodec<exz> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(cwm.e.fieldOf("item").forGetter($$0x -> $$0x.b)).apply($$0, exz::new));
   private final jr<cwm> b;

   private exz(List<ezb> $$0, jr<cwm> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public exh<exz> b() {
      return exi.f;
   }

   @Override
   public cwq a(cwq $$0, evs $$1) {
      return $$0.a(this.b.a());
   }
}
