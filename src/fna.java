import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import java.util.Map;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fna {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<cqp<?>, fna.a<?, ?>> b = Maps.newHashMap();

   public static <T extends cph> void a(cqp<T> $$0, fft $$1, int $$2, wu $$3) {
      fna.a<T, ?> $$4 = a($$0);
      if ($$4 == null) {
         a.warn("Failed to create screen for menu type: {}", lq.p.b($$0));
      } else {
         $$4.a($$3, $$0, $$1, $$2);
      }
   }

   @Nullable
   private static <T extends cph> fna.a<T, ?> a(cqp<T> $$0) {
      return (fna.a<T, ?>)b.get($$0);
   }

   private static <M extends cph, U extends fnj & fpe<M>> void a(cqp<? extends M> $$0, fna.a<M, U> $$1) {
      fna.a<?, ?> $$2 = b.put($$0, $$1);
      if ($$2 != null) {
         throw new IllegalStateException("Duplicate registration for " + lq.p.b($$0));
      }
   }

   public static boolean a() {
      boolean $$0 = false;

      for (cqp<?> $$1 : lq.p) {
         if (!b.containsKey($$1)) {
            a.debug("Menu {} has no matching screen", lq.p.b($$1));
            $$0 = true;
         }
      }

      return $$0;
   }

   static {
      a(cqp.a, foj::new);
      a(cqp.b, foj::new);
      a(cqp.c, foj::new);
      a(cqp.d, foj::new);
      a(cqp.e, foj::new);
      a(cqp.f, foj::new);
      a(cqp.g, fop::new);
      a(cqp.h, fok::new);
      a(cqp.i, fob::new);
      a(cqp.j, foc::new);
      a(cqp.k, fod::new);
      a(cqp.l, fog::new);
      a(cqp.m, fol::new);
      a(cqp.n, fot::new);
      a(cqp.o, fou::new);
      a(cqp.p, fov::new);
      a(cqp.q, fox::new);
      a(cqp.r, fpc::new);
      a(cqp.s, fpd::new);
      a(cqp.t, fpf::new);
      a(cqp.u, fpi::new);
      a(cqp.v, fpk::new);
      a(cqp.w, fpl::new);
      a(cqp.x, foh::new);
      a(cqp.y, fpm::new);
   }

   interface a<T extends cph, U extends fnj & fpe<T>> {
      default void a(wu $$0, cqp<T> $$1, fft $$2, int $$3) {
         U $$4 = this.create($$1.a($$3, $$2.s.fZ()), $$2.s.fZ(), $$0);
         $$2.s.cd = $$4.F();
         $$2.a($$4);
      }

      U create(T var1, cmj var2, wu var3);
   }
}
