import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import java.util.Map;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fud {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<ctm<?>, fud.a<?, ?>> b = Maps.newHashMap();

   public static <T extends csd> void a(ctm<T> $$0, flk $$1, int $$2, wp $$3) {
      fud.a<T, ?> $$4 = a($$0);
      if ($$4 == null) {
         a.warn("Failed to create screen for menu type: {}", mb.p.b($$0));
      } else {
         $$4.a($$3, $$0, $$1, $$2);
      }
   }

   @Nullable
   private static <T extends csd> fud.a<T, ?> a(ctm<T> $$0) {
      return (fud.a<T, ?>)b.get($$0);
   }

   private static <M extends csd, U extends fum & fwh<M>> void a(ctm<? extends M> $$0, fud.a<M, U> $$1) {
      fud.a<?, ?> $$2 = b.put($$0, $$1);
      if ($$2 != null) {
         throw new IllegalStateException("Duplicate registration for " + mb.p.b($$0));
      }
   }

   public static boolean a() {
      boolean $$0 = false;

      for (ctm<?> $$1 : mb.p) {
         if (!b.containsKey($$1)) {
            a.debug("Menu {} has no matching screen", mb.p.b($$1));
            $$0 = true;
         }
      }

      return $$0;
   }

   static {
      a(ctm.a, fvn::new);
      a(ctm.b, fvn::new);
      a(ctm.c, fvn::new);
      a(ctm.d, fvn::new);
      a(ctm.e, fvn::new);
      a(ctm.f, fvn::new);
      a(ctm.g, fvt::new);
      a(ctm.h, fvo::new);
      a(ctm.i, fvf::new);
      a(ctm.j, fvg::new);
      a(ctm.k, fvh::new);
      a(ctm.l, fvk::new);
      a(ctm.m, fvp::new);
      a(ctm.n, fvw::new);
      a(ctm.o, fvx::new);
      a(ctm.p, fvy::new);
      a(ctm.q, fwa::new);
      a(ctm.r, fwf::new);
      a(ctm.s, fwg::new);
      a(ctm.t, fwi::new);
      a(ctm.u, fwl::new);
      a(ctm.v, fwn::new);
      a(ctm.w, fwo::new);
      a(ctm.x, fvl::new);
      a(ctm.y, fwp::new);
   }

   interface a<T extends csd, U extends fum & fwh<T>> {
      default void a(wp $$0, ctm<T> $$1, flk $$2, int $$3) {
         U $$4 = this.create($$1.a($$3, $$2.t.gi()), $$2.t.gi(), $$0);
         $$2.t.cd = $$4.F();
         $$2.a($$4);
      }

      U create(T var1, cox var2, wp var3);
   }
}
