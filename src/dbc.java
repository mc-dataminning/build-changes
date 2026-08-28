import com.mojang.serialization.Codec;
import java.util.List;

public interface dbc<T extends dbi> {
   Codec<dbc<?>> a = mb.r.q().dispatch(dbc::a, dbm::a);
   ym<vz, dbc<?>> b = yk.a(mc.ae).b(dbc::a, dbm::b);

   boolean a(T var1, dgg var2);

   cwn a(T var1, jt.a var2);

   default boolean ap_() {
      return false;
   }

   default boolean i() {
      return true;
   }

   default String j() {
      return "";
   }

   dbm<? extends dbc<T>> a();

   dbn<? extends dbc<T>> b();

   dbb ao_();

   default List<dch> g() {
      return List.of();
   }

   dbf h();
}
