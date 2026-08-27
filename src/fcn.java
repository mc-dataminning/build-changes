import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import java.util.Map;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fcn {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<cjh<?>, fcn.a<?, ?>> b = Maps.newHashMap();

   public static <T extends cia> void a(@Nullable cjh<T> $$0, evh $$1, int $$2, vf $$3) {
      if ($$0 == null) {
         a.warn("Trying to open invalid screen with name: {}", $$3.getString());
      } else {
         fcn.a<T, ?> $$4 = a($$0);
         if ($$4 == null) {
            a.warn("Failed to create screen for menu type: {}", kd.r.b($$0));
         } else {
            $$4.a($$3, $$0, $$1, $$2);
         }
      }
   }

   @Nullable
   private static <T extends cia> fcn.a<T, ?> a(cjh<T> $$0) {
      return (fcn.a<T, ?>)b.get($$0);
   }

   private static <M extends cia, U extends fda & ffe<M>> void a(cjh<? extends M> $$0, fcn.a<M, U> $$1) {
      fcn.a<?, ?> $$2 = b.put($$0, $$1);
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
      a(cjh.a, fek::new);
      a(cjh.b, fek::new);
      a(cjh.c, fek::new);
      a(cjh.d, fek::new);
      a(cjh.e, fek::new);
      a(cjh.f, fek::new);
      a(cjh.g, feq::new);
      a(cjh.h, fel::new);
      a(cjh.i, fec::new);
      a(cjh.j, fed::new);
      a(cjh.k, fee::new);
      a(cjh.l, feh::new);
      a(cjh.m, fem::new);
      a(cjh.n, fet::new);
      a(cjh.o, feu::new);
      a(cjh.p, fev::new);
      a(cjh.q, fex::new);
      a(cjh.r, ffc::new);
      a(cjh.s, ffd::new);
      a(cjh.t, fff::new);
      a(cjh.u, ffi::new);
      a(cjh.v, ffk::new);
      a(cjh.w, ffl::new);
      a(cjh.x, fei::new);
      a(cjh.y, ffm::new);
   }

   interface a<T extends cia, U extends fda & ffe<T>> {
      default void a(vf $$0, cjh<T> $$1, evh $$2, int $$3) {
         U $$4 = this.create($$1.a($$3, $$2.s.fS()), $$2.s.fS(), $$0);
         $$2.s.bS = $$4.E();
         $$2.a($$4);
      }

      U create(T var1, cfg var2, vf var3);
   }
}
