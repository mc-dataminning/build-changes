import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

public class flw {
   private static final Map<czp<?>, flv<?>> a = Maps.newHashMap();

   private static <T extends czn> void a(czp<? extends T> $$0, flv<T> $$1) {
      a.put($$0, $$1);
   }

   public static Map<czp<?>, flu<?>> a(flv.a $$0) {
      Builder<czp<?>, flu<?>> $$1 = ImmutableMap.builder();
      a.forEach(($$2, $$3) -> {
         try {
            $$1.put($$2, $$3.create($$0));
         } catch (Exception var5) {
            throw new IllegalStateException("Failed to create model for " + jb.l.b((czp<?>)$$2), var5);
         }
      });
      return $$1.build();
   }

   static {
      a(czp.h, fmi::new);
      a(czp.i, fme::new);
      a(czp.j, fmk::new);
      a(czp.k, fmg::new);
      a(czp.b, fma::new);
      a(czp.d, fma::new);
      a(czp.c, fma::new);
      a(czp.m, fmd::new);
      a(czp.D, fmf::new);
      a(czp.n, fmn::new);
      a(czp.v, fmm::new);
      a(czp.o, flq::new);
      a(czp.p, fmj::new);
      a(czp.t, flp::new);
      a(czp.u, fml::new);
      a(czp.x, fmh::new);
      a(czp.y, flr::new);
      a(czp.z, fmb::new);
      a(czp.E, fls::new);
      a(czp.G, flz::new);
      a(czp.N, fly::new);
      a(czp.O, fmc::new);
   }
}
