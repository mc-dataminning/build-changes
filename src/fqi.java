import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

public class fqi {
   private static final Map<dcz<?>, fqh<?>> a = Maps.newHashMap();

   private static <T extends dcx> void a(dcz<? extends T> $$0, fqh<T> $$1) {
      a.put($$0, $$1);
   }

   public static Map<dcz<?>, fqg<?>> a(fqh.a $$0) {
      Builder<dcz<?>, fqg<?>> $$1 = ImmutableMap.builder();
      a.forEach(($$2, $$3) -> {
         try {
            $$1.put($$2, $$3.create($$0));
         } catch (Exception var5) {
            throw new IllegalStateException("Failed to create model for " + jd.l.b((dcz<?>)$$2), var5);
         }
      });
      return $$1.build();
   }

   static {
      a(dcz.h, fqu::new);
      a(dcz.i, fqq::new);
      a(dcz.j, fqw::new);
      a(dcz.k, fqs::new);
      a(dcz.b, fqm::new);
      a(dcz.d, fqm::new);
      a(dcz.c, fqm::new);
      a(dcz.m, fqp::new);
      a(dcz.D, fqr::new);
      a(dcz.n, fqz::new);
      a(dcz.v, fqy::new);
      a(dcz.o, fqc::new);
      a(dcz.p, fqv::new);
      a(dcz.t, fqb::new);
      a(dcz.u, fqx::new);
      a(dcz.x, fqt::new);
      a(dcz.y, fqd::new);
      a(dcz.z, fqn::new);
      a(dcz.E, fqe::new);
      a(dcz.G, fql::new);
      a(dcz.N, fqk::new);
      a(dcz.O, fqo::new);
   }
}
