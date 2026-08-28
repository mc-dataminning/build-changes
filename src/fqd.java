import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class fqd {
   private static final ayu.b<alg, MapCodec<? extends fqc>> b = new ayu.b<>();
   public static final Codec<fqc> a = b.a(alg.a).dispatch(fqc::a, $$0 -> $$0);

   public static void a() {
      b.a(alg.b("custom_model_data"), fpy.a);
      b.a(alg.b("constant"), fpx.a);
      b.a(alg.b("dye"), fpz.a);
      b.a(alg.b("grass"), fqb.a);
      b.a(alg.b("firework"), fqa.a);
      b.a(alg.b("potion"), fqf.a);
      b.a(alg.b("map_color"), fqe.a);
      b.a(alg.b("team"), fqg.a);
   }
}
