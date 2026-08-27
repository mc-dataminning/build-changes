import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import java.util.Map;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fam {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<chy<?>, fam.a<?, ?>> b = Maps.newHashMap();

   public static <T extends cgr> void a(@Nullable chy<T> $$0, eti $$1, int $$2, uv $$3) {
      if ($$0 == null) {
         a.warn("Trying to open invalid screen with name: {}", $$3.getString());
      } else {
         fam.a<T, ?> $$4 = a($$0);
         if ($$4 == null) {
            a.warn("Failed to create screen for menu type: {}", kc.s.b($$0));
         } else {
            $$4.a($$3, $$0, $$1, $$2);
         }
      }
   }

   @Nullable
   private static <T extends cgr> fam.a<T, ?> a(chy<T> $$0) {
      return (fam.a<T, ?>)b.get($$0);
   }

   private static <M extends cgr, U extends faz & fdd<M>> void a(chy<? extends M> $$0, fam.a<M, U> $$1) {
      fam.a<?, ?> $$2 = b.put($$0, $$1);
      if ($$2 != null) {
         throw new IllegalStateException("Duplicate registration for " + kc.s.b($$0));
      }
   }

   public static boolean a() {
      boolean $$0 = false;

      for (chy<?> $$1 : kc.s) {
         if (!b.containsKey($$1)) {
            a.debug("Menu {} has no matching screen", kc.s.b($$1));
            $$0 = true;
         }
      }

      return $$0;
   }

   static {
      a(chy.a, fcj::new);
      a(chy.b, fcj::new);
      a(chy.c, fcj::new);
      a(chy.d, fcj::new);
      a(chy.e, fcj::new);
      a(chy.f, fcj::new);
      a(chy.g, fcp::new);
      a(chy.h, fck::new);
      a(chy.i, fcb::new);
      a(chy.j, fcc::new);
      a(chy.k, fcd::new);
      a(chy.l, fcg::new);
      a(chy.m, fcl::new);
      a(chy.n, fcs::new);
      a(chy.o, fct::new);
      a(chy.p, fcu::new);
      a(chy.q, fcw::new);
      a(chy.r, fdb::new);
      a(chy.s, fdc::new);
      a(chy.t, fde::new);
      a(chy.u, fdh::new);
      a(chy.v, fdj::new);
      a(chy.w, fdk::new);
      a(chy.x, fch::new);
      a(chy.y, fdl::new);
   }

   interface a<T extends cgr, U extends faz & fdd<T>> {
      default void a(uv $$0, chy<T> $$1, eti $$2, int $$3) {
         U $$4 = this.create($$1.a($$3, $$2.s.fT()), $$2.s.fT(), $$0);
         $$2.s.bS = $$4.D();
         $$2.a($$4);
      }

      U create(T var1, cdy var2, uv var3);
   }
}
