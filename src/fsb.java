import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class fsb {
   private static final azg.b<alr, MapCodec<? extends fsa>> b = new azg.b<>();
   public static final Codec<fsa> a = b.a(alr.a).dispatch(fsa::a, $$0 -> $$0);

   public static void a() {
      b.a(alr.b("custom_model_data"), frw.a);
      b.a(alr.b("constant"), frv.a);
      b.a(alr.b("dye"), frx.a);
      b.a(alr.b("grass"), frz.a);
      b.a(alr.b("firework"), fry.a);
      b.a(alr.b("potion"), fsd.a);
      b.a(alr.b("map_color"), fsc.a);
      b.a(alr.b("team"), fse.a);
   }
}
