import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class esd {
   public static final Codec<esf> a = lt.D.r().dispatch(esf::a, esg::a);
   public static final esg b = a("empty", esa.a);
   public static final esg c = a("item", esc.a);
   public static final esg d = a("loot_table", esi.a);
   public static final esg e = a("dynamic", erz.a);
   public static final esg f = a("tag", esk.a);
   public static final esg g = a("alternatives", erw.a);
   public static final esg h = a("sequence", esj.a);
   public static final esg i = a("group", esb.a);

   private static esg a(String $$0, MapCodec<? extends esf> $$1) {
      return jz.a(lt.D, akr.b($$0), new esg($$1));
   }
}
