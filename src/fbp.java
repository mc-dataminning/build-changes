import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import java.util.Map;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fbp {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<cir<?>, fbp.a<?, ?>> b = Maps.newHashMap();

   public static <T extends chk> void a(@Nullable cir<T> $$0, euk $$1, int $$2, vb $$3) {
      if ($$0 == null) {
         a.warn("Trying to open invalid screen with name: {}", $$3.getString());
      } else {
         fbp.a<T, ?> $$4 = a($$0);
         if ($$4 == null) {
            a.warn("Failed to create screen for menu type: {}", kb.r.b($$0));
         } else {
            $$4.a($$3, $$0, $$1, $$2);
         }
      }
   }

   @Nullable
   private static <T extends chk> fbp.a<T, ?> a(cir<T> $$0) {
      return (fbp.a<T, ?>)b.get($$0);
   }

   private static <M extends chk, U extends fcc & feg<M>> void a(cir<? extends M> $$0, fbp.a<M, U> $$1) {
      fbp.a<?, ?> $$2 = b.put($$0, $$1);
      if ($$2 != null) {
         throw new IllegalStateException("Duplicate registration for " + kb.r.b($$0));
      }
   }

   public static boolean a() {
      boolean $$0 = false;

      for (cir<?> $$1 : kb.r) {
         if (!b.containsKey($$1)) {
            a.debug("Menu {} has no matching screen", kb.r.b($$1));
            $$0 = true;
         }
      }

      return $$0;
   }

   static {
      a(cir.a, fdm::new);
      a(cir.b, fdm::new);
      a(cir.c, fdm::new);
      a(cir.d, fdm::new);
      a(cir.e, fdm::new);
      a(cir.f, fdm::new);
      a(cir.g, fds::new);
      a(cir.h, fdn::new);
      a(cir.i, fde::new);
      a(cir.j, fdf::new);
      a(cir.k, fdg::new);
      a(cir.l, fdj::new);
      a(cir.m, fdo::new);
      a(cir.n, fdv::new);
      a(cir.o, fdw::new);
      a(cir.p, fdx::new);
      a(cir.q, fdz::new);
      a(cir.r, fee::new);
      a(cir.s, fef::new);
      a(cir.t, feh::new);
      a(cir.u, fek::new);
      a(cir.v, fem::new);
      a(cir.w, fen::new);
      a(cir.x, fdk::new);
      a(cir.y, feo::new);
   }

   interface a<T extends chk, U extends fcc & feg<T>> {
      default void a(vb $$0, cir<T> $$1, euk $$2, int $$3) {
         U $$4 = this.create($$1.a($$3, $$2.s.fS()), $$2.s.fS(), $$0);
         $$2.s.bS = $$4.D();
         $$2.a($$4);
      }

      U create(T var1, ceq var2, vb var3);
   }
}
