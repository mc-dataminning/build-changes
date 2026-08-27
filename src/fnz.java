import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import java.util.Map;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fnz {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<cqo<?>, fnz.a<?, ?>> b = Maps.newHashMap();

   public static <T extends cpg> void a(cqo<T> $$0, fgj $$1, int $$2, xe $$3) {
      fnz.a<T, ?> $$4 = a($$0);
      if ($$4 == null) {
         a.warn("Failed to create screen for menu type: {}", lh.r.b($$0));
      } else {
         $$4.a($$3, $$0, $$1, $$2);
      }
   }

   @Nullable
   private static <T extends cpg> fnz.a<T, ?> a(cqo<T> $$0) {
      return (fnz.a<T, ?>)b.get($$0);
   }

   private static <M extends cpg, U extends fon & fqt<M>> void a(cqo<? extends M> $$0, fnz.a<M, U> $$1) {
      fnz.a<?, ?> $$2 = b.put($$0, $$1);
      if ($$2 != null) {
         throw new IllegalStateException("Duplicate registration for " + lh.r.b($$0));
      }
   }

   public static boolean a() {
      boolean $$0 = false;

      for (cqo<?> $$1 : lh.r) {
         if (!b.containsKey($$1)) {
            a.debug("Menu {} has no matching screen", lh.r.b($$1));
            $$0 = true;
         }
      }

      return $$0;
   }

   static {
      a(cqo.a, fpy::new);
      a(cqo.b, fpy::new);
      a(cqo.c, fpy::new);
      a(cqo.d, fpy::new);
      a(cqo.e, fpy::new);
      a(cqo.f, fpy::new);
      a(cqo.g, fqe::new);
      a(cqo.h, fpz::new);
      a(cqo.i, fpq::new);
      a(cqo.j, fpr::new);
      a(cqo.k, fps::new);
      a(cqo.l, fpv::new);
      a(cqo.p, fqi::new);
      a(cqo.m, fqa::new);
      a(cqo.n, fqh::new);
      a(cqo.o, fqj::new);
      a(cqo.q, fqk::new);
      a(cqo.r, fqm::new);
      a(cqo.s, fqr::new);
      a(cqo.t, fqs::new);
      a(cqo.u, fqu::new);
      a(cqo.v, fqz::new);
      a(cqo.w, frb::new);
      a(cqo.x, frc::new);
      a(cqo.y, fpw::new);
      a(cqo.z, frd::new);
      a(cqo.A, fqx::new);
      a(cqo.B, fqy::new);
   }

   interface a<T extends cpg, U extends fon & fqt<T>> {
      default void a(xe $$0, cqo<T> $$1, fgj $$2, int $$3) {
         U $$4 = this.create($$1.a($$3, $$2.s.gl()), $$2.s.gl(), $$0);
         $$2.s.cq = $$4.D();
         $$2.a($$4);
      }

      U create(T var1, clx var2, xe var3);
   }
}
