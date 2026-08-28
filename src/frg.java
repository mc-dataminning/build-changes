import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import java.util.Map;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class frg {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<ctb<?>, frg.a<?, ?>> b = Maps.newHashMap();

   public static <T extends crs> void a(ctb<T> $$0, fjx $$1, int $$2, xl $$3) {
      frg.a<T, ?> $$4 = a($$0);
      if ($$4 == null) {
         a.warn("Failed to create screen for menu type: {}", lz.p.b($$0));
      } else {
         $$4.a($$3, $$0, $$1, $$2);
      }
   }

   @Nullable
   private static <T extends crs> frg.a<T, ?> a(ctb<T> $$0) {
      return (frg.a<T, ?>)b.get($$0);
   }

   private static <M extends crs, U extends frp & ftj<M>> void a(ctb<? extends M> $$0, frg.a<M, U> $$1) {
      frg.a<?, ?> $$2 = b.put($$0, $$1);
      if ($$2 != null) {
         throw new IllegalStateException("Duplicate registration for " + lz.p.b($$0));
      }
   }

   public static boolean a() {
      boolean $$0 = false;

      for (ctb<?> $$1 : lz.p) {
         if (!b.containsKey($$1)) {
            a.debug("Menu {} has no matching screen", lz.p.b($$1));
            $$0 = true;
         }
      }

      return $$0;
   }

   static {
      a(ctb.a, fsp::new);
      a(ctb.b, fsp::new);
      a(ctb.c, fsp::new);
      a(ctb.d, fsp::new);
      a(ctb.e, fsp::new);
      a(ctb.f, fsp::new);
      a(ctb.g, fsv::new);
      a(ctb.h, fsq::new);
      a(ctb.i, fsh::new);
      a(ctb.j, fsi::new);
      a(ctb.k, fsj::new);
      a(ctb.l, fsm::new);
      a(ctb.m, fsr::new);
      a(ctb.n, fsy::new);
      a(ctb.o, fsz::new);
      a(ctb.p, fta::new);
      a(ctb.q, ftc::new);
      a(ctb.r, fth::new);
      a(ctb.s, fti::new);
      a(ctb.t, ftk::new);
      a(ctb.u, ftn::new);
      a(ctb.v, ftp::new);
      a(ctb.w, ftq::new);
      a(ctb.x, fsn::new);
      a(ctb.y, ftr::new);
   }

   interface a<T extends crs, U extends frp & ftj<T>> {
      default void a(xl $$0, ctb<T> $$1, fjx $$2, int $$3) {
         U $$4 = this.create($$1.a($$3, $$2.t.gl()), $$2.t.gl(), $$0);
         $$2.t.cd = $$4.E();
         $$2.a($$4);
      }

      U create(T var1, coq var2, xl var3);
   }
}
