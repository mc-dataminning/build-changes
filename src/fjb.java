import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import java.util.Map;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fjb {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<cnw<?>, fjb.a<?, ?>> b = Maps.newHashMap();

   public static <T extends cmp> void a(cnw<T> $$0, fbp $$1, int $$2, wg $$3) {
      fjb.a<T, ?> $$4 = a($$0);
      if ($$4 == null) {
         a.warn("Failed to create screen for menu type: {}", kr.r.b($$0));
      } else {
         $$4.a($$3, $$0, $$1, $$2);
      }
   }

   @Nullable
   private static <T extends cmp> fjb.a<T, ?> a(cnw<T> $$0) {
      return (fjb.a<T, ?>)b.get($$0);
   }

   private static <M extends cmp, U extends fjo & flr<M>> void a(cnw<? extends M> $$0, fjb.a<M, U> $$1) {
      fjb.a<?, ?> $$2 = b.put($$0, $$1);
      if ($$2 != null) {
         throw new IllegalStateException("Duplicate registration for " + kr.r.b($$0));
      }
   }

   public static boolean a() {
      boolean $$0 = false;

      for (cnw<?> $$1 : kr.r) {
         if (!b.containsKey($$1)) {
            a.debug("Menu {} has no matching screen", kr.r.b($$1));
            $$0 = true;
         }
      }

      return $$0;
   }

   static {
      a(cnw.a, fkx::new);
      a(cnw.b, fkx::new);
      a(cnw.c, fkx::new);
      a(cnw.d, fkx::new);
      a(cnw.e, fkx::new);
      a(cnw.f, fkx::new);
      a(cnw.g, fld::new);
      a(cnw.h, fky::new);
      a(cnw.i, fkp::new);
      a(cnw.j, fkq::new);
      a(cnw.k, fkr::new);
      a(cnw.l, fku::new);
      a(cnw.m, fkz::new);
      a(cnw.n, flg::new);
      a(cnw.o, flh::new);
      a(cnw.p, fli::new);
      a(cnw.q, flk::new);
      a(cnw.r, flp::new);
      a(cnw.s, flq::new);
      a(cnw.t, fls::new);
      a(cnw.u, flv::new);
      a(cnw.v, flx::new);
      a(cnw.w, fly::new);
      a(cnw.x, fkv::new);
      a(cnw.y, flz::new);
   }

   interface a<T extends cmp, U extends fjo & flr<T>> {
      default void a(wg $$0, cnw<T> $$1, fbp $$2, int $$3) {
         U $$4 = this.create($$1.a($$3, $$2.s.fZ()), $$2.s.fZ(), $$0);
         $$2.s.bY = $$4.D();
         $$2.a($$4);
      }

      U create(T var1, cjs var2, wg var3);
   }
}
