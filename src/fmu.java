import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class fmu {
   private static final ayi.b<akv, MapCodec<? extends fmt>> b = new ayi.b<>();
   public static final Codec<fmt> a = b.a(akv.a).dispatch(fmt::a, $$0 -> $$0);

   public static void a() {
      b.a(akv.b("custom_model_data"), fmp.a);
      b.a(akv.b("constant"), fmo.a);
      b.a(akv.b("dye"), fmq.a);
      b.a(akv.b("grass"), fms.a);
      b.a(akv.b("firework"), fmr.a);
      b.a(akv.b("potion"), fmw.a);
      b.a(akv.b("map_color"), fmv.a);
      b.a(akv.b("team"), fmx.a);
   }
}
