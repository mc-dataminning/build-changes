import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eyc extends exe {
   public static final MapCodec<eyc> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(cym.a.fieldOf("id").forGetter($$0x -> $$0x.b)).apply($$0, eyc::new));
   private final jr<cym> b;

   private eyc(List<eza> $$0, jr<cym> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public exg<eyc> b() {
      return exh.F;
   }

   @Override
   public cwp a(cwp $$0, evr $$1) {
      $$0.a(kv.Q, cyo.a, this.b, cyo::b);
      return $$0;
   }

   public static exe.a<?> a(jr<cym> $$0) {
      return a($$1 -> new eyc($$1, $$0));
   }
}
