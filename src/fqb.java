import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

public class fqb {
   private static final Map<dcs<?>, fqa<?>> a = Maps.newHashMap();

   private static <T extends dcq> void a(dcs<? extends T> $$0, fqa<T> $$1) {
      a.put($$0, $$1);
   }

   public static Map<dcs<?>, fpz<?>> a(fqa.a $$0) {
      Builder<dcs<?>, fpz<?>> $$1 = ImmutableMap.builder();
      a.forEach(($$2, $$3) -> {
         try {
            $$1.put($$2, $$3.create($$0));
         } catch (Exception var5) {
            throw new IllegalStateException("Failed to create model for " + jd.l.b((dcs<?>)$$2), var5);
         }
      });
      return $$1.build();
   }

   static {
      a(dcs.h, fqn::new);
      a(dcs.i, fqj::new);
      a(dcs.j, fqp::new);
      a(dcs.k, fql::new);
      a(dcs.b, fqf::new);
      a(dcs.d, fqf::new);
      a(dcs.c, fqf::new);
      a(dcs.m, fqi::new);
      a(dcs.D, fqk::new);
      a(dcs.n, fqs::new);
      a(dcs.v, fqr::new);
      a(dcs.o, fpv::new);
      a(dcs.p, fqo::new);
      a(dcs.t, fpu::new);
      a(dcs.u, fqq::new);
      a(dcs.x, fqm::new);
      a(dcs.y, fpw::new);
      a(dcs.z, fqg::new);
      a(dcs.E, fpx::new);
      a(dcs.G, fqe::new);
      a(dcs.N, fqd::new);
      a(dcs.O, fqh::new);
   }
}
