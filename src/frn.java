import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import java.util.Map;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class frn {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<cti<?>, frn.a<?, ?>> b = Maps.newHashMap();

   public static <T extends crz> void a(cti<T> $$0, fke $$1, int $$2, xj $$3) {
      frn.a<T, ?> $$4 = a($$0);
      if ($$4 == null) {
         a.warn("Failed to create screen for menu type: {}", lz.p.b($$0));
      } else {
         $$4.a($$3, $$0, $$1, $$2);
      }
   }

   @Nullable
   private static <T extends crz> frn.a<T, ?> a(cti<T> $$0) {
      return (frn.a<T, ?>)b.get($$0);
   }

   private static <M extends crz, U extends frw & ftr<M>> void a(cti<? extends M> $$0, frn.a<M, U> $$1) {
      frn.a<?, ?> $$2 = b.put($$0, $$1);
      if ($$2 != null) {
         throw new IllegalStateException("Duplicate registration for " + lz.p.b($$0));
      }
   }

   public static boolean a() {
      boolean $$0 = false;

      for (cti<?> $$1 : lz.p) {
         if (!b.containsKey($$1)) {
            a.debug("Menu {} has no matching screen", lz.p.b($$1));
            $$0 = true;
         }
      }

      return $$0;
   }

   static {
      a(cti.a, fsx::new);
      a(cti.b, fsx::new);
      a(cti.c, fsx::new);
      a(cti.d, fsx::new);
      a(cti.e, fsx::new);
      a(cti.f, fsx::new);
      a(cti.g, ftd::new);
      a(cti.h, fsy::new);
      a(cti.i, fsp::new);
      a(cti.j, fsq::new);
      a(cti.k, fsr::new);
      a(cti.l, fsu::new);
      a(cti.m, fsz::new);
      a(cti.n, ftg::new);
      a(cti.o, fth::new);
      a(cti.p, fti::new);
      a(cti.q, ftk::new);
      a(cti.r, ftp::new);
      a(cti.s, ftq::new);
      a(cti.t, fts::new);
      a(cti.u, ftv::new);
      a(cti.v, ftx::new);
      a(cti.w, fty::new);
      a(cti.x, fsv::new);
      a(cti.y, ftz::new);
   }

   interface a<T extends crz, U extends frw & ftr<T>> {
      default void a(xj $$0, cti<T> $$1, fke $$2, int $$3) {
         U $$4 = this.create($$1.a($$3, $$2.t.gg()), $$2.t.gg(), $$0);
         $$2.t.cc = $$4.G();
         $$2.a($$4);
      }

      U create(T var1, cot var2, xj var3);
   }
}
