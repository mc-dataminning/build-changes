import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import java.util.Map;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ezu {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<chl<?>, ezu.a<?, ?>> b = Maps.newHashMap();

   public static <T extends cge> void a(@Nullable chl<T> $$0, esr $$1, int $$2, ur $$3) {
      if ($$0 == null) {
         a.warn("Trying to open invalid screen with name: {}", $$3.getString());
      } else {
         ezu.a<T, ?> $$4 = a($$0);
         if ($$4 == null) {
            a.warn("Failed to create screen for menu type: {}", jy.s.b($$0));
         } else {
            $$4.a($$3, $$0, $$1, $$2);
         }
      }
   }

   @Nullable
   private static <T extends cge> ezu.a<T, ?> a(chl<T> $$0) {
      return (ezu.a<T, ?>)b.get($$0);
   }

   private static <M extends cge, U extends fah & fcl<M>> void a(chl<? extends M> $$0, ezu.a<M, U> $$1) {
      ezu.a<?, ?> $$2 = b.put($$0, $$1);
      if ($$2 != null) {
         throw new IllegalStateException("Duplicate registration for " + jy.s.b($$0));
      }
   }

   public static boolean a() {
      boolean $$0 = false;

      for (chl<?> $$1 : jy.s) {
         if (!b.containsKey($$1)) {
            a.debug("Menu {} has no matching screen", jy.s.b($$1));
            $$0 = true;
         }
      }

      return $$0;
   }

   static {
      a(chl.a, fbr::new);
      a(chl.b, fbr::new);
      a(chl.c, fbr::new);
      a(chl.d, fbr::new);
      a(chl.e, fbr::new);
      a(chl.f, fbr::new);
      a(chl.g, fbx::new);
      a(chl.h, fbs::new);
      a(chl.i, fbj::new);
      a(chl.j, fbk::new);
      a(chl.k, fbl::new);
      a(chl.l, fbo::new);
      a(chl.m, fbt::new);
      a(chl.n, fca::new);
      a(chl.o, fcb::new);
      a(chl.p, fcc::new);
      a(chl.q, fce::new);
      a(chl.r, fcj::new);
      a(chl.s, fck::new);
      a(chl.t, fcm::new);
      a(chl.u, fcp::new);
      a(chl.v, fcr::new);
      a(chl.w, fcs::new);
      a(chl.x, fbp::new);
      a(chl.y, fct::new);
   }

   interface a<T extends cge, U extends fah & fcl<T>> {
      default void a(ur $$0, chl<T> $$1, esr $$2, int $$3) {
         U $$4 = this.create($$1.a($$3, $$2.s.fS()), $$2.s.fS(), $$0);
         $$2.s.bS = $$4.D();
         $$2.a($$4);
      }

      U create(T var1, cdl var2, ur var3);
   }
}
