import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class fmv {
   private static final ayi.b<akv, MapCodec<? extends fmu>> b = new ayi.b<>();
   public static final Codec<fmu> a = b.a(akv.a).dispatch(fmu::a, $$0 -> $$0);

   public static void a() {
      b.a(akv.b("custom_model_data"), fmq.a);
      b.a(akv.b("constant"), fmp.a);
      b.a(akv.b("dye"), fmr.a);
      b.a(akv.b("grass"), fmt.a);
      b.a(akv.b("firework"), fms.a);
      b.a(akv.b("potion"), fmx.a);
      b.a(akv.b("map_color"), fmw.a);
      b.a(akv.b("team"), fmy.a);
   }
}
