import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

public class frc {
   private static final Map<ddz<?>, frb<?>> a = Maps.newHashMap();

   private static <T extends ddx> void a(ddz<? extends T> $$0, frb<T> $$1) {
      a.put($$0, $$1);
   }

   public static Map<ddz<?>, fra<?>> a(frb.a $$0) {
      Builder<ddz<?>, fra<?>> $$1 = ImmutableMap.builder();
      a.forEach(($$2, $$3) -> {
         try {
            $$1.put($$2, $$3.create($$0));
         } catch (Exception var5) {
            throw new IllegalStateException("Failed to create model for " + jy.l.b((ddz<?>)$$2), var5);
         }
      });
      return $$1.build();
   }

   static {
      a(ddz.h, fro::new);
      a(ddz.i, frk::new);
      a(ddz.j, frq::new);
      a(ddz.k, frm::new);
      a(ddz.b, frg::new);
      a(ddz.d, frg::new);
      a(ddz.c, frg::new);
      a(ddz.m, frj::new);
      a(ddz.D, frl::new);
      a(ddz.n, frt::new);
      a(ddz.v, frs::new);
      a(ddz.o, fqw::new);
      a(ddz.p, frp::new);
      a(ddz.t, fqv::new);
      a(ddz.u, frr::new);
      a(ddz.x, frn::new);
      a(ddz.y, fqx::new);
      a(ddz.z, frh::new);
      a(ddz.E, fqy::new);
      a(ddz.G, frf::new);
      a(ddz.N, fre::new);
      a(ddz.O, fri::new);
   }
}
