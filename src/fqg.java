import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

public class fqg {
   private static final Map<dcx<?>, fqf<?>> a = Maps.newHashMap();

   private static <T extends dcv> void a(dcx<? extends T> $$0, fqf<T> $$1) {
      a.put($$0, $$1);
   }

   public static Map<dcx<?>, fqe<?>> a(fqf.a $$0) {
      Builder<dcx<?>, fqe<?>> $$1 = ImmutableMap.builder();
      a.forEach(($$2, $$3) -> {
         try {
            $$1.put($$2, $$3.create($$0));
         } catch (Exception var5) {
            throw new IllegalStateException("Failed to create model for " + jd.l.b((dcx<?>)$$2), var5);
         }
      });
      return $$1.build();
   }

   static {
      a(dcx.h, fqs::new);
      a(dcx.i, fqo::new);
      a(dcx.j, fqu::new);
      a(dcx.k, fqq::new);
      a(dcx.b, fqk::new);
      a(dcx.d, fqk::new);
      a(dcx.c, fqk::new);
      a(dcx.m, fqn::new);
      a(dcx.D, fqp::new);
      a(dcx.n, fqx::new);
      a(dcx.v, fqw::new);
      a(dcx.o, fqa::new);
      a(dcx.p, fqt::new);
      a(dcx.t, fpz::new);
      a(dcx.u, fqv::new);
      a(dcx.x, fqr::new);
      a(dcx.y, fqb::new);
      a(dcx.z, fql::new);
      a(dcx.E, fqc::new);
      a(dcx.G, fqj::new);
      a(dcx.N, fqi::new);
      a(dcx.O, fqm::new);
   }
}
