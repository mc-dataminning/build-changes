import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eyb extends exd {
   public static final MapCodec<eyb> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(cyl.a.fieldOf("id").forGetter($$0x -> $$0x.b)).apply($$0, eyb::new));
   private final jr<cyl> b;

   private eyb(List<eyz> $$0, jr<cyl> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public exf<eyb> b() {
      return exg.F;
   }

   @Override
   public cwo a(cwo $$0, evq $$1) {
      $$0.a(kv.Q, cyn.a, this.b, cyn::b);
      return $$0;
   }

   public static exd.a<?> a(jr<cyl> $$0) {
      return a($$1 -> new eyb($$1, $$0));
   }
}
