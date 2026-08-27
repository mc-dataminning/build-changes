import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

public class fpw {
   private static final Map<dcn<?>, fpv<?>> a = Maps.newHashMap();

   private static <T extends dcl> void a(dcn<? extends T> $$0, fpv<T> $$1) {
      a.put($$0, $$1);
   }

   public static Map<dcn<?>, fpu<?>> a(fpv.a $$0) {
      Builder<dcn<?>, fpu<?>> $$1 = ImmutableMap.builder();
      a.forEach(($$2, $$3) -> {
         try {
            $$1.put($$2, $$3.create($$0));
         } catch (Exception var5) {
            throw new IllegalStateException("Failed to create model for " + jb.l.b((dcn<?>)$$2), var5);
         }
      });
      return $$1.build();
   }

   static {
      a(dcn.h, fqi::new);
      a(dcn.i, fqe::new);
      a(dcn.j, fqk::new);
      a(dcn.k, fqg::new);
      a(dcn.b, fqa::new);
      a(dcn.d, fqa::new);
      a(dcn.c, fqa::new);
      a(dcn.m, fqd::new);
      a(dcn.D, fqf::new);
      a(dcn.n, fqn::new);
      a(dcn.v, fqm::new);
      a(dcn.o, fpq::new);
      a(dcn.p, fqj::new);
      a(dcn.t, fpp::new);
      a(dcn.u, fql::new);
      a(dcn.x, fqh::new);
      a(dcn.y, fpr::new);
      a(dcn.z, fqb::new);
      a(dcn.E, fps::new);
      a(dcn.G, fpz::new);
      a(dcn.N, fpy::new);
      a(dcn.O, fqc::new);
   }
}
