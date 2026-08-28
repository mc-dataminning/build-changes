import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import java.util.Map;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fno {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<cra<?>, fno.a<?, ?>> b = Maps.newHashMap();

   public static <T extends cps> void a(cra<T> $$0, fgi $$1, int $$2, wy $$3) {
      fno.a<T, ?> $$4 = a($$0);
      if ($$4 == null) {
         a.warn("Failed to create screen for menu type: {}", lt.p.b($$0));
      } else {
         $$4.a($$3, $$0, $$1, $$2);
      }
   }

   @Nullable
   private static <T extends cps> fno.a<T, ?> a(cra<T> $$0) {
      return (fno.a<T, ?>)b.get($$0);
   }

   private static <M extends cps, U extends fnx & fps<M>> void a(cra<? extends M> $$0, fno.a<M, U> $$1) {
      fno.a<?, ?> $$2 = b.put($$0, $$1);
      if ($$2 != null) {
         throw new IllegalStateException("Duplicate registration for " + lt.p.b($$0));
      }
   }

   public static boolean a() {
      boolean $$0 = false;

      for (cra<?> $$1 : lt.p) {
         if (!b.containsKey($$1)) {
            a.debug("Menu {} has no matching screen", lt.p.b($$1));
            $$0 = true;
         }
      }

      return $$0;
   }

   static {
      a(cra.a, foy::new);
      a(cra.b, foy::new);
      a(cra.c, foy::new);
      a(cra.d, foy::new);
      a(cra.e, foy::new);
      a(cra.f, foy::new);
      a(cra.g, fpe::new);
      a(cra.h, foz::new);
      a(cra.i, fop::new);
      a(cra.j, foq::new);
      a(cra.k, fos::new);
      a(cra.l, fov::new);
      a(cra.m, fpa::new);
      a(cra.n, fph::new);
      a(cra.o, fpi::new);
      a(cra.p, fpj::new);
      a(cra.q, fpl::new);
      a(cra.r, fpq::new);
      a(cra.s, fpr::new);
      a(cra.t, fpt::new);
      a(cra.u, fpw::new);
      a(cra.v, fpy::new);
      a(cra.w, fpz::new);
      a(cra.x, fow::new);
      a(cra.y, fqa::new);
   }

   interface a<T extends cps, U extends fnx & fps<T>> {
      default void a(wy $$0, cra<T> $$1, fgi $$2, int $$3) {
         U $$4 = this.create($$1.a($$3, $$2.s.fZ()), $$2.s.fZ(), $$0);
         $$2.s.cd = $$4.E();
         $$2.a($$4);
      }

      U create(T var1, cmu var2, wy var3);
   }
}
