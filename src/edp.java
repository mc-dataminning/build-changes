import com.mojang.serialization.Codec;

public interface edp<P extends edo> {
   edp<edm> a = a("clear", edm.a);
   edp<edn> b = a("passthrough", edn.b);
   edp<edl> c = a("append_static", edl.a);
   edp<edk> d = a("append_loot", edk.a);

   Codec<P> codec();

   private static <P extends edo> edp<P> a(String $$0, Codec<P> $$1) {
      return it.a(kd.p, $$0, () -> $$1);
   }
}
