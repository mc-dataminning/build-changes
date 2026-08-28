import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import java.util.Map;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fnc {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<cqq<?>, fnc.a<?, ?>> b = Maps.newHashMap();

   public static <T extends cpi> void a(cqq<T> $$0, ffw $$1, int $$2, wu $$3) {
      fnc.a<T, ?> $$4 = a($$0);
      if ($$4 == null) {
         a.warn("Failed to create screen for menu type: {}", lq.p.b($$0));
      } else {
         $$4.a($$3, $$0, $$1, $$2);
      }
   }

   @Nullable
   private static <T extends cpi> fnc.a<T, ?> a(cqq<T> $$0) {
      return (fnc.a<T, ?>)b.get($$0);
   }

   private static <M extends cpi, U extends fnl & fpg<M>> void a(cqq<? extends M> $$0, fnc.a<M, U> $$1) {
      fnc.a<?, ?> $$2 = b.put($$0, $$1);
      if ($$2 != null) {
         throw new IllegalStateException("Duplicate registration for " + lq.p.b($$0));
      }
   }

   public static boolean a() {
      boolean $$0 = false;

      for (cqq<?> $$1 : lq.p) {
         if (!b.containsKey($$1)) {
            a.debug("Menu {} has no matching screen", lq.p.b($$1));
            $$0 = true;
         }
      }

      return $$0;
   }

   static {
      a(cqq.a, fol::new);
      a(cqq.b, fol::new);
      a(cqq.c, fol::new);
      a(cqq.d, fol::new);
      a(cqq.e, fol::new);
      a(cqq.f, fol::new);
      a(cqq.g, fos::new);
      a(cqq.h, fom::new);
      a(cqq.i, fod::new);
      a(cqq.j, foe::new);
      a(cqq.k, fof::new);
      a(cqq.l, foi::new);
      a(cqq.m, fon::new);
      a(cqq.n, fov::new);
      a(cqq.o, fow::new);
      a(cqq.p, fox::new);
      a(cqq.q, foz::new);
      a(cqq.r, fpe::new);
      a(cqq.s, fpf::new);
      a(cqq.t, fph::new);
      a(cqq.u, fpk::new);
      a(cqq.v, fpm::new);
      a(cqq.w, fpn::new);
      a(cqq.x, foj::new);
      a(cqq.y, fpo::new);
   }

   interface a<T extends cpi, U extends fnl & fpg<T>> {
      default void a(wu $$0, cqq<T> $$1, ffw $$2, int $$3) {
         U $$4 = this.create($$1.a($$3, $$2.s.ga()), $$2.s.ga(), $$0);
         $$2.s.ce = $$4.E();
         $$2.a($$4);
      }

      U create(T var1, cmk var2, wu var3);
   }
}
