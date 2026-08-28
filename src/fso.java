import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class fso {
   private static final ayw.b<ali, MapCodec<? extends fsn>> b = new ayw.b<>();
   public static final Codec<fsn> a = b.a(ali.a).dispatch(fsn::a, $$0 -> $$0);

   public static void a() {
      b.a(ali.b("custom_model_data"), fsj.a);
      b.a(ali.b("constant"), fsi.a);
      b.a(ali.b("dye"), fsk.a);
      b.a(ali.b("grass"), fsm.a);
      b.a(ali.b("firework"), fsl.a);
      b.a(ali.b("potion"), fsq.a);
      b.a(ali.b("map_color"), fsp.a);
      b.a(ali.b("team"), fsr.a);
   }
}
