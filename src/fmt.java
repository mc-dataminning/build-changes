import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class fmt {
   private static final ayi.b<akv, MapCodec<? extends fms>> b = new ayi.b<>();
   public static final Codec<fms> a = b.a(akv.a).dispatch(fms::a, $$0 -> $$0);

   public static void a() {
      b.a(akv.b("custom_model_data"), fmo.a);
      b.a(akv.b("constant"), fmn.a);
      b.a(akv.b("dye"), fmp.a);
      b.a(akv.b("grass"), fmr.a);
      b.a(akv.b("firework"), fmq.a);
      b.a(akv.b("potion"), fmv.a);
      b.a(akv.b("map_color"), fmu.a);
      b.a(akv.b("team"), fmw.a);
   }
}
