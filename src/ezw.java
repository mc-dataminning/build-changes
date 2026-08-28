import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class ezw extends eyy {
   public static final MapCodec<ezw> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(czs.a.fieldOf("id").forGetter($$0x -> $$0x.b)).apply($$0, ezw::new));
   private final js<czs> b;

   private ezw(List<fau> $$0, js<czs> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public eza<ezw> b() {
      return ezb.F;
   }

   @Override
   public cxy a(cxy $$0, exl $$1) {
      $$0.a(kx.R, czu.a, this.b, czu::b);
      return $$0;
   }

   public static eyy.a<?> a(js<czs> $$0) {
      return a($$1 -> new ezw($$1, $$0));
   }
}
