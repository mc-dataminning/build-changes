import com.mojang.serialization.Codec;
import java.util.List;

public interface ddj<T extends ddp> {
   Codec<ddj<?>> a = mf.r.q().dispatch(ddj::a, ddt::a);
   yu<wh, ddj<?>> b = ys.a(mg.ah).b(ddj::a, ddt::b);

   boolean a(T var1, dip var2);

   cys a(T var1, jg.a var2);

   default boolean al_() {
      return false;
   }

   default boolean i() {
      return true;
   }

   default String j() {
      return "";
   }

   ddt<? extends ddj<T>> a();

   ddu<? extends ddj<T>> b();

   ddi ak_();

   default List<dep> g() {
      return List.of();
   }

   ddm h();
}
