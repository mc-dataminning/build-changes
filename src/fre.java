import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class fre {
   private static final ayu.b<alg, MapCodec<? extends frd>> b = new ayu.b<>();
   public static final Codec<frd> a = b.a(alg.a).dispatch(frd::a, $$0 -> $$0);

   public static void a() {
      b.a(alg.b("custom_model_data"), fqz.a);
      b.a(alg.b("constant"), fqy.a);
      b.a(alg.b("dye"), fra.a);
      b.a(alg.b("grass"), frc.a);
      b.a(alg.b("firework"), frb.a);
      b.a(alg.b("potion"), frg.a);
      b.a(alg.b("map_color"), frf.a);
      b.a(alg.b("team"), frh.a);
   }
}
