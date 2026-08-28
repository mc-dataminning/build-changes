import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import java.util.Map;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fmr {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<crc<?>, fmr.a<?, ?>> b = Maps.newHashMap();

   public static <T extends cpv> void a(crc<T> $$0, ffg $$1, int $$2, xp $$3) {
      fmr.a<T, ?> $$4 = a($$0);
      if ($$4 == null) {
         a.warn("Failed to create screen for menu type: {}", lp.r.b($$0));
      } else {
         $$4.a($$3, $$0, $$1, $$2);
      }
   }

   @Nullable
   private static <T extends cpv> fmr.a<T, ?> a(crc<T> $$0) {
      return (fmr.a<T, ?>)b.get($$0);
   }

   private static <M extends cpv, U extends fne & fpi<M>> void a(crc<? extends M> $$0, fmr.a<M, U> $$1) {
      fmr.a<?, ?> $$2 = b.put($$0, $$1);
      if ($$2 != null) {
         throw new IllegalStateException("Duplicate registration for " + lp.r.b($$0));
      }
   }

   public static boolean a() {
      boolean $$0 = false;

      for (crc<?> $$1 : lp.r) {
         if (!b.containsKey($$1)) {
            a.debug("Menu {} has no matching screen", lp.r.b($$1));
            $$0 = true;
         }
      }

      return $$0;
   }

   static {
      a(crc.a, fon::new);
      a(crc.b, fon::new);
      a(crc.c, fon::new);
      a(crc.d, fon::new);
      a(crc.e, fon::new);
      a(crc.f, fon::new);
      a(crc.g, fou::new);
      a(crc.h, foo::new);
      a(crc.i, fof::new);
      a(crc.j, fog::new);
      a(crc.k, foh::new);
      a(crc.l, fok::new);
      a(crc.m, fop::new);
      a(crc.n, fox::new);
      a(crc.o, foy::new);
      a(crc.p, foz::new);
      a(crc.q, fpb::new);
      a(crc.r, fpg::new);
      a(crc.s, fph::new);
      a(crc.t, fpj::new);
      a(crc.u, fpm::new);
      a(crc.v, fpo::new);
      a(crc.w, fpp::new);
      a(crc.x, fol::new);
      a(crc.y, fpq::new);
   }

   interface a<T extends cpv, U extends fne & fpi<T>> {
      default void a(xp $$0, crc<T> $$1, ffg $$2, int $$3) {
         U $$4 = this.create($$1.a($$3, $$2.s.gc()), $$2.s.gc(), $$0);
         $$2.s.cb = $$4.F();
         $$2.a($$4);
      }

      U create(T var1, cmx var2, xp var3);
   }
}
