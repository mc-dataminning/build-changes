import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import java.util.Map;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fqj {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<css<?>, fqj.a<?, ?>> b = Maps.newHashMap();

   public static <T extends crj> void a(css<T> $$0, fja $$1, int $$2, xh $$3) {
      fqj.a<T, ?> $$4 = a($$0);
      if ($$4 == null) {
         a.warn("Failed to create screen for menu type: {}", lx.p.b($$0));
      } else {
         $$4.a($$3, $$0, $$1, $$2);
      }
   }

   @Nullable
   private static <T extends crj> fqj.a<T, ?> a(css<T> $$0) {
      return (fqj.a<T, ?>)b.get($$0);
   }

   private static <M extends crj, U extends fqs & fsm<M>> void a(css<? extends M> $$0, fqj.a<M, U> $$1) {
      fqj.a<?, ?> $$2 = b.put($$0, $$1);
      if ($$2 != null) {
         throw new IllegalStateException("Duplicate registration for " + lx.p.b($$0));
      }
   }

   public static boolean a() {
      boolean $$0 = false;

      for (css<?> $$1 : lx.p) {
         if (!b.containsKey($$1)) {
            a.debug("Menu {} has no matching screen", lx.p.b($$1));
            $$0 = true;
         }
      }

      return $$0;
   }

   static {
      a(css.a, frs::new);
      a(css.b, frs::new);
      a(css.c, frs::new);
      a(css.d, frs::new);
      a(css.e, frs::new);
      a(css.f, frs::new);
      a(css.g, fry::new);
      a(css.h, frt::new);
      a(css.i, frk::new);
      a(css.j, frl::new);
      a(css.k, frm::new);
      a(css.l, frp::new);
      a(css.m, fru::new);
      a(css.n, fsb::new);
      a(css.o, fsc::new);
      a(css.p, fsd::new);
      a(css.q, fsf::new);
      a(css.r, fsk::new);
      a(css.s, fsl::new);
      a(css.t, fsn::new);
      a(css.u, fsq::new);
      a(css.v, fss::new);
      a(css.w, fst::new);
      a(css.x, frq::new);
      a(css.y, fsu::new);
   }

   interface a<T extends crj, U extends fqs & fsm<T>> {
      default void a(xh $$0, css<T> $$1, fja $$2, int $$3) {
         U $$4 = this.create($$1.a($$3, $$2.t.gk()), $$2.t.gk(), $$0);
         $$2.t.ca = $$4.E();
         $$2.a($$4);
      }

      U create(T var1, cog var2, xh var3);
   }
}
