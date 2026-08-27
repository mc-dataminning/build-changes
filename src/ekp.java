import com.mojang.serialization.Codec;

public class ekp {
   public static final Codec<ekr> a = kh.F.q().dispatch(ekr::a, eks::a);
   public static final eks b = a("empty", ekm.a);
   public static final eks c = a("item", eko.a);
   public static final eks d = a("loot_table", eku.a);
   public static final eks e = a("dynamic", ekl.a);
   public static final eks f = a("tag", ekw.a);
   public static final eks g = a("alternatives", eki.a);
   public static final eks h = a("sequence", ekv.a);
   public static final eks i = a("group", ekn.a);

   private static eks a(String $$0, Codec<? extends ekr> $$1) {
      return ix.a(kh.F, new ajc($$0), new eks($$1));
   }
}
