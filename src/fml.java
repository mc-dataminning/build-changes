import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import java.util.Map;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fml {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<cqw<?>, fml.a<?, ?>> b = Maps.newHashMap();

   public static <T extends cpp> void a(cqw<T> $$0, ffa $$1, int $$2, xl $$3) {
      fml.a<T, ?> $$4 = a($$0);
      if ($$4 == null) {
         a.warn("Failed to create screen for menu type: {}", lp.r.b($$0));
      } else {
         $$4.a($$3, $$0, $$1, $$2);
      }
   }

   @Nullable
   private static <T extends cpp> fml.a<T, ?> a(cqw<T> $$0) {
      return (fml.a<T, ?>)b.get($$0);
   }

   private static <M extends cpp, U extends fmy & fpc<M>> void a(cqw<? extends M> $$0, fml.a<M, U> $$1) {
      fml.a<?, ?> $$2 = b.put($$0, $$1);
      if ($$2 != null) {
         throw new IllegalStateException("Duplicate registration for " + lp.r.b($$0));
      }
   }

   public static boolean a() {
      boolean $$0 = false;

      for (cqw<?> $$1 : lp.r) {
         if (!b.containsKey($$1)) {
            a.debug("Menu {} has no matching screen", lp.r.b($$1));
            $$0 = true;
         }
      }

      return $$0;
   }

   static {
      a(cqw.a, foh::new);
      a(cqw.b, foh::new);
      a(cqw.c, foh::new);
      a(cqw.d, foh::new);
      a(cqw.e, foh::new);
      a(cqw.f, foh::new);
      a(cqw.g, fon::new);
      a(cqw.h, foi::new);
      a(cqw.i, fnz::new);
      a(cqw.j, foa::new);
      a(cqw.k, fob::new);
      a(cqw.l, foe::new);
      a(cqw.m, foj::new);
      a(cqw.n, foq::new);
      a(cqw.o, fos::new);
      a(cqw.p, fot::new);
      a(cqw.q, fov::new);
      a(cqw.r, fpa::new);
      a(cqw.s, fpb::new);
      a(cqw.t, fpd::new);
      a(cqw.u, fpg::new);
      a(cqw.v, fpi::new);
      a(cqw.w, fpj::new);
      a(cqw.x, fof::new);
      a(cqw.y, fpk::new);
   }

   interface a<T extends cpp, U extends fmy & fpc<T>> {
      default void a(xl $$0, cqw<T> $$1, ffa $$2, int $$3) {
         U $$4 = this.create($$1.a($$3, $$2.s.gc()), $$2.s.gc(), $$0);
         $$2.s.cb = $$4.D();
         $$2.a($$4);
      }

      U create(T var1, cmr var2, xl var3);
   }
}
