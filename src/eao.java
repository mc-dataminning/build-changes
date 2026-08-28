import com.mojang.serialization.Codec;
import java.util.Optional;

public interface eao {
   Codec<eao> c = lz.t.q().dispatch(eao::a, eap::a);
   zj<ww, eao> d = zh.a(ma.ab).b(eao::a, eap::b);

   Optional<ezr> a(dff var1);

   eap<? extends eao> a();
}
