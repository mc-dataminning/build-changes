import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import java.util.Map;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ffu {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<cmb<?>, ffu.a<?, ?>> b = Maps.newHashMap();

   public static <T extends cku> void a(cmb<T> $$0, eyk $$1, int $$2, vs $$3) {
      ffu.a<T, ?> $$4 = a($$0);
      if ($$4 == null) {
         a.warn("Failed to create screen for menu type: {}", kh.r.b($$0));
      } else {
         $$4.a($$3, $$0, $$1, $$2);
      }
   }

   @Nullable
   private static <T extends cku> ffu.a<T, ?> a(cmb<T> $$0) {
      return (ffu.a<T, ?>)b.get($$0);
   }

   private static <M extends cku, U extends fgh & fil<M>> void a(cmb<? extends M> $$0, ffu.a<M, U> $$1) {
      ffu.a<?, ?> $$2 = b.put($$0, $$1);
      if ($$2 != null) {
         throw new IllegalStateException("Duplicate registration for " + kh.r.b($$0));
      }
   }

   public static boolean a() {
      boolean $$0 = false;

      for (cmb<?> $$1 : kh.r) {
         if (!b.containsKey($$1)) {
            a.debug("Menu {} has no matching screen", kh.r.b($$1));
            $$0 = true;
         }
      }

      return $$0;
   }

   static {
      a(cmb.a, fhr::new);
      a(cmb.b, fhr::new);
      a(cmb.c, fhr::new);
      a(cmb.d, fhr::new);
      a(cmb.e, fhr::new);
      a(cmb.f, fhr::new);
      a(cmb.g, fhx::new);
      a(cmb.h, fhs::new);
      a(cmb.i, fhj::new);
      a(cmb.j, fhk::new);
      a(cmb.k, fhl::new);
      a(cmb.l, fho::new);
      a(cmb.m, fht::new);
      a(cmb.n, fia::new);
      a(cmb.o, fib::new);
      a(cmb.p, fic::new);
      a(cmb.q, fie::new);
      a(cmb.r, fij::new);
      a(cmb.s, fik::new);
      a(cmb.t, fim::new);
      a(cmb.u, fip::new);
      a(cmb.v, fir::new);
      a(cmb.w, fis::new);
      a(cmb.x, fhp::new);
      a(cmb.y, fit::new);
   }

   interface a<T extends cku, U extends fgh & fil<T>> {
      default void a(vs $$0, cmb<T> $$1, eyk $$2, int $$3) {
         U $$4 = this.create($$1.a($$3, $$2.s.fV()), $$2.s.fV(), $$0);
         $$2.s.bX = $$4.H();
         $$2.a($$4);
      }

      U create(T var1, chz var2, vs var3);
   }
}
