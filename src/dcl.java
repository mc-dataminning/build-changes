import com.mojang.serialization.Codec;
import java.util.List;

public interface dcl<T extends dcr> {
   Codec<dcl<?>> a = md.r.q().dispatch(dcl::a, dcv::a);
   yt<wg, dcl<?>> b = yr.a(me.ae).b(dcl::a, dcv::b);

   boolean a(T var1, dhp var2);

   cxy a(T var1, ju.a var2);

   default boolean al_() {
      return false;
   }

   default boolean i() {
      return true;
   }

   default String j() {
      return "";
   }

   dcv<? extends dcl<T>> a();

   dcw<? extends dcl<T>> b();

   dck ak_();

   default List<ddr> g() {
      return List.of();
   }

   dco h();
}
