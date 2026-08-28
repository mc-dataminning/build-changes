import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class fnr {
   private static final ayi.b<aku, MapCodec<? extends fnq>> b = new ayi.b<>();
   public static final Codec<fnq> a = b.a(aku.a).dispatch(fnq::a, $$0 -> $$0);

   public static void a() {
      b.a(aku.b("custom_model_data"), fnm.a);
      b.a(aku.b("constant"), fnl.a);
      b.a(aku.b("dye"), fnn.a);
      b.a(aku.b("grass"), fnp.a);
      b.a(aku.b("firework"), fno.a);
      b.a(aku.b("potion"), fnt.a);
      b.a(aku.b("map_color"), fns.a);
      b.a(aku.b("team"), fnu.a);
   }
}
