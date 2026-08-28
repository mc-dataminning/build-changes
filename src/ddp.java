import com.mojang.serialization.Codec;
import java.util.List;

public interface ddp<T extends ddv> {
   Codec<ddp<?>> a = mf.r.q().dispatch(ddp::a, ddz::a);
   yw<wj, ddp<?>> b = yu.a(mg.ah).b(ddp::a, ddz::b);

   boolean a(T var1, div var2);

   cyy a(T var1, jg.a var2);

   default boolean al_() {
      return false;
   }

   default boolean i() {
      return true;
   }

   default String j() {
      return "";
   }

   ddz<? extends ddp<T>> a();

   dea<? extends ddp<T>> b();

   ddo ak_();

   default List<dev> g() {
      return List.of();
   }

   dds h();
}
