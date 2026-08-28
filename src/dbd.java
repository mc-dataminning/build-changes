import com.mojang.serialization.Codec;
import java.util.List;

public interface dbd<T extends dbj> {
   Codec<dbd<?>> a = mb.r.q().dispatch(dbd::a, dbn::a);
   yn<wa, dbd<?>> b = yl.a(mc.ae).b(dbd::a, dbn::b);

   boolean a(T var1, dgh var2);

   cwo a(T var1, jt.a var2);

   default boolean ap_() {
      return false;
   }

   default boolean i() {
      return true;
   }

   default String j() {
      return "";
   }

   dbn<? extends dbd<T>> a();

   dbo<? extends dbd<T>> b();

   dbc ao_();

   default List<dci> g() {
      return List.of();
   }

   dbg h();
}
