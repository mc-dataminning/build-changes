import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

public class fpn {
   private static final Map<dco<?>, fpm<?>> a = Maps.newHashMap();

   private static <T extends dcm> void a(dco<? extends T> $$0, fpm<T> $$1) {
      a.put($$0, $$1);
   }

   public static Map<dco<?>, fpl<?>> a(fpm.a $$0) {
      Builder<dco<?>, fpl<?>> $$1 = ImmutableMap.builder();
      a.forEach(($$2, $$3) -> {
         try {
            $$1.put($$2, $$3.create($$0));
         } catch (Exception var5) {
            throw new IllegalStateException("Failed to create model for " + jb.l.b((dco<?>)$$2), var5);
         }
      });
      return $$1.build();
   }

   static {
      a(dco.h, fpz::new);
      a(dco.i, fpv::new);
      a(dco.j, fqb::new);
      a(dco.k, fpx::new);
      a(dco.b, fpr::new);
      a(dco.d, fpr::new);
      a(dco.c, fpr::new);
      a(dco.m, fpu::new);
      a(dco.D, fpw::new);
      a(dco.n, fqe::new);
      a(dco.v, fqd::new);
      a(dco.o, fph::new);
      a(dco.p, fqa::new);
      a(dco.t, fpg::new);
      a(dco.u, fqc::new);
      a(dco.x, fpy::new);
      a(dco.y, fpi::new);
      a(dco.z, fps::new);
      a(dco.E, fpj::new);
      a(dco.G, fpq::new);
      a(dco.N, fpp::new);
      a(dco.O, fpt::new);
   }
}
