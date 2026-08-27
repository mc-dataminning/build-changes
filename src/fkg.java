import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import java.util.Map;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fkg {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<cop<?>, fkg.a<?, ?>> b = Maps.newHashMap();

   public static <T extends cnh> void a(cop<T> $$0, fcu $$1, int $$2, ws $$3) {
      fkg.a<T, ?> $$4 = a($$0);
      if ($$4 == null) {
         a.warn("Failed to create screen for menu type: {}", lc.r.b($$0));
      } else {
         $$4.a($$3, $$0, $$1, $$2);
      }
   }

   @Nullable
   private static <T extends cnh> fkg.a<T, ?> a(cop<T> $$0) {
      return (fkg.a<T, ?>)b.get($$0);
   }

   private static <M extends cnh, U extends fkt & fmw<M>> void a(cop<? extends M> $$0, fkg.a<M, U> $$1) {
      fkg.a<?, ?> $$2 = b.put($$0, $$1);
      if ($$2 != null) {
         throw new IllegalStateException("Duplicate registration for " + lc.r.b($$0));
      }
   }

   public static boolean a() {
      boolean $$0 = false;

      for (cop<?> $$1 : lc.r) {
         if (!b.containsKey($$1)) {
            a.debug("Menu {} has no matching screen", lc.r.b($$1));
            $$0 = true;
         }
      }

      return $$0;
   }

   static {
      a(cop.a, fmc::new);
      a(cop.b, fmc::new);
      a(cop.c, fmc::new);
      a(cop.d, fmc::new);
      a(cop.e, fmc::new);
      a(cop.f, fmc::new);
      a(cop.g, fmi::new);
      a(cop.h, fmd::new);
      a(cop.i, flu::new);
      a(cop.j, flv::new);
      a(cop.k, flw::new);
      a(cop.l, flz::new);
      a(cop.m, fme::new);
      a(cop.n, fml::new);
      a(cop.o, fmm::new);
      a(cop.p, fmn::new);
      a(cop.q, fmp::new);
      a(cop.r, fmu::new);
      a(cop.s, fmv::new);
      a(cop.t, fmx::new);
      a(cop.u, fna::new);
      a(cop.v, fnc::new);
      a(cop.w, fnd::new);
      a(cop.x, fma::new);
      a(cop.y, fne::new);
   }

   interface a<T extends cnh, U extends fkt & fmw<T>> {
      default void a(ws $$0, cop<T> $$1, fcu $$2, int $$3) {
         U $$4 = this.create($$1.a($$3, $$2.s.ga()), $$2.s.ga(), $$0);
         $$2.s.cc = $$4.D();
         $$2.a($$4);
      }

      U create(T var1, ckk var2, ws var3);
   }
}
