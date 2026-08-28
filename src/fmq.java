import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import java.util.Map;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fmq {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<crb<?>, fmq.a<?, ?>> b = Maps.newHashMap();

   public static <T extends cpu> void a(crb<T> $$0, fff $$1, int $$2, xp $$3) {
      fmq.a<T, ?> $$4 = a($$0);
      if ($$4 == null) {
         a.warn("Failed to create screen for menu type: {}", lp.r.b($$0));
      } else {
         $$4.a($$3, $$0, $$1, $$2);
      }
   }

   @Nullable
   private static <T extends cpu> fmq.a<T, ?> a(crb<T> $$0) {
      return (fmq.a<T, ?>)b.get($$0);
   }

   private static <M extends cpu, U extends fnd & fph<M>> void a(crb<? extends M> $$0, fmq.a<M, U> $$1) {
      fmq.a<?, ?> $$2 = b.put($$0, $$1);
      if ($$2 != null) {
         throw new IllegalStateException("Duplicate registration for " + lp.r.b($$0));
      }
   }

   public static boolean a() {
      boolean $$0 = false;

      for (crb<?> $$1 : lp.r) {
         if (!b.containsKey($$1)) {
            a.debug("Menu {} has no matching screen", lp.r.b($$1));
            $$0 = true;
         }
      }

      return $$0;
   }

   static {
      a(crb.a, fom::new);
      a(crb.b, fom::new);
      a(crb.c, fom::new);
      a(crb.d, fom::new);
      a(crb.e, fom::new);
      a(crb.f, fom::new);
      a(crb.g, fot::new);
      a(crb.h, fon::new);
      a(crb.i, foe::new);
      a(crb.j, fof::new);
      a(crb.k, fog::new);
      a(crb.l, foj::new);
      a(crb.m, foo::new);
      a(crb.n, fow::new);
      a(crb.o, fox::new);
      a(crb.p, foy::new);
      a(crb.q, fpa::new);
      a(crb.r, fpf::new);
      a(crb.s, fpg::new);
      a(crb.t, fpi::new);
      a(crb.u, fpl::new);
      a(crb.v, fpn::new);
      a(crb.w, fpo::new);
      a(crb.x, fok::new);
      a(crb.y, fpp::new);
   }

   interface a<T extends cpu, U extends fnd & fph<T>> {
      default void a(xp $$0, crb<T> $$1, fff $$2, int $$3) {
         U $$4 = this.create($$1.a($$3, $$2.s.gc()), $$2.s.gc(), $$0);
         $$2.s.cb = $$4.F();
         $$2.a($$4);
      }

      U create(T var1, cmw var2, xp var3);
   }
}
