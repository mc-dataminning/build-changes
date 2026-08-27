import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import java.util.Map;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fah {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<cht<?>, fah.a<?, ?>> b = Maps.newHashMap();

   public static <T extends cgm> void a(@Nullable cht<T> $$0, etd $$1, int $$2, ur $$3) {
      if ($$0 == null) {
         a.warn("Trying to open invalid screen with name: {}", $$3.getString());
      } else {
         fah.a<T, ?> $$4 = a($$0);
         if ($$4 == null) {
            a.warn("Failed to create screen for menu type: {}", jy.s.b($$0));
         } else {
            $$4.a($$3, $$0, $$1, $$2);
         }
      }
   }

   @Nullable
   private static <T extends cgm> fah.a<T, ?> a(cht<T> $$0) {
      return (fah.a<T, ?>)b.get($$0);
   }

   private static <M extends cgm, U extends fau & fcy<M>> void a(cht<? extends M> $$0, fah.a<M, U> $$1) {
      fah.a<?, ?> $$2 = b.put($$0, $$1);
      if ($$2 != null) {
         throw new IllegalStateException("Duplicate registration for " + jy.s.b($$0));
      }
   }

   public static boolean a() {
      boolean $$0 = false;

      for (cht<?> $$1 : jy.s) {
         if (!b.containsKey($$1)) {
            a.debug("Menu {} has no matching screen", jy.s.b($$1));
            $$0 = true;
         }
      }

      return $$0;
   }

   static {
      a(cht.a, fce::new);
      a(cht.b, fce::new);
      a(cht.c, fce::new);
      a(cht.d, fce::new);
      a(cht.e, fce::new);
      a(cht.f, fce::new);
      a(cht.g, fck::new);
      a(cht.h, fcf::new);
      a(cht.i, fbw::new);
      a(cht.j, fbx::new);
      a(cht.k, fby::new);
      a(cht.l, fcb::new);
      a(cht.m, fcg::new);
      a(cht.n, fcn::new);
      a(cht.o, fco::new);
      a(cht.p, fcp::new);
      a(cht.q, fcr::new);
      a(cht.r, fcw::new);
      a(cht.s, fcx::new);
      a(cht.t, fcz::new);
      a(cht.u, fdc::new);
      a(cht.v, fde::new);
      a(cht.w, fdf::new);
      a(cht.x, fcc::new);
      a(cht.y, fdg::new);
   }

   interface a<T extends cgm, U extends fau & fcy<T>> {
      default void a(ur $$0, cht<T> $$1, etd $$2, int $$3) {
         U $$4 = this.create($$1.a($$3, $$2.s.fT()), $$2.s.fT(), $$0);
         $$2.s.bS = $$4.D();
         $$2.a($$4);
      }

      U create(T var1, cdt var2, ur var3);
   }
}
