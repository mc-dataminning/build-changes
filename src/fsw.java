import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

public class fsw {
   private static final Map<dff<?>, fsv<?>> a = Maps.newHashMap();

   private static <T extends dfd> void a(dff<? extends T> $$0, fsv<T> $$1) {
      a.put($$0, $$1);
   }

   public static Map<dff<?>, fsu<?>> a(fsv.a $$0) {
      Builder<dff<?>, fsu<?>> $$1 = ImmutableMap.builder();
      a.forEach(($$2, $$3) -> {
         try {
            $$1.put($$2, $$3.create($$0));
         } catch (Exception var5) {
            throw new IllegalStateException("Failed to create model for " + jy.l.b((dff<?>)$$2), var5);
         }
      });
      return $$1.build();
   }

   static {
      a(dff.h, fti::new);
      a(dff.i, fte::new);
      a(dff.j, ftk::new);
      a(dff.k, ftg::new);
      a(dff.b, fta::new);
      a(dff.d, fta::new);
      a(dff.c, fta::new);
      a(dff.m, ftd::new);
      a(dff.D, ftf::new);
      a(dff.n, ftn::new);
      a(dff.v, ftm::new);
      a(dff.o, fsq::new);
      a(dff.p, ftj::new);
      a(dff.t, fsp::new);
      a(dff.u, ftl::new);
      a(dff.x, fth::new);
      a(dff.y, fsr::new);
      a(dff.z, ftb::new);
      a(dff.E, fss::new);
      a(dff.G, fsz::new);
      a(dff.N, fsy::new);
      a(dff.O, ftc::new);
   }
}
