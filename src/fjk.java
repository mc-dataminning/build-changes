import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import java.util.Map;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fjk {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<cod<?>, fjk.a<?, ?>> b = Maps.newHashMap();

   public static <T extends cmw> void a(cod<T> $$0, fby $$1, int $$2, wi $$3) {
      fjk.a<T, ?> $$4 = a($$0);
      if ($$4 == null) {
         a.warn("Failed to create screen for menu type: {}", kt.r.b($$0));
      } else {
         $$4.a($$3, $$0, $$1, $$2);
      }
   }

   @Nullable
   private static <T extends cmw> fjk.a<T, ?> a(cod<T> $$0) {
      return (fjk.a<T, ?>)b.get($$0);
   }

   private static <M extends cmw, U extends fjx & fma<M>> void a(cod<? extends M> $$0, fjk.a<M, U> $$1) {
      fjk.a<?, ?> $$2 = b.put($$0, $$1);
      if ($$2 != null) {
         throw new IllegalStateException("Duplicate registration for " + kt.r.b($$0));
      }
   }

   public static boolean a() {
      boolean $$0 = false;

      for (cod<?> $$1 : kt.r) {
         if (!b.containsKey($$1)) {
            a.debug("Menu {} has no matching screen", kt.r.b($$1));
            $$0 = true;
         }
      }

      return $$0;
   }

   static {
      a(cod.a, flg::new);
      a(cod.b, flg::new);
      a(cod.c, flg::new);
      a(cod.d, flg::new);
      a(cod.e, flg::new);
      a(cod.f, flg::new);
      a(cod.g, flm::new);
      a(cod.h, flh::new);
      a(cod.i, fky::new);
      a(cod.j, fkz::new);
      a(cod.k, fla::new);
      a(cod.l, fld::new);
      a(cod.m, fli::new);
      a(cod.n, flp::new);
      a(cod.o, flq::new);
      a(cod.p, flr::new);
      a(cod.q, flt::new);
      a(cod.r, fly::new);
      a(cod.s, flz::new);
      a(cod.t, fmb::new);
      a(cod.u, fme::new);
      a(cod.v, fmg::new);
      a(cod.w, fmh::new);
      a(cod.x, fle::new);
      a(cod.y, fmi::new);
   }

   interface a<T extends cmw, U extends fjx & fma<T>> {
      default void a(wi $$0, cod<T> $$1, fby $$2, int $$3) {
         U $$4 = this.create($$1.a($$3, $$2.s.fZ()), $$2.s.fZ(), $$0);
         $$2.s.ca = $$4.D();
         $$2.a($$4);
      }

      U create(T var1, cjz var2, wi var3);
   }
}
