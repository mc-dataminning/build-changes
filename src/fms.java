import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import java.util.Map;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fms {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<crd<?>, fms.a<?, ?>> b = Maps.newHashMap();

   public static <T extends cpw> void a(crd<T> $$0, ffh $$1, int $$2, xp $$3) {
      fms.a<T, ?> $$4 = a($$0);
      if ($$4 == null) {
         a.warn("Failed to create screen for menu type: {}", lp.r.b($$0));
      } else {
         $$4.a($$3, $$0, $$1, $$2);
      }
   }

   @Nullable
   private static <T extends cpw> fms.a<T, ?> a(crd<T> $$0) {
      return (fms.a<T, ?>)b.get($$0);
   }

   private static <M extends cpw, U extends fnf & fpj<M>> void a(crd<? extends M> $$0, fms.a<M, U> $$1) {
      fms.a<?, ?> $$2 = b.put($$0, $$1);
      if ($$2 != null) {
         throw new IllegalStateException("Duplicate registration for " + lp.r.b($$0));
      }
   }

   public static boolean a() {
      boolean $$0 = false;

      for (crd<?> $$1 : lp.r) {
         if (!b.containsKey($$1)) {
            a.debug("Menu {} has no matching screen", lp.r.b($$1));
            $$0 = true;
         }
      }

      return $$0;
   }

   static {
      a(crd.a, foo::new);
      a(crd.b, foo::new);
      a(crd.c, foo::new);
      a(crd.d, foo::new);
      a(crd.e, foo::new);
      a(crd.f, foo::new);
      a(crd.g, fov::new);
      a(crd.h, fop::new);
      a(crd.i, fog::new);
      a(crd.j, foh::new);
      a(crd.k, foi::new);
      a(crd.l, fol::new);
      a(crd.m, foq::new);
      a(crd.n, foy::new);
      a(crd.o, foz::new);
      a(crd.p, fpa::new);
      a(crd.q, fpc::new);
      a(crd.r, fph::new);
      a(crd.s, fpi::new);
      a(crd.t, fpk::new);
      a(crd.u, fpn::new);
      a(crd.v, fpp::new);
      a(crd.w, fpq::new);
      a(crd.x, fom::new);
      a(crd.y, fpr::new);
   }

   interface a<T extends cpw, U extends fnf & fpj<T>> {
      default void a(xp $$0, crd<T> $$1, ffh $$2, int $$3) {
         U $$4 = this.create($$1.a($$3, $$2.s.gc()), $$2.s.gc(), $$0);
         $$2.s.cb = $$4.F();
         $$2.a($$4);
      }

      U create(T var1, cmy var2, xp var3);
   }
}
