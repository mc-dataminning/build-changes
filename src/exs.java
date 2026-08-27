import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import java.util.Map;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class exs {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<cfl<?>, exs.a<?, ?>> b = Maps.newHashMap();

   public static <T extends ceg> void a(@Nullable cfl<T> $$0, eqq $$1, int $$2, ti $$3) {
      if ($$0 == null) {
         a.warn("Trying to open invalid screen with name: {}", $$3.getString());
      } else {
         exs.a<T, ?> $$4 = a($$0);
         if ($$4 == null) {
            a.warn("Failed to create screen for menu type: {}", jd.s.b($$0));
         } else {
            $$4.a($$3, $$0, $$1, $$2);
         }
      }
   }

   @Nullable
   private static <T extends ceg> exs.a<T, ?> a(cfl<T> $$0) {
      return (exs.a<T, ?>)b.get($$0);
   }

   private static <M extends ceg, U extends eyf & fah<M>> void a(cfl<? extends M> $$0, exs.a<M, U> $$1) {
      exs.a<?, ?> $$2 = b.put($$0, $$1);
      if ($$2 != null) {
         throw new IllegalStateException("Duplicate registration for " + jd.s.b($$0));
      }
   }

   public static boolean a() {
      boolean $$0 = false;

      for (cfl<?> $$1 : jd.s) {
         if (!b.containsKey($$1)) {
            a.debug("Menu {} has no matching screen", jd.s.b($$1));
            $$0 = true;
         }
      }

      return $$0;
   }

   static {
      a(cfl.a, ezo::new);
      a(cfl.b, ezo::new);
      a(cfl.c, ezo::new);
      a(cfl.d, ezo::new);
      a(cfl.e, ezo::new);
      a(cfl.f, ezo::new);
      a(cfl.g, ezt::new);
      a(cfl.h, ezg::new);
      a(cfl.i, ezh::new);
      a(cfl.j, ezi::new);
      a(cfl.k, ezl::new);
      a(cfl.l, ezp::new);
      a(cfl.m, ezw::new);
      a(cfl.n, ezx::new);
      a(cfl.o, ezy::new);
      a(cfl.p, faa::new);
      a(cfl.q, faf::new);
      a(cfl.r, fag::new);
      a(cfl.s, fai::new);
      a(cfl.t, fal::new);
      a(cfl.u, fan::new);
      a(cfl.v, fao::new);
      a(cfl.w, ezm::new);
      a(cfl.x, fap::new);
   }

   interface a<T extends ceg, U extends eyf & fah<T>> {
      default void a(ti $$0, cfl<T> $$1, eqq $$2, int $$3) {
         U $$4 = this.create($$1.a($$3, $$2.s.fQ()), $$2.s.fQ(), $$0);
         $$2.s.bQ = $$4.D();
         $$2.a($$4);
      }

      U create(T var1, cbo var2, ti var3);
   }
}
