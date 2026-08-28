import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import java.util.Map;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fmp {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<cra<?>, fmp.a<?, ?>> b = Maps.newHashMap();

   public static <T extends cpt> void a(cra<T> $$0, ffe $$1, int $$2, xo $$3) {
      fmp.a<T, ?> $$4 = a($$0);
      if ($$4 == null) {
         a.warn("Failed to create screen for menu type: {}", lp.r.b($$0));
      } else {
         $$4.a($$3, $$0, $$1, $$2);
      }
   }

   @Nullable
   private static <T extends cpt> fmp.a<T, ?> a(cra<T> $$0) {
      return (fmp.a<T, ?>)b.get($$0);
   }

   private static <M extends cpt, U extends fnc & fpg<M>> void a(cra<? extends M> $$0, fmp.a<M, U> $$1) {
      fmp.a<?, ?> $$2 = b.put($$0, $$1);
      if ($$2 != null) {
         throw new IllegalStateException("Duplicate registration for " + lp.r.b($$0));
      }
   }

   public static boolean a() {
      boolean $$0 = false;

      for (cra<?> $$1 : lp.r) {
         if (!b.containsKey($$1)) {
            a.debug("Menu {} has no matching screen", lp.r.b($$1));
            $$0 = true;
         }
      }

      return $$0;
   }

   static {
      a(cra.a, fol::new);
      a(cra.b, fol::new);
      a(cra.c, fol::new);
      a(cra.d, fol::new);
      a(cra.e, fol::new);
      a(cra.f, fol::new);
      a(cra.g, fos::new);
      a(cra.h, fom::new);
      a(cra.i, fod::new);
      a(cra.j, foe::new);
      a(cra.k, fof::new);
      a(cra.l, foi::new);
      a(cra.m, fon::new);
      a(cra.n, fov::new);
      a(cra.o, fow::new);
      a(cra.p, fox::new);
      a(cra.q, foz::new);
      a(cra.r, fpe::new);
      a(cra.s, fpf::new);
      a(cra.t, fph::new);
      a(cra.u, fpk::new);
      a(cra.v, fpm::new);
      a(cra.w, fpn::new);
      a(cra.x, foj::new);
      a(cra.y, fpo::new);
   }

   interface a<T extends cpt, U extends fnc & fpg<T>> {
      default void a(xo $$0, cra<T> $$1, ffe $$2, int $$3) {
         U $$4 = this.create($$1.a($$3, $$2.s.gc()), $$2.s.gc(), $$0);
         $$2.s.cb = $$4.F();
         $$2.a($$4);
      }

      U create(T var1, cmv var2, xo var3);
   }
}
