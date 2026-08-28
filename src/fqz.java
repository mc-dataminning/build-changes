import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class fqz {
   private static final ayu.b<alg, MapCodec<? extends fqy>> b = new ayu.b<>();
   public static final Codec<fqy> a = b.a(alg.a).dispatch(fqy::a, $$0 -> $$0);

   public static void a() {
      b.a(alg.b("custom_model_data"), fqu.a);
      b.a(alg.b("constant"), fqt.a);
      b.a(alg.b("dye"), fqv.a);
      b.a(alg.b("grass"), fqx.a);
      b.a(alg.b("firework"), fqw.a);
      b.a(alg.b("potion"), frb.a);
      b.a(alg.b("map_color"), fra.a);
      b.a(alg.b("team"), frc.a);
   }
}
