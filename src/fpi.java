import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

public class fpi {
   private static final Map<dcm<?>, fph<?>> a = Maps.newHashMap();

   private static <T extends dck> void a(dcm<? extends T> $$0, fph<T> $$1) {
      a.put($$0, $$1);
   }

   public static Map<dcm<?>, fpg<?>> a(fph.a $$0) {
      Builder<dcm<?>, fpg<?>> $$1 = ImmutableMap.builder();
      a.forEach(($$2, $$3) -> {
         try {
            $$1.put($$2, $$3.create($$0));
         } catch (Exception var5) {
            throw new IllegalStateException("Failed to create model for " + jc.l.b((dcm<?>)$$2), var5);
         }
      });
      return $$1.build();
   }

   static {
      a(dcm.h, fpu::new);
      a(dcm.i, fpq::new);
      a(dcm.j, fpw::new);
      a(dcm.k, fps::new);
      a(dcm.b, fpm::new);
      a(dcm.d, fpm::new);
      a(dcm.c, fpm::new);
      a(dcm.m, fpp::new);
      a(dcm.D, fpr::new);
      a(dcm.n, fpz::new);
      a(dcm.v, fpy::new);
      a(dcm.o, fpc::new);
      a(dcm.p, fpv::new);
      a(dcm.t, fpb::new);
      a(dcm.u, fpx::new);
      a(dcm.x, fpt::new);
      a(dcm.y, fpd::new);
      a(dcm.z, fpn::new);
      a(dcm.E, fpe::new);
      a(dcm.G, fpl::new);
      a(dcm.N, fpk::new);
      a(dcm.O, fpo::new);
   }
}
