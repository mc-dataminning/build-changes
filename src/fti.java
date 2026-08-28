import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import java.util.Map;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fti {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<cug<?>, fti.a<?, ?>> b = Maps.newHashMap();

   public static <T extends csx> void a(cug<T> $$0, flz $$1, int $$2, xv $$3) {
      fti.a<T, ?> $$4 = a($$0);
      if ($$4 == null) {
         a.warn("Failed to create screen for menu type: {}", ma.p.b($$0));
      } else {
         $$4.a($$3, $$0, $$1, $$2);
      }
   }

   @Nullable
   private static <T extends csx> fti.a<T, ?> a(cug<T> $$0) {
      return (fti.a<T, ?>)b.get($$0);
   }

   private static <M extends csx, U extends ftr & fvm<M>> void a(cug<? extends M> $$0, fti.a<M, U> $$1) {
      fti.a<?, ?> $$2 = b.put($$0, $$1);
      if ($$2 != null) {
         throw new IllegalStateException("Duplicate registration for " + ma.p.b($$0));
      }
   }

   public static boolean a() {
      boolean $$0 = false;

      for (cug<?> $$1 : ma.p) {
         if (!b.containsKey($$1)) {
            a.debug("Menu {} has no matching screen", ma.p.b($$1));
            $$0 = true;
         }
      }

      return $$0;
   }

   static {
      a(cug.a, fus::new);
      a(cug.b, fus::new);
      a(cug.c, fus::new);
      a(cug.d, fus::new);
      a(cug.e, fus::new);
      a(cug.f, fus::new);
      a(cug.g, fuy::new);
      a(cug.h, fut::new);
      a(cug.i, fuk::new);
      a(cug.j, ful::new);
      a(cug.k, fum::new);
      a(cug.l, fup::new);
      a(cug.m, fuu::new);
      a(cug.n, fvb::new);
      a(cug.o, fvc::new);
      a(cug.p, fvd::new);
      a(cug.q, fvf::new);
      a(cug.r, fvk::new);
      a(cug.s, fvl::new);
      a(cug.t, fvn::new);
      a(cug.u, fvq::new);
      a(cug.v, fvs::new);
      a(cug.w, fvt::new);
      a(cug.x, fuq::new);
      a(cug.y, fvu::new);
   }

   interface a<T extends csx, U extends ftr & fvm<T>> {
      default void a(xv $$0, cug<T> $$1, flz $$2, int $$3) {
         U $$4 = this.create($$1.a($$3, $$2.t.gg()), $$2.t.gg(), $$0);
         $$2.t.cd = $$4.F();
         $$2.a($$4);
      }

      U create(T var1, cpr var2, xv var3);
   }
}
