import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import java.util.Map;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fey {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<clm<?>, fey.a<?, ?>> b = Maps.newHashMap();

   public static <T extends ckf> void a(clm<T> $$0, exo $$1, int $$2, vq $$3) {
      fey.a<T, ?> $$4 = a($$0);
      if ($$4 == null) {
         a.warn("Failed to create screen for menu type: {}", kf.r.b($$0));
      } else {
         $$4.a($$3, $$0, $$1, $$2);
      }
   }

   @Nullable
   private static <T extends ckf> fey.a<T, ?> a(clm<T> $$0) {
      return (fey.a<T, ?>)b.get($$0);
   }

   private static <M extends ckf, U extends ffl & fhp<M>> void a(clm<? extends M> $$0, fey.a<M, U> $$1) {
      fey.a<?, ?> $$2 = b.put($$0, $$1);
      if ($$2 != null) {
         throw new IllegalStateException("Duplicate registration for " + kf.r.b($$0));
      }
   }

   public static boolean a() {
      boolean $$0 = false;

      for (clm<?> $$1 : kf.r) {
         if (!b.containsKey($$1)) {
            a.debug("Menu {} has no matching screen", kf.r.b($$1));
            $$0 = true;
         }
      }

      return $$0;
   }

   static {
      a(clm.a, fgv::new);
      a(clm.b, fgv::new);
      a(clm.c, fgv::new);
      a(clm.d, fgv::new);
      a(clm.e, fgv::new);
      a(clm.f, fgv::new);
      a(clm.g, fhb::new);
      a(clm.h, fgw::new);
      a(clm.i, fgn::new);
      a(clm.j, fgo::new);
      a(clm.k, fgp::new);
      a(clm.l, fgs::new);
      a(clm.m, fgx::new);
      a(clm.n, fhe::new);
      a(clm.o, fhf::new);
      a(clm.p, fhg::new);
      a(clm.q, fhi::new);
      a(clm.r, fhn::new);
      a(clm.s, fho::new);
      a(clm.t, fhq::new);
      a(clm.u, fht::new);
      a(clm.v, fhv::new);
      a(clm.w, fhw::new);
      a(clm.x, fgt::new);
      a(clm.y, fhx::new);
   }

   interface a<T extends ckf, U extends ffl & fhp<T>> {
      default void a(vq $$0, clm<T> $$1, exo $$2, int $$3) {
         U $$4 = this.create($$1.a($$3, $$2.s.fT()), $$2.s.fT(), $$0);
         $$2.s.bW = $$4.H();
         $$2.a($$4);
      }

      U create(T var1, chk var2, vq var3);
   }
}
