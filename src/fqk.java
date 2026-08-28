import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class fqk {
   private static final ayu.b<alg, MapCodec<? extends fqj>> b = new ayu.b<>();
   public static final Codec<fqj> a = b.a(alg.a).dispatch(fqj::a, $$0 -> $$0);

   public static void a() {
      b.a(alg.b("custom_model_data"), fqf.a);
      b.a(alg.b("constant"), fqe.a);
      b.a(alg.b("dye"), fqg.a);
      b.a(alg.b("grass"), fqi.a);
      b.a(alg.b("firework"), fqh.a);
      b.a(alg.b("potion"), fqm.a);
      b.a(alg.b("map_color"), fql.a);
      b.a(alg.b("team"), fqn.a);
   }
}
