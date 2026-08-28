import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import java.util.Map;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ftz {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<ctj<?>, ftz.a<?, ?>> b = Maps.newHashMap();

   public static <T extends csa> void a(ctj<T> $$0, flh $$1, int $$2, wo $$3) {
      ftz.a<T, ?> $$4 = a($$0);
      if ($$4 == null) {
         a.warn("Failed to create screen for menu type: {}", mb.p.b($$0));
      } else {
         $$4.a($$3, $$0, $$1, $$2);
      }
   }

   @Nullable
   private static <T extends csa> ftz.a<T, ?> a(ctj<T> $$0) {
      return (ftz.a<T, ?>)b.get($$0);
   }

   private static <M extends csa, U extends fui & fwd<M>> void a(ctj<? extends M> $$0, ftz.a<M, U> $$1) {
      ftz.a<?, ?> $$2 = b.put($$0, $$1);
      if ($$2 != null) {
         throw new IllegalStateException("Duplicate registration for " + mb.p.b($$0));
      }
   }

   public static boolean a() {
      boolean $$0 = false;

      for (ctj<?> $$1 : mb.p) {
         if (!b.containsKey($$1)) {
            a.debug("Menu {} has no matching screen", mb.p.b($$1));
            $$0 = true;
         }
      }

      return $$0;
   }

   static {
      a(ctj.a, fvj::new);
      a(ctj.b, fvj::new);
      a(ctj.c, fvj::new);
      a(ctj.d, fvj::new);
      a(ctj.e, fvj::new);
      a(ctj.f, fvj::new);
      a(ctj.g, fvp::new);
      a(ctj.h, fvk::new);
      a(ctj.i, fvb::new);
      a(ctj.j, fvc::new);
      a(ctj.k, fvd::new);
      a(ctj.l, fvg::new);
      a(ctj.m, fvl::new);
      a(ctj.n, fvs::new);
      a(ctj.o, fvt::new);
      a(ctj.p, fvu::new);
      a(ctj.q, fvw::new);
      a(ctj.r, fwb::new);
      a(ctj.s, fwc::new);
      a(ctj.t, fwe::new);
      a(ctj.u, fwh::new);
      a(ctj.v, fwj::new);
      a(ctj.w, fwk::new);
      a(ctj.x, fvh::new);
      a(ctj.y, fwl::new);
   }

   interface a<T extends csa, U extends fui & fwd<T>> {
      default void a(wo $$0, ctj<T> $$1, flh $$2, int $$3) {
         U $$4 = this.create($$1.a($$3, $$2.t.gi()), $$2.t.gi(), $$0);
         $$2.t.cd = $$4.F();
         $$2.a($$4);
      }

      U create(T var1, cou var2, wo var3);
   }
}
