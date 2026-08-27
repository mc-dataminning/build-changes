import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

public class fqc {
   private static final Map<ddb<?>, fqb<?>> a = Maps.newHashMap();

   private static <T extends dcz> void a(ddb<? extends T> $$0, fqb<T> $$1) {
      a.put($$0, $$1);
   }

   public static Map<ddb<?>, fqa<?>> a(fqb.a $$0) {
      Builder<ddb<?>, fqa<?>> $$1 = ImmutableMap.builder();
      a.forEach(($$2, $$3) -> {
         try {
            $$1.put($$2, $$3.create($$0));
         } catch (Exception var5) {
            throw new IllegalStateException("Failed to create model for " + jb.l.b((ddb<?>)$$2), var5);
         }
      });
      return $$1.build();
   }

   static {
      a(ddb.h, fqo::new);
      a(ddb.i, fqk::new);
      a(ddb.j, fqq::new);
      a(ddb.k, fqm::new);
      a(ddb.b, fqg::new);
      a(ddb.d, fqg::new);
      a(ddb.c, fqg::new);
      a(ddb.m, fqj::new);
      a(ddb.D, fql::new);
      a(ddb.n, fqt::new);
      a(ddb.v, fqs::new);
      a(ddb.o, fpw::new);
      a(ddb.p, fqp::new);
      a(ddb.t, fpv::new);
      a(ddb.u, fqr::new);
      a(ddb.x, fqn::new);
      a(ddb.y, fpx::new);
      a(ddb.z, fqh::new);
      a(ddb.E, fpy::new);
      a(ddb.G, fqf::new);
      a(ddb.N, fqe::new);
      a(ddb.O, fqi::new);
   }
}
