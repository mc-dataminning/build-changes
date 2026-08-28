import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import java.util.Map;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fuc {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<ctl<?>, fuc.a<?, ?>> b = Maps.newHashMap();

   public static <T extends csc> void a(ctl<T> $$0, flj $$1, int $$2, wp $$3) {
      fuc.a<T, ?> $$4 = a($$0);
      if ($$4 == null) {
         a.warn("Failed to create screen for menu type: {}", mb.p.b($$0));
      } else {
         $$4.a($$3, $$0, $$1, $$2);
      }
   }

   @Nullable
   private static <T extends csc> fuc.a<T, ?> a(ctl<T> $$0) {
      return (fuc.a<T, ?>)b.get($$0);
   }

   private static <M extends csc, U extends ful & fwg<M>> void a(ctl<? extends M> $$0, fuc.a<M, U> $$1) {
      fuc.a<?, ?> $$2 = b.put($$0, $$1);
      if ($$2 != null) {
         throw new IllegalStateException("Duplicate registration for " + mb.p.b($$0));
      }
   }

   public static boolean a() {
      boolean $$0 = false;

      for (ctl<?> $$1 : mb.p) {
         if (!b.containsKey($$1)) {
            a.debug("Menu {} has no matching screen", mb.p.b($$1));
            $$0 = true;
         }
      }

      return $$0;
   }

   static {
      a(ctl.a, fvm::new);
      a(ctl.b, fvm::new);
      a(ctl.c, fvm::new);
      a(ctl.d, fvm::new);
      a(ctl.e, fvm::new);
      a(ctl.f, fvm::new);
      a(ctl.g, fvs::new);
      a(ctl.h, fvn::new);
      a(ctl.i, fve::new);
      a(ctl.j, fvf::new);
      a(ctl.k, fvg::new);
      a(ctl.l, fvj::new);
      a(ctl.m, fvo::new);
      a(ctl.n, fvv::new);
      a(ctl.o, fvw::new);
      a(ctl.p, fvx::new);
      a(ctl.q, fvz::new);
      a(ctl.r, fwe::new);
      a(ctl.s, fwf::new);
      a(ctl.t, fwh::new);
      a(ctl.u, fwk::new);
      a(ctl.v, fwm::new);
      a(ctl.w, fwn::new);
      a(ctl.x, fvk::new);
      a(ctl.y, fwo::new);
   }

   interface a<T extends csc, U extends ful & fwg<T>> {
      default void a(wp $$0, ctl<T> $$1, flj $$2, int $$3) {
         U $$4 = this.create($$1.a($$3, $$2.t.gi()), $$2.t.gi(), $$0);
         $$2.t.cd = $$4.F();
         $$2.a($$4);
      }

      U create(T var1, cow var2, wp var3);
   }
}
