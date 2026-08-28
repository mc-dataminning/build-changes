import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class fpr {
   private static final ays.b<ale, MapCodec<? extends fpq>> b = new ays.b<>();
   public static final Codec<fpq> a = b.a(ale.a).dispatch(fpq::a, $$0 -> $$0);

   public static void a() {
      b.a(ale.b("custom_model_data"), fpm.a);
      b.a(ale.b("constant"), fpl.a);
      b.a(ale.b("dye"), fpn.a);
      b.a(ale.b("grass"), fpp.a);
      b.a(ale.b("firework"), fpo.a);
      b.a(ale.b("potion"), fpt.a);
      b.a(ale.b("map_color"), fps.a);
      b.a(ale.b("team"), fpu.a);
   }
}
