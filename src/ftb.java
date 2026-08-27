import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

public class ftb {
   private static final Map<dfk<?>, fta<?>> a = Maps.newHashMap();

   private static <T extends dfi> void a(dfk<? extends T> $$0, fta<T> $$1) {
      a.put($$0, $$1);
   }

   public static Map<dfk<?>, fsz<?>> a(fta.a $$0) {
      Builder<dfk<?>, fsz<?>> $$1 = ImmutableMap.builder();
      a.forEach(($$2, $$3) -> {
         try {
            $$1.put($$2, $$3.create($$0));
         } catch (Exception var5) {
            throw new IllegalStateException("Failed to create model for " + kc.l.b((dfk<?>)$$2), var5);
         }
      });
      return $$1.build();
   }

   static {
      a(dfk.h, ftn::new);
      a(dfk.i, ftj::new);
      a(dfk.j, ftp::new);
      a(dfk.k, ftl::new);
      a(dfk.b, ftf::new);
      a(dfk.d, ftf::new);
      a(dfk.c, ftf::new);
      a(dfk.m, fti::new);
      a(dfk.D, ftk::new);
      a(dfk.n, fts::new);
      a(dfk.v, ftr::new);
      a(dfk.o, fsv::new);
      a(dfk.p, fto::new);
      a(dfk.t, fsu::new);
      a(dfk.u, ftq::new);
      a(dfk.x, ftm::new);
      a(dfk.y, fsw::new);
      a(dfk.z, ftg::new);
      a(dfk.E, fsx::new);
      a(dfk.G, fte::new);
      a(dfk.N, ftd::new);
      a(dfk.O, fth::new);
   }
}
