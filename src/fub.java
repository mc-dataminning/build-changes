import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import java.util.Map;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fub {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<ctk<?>, fub.a<?, ?>> b = Maps.newHashMap();

   public static <T extends csb> void a(ctk<T> $$0, fli $$1, int $$2, wp $$3) {
      fub.a<T, ?> $$4 = a($$0);
      if ($$4 == null) {
         a.warn("Failed to create screen for menu type: {}", mb.p.b($$0));
      } else {
         $$4.a($$3, $$0, $$1, $$2);
      }
   }

   @Nullable
   private static <T extends csb> fub.a<T, ?> a(ctk<T> $$0) {
      return (fub.a<T, ?>)b.get($$0);
   }

   private static <M extends csb, U extends fuk & fwf<M>> void a(ctk<? extends M> $$0, fub.a<M, U> $$1) {
      fub.a<?, ?> $$2 = b.put($$0, $$1);
      if ($$2 != null) {
         throw new IllegalStateException("Duplicate registration for " + mb.p.b($$0));
      }
   }

   public static boolean a() {
      boolean $$0 = false;

      for (ctk<?> $$1 : mb.p) {
         if (!b.containsKey($$1)) {
            a.debug("Menu {} has no matching screen", mb.p.b($$1));
            $$0 = true;
         }
      }

      return $$0;
   }

   static {
      a(ctk.a, fvl::new);
      a(ctk.b, fvl::new);
      a(ctk.c, fvl::new);
      a(ctk.d, fvl::new);
      a(ctk.e, fvl::new);
      a(ctk.f, fvl::new);
      a(ctk.g, fvr::new);
      a(ctk.h, fvm::new);
      a(ctk.i, fvd::new);
      a(ctk.j, fve::new);
      a(ctk.k, fvf::new);
      a(ctk.l, fvi::new);
      a(ctk.m, fvn::new);
      a(ctk.n, fvu::new);
      a(ctk.o, fvv::new);
      a(ctk.p, fvw::new);
      a(ctk.q, fvy::new);
      a(ctk.r, fwd::new);
      a(ctk.s, fwe::new);
      a(ctk.t, fwg::new);
      a(ctk.u, fwj::new);
      a(ctk.v, fwl::new);
      a(ctk.w, fwm::new);
      a(ctk.x, fvj::new);
      a(ctk.y, fwn::new);
   }

   interface a<T extends csb, U extends fuk & fwf<T>> {
      default void a(wp $$0, ctk<T> $$1, fli $$2, int $$3) {
         U $$4 = this.create($$1.a($$3, $$2.t.gi()), $$2.t.gi(), $$0);
         $$2.t.cd = $$4.F();
         $$2.a($$4);
      }

      U create(T var1, cov var2, wp var3);
   }
}
