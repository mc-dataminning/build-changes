import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import java.util.Map;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fto {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<cuk<?>, fto.a<?, ?>> b = Maps.newHashMap();

   public static <T extends ctb> void a(cuk<T> $$0, fmf $$1, int $$2, xv $$3) {
      fto.a<T, ?> $$4 = a($$0);
      if ($$4 == null) {
         a.warn("Failed to create screen for menu type: {}", ma.p.b($$0));
      } else {
         $$4.a($$3, $$0, $$1, $$2);
      }
   }

   @Nullable
   private static <T extends ctb> fto.a<T, ?> a(cuk<T> $$0) {
      return (fto.a<T, ?>)b.get($$0);
   }

   private static <M extends ctb, U extends ftx & fvs<M>> void a(cuk<? extends M> $$0, fto.a<M, U> $$1) {
      fto.a<?, ?> $$2 = b.put($$0, $$1);
      if ($$2 != null) {
         throw new IllegalStateException("Duplicate registration for " + ma.p.b($$0));
      }
   }

   public static boolean a() {
      boolean $$0 = false;

      for (cuk<?> $$1 : ma.p) {
         if (!b.containsKey($$1)) {
            a.debug("Menu {} has no matching screen", ma.p.b($$1));
            $$0 = true;
         }
      }

      return $$0;
   }

   static {
      a(cuk.a, fuy::new);
      a(cuk.b, fuy::new);
      a(cuk.c, fuy::new);
      a(cuk.d, fuy::new);
      a(cuk.e, fuy::new);
      a(cuk.f, fuy::new);
      a(cuk.g, fve::new);
      a(cuk.h, fuz::new);
      a(cuk.i, fuq::new);
      a(cuk.j, fur::new);
      a(cuk.k, fus::new);
      a(cuk.l, fuv::new);
      a(cuk.m, fva::new);
      a(cuk.n, fvh::new);
      a(cuk.o, fvi::new);
      a(cuk.p, fvj::new);
      a(cuk.q, fvl::new);
      a(cuk.r, fvq::new);
      a(cuk.s, fvr::new);
      a(cuk.t, fvt::new);
      a(cuk.u, fvw::new);
      a(cuk.v, fvy::new);
      a(cuk.w, fvz::new);
      a(cuk.x, fuw::new);
      a(cuk.y, fwa::new);
   }

   interface a<T extends ctb, U extends ftx & fvs<T>> {
      default void a(xv $$0, cuk<T> $$1, fmf $$2, int $$3) {
         U $$4 = this.create($$1.a($$3, $$2.t.gi()), $$2.t.gi(), $$0);
         $$2.t.cd = $$4.F();
         $$2.a($$4);
      }

      U create(T var1, cpv var2, xv var3);
   }
}
