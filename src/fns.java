import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import java.util.Map;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fns {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<crc<?>, fns.a<?, ?>> b = Maps.newHashMap();

   public static <T extends cpu> void a(crc<T> $$0, fgm $$1, int $$2, wz $$3) {
      fns.a<T, ?> $$4 = a($$0);
      if ($$4 == null) {
         a.warn("Failed to create screen for menu type: {}", lt.p.b($$0));
      } else {
         $$4.a($$3, $$0, $$1, $$2);
      }
   }

   @Nullable
   private static <T extends cpu> fns.a<T, ?> a(crc<T> $$0) {
      return (fns.a<T, ?>)b.get($$0);
   }

   private static <M extends cpu, U extends fob & fpw<M>> void a(crc<? extends M> $$0, fns.a<M, U> $$1) {
      fns.a<?, ?> $$2 = b.put($$0, $$1);
      if ($$2 != null) {
         throw new IllegalStateException("Duplicate registration for " + lt.p.b($$0));
      }
   }

   public static boolean a() {
      boolean $$0 = false;

      for (crc<?> $$1 : lt.p) {
         if (!b.containsKey($$1)) {
            a.debug("Menu {} has no matching screen", lt.p.b($$1));
            $$0 = true;
         }
      }

      return $$0;
   }

   static {
      a(crc.a, fpc::new);
      a(crc.b, fpc::new);
      a(crc.c, fpc::new);
      a(crc.d, fpc::new);
      a(crc.e, fpc::new);
      a(crc.f, fpc::new);
      a(crc.g, fpi::new);
      a(crc.h, fpd::new);
      a(crc.i, fou::new);
      a(crc.j, fov::new);
      a(crc.k, fow::new);
      a(crc.l, foz::new);
      a(crc.m, fpe::new);
      a(crc.n, fpl::new);
      a(crc.o, fpm::new);
      a(crc.p, fpn::new);
      a(crc.q, fpp::new);
      a(crc.r, fpu::new);
      a(crc.s, fpv::new);
      a(crc.t, fpx::new);
      a(crc.u, fqa::new);
      a(crc.v, fqc::new);
      a(crc.w, fqd::new);
      a(crc.x, fpa::new);
      a(crc.y, fqe::new);
   }

   interface a<T extends cpu, U extends fob & fpw<T>> {
      default void a(wz $$0, crc<T> $$1, fgm $$2, int $$3) {
         U $$4 = this.create($$1.a($$3, $$2.s.fZ()), $$2.s.fZ(), $$0);
         $$2.s.cd = $$4.D();
         $$2.a($$4);
      }

      U create(T var1, cmw var2, wz var3);
   }
}
