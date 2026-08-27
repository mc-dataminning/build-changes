import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import java.util.Map;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fkq {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<cpl<?>, fkq.a<?, ?>> b = Maps.newHashMap();

   public static <T extends cod> void a(cpl<T> $$0, fde $$1, int $$2, wu $$3) {
      fkq.a<T, ?> $$4 = a($$0);
      if ($$4 == null) {
         a.warn("Failed to create screen for menu type: {}", ld.r.b($$0));
      } else {
         $$4.a($$3, $$0, $$1, $$2);
      }
   }

   @Nullable
   private static <T extends cod> fkq.a<T, ?> a(cpl<T> $$0) {
      return (fkq.a<T, ?>)b.get($$0);
   }

   private static <M extends cod, U extends fld & fng<M>> void a(cpl<? extends M> $$0, fkq.a<M, U> $$1) {
      fkq.a<?, ?> $$2 = b.put($$0, $$1);
      if ($$2 != null) {
         throw new IllegalStateException("Duplicate registration for " + ld.r.b($$0));
      }
   }

   public static boolean a() {
      boolean $$0 = false;

      for (cpl<?> $$1 : ld.r) {
         if (!b.containsKey($$1)) {
            a.debug("Menu {} has no matching screen", ld.r.b($$1));
            $$0 = true;
         }
      }

      return $$0;
   }

   static {
      a(cpl.a, fmm::new);
      a(cpl.b, fmm::new);
      a(cpl.c, fmm::new);
      a(cpl.d, fmm::new);
      a(cpl.e, fmm::new);
      a(cpl.f, fmm::new);
      a(cpl.g, fms::new);
      a(cpl.h, fmn::new);
      a(cpl.i, fme::new);
      a(cpl.j, fmf::new);
      a(cpl.k, fmg::new);
      a(cpl.l, fmj::new);
      a(cpl.m, fmo::new);
      a(cpl.n, fmv::new);
      a(cpl.o, fmw::new);
      a(cpl.p, fmx::new);
      a(cpl.q, fmz::new);
      a(cpl.r, fne::new);
      a(cpl.s, fnf::new);
      a(cpl.t, fnh::new);
      a(cpl.u, fnk::new);
      a(cpl.v, fnm::new);
      a(cpl.w, fnn::new);
      a(cpl.x, fmk::new);
      a(cpl.y, fno::new);
   }

   interface a<T extends cod, U extends fld & fng<T>> {
      default void a(wu $$0, cpl<T> $$1, fde $$2, int $$3) {
         U $$4 = this.create($$1.a($$3, $$2.s.ga()), $$2.s.ga(), $$0);
         $$2.s.cc = $$4.D();
         $$2.a($$4);
      }

      U create(T var1, clg var2, wu var3);
   }
}
