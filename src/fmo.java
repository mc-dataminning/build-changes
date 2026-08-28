import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import java.util.Map;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fmo {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<cqz<?>, fmo.a<?, ?>> b = Maps.newHashMap();

   public static <T extends cps> void a(cqz<T> $$0, ffd $$1, int $$2, xo $$3) {
      fmo.a<T, ?> $$4 = a($$0);
      if ($$4 == null) {
         a.warn("Failed to create screen for menu type: {}", lp.r.b($$0));
      } else {
         $$4.a($$3, $$0, $$1, $$2);
      }
   }

   @Nullable
   private static <T extends cps> fmo.a<T, ?> a(cqz<T> $$0) {
      return (fmo.a<T, ?>)b.get($$0);
   }

   private static <M extends cps, U extends fnb & fpf<M>> void a(cqz<? extends M> $$0, fmo.a<M, U> $$1) {
      fmo.a<?, ?> $$2 = b.put($$0, $$1);
      if ($$2 != null) {
         throw new IllegalStateException("Duplicate registration for " + lp.r.b($$0));
      }
   }

   public static boolean a() {
      boolean $$0 = false;

      for (cqz<?> $$1 : lp.r) {
         if (!b.containsKey($$1)) {
            a.debug("Menu {} has no matching screen", lp.r.b($$1));
            $$0 = true;
         }
      }

      return $$0;
   }

   static {
      a(cqz.a, fok::new);
      a(cqz.b, fok::new);
      a(cqz.c, fok::new);
      a(cqz.d, fok::new);
      a(cqz.e, fok::new);
      a(cqz.f, fok::new);
      a(cqz.g, foq::new);
      a(cqz.h, fol::new);
      a(cqz.i, foc::new);
      a(cqz.j, fod::new);
      a(cqz.k, foe::new);
      a(cqz.l, foh::new);
      a(cqz.m, fom::new);
      a(cqz.n, fou::new);
      a(cqz.o, fov::new);
      a(cqz.p, fow::new);
      a(cqz.q, foy::new);
      a(cqz.r, fpd::new);
      a(cqz.s, fpe::new);
      a(cqz.t, fpg::new);
      a(cqz.u, fpj::new);
      a(cqz.v, fpl::new);
      a(cqz.w, fpm::new);
      a(cqz.x, foi::new);
      a(cqz.y, fpn::new);
   }

   interface a<T extends cps, U extends fnb & fpf<T>> {
      default void a(xo $$0, cqz<T> $$1, ffd $$2, int $$3) {
         U $$4 = this.create($$1.a($$3, $$2.s.gc()), $$2.s.gc(), $$0);
         $$2.s.cb = $$4.E();
         $$2.a($$4);
      }

      U create(T var1, cmu var2, xo var3);
   }
}
