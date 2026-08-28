import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class fmu {
   private static final ayi.b<aku, MapCodec<? extends fmt>> b = new ayi.b<>();
   public static final Codec<fmt> a = b.a(aku.a).dispatch(fmt::a, $$0 -> $$0);

   public static void a() {
      b.a(aku.b("custom_model_data"), fmp.a);
      b.a(aku.b("constant"), fmo.a);
      b.a(aku.b("dye"), fmq.a);
      b.a(aku.b("grass"), fms.a);
      b.a(aku.b("firework"), fmr.a);
      b.a(aku.b("potion"), fmw.a);
      b.a(aku.b("map_color"), fmv.a);
   }
}
