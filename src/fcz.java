import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import java.util.Map;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fcz {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<cjq<?>, fcz.a<?, ?>> b = Maps.newHashMap();

   public static <T extends cij> void a(@Nullable cjq<T> $$0, evr $$1, int $$2, vg $$3) {
      if ($$0 == null) {
         a.warn("Trying to open invalid screen with name: {}", $$3.getString());
      } else {
         fcz.a<T, ?> $$4 = a($$0);
         if ($$4 == null) {
            a.warn("Failed to create screen for menu type: {}", kd.r.b($$0));
         } else {
            $$4.a($$3, $$0, $$1, $$2);
         }
      }
   }

   @Nullable
   private static <T extends cij> fcz.a<T, ?> a(cjq<T> $$0) {
      return (fcz.a<T, ?>)b.get($$0);
   }

   private static <M extends cij, U extends fdm & ffq<M>> void a(cjq<? extends M> $$0, fcz.a<M, U> $$1) {
      fcz.a<?, ?> $$2 = b.put($$0, $$1);
      if ($$2 != null) {
         throw new IllegalStateException("Duplicate registration for " + kd.r.b($$0));
      }
   }

   public static boolean a() {
      boolean $$0 = false;

      for (cjq<?> $$1 : kd.r) {
         if (!b.containsKey($$1)) {
            a.debug("Menu {} has no matching screen", kd.r.b($$1));
            $$0 = true;
         }
      }

      return $$0;
   }

   static {
      a(cjq.a, few::new);
      a(cjq.b, few::new);
      a(cjq.c, few::new);
      a(cjq.d, few::new);
      a(cjq.e, few::new);
      a(cjq.f, few::new);
      a(cjq.g, ffc::new);
      a(cjq.h, fex::new);
      a(cjq.i, feo::new);
      a(cjq.j, fep::new);
      a(cjq.k, feq::new);
      a(cjq.l, fet::new);
      a(cjq.m, fey::new);
      a(cjq.n, fff::new);
      a(cjq.o, ffg::new);
      a(cjq.p, ffh::new);
      a(cjq.q, ffj::new);
      a(cjq.r, ffo::new);
      a(cjq.s, ffp::new);
      a(cjq.t, ffr::new);
      a(cjq.u, ffu::new);
      a(cjq.v, ffw::new);
      a(cjq.w, ffx::new);
      a(cjq.x, feu::new);
      a(cjq.y, ffy::new);
   }

   interface a<T extends cij, U extends fdm & ffq<T>> {
      default void a(vg $$0, cjq<T> $$1, evr $$2, int $$3) {
         U $$4 = this.create($$1.a($$3, $$2.s.fS()), $$2.s.fS(), $$0);
         $$2.s.bW = $$4.H();
         $$2.a($$4);
      }

      U create(T var1, cfp var2, vg var3);
   }
}
