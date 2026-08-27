import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import java.util.Map;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fer {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<cli<?>, fer.a<?, ?>> b = Maps.newHashMap();

   public static <T extends ckb> void a(cli<T> $$0, exh $$1, int $$2, vq $$3) {
      fer.a<T, ?> $$4 = a($$0);
      if ($$4 == null) {
         a.warn("Failed to create screen for menu type: {}", kf.r.b($$0));
      } else {
         $$4.a($$3, $$0, $$1, $$2);
      }
   }

   @Nullable
   private static <T extends ckb> fer.a<T, ?> a(cli<T> $$0) {
      return (fer.a<T, ?>)b.get($$0);
   }

   private static <M extends ckb, U extends ffe & fhi<M>> void a(cli<? extends M> $$0, fer.a<M, U> $$1) {
      fer.a<?, ?> $$2 = b.put($$0, $$1);
      if ($$2 != null) {
         throw new IllegalStateException("Duplicate registration for " + kf.r.b($$0));
      }
   }

   public static boolean a() {
      boolean $$0 = false;

      for (cli<?> $$1 : kf.r) {
         if (!b.containsKey($$1)) {
            a.debug("Menu {} has no matching screen", kf.r.b($$1));
            $$0 = true;
         }
      }

      return $$0;
   }

   static {
      a(cli.a, fgo::new);
      a(cli.b, fgo::new);
      a(cli.c, fgo::new);
      a(cli.d, fgo::new);
      a(cli.e, fgo::new);
      a(cli.f, fgo::new);
      a(cli.g, fgu::new);
      a(cli.h, fgp::new);
      a(cli.i, fgg::new);
      a(cli.j, fgh::new);
      a(cli.k, fgi::new);
      a(cli.l, fgl::new);
      a(cli.m, fgq::new);
      a(cli.n, fgx::new);
      a(cli.o, fgy::new);
      a(cli.p, fgz::new);
      a(cli.q, fhb::new);
      a(cli.r, fhg::new);
      a(cli.s, fhh::new);
      a(cli.t, fhj::new);
      a(cli.u, fhm::new);
      a(cli.v, fho::new);
      a(cli.w, fhp::new);
      a(cli.x, fgm::new);
      a(cli.y, fhq::new);
   }

   interface a<T extends ckb, U extends ffe & fhi<T>> {
      default void a(vq $$0, cli<T> $$1, exh $$2, int $$3) {
         U $$4 = this.create($$1.a($$3, $$2.s.fT()), $$2.s.fT(), $$0);
         $$2.s.bW = $$4.H();
         $$2.a($$4);
      }

      U create(T var1, chg var2, vq var3);
   }
}
