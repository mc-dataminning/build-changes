import com.mojang.serialization.Codec;

public class eoz {
   public static final Codec<epb> a = ld.F.q().dispatch(epb::a, epc::a);
   public static final epc b = a("empty", eow.a);
   public static final epc c = a("item", eoy.a);
   public static final epc d = a("loot_table", epe.a);
   public static final epc e = a("dynamic", eov.a);
   public static final epc f = a("tag", epg.a);
   public static final epc g = a("alternatives", eos.a);
   public static final epc h = a("sequence", epf.a);
   public static final epc i = a("group", eox.a);

   private static epc a(String $$0, Codec<? extends epb> $$1) {
      return jj.a(ld.F, new akh($$0), new epc($$1));
   }
}
