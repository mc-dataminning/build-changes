import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import java.util.Map;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class flm {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<cqc<?>, flm.a<?, ?>> b = Maps.newHashMap();

   public static <T extends cov> void a(cqc<T> $$0, feb $$1, int $$2, wx $$3) {
      flm.a<T, ?> $$4 = a($$0);
      if ($$4 == null) {
         a.warn("Failed to create screen for menu type: {}", le.r.b($$0));
      } else {
         $$4.a($$3, $$0, $$1, $$2);
      }
   }

   @Nullable
   private static <T extends cov> flm.a<T, ?> a(cqc<T> $$0) {
      return (flm.a<T, ?>)b.get($$0);
   }

   private static <M extends cov, U extends flz & foc<M>> void a(cqc<? extends M> $$0, flm.a<M, U> $$1) {
      flm.a<?, ?> $$2 = b.put($$0, $$1);
      if ($$2 != null) {
         throw new IllegalStateException("Duplicate registration for " + le.r.b($$0));
      }
   }

   public static boolean a() {
      boolean $$0 = false;

      for (cqc<?> $$1 : le.r) {
         if (!b.containsKey($$1)) {
            a.debug("Menu {} has no matching screen", le.r.b($$1));
            $$0 = true;
         }
      }

      return $$0;
   }

   static {
      a(cqc.a, fni::new);
      a(cqc.b, fni::new);
      a(cqc.c, fni::new);
      a(cqc.d, fni::new);
      a(cqc.e, fni::new);
      a(cqc.f, fni::new);
      a(cqc.g, fno::new);
      a(cqc.h, fnj::new);
      a(cqc.i, fna::new);
      a(cqc.j, fnb::new);
      a(cqc.k, fnc::new);
      a(cqc.l, fnf::new);
      a(cqc.m, fnk::new);
      a(cqc.n, fnr::new);
      a(cqc.o, fns::new);
      a(cqc.p, fnt::new);
      a(cqc.q, fnv::new);
      a(cqc.r, foa::new);
      a(cqc.s, fob::new);
      a(cqc.t, fod::new);
      a(cqc.u, fog::new);
      a(cqc.v, foi::new);
      a(cqc.w, foj::new);
      a(cqc.x, fng::new);
      a(cqc.y, fok::new);
   }

   interface a<T extends cov, U extends flz & foc<T>> {
      default void a(wx $$0, cqc<T> $$1, feb $$2, int $$3) {
         U $$4 = this.create($$1.a($$3, $$2.s.gc()), $$2.s.gc(), $$0);
         $$2.s.cb = $$4.D();
         $$2.a($$4);
      }

      U create(T var1, clx var2, wx var3);
   }
}
