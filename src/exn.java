import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import java.util.Map;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class exn {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<cfi<?>, exn.a<?, ?>> b = Maps.newHashMap();

   public static <T extends ced> void a(@Nullable cfi<T> $$0, eql $$1, int $$2, tf $$3) {
      if ($$0 == null) {
         a.warn("Trying to open invalid screen with name: {}", $$3.getString());
      } else {
         exn.a<T, ?> $$4 = a($$0);
         if ($$4 == null) {
            a.warn("Failed to create screen for menu type: {}", jb.s.b($$0));
         } else {
            $$4.a($$3, $$0, $$1, $$2);
         }
      }
   }

   @Nullable
   private static <T extends ced> exn.a<T, ?> a(cfi<T> $$0) {
      return (exn.a<T, ?>)b.get($$0);
   }

   private static <M extends ced, U extends eya & fac<M>> void a(cfi<? extends M> $$0, exn.a<M, U> $$1) {
      exn.a<?, ?> $$2 = b.put($$0, $$1);
      if ($$2 != null) {
         throw new IllegalStateException("Duplicate registration for " + jb.s.b($$0));
      }
   }

   public static boolean a() {
      boolean $$0 = false;

      for (cfi<?> $$1 : jb.s) {
         if (!b.containsKey($$1)) {
            a.debug("Menu {} has no matching screen", jb.s.b($$1));
            $$0 = true;
         }
      }

      return $$0;
   }

   static {
      a(cfi.a, ezj::new);
      a(cfi.b, ezj::new);
      a(cfi.c, ezj::new);
      a(cfi.d, ezj::new);
      a(cfi.e, ezj::new);
      a(cfi.f, ezj::new);
      a(cfi.g, ezo::new);
      a(cfi.h, ezb::new);
      a(cfi.i, ezc::new);
      a(cfi.j, ezd::new);
      a(cfi.k, ezg::new);
      a(cfi.l, ezk::new);
      a(cfi.m, ezr::new);
      a(cfi.n, ezs::new);
      a(cfi.o, ezt::new);
      a(cfi.p, ezv::new);
      a(cfi.q, faa::new);
      a(cfi.r, fab::new);
      a(cfi.s, fad::new);
      a(cfi.t, fag::new);
      a(cfi.u, fai::new);
      a(cfi.v, faj::new);
      a(cfi.w, ezh::new);
      a(cfi.x, fak::new);
   }

   interface a<T extends ced, U extends eya & fac<T>> {
      default void a(tf $$0, cfi<T> $$1, eql $$2, int $$3) {
         U $$4 = this.create($$1.a($$3, $$2.s.fQ()), $$2.s.fQ(), $$0);
         $$2.s.bQ = $$4.D();
         $$2.a($$4);
      }

      U create(T var1, cbl var2, tf var3);
   }
}
