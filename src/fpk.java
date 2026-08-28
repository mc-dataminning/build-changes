import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import java.util.Map;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fpk {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<crz<?>, fpk.a<?, ?>> b = Maps.newHashMap();

   public static <T extends cqq> void a(crz<T> $$0, fib $$1, int $$2, xd $$3) {
      fpk.a<T, ?> $$4 = a($$0);
      if ($$4 == null) {
         a.warn("Failed to create screen for menu type: {}", lu.p.b($$0));
      } else {
         $$4.a($$3, $$0, $$1, $$2);
      }
   }

   @Nullable
   private static <T extends cqq> fpk.a<T, ?> a(crz<T> $$0) {
      return (fpk.a<T, ?>)b.get($$0);
   }

   private static <M extends cqq, U extends fpt & frn<M>> void a(crz<? extends M> $$0, fpk.a<M, U> $$1) {
      fpk.a<?, ?> $$2 = b.put($$0, $$1);
      if ($$2 != null) {
         throw new IllegalStateException("Duplicate registration for " + lu.p.b($$0));
      }
   }

   public static boolean a() {
      boolean $$0 = false;

      for (crz<?> $$1 : lu.p) {
         if (!b.containsKey($$1)) {
            a.debug("Menu {} has no matching screen", lu.p.b($$1));
            $$0 = true;
         }
      }

      return $$0;
   }

   static {
      a(crz.a, fqt::new);
      a(crz.b, fqt::new);
      a(crz.c, fqt::new);
      a(crz.d, fqt::new);
      a(crz.e, fqt::new);
      a(crz.f, fqt::new);
      a(crz.g, fqz::new);
      a(crz.h, fqu::new);
      a(crz.i, fql::new);
      a(crz.j, fqm::new);
      a(crz.k, fqn::new);
      a(crz.l, fqq::new);
      a(crz.m, fqv::new);
      a(crz.n, frc::new);
      a(crz.o, frd::new);
      a(crz.p, fre::new);
      a(crz.q, frg::new);
      a(crz.r, frl::new);
      a(crz.s, frm::new);
      a(crz.t, fro::new);
      a(crz.u, frr::new);
      a(crz.v, frt::new);
      a(crz.w, fru::new);
      a(crz.x, fqr::new);
      a(crz.y, frv::new);
   }

   interface a<T extends cqq, U extends fpt & frn<T>> {
      default void a(xd $$0, crz<T> $$1, fib $$2, int $$3) {
         U $$4 = this.create($$1.a($$3, $$2.t.gc()), $$2.t.gc(), $$0);
         $$2.t.ca = $$4.E();
         $$2.a($$4);
      }

      U create(T var1, cno var2, xd var3);
   }
}
