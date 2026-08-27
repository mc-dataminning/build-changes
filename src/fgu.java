import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import java.util.Map;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fgu {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<cmx<?>, fgu.a<?, ?>> b = Maps.newHashMap();

   public static <T extends clq> void a(cmx<T> $$0, ezi $$1, int $$2, vu $$3) {
      fgu.a<T, ?> $$4 = a($$0);
      if ($$4 == null) {
         a.warn("Failed to create screen for menu type: {}", ki.r.b($$0));
      } else {
         $$4.a($$3, $$0, $$1, $$2);
      }
   }

   @Nullable
   private static <T extends clq> fgu.a<T, ?> a(cmx<T> $$0) {
      return (fgu.a<T, ?>)b.get($$0);
   }

   private static <M extends clq, U extends fhh & fjl<M>> void a(cmx<? extends M> $$0, fgu.a<M, U> $$1) {
      fgu.a<?, ?> $$2 = b.put($$0, $$1);
      if ($$2 != null) {
         throw new IllegalStateException("Duplicate registration for " + ki.r.b($$0));
      }
   }

   public static boolean a() {
      boolean $$0 = false;

      for (cmx<?> $$1 : ki.r) {
         if (!b.containsKey($$1)) {
            a.debug("Menu {} has no matching screen", ki.r.b($$1));
            $$0 = true;
         }
      }

      return $$0;
   }

   static {
      a(cmx.a, fir::new);
      a(cmx.b, fir::new);
      a(cmx.c, fir::new);
      a(cmx.d, fir::new);
      a(cmx.e, fir::new);
      a(cmx.f, fir::new);
      a(cmx.g, fix::new);
      a(cmx.h, fis::new);
      a(cmx.i, fij::new);
      a(cmx.j, fik::new);
      a(cmx.k, fil::new);
      a(cmx.l, fio::new);
      a(cmx.m, fit::new);
      a(cmx.n, fja::new);
      a(cmx.o, fjb::new);
      a(cmx.p, fjc::new);
      a(cmx.q, fje::new);
      a(cmx.r, fjj::new);
      a(cmx.s, fjk::new);
      a(cmx.t, fjm::new);
      a(cmx.u, fjp::new);
      a(cmx.v, fjr::new);
      a(cmx.w, fjs::new);
      a(cmx.x, fip::new);
      a(cmx.y, fjt::new);
   }

   interface a<T extends clq, U extends fhh & fjl<T>> {
      default void a(vu $$0, cmx<T> $$1, ezi $$2, int $$3) {
         U $$4 = this.create($$1.a($$3, $$2.s.fZ()), $$2.s.fZ(), $$0);
         $$2.s.bZ = $$4.H();
         $$2.a($$4);
      }

      U create(T var1, cit var2, vu var3);
   }
}
