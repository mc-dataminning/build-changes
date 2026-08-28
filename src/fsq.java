import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class fsq {
   private static final ayy.b<alk, MapCodec<? extends fsp>> b = new ayy.b<>();
   public static final Codec<fsp> a = b.a(alk.a).dispatch(fsp::a, $$0 -> $$0);

   public static void a() {
      b.a(alk.b("custom_model_data"), fsl.a);
      b.a(alk.b("constant"), fsk.a);
      b.a(alk.b("dye"), fsm.a);
      b.a(alk.b("grass"), fso.a);
      b.a(alk.b("firework"), fsn.a);
      b.a(alk.b("potion"), fss.a);
      b.a(alk.b("map_color"), fsr.a);
      b.a(alk.b("team"), fst.a);
   }
}
