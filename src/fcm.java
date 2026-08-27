import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import java.util.Map;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fcm {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<cjh<?>, fcm.a<?, ?>> b = Maps.newHashMap();

   public static <T extends cia> void a(@Nullable cjh<T> $$0, evg $$1, int $$2, vf $$3) {
      if ($$0 == null) {
         a.warn("Trying to open invalid screen with name: {}", $$3.getString());
      } else {
         fcm.a<T, ?> $$4 = a($$0);
         if ($$4 == null) {
            a.warn("Failed to create screen for menu type: {}", kd.r.b($$0));
         } else {
            $$4.a($$3, $$0, $$1, $$2);
         }
      }
   }

   @Nullable
   private static <T extends cia> fcm.a<T, ?> a(cjh<T> $$0) {
      return (fcm.a<T, ?>)b.get($$0);
   }

   private static <M extends cia, U extends fcz & ffd<M>> void a(cjh<? extends M> $$0, fcm.a<M, U> $$1) {
      fcm.a<?, ?> $$2 = b.put($$0, $$1);
      if ($$2 != null) {
         throw new IllegalStateException("Duplicate registration for " + kd.r.b($$0));
      }
   }

   public static boolean a() {
      boolean $$0 = false;

      for (cjh<?> $$1 : kd.r) {
         if (!b.containsKey($$1)) {
            a.debug("Menu {} has no matching screen", kd.r.b($$1));
            $$0 = true;
         }
      }

      return $$0;
   }

   static {
      a(cjh.a, fej::new);
      a(cjh.b, fej::new);
      a(cjh.c, fej::new);
      a(cjh.d, fej::new);
      a(cjh.e, fej::new);
      a(cjh.f, fej::new);
      a(cjh.g, fep::new);
      a(cjh.h, fek::new);
      a(cjh.i, feb::new);
      a(cjh.j, fec::new);
      a(cjh.k, fed::new);
      a(cjh.l, feg::new);
      a(cjh.m, fel::new);
      a(cjh.n, fes::new);
      a(cjh.o, fet::new);
      a(cjh.p, feu::new);
      a(cjh.q, few::new);
      a(cjh.r, ffb::new);
      a(cjh.s, ffc::new);
      a(cjh.t, ffe::new);
      a(cjh.u, ffh::new);
      a(cjh.v, ffj::new);
      a(cjh.w, ffk::new);
      a(cjh.x, feh::new);
      a(cjh.y, ffl::new);
   }

   interface a<T extends cia, U extends fcz & ffd<T>> {
      default void a(vf $$0, cjh<T> $$1, evg $$2, int $$3) {
         U $$4 = this.create($$1.a($$3, $$2.s.fS()), $$2.s.fS(), $$0);
         $$2.s.bS = $$4.D();
         $$2.a($$4);
      }

      U create(T var1, cfg var2, vf var3);
   }
}
