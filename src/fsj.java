import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

public class fsj {
   private static final Map<det<?>, fsi<?>> a = Maps.newHashMap();

   private static <T extends der> void a(det<? extends T> $$0, fsi<T> $$1) {
      a.put($$0, $$1);
   }

   public static Map<det<?>, fsh<?>> a(fsi.a $$0) {
      Builder<det<?>, fsh<?>> $$1 = ImmutableMap.builder();
      a.forEach(($$2, $$3) -> {
         try {
            $$1.put($$2, $$3.create($$0));
         } catch (Exception var5) {
            throw new IllegalStateException("Failed to create model for " + jy.l.b((det<?>)$$2), var5);
         }
      });
      return $$1.build();
   }

   static {
      a(det.h, fsv::new);
      a(det.i, fsr::new);
      a(det.j, fsx::new);
      a(det.k, fst::new);
      a(det.b, fsn::new);
      a(det.d, fsn::new);
      a(det.c, fsn::new);
      a(det.m, fsq::new);
      a(det.D, fss::new);
      a(det.n, fta::new);
      a(det.v, fsz::new);
      a(det.o, fsd::new);
      a(det.p, fsw::new);
      a(det.t, fsc::new);
      a(det.u, fsy::new);
      a(det.x, fsu::new);
      a(det.y, fse::new);
      a(det.z, fso::new);
      a(det.E, fsf::new);
      a(det.G, fsm::new);
      a(det.N, fsl::new);
      a(det.O, fsp::new);
   }
}
