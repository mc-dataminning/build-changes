import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class exp extends exd {
   public static final MapCodec<exp> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(uo.j.fieldOf("tag").forGetter($$0x -> $$0x.b)).apply($$0, exp::new));
   private final tq b;

   private exp(List<eyz> $$0, tq $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public exf<exp> b() {
      return exg.j;
   }

   @Override
   public cwo a(cwo $$0, evq $$1) {
      cyx.a(kv.b, $$0, $$0x -> $$0x.a(this.b));
      return $$0;
   }

   @Deprecated
   public static exd.a<?> a(tq $$0) {
      return a($$1 -> new exp($$1, $$0));
   }
}
