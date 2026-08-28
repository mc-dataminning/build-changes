import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import java.util.Map;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ftn {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<cuk<?>, ftn.a<?, ?>> b = Maps.newHashMap();

   public static <T extends ctb> void a(cuk<T> $$0, fme $$1, int $$2, xv $$3) {
      ftn.a<T, ?> $$4 = a($$0);
      if ($$4 == null) {
         a.warn("Failed to create screen for menu type: {}", ma.p.b($$0));
      } else {
         $$4.a($$3, $$0, $$1, $$2);
      }
   }

   @Nullable
   private static <T extends ctb> ftn.a<T, ?> a(cuk<T> $$0) {
      return (ftn.a<T, ?>)b.get($$0);
   }

   private static <M extends ctb, U extends ftw & fvr<M>> void a(cuk<? extends M> $$0, ftn.a<M, U> $$1) {
      ftn.a<?, ?> $$2 = b.put($$0, $$1);
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
      a(cuk.a, fux::new);
      a(cuk.b, fux::new);
      a(cuk.c, fux::new);
      a(cuk.d, fux::new);
      a(cuk.e, fux::new);
      a(cuk.f, fux::new);
      a(cuk.g, fvd::new);
      a(cuk.h, fuy::new);
      a(cuk.i, fup::new);
      a(cuk.j, fuq::new);
      a(cuk.k, fur::new);
      a(cuk.l, fuu::new);
      a(cuk.m, fuz::new);
      a(cuk.n, fvg::new);
      a(cuk.o, fvh::new);
      a(cuk.p, fvi::new);
      a(cuk.q, fvk::new);
      a(cuk.r, fvp::new);
      a(cuk.s, fvq::new);
      a(cuk.t, fvs::new);
      a(cuk.u, fvv::new);
      a(cuk.v, fvx::new);
      a(cuk.w, fvy::new);
      a(cuk.x, fuv::new);
      a(cuk.y, fvz::new);
   }

   interface a<T extends ctb, U extends ftw & fvr<T>> {
      default void a(xv $$0, cuk<T> $$1, fme $$2, int $$3) {
         U $$4 = this.create($$1.a($$3, $$2.t.gg()), $$2.t.gg(), $$0);
         $$2.t.cd = $$4.F();
         $$2.a($$4);
      }

      U create(T var1, cpv var2, xv var3);
   }
}
