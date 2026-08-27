import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import java.util.Map;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fgs {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<cmv<?>, fgs.a<?, ?>> b = Maps.newHashMap();

   public static <T extends clo> void a(cmv<T> $$0, ezg $$1, int $$2, vu $$3) {
      fgs.a<T, ?> $$4 = a($$0);
      if ($$4 == null) {
         a.warn("Failed to create screen for menu type: {}", ki.r.b($$0));
      } else {
         $$4.a($$3, $$0, $$1, $$2);
      }
   }

   @Nullable
   private static <T extends clo> fgs.a<T, ?> a(cmv<T> $$0) {
      return (fgs.a<T, ?>)b.get($$0);
   }

   private static <M extends clo, U extends fhf & fjj<M>> void a(cmv<? extends M> $$0, fgs.a<M, U> $$1) {
      fgs.a<?, ?> $$2 = b.put($$0, $$1);
      if ($$2 != null) {
         throw new IllegalStateException("Duplicate registration for " + ki.r.b($$0));
      }
   }

   public static boolean a() {
      boolean $$0 = false;

      for (cmv<?> $$1 : ki.r) {
         if (!b.containsKey($$1)) {
            a.debug("Menu {} has no matching screen", ki.r.b($$1));
            $$0 = true;
         }
      }

      return $$0;
   }

   static {
      a(cmv.a, fip::new);
      a(cmv.b, fip::new);
      a(cmv.c, fip::new);
      a(cmv.d, fip::new);
      a(cmv.e, fip::new);
      a(cmv.f, fip::new);
      a(cmv.g, fiv::new);
      a(cmv.h, fiq::new);
      a(cmv.i, fih::new);
      a(cmv.j, fii::new);
      a(cmv.k, fij::new);
      a(cmv.l, fim::new);
      a(cmv.m, fir::new);
      a(cmv.n, fiy::new);
      a(cmv.o, fiz::new);
      a(cmv.p, fja::new);
      a(cmv.q, fjc::new);
      a(cmv.r, fjh::new);
      a(cmv.s, fji::new);
      a(cmv.t, fjk::new);
      a(cmv.u, fjn::new);
      a(cmv.v, fjp::new);
      a(cmv.w, fjq::new);
      a(cmv.x, fin::new);
      a(cmv.y, fjr::new);
   }

   interface a<T extends clo, U extends fhf & fjj<T>> {
      default void a(vu $$0, cmv<T> $$1, ezg $$2, int $$3) {
         U $$4 = this.create($$1.a($$3, $$2.s.fZ()), $$2.s.fZ(), $$0);
         $$2.s.bZ = $$4.H();
         $$2.a($$4);
      }

      U create(T var1, cir var2, vu var3);
   }
}
