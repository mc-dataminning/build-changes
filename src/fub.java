import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import java.util.Map;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fub {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<ctl<?>, fub.a<?, ?>> b = Maps.newHashMap();

   public static <T extends csc> void a(ctl<T> $$0, flj $$1, int $$2, wo $$3) {
      fub.a<T, ?> $$4 = a($$0);
      if ($$4 == null) {
         a.warn("Failed to create screen for menu type: {}", mb.p.b($$0));
      } else {
         $$4.a($$3, $$0, $$1, $$2);
      }
   }

   @Nullable
   private static <T extends csc> fub.a<T, ?> a(ctl<T> $$0) {
      return (fub.a<T, ?>)b.get($$0);
   }

   private static <M extends csc, U extends fuk & fwf<M>> void a(ctl<? extends M> $$0, fub.a<M, U> $$1) {
      fub.a<?, ?> $$2 = b.put($$0, $$1);
      if ($$2 != null) {
         throw new IllegalStateException("Duplicate registration for " + mb.p.b($$0));
      }
   }

   public static boolean a() {
      boolean $$0 = false;

      for (ctl<?> $$1 : mb.p) {
         if (!b.containsKey($$1)) {
            a.debug("Menu {} has no matching screen", mb.p.b($$1));
            $$0 = true;
         }
      }

      return $$0;
   }

   static {
      a(ctl.a, fvl::new);
      a(ctl.b, fvl::new);
      a(ctl.c, fvl::new);
      a(ctl.d, fvl::new);
      a(ctl.e, fvl::new);
      a(ctl.f, fvl::new);
      a(ctl.g, fvr::new);
      a(ctl.h, fvm::new);
      a(ctl.i, fvd::new);
      a(ctl.j, fve::new);
      a(ctl.k, fvf::new);
      a(ctl.l, fvi::new);
      a(ctl.m, fvn::new);
      a(ctl.n, fvu::new);
      a(ctl.o, fvv::new);
      a(ctl.p, fvw::new);
      a(ctl.q, fvy::new);
      a(ctl.r, fwd::new);
      a(ctl.s, fwe::new);
      a(ctl.t, fwg::new);
      a(ctl.u, fwj::new);
      a(ctl.v, fwl::new);
      a(ctl.w, fwm::new);
      a(ctl.x, fvj::new);
      a(ctl.y, fwn::new);
   }

   interface a<T extends csc, U extends fuk & fwf<T>> {
      default void a(wo $$0, ctl<T> $$1, flj $$2, int $$3) {
         U $$4 = this.create($$1.a($$3, $$2.t.gi()), $$2.t.gi(), $$0);
         $$2.t.cd = $$4.F();
         $$2.a($$4);
      }

      U create(T var1, cow var2, wo var3);
   }
}
