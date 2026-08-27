import com.mojang.serialization.Codec;

public interface dwc<P extends dwb> {
   dwc<dvz> a = a("clear", dvz.a);
   dwc<dwa> b = a("passthrough", dwa.b);
   dwc<dvy> c = a("append_static", dvy.a);
   dwc<dvx> d = a("append_loot", dvx.a);

   Codec<P> codec();

   private static <P extends dwb> dwc<P> a(String $$0, Codec<P> $$1) {
      return hr.a(jb.q, $$0, () -> $$1);
   }
}
