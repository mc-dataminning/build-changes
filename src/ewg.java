import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class ewg {
   public static final Codec<ewi> a = mb.D.q().dispatch(ewi::a, ewj::a);
   public static final ewj b = a("empty", ewd.a);
   public static final ewj c = a("item", ewf.a);
   public static final ewj d = a("loot_table", ewl.a);
   public static final ewj e = a("dynamic", ewc.a);
   public static final ewj f = a("tag", ewn.a);
   public static final ewj g = a("alternatives", evz.a);
   public static final ewj h = a("sequence", ewm.a);
   public static final ewj i = a("group", ewe.a);

   private static ewj a(String $$0, MapCodec<? extends ewi> $$1) {
      return ke.a(mb.D, akv.b($$0), new ewj($$1));
   }
}
