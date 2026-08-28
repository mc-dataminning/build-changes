import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class exq extends exe {
   public static final MapCodec<exq> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(uo.j.fieldOf("tag").forGetter($$0x -> $$0x.b)).apply($$0, exq::new));
   private final tq b;

   private exq(List<eza> $$0, tq $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public exg<exq> b() {
      return exh.j;
   }

   @Override
   public cwp a(cwp $$0, evr $$1) {
      cyy.a(kv.b, $$0, $$0x -> $$0x.a(this.b));
      return $$0;
   }

   @Deprecated
   public static exe.a<?> a(tq $$0) {
      return a($$1 -> new exq($$1, $$0));
   }
}
