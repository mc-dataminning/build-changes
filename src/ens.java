import com.mojang.serialization.Codec;

public class ens {
   public static final Codec<enu> a = kr.F.q().dispatch(enu::a, env::a);
   public static final env b = a("empty", enp.a);
   public static final env c = a("item", enr.a);
   public static final env d = a("loot_table", enx.a);
   public static final env e = a("dynamic", eno.a);
   public static final env f = a("tag", enz.a);
   public static final env g = a("alternatives", enl.a);
   public static final env h = a("sequence", eny.a);
   public static final env i = a("group", enq.a);

   private static env a(String $$0, Codec<? extends enu> $$1) {
      return iy.a(kr.F, new ajt($$0), new env($$1));
   }
}
