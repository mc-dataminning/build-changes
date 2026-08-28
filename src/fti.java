import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import java.util.Map;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fti {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<cuc<?>, fti.a<?, ?>> b = Maps.newHashMap();

   public static <T extends cst> void a(cuc<T> $$0, flz $$1, int $$2, xk $$3) {
      fti.a<T, ?> $$4 = a($$0);
      if ($$4 == null) {
         a.warn("Failed to create screen for menu type: {}", ma.p.b($$0));
      } else {
         $$4.a($$3, $$0, $$1, $$2);
      }
   }

   @Nullable
   private static <T extends cst> fti.a<T, ?> a(cuc<T> $$0) {
      return (fti.a<T, ?>)b.get($$0);
   }

   private static <M extends cst, U extends ftr & fvm<M>> void a(cuc<? extends M> $$0, fti.a<M, U> $$1) {
      fti.a<?, ?> $$2 = b.put($$0, $$1);
      if ($$2 != null) {
         throw new IllegalStateException("Duplicate registration for " + ma.p.b($$0));
      }
   }

   public static boolean a() {
      boolean $$0 = false;

      for (cuc<?> $$1 : ma.p) {
         if (!b.containsKey($$1)) {
            a.debug("Menu {} has no matching screen", ma.p.b($$1));
            $$0 = true;
         }
      }

      return $$0;
   }

   static {
      a(cuc.a, fus::new);
      a(cuc.b, fus::new);
      a(cuc.c, fus::new);
      a(cuc.d, fus::new);
      a(cuc.e, fus::new);
      a(cuc.f, fus::new);
      a(cuc.g, fuy::new);
      a(cuc.h, fut::new);
      a(cuc.i, fuk::new);
      a(cuc.j, ful::new);
      a(cuc.k, fum::new);
      a(cuc.l, fup::new);
      a(cuc.m, fuu::new);
      a(cuc.n, fvb::new);
      a(cuc.o, fvc::new);
      a(cuc.p, fvd::new);
      a(cuc.q, fvf::new);
      a(cuc.r, fvk::new);
      a(cuc.s, fvl::new);
      a(cuc.t, fvn::new);
      a(cuc.u, fvq::new);
      a(cuc.v, fvs::new);
      a(cuc.w, fvt::new);
      a(cuc.x, fuq::new);
      a(cuc.y, fvu::new);
   }

   interface a<T extends cst, U extends ftr & fvm<T>> {
      default void a(xk $$0, cuc<T> $$1, flz $$2, int $$3) {
         U $$4 = this.create($$1.a($$3, $$2.t.gi()), $$2.t.gi(), $$0);
         $$2.t.cd = $$4.F();
         $$2.a($$4);
      }

      U create(T var1, cpn var2, xk var3);
   }
}
