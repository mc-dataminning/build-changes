import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class fax {
   public static final Codec<faz> a = mh.D.q().dispatch(faz::a, fba::a);
   public static final fba b = a("empty", fau.a);
   public static final fba c = a("item", faw.a);
   public static final fba d = a("loot_table", fbc.a);
   public static final fba e = a("dynamic", fat.a);
   public static final fba f = a("tag", fbe.a);
   public static final fba g = a("alternatives", faq.a);
   public static final fba h = a("sequence", fbd.a);
   public static final fba i = a("group", fav.a);

   private static fba a(String $$0, MapCodec<? extends faz> $$1) {
      return jt.a(mh.D, alk.b($$0), new fba($$1));
   }
}
