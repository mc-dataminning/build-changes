import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import java.util.Map;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fqr {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<csx<?>, fqr.a<?, ?>> b = Maps.newHashMap();

   public static <T extends cro> void a(csx<T> $$0, fji $$1, int $$2, xi $$3) {
      fqr.a<T, ?> $$4 = a($$0);
      if ($$4 == null) {
         a.warn("Failed to create screen for menu type: {}", ly.p.b($$0));
      } else {
         $$4.a($$3, $$0, $$1, $$2);
      }
   }

   @Nullable
   private static <T extends cro> fqr.a<T, ?> a(csx<T> $$0) {
      return (fqr.a<T, ?>)b.get($$0);
   }

   private static <M extends cro, U extends fra & fsu<M>> void a(csx<? extends M> $$0, fqr.a<M, U> $$1) {
      fqr.a<?, ?> $$2 = b.put($$0, $$1);
      if ($$2 != null) {
         throw new IllegalStateException("Duplicate registration for " + ly.p.b($$0));
      }
   }

   public static boolean a() {
      boolean $$0 = false;

      for (csx<?> $$1 : ly.p) {
         if (!b.containsKey($$1)) {
            a.debug("Menu {} has no matching screen", ly.p.b($$1));
            $$0 = true;
         }
      }

      return $$0;
   }

   static {
      a(csx.a, fsa::new);
      a(csx.b, fsa::new);
      a(csx.c, fsa::new);
      a(csx.d, fsa::new);
      a(csx.e, fsa::new);
      a(csx.f, fsa::new);
      a(csx.g, fsg::new);
      a(csx.h, fsb::new);
      a(csx.i, frs::new);
      a(csx.j, frt::new);
      a(csx.k, fru::new);
      a(csx.l, frx::new);
      a(csx.m, fsc::new);
      a(csx.n, fsj::new);
      a(csx.o, fsk::new);
      a(csx.p, fsl::new);
      a(csx.q, fsn::new);
      a(csx.r, fss::new);
      a(csx.s, fst::new);
      a(csx.t, fsv::new);
      a(csx.u, fsy::new);
      a(csx.v, fta::new);
      a(csx.w, ftb::new);
      a(csx.x, fry::new);
      a(csx.y, ftc::new);
   }

   interface a<T extends cro, U extends fra & fsu<T>> {
      default void a(xi $$0, csx<T> $$1, fji $$2, int $$3) {
         U $$4 = this.create($$1.a($$3, $$2.t.gk()), $$2.t.gk(), $$0);
         $$2.t.cd = $$4.E();
         $$2.a($$4);
      }

      U create(T var1, col var2, xi var3);
   }
}
