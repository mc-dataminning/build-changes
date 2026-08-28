import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class fms {
   private static final ayh.b<aku, MapCodec<? extends fmr>> b = new ayh.b<>();
   public static final Codec<fmr> a = b.a(aku.a).dispatch(fmr::a, $$0 -> $$0);

   public static void a() {
      b.a(aku.b("custom_model_data"), fmn.a);
      b.a(aku.b("constant"), fmm.a);
      b.a(aku.b("dye"), fmo.a);
      b.a(aku.b("grass"), fmq.a);
      b.a(aku.b("firework"), fmp.a);
      b.a(aku.b("potion"), fmu.a);
      b.a(aku.b("map_color"), fmt.a);
   }
}
