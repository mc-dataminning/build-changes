import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import java.util.Map;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fnu {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<crc<?>, fnu.a<?, ?>> b = Maps.newHashMap();

   public static <T extends cpu> void a(crc<T> $$0, fgo $$1, int $$2, wz $$3) {
      fnu.a<T, ?> $$4 = a($$0);
      if ($$4 == null) {
         a.warn("Failed to create screen for menu type: {}", lt.p.b($$0));
      } else {
         $$4.a($$3, $$0, $$1, $$2);
      }
   }

   @Nullable
   private static <T extends cpu> fnu.a<T, ?> a(crc<T> $$0) {
      return (fnu.a<T, ?>)b.get($$0);
   }

   private static <M extends cpu, U extends fod & fpy<M>> void a(crc<? extends M> $$0, fnu.a<M, U> $$1) {
      fnu.a<?, ?> $$2 = b.put($$0, $$1);
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
      a(crc.a, fpe::new);
      a(crc.b, fpe::new);
      a(crc.c, fpe::new);
      a(crc.d, fpe::new);
      a(crc.e, fpe::new);
      a(crc.f, fpe::new);
      a(crc.g, fpk::new);
      a(crc.h, fpf::new);
      a(crc.i, fow::new);
      a(crc.j, fox::new);
      a(crc.k, foy::new);
      a(crc.l, fpb::new);
      a(crc.m, fpg::new);
      a(crc.n, fpn::new);
      a(crc.o, fpo::new);
      a(crc.p, fpp::new);
      a(crc.q, fpr::new);
      a(crc.r, fpw::new);
      a(crc.s, fpx::new);
      a(crc.t, fpz::new);
      a(crc.u, fqc::new);
      a(crc.v, fqe::new);
      a(crc.w, fqf::new);
      a(crc.x, fpc::new);
      a(crc.y, fqg::new);
   }

   interface a<T extends cpu, U extends fod & fpy<T>> {
      default void a(wz $$0, crc<T> $$1, fgo $$2, int $$3) {
         U $$4 = this.create($$1.a($$3, $$2.s.fY()), $$2.s.fY(), $$0);
         $$2.s.cd = $$4.D();
         $$2.a($$4);
      }

      U create(T var1, cmw var2, wz var3);
   }
}
