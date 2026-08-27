import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import java.util.Map;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fll {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<cqa<?>, fll.a<?, ?>> b = Maps.newHashMap();

   public static <T extends cot> void a(cqa<T> $$0, fdz $$1, int $$2, wx $$3) {
      fll.a<T, ?> $$4 = a($$0);
      if ($$4 == null) {
         a.warn("Failed to create screen for menu type: {}", le.r.b($$0));
      } else {
         $$4.a($$3, $$0, $$1, $$2);
      }
   }

   @Nullable
   private static <T extends cot> fll.a<T, ?> a(cqa<T> $$0) {
      return (fll.a<T, ?>)b.get($$0);
   }

   private static <M extends cot, U extends fly & fob<M>> void a(cqa<? extends M> $$0, fll.a<M, U> $$1) {
      fll.a<?, ?> $$2 = b.put($$0, $$1);
      if ($$2 != null) {
         throw new IllegalStateException("Duplicate registration for " + le.r.b($$0));
      }
   }

   public static boolean a() {
      boolean $$0 = false;

      for (cqa<?> $$1 : le.r) {
         if (!b.containsKey($$1)) {
            a.debug("Menu {} has no matching screen", le.r.b($$1));
            $$0 = true;
         }
      }

      return $$0;
   }

   static {
      a(cqa.a, fnh::new);
      a(cqa.b, fnh::new);
      a(cqa.c, fnh::new);
      a(cqa.d, fnh::new);
      a(cqa.e, fnh::new);
      a(cqa.f, fnh::new);
      a(cqa.g, fnn::new);
      a(cqa.h, fni::new);
      a(cqa.i, fmz::new);
      a(cqa.j, fna::new);
      a(cqa.k, fnb::new);
      a(cqa.l, fne::new);
      a(cqa.m, fnj::new);
      a(cqa.n, fnq::new);
      a(cqa.o, fnr::new);
      a(cqa.p, fns::new);
      a(cqa.q, fnu::new);
      a(cqa.r, fnz::new);
      a(cqa.s, foa::new);
      a(cqa.t, foc::new);
      a(cqa.u, fof::new);
      a(cqa.v, foh::new);
      a(cqa.w, foi::new);
      a(cqa.x, fnf::new);
      a(cqa.y, foj::new);
   }

   interface a<T extends cot, U extends fly & fob<T>> {
      default void a(wx $$0, cqa<T> $$1, fdz $$2, int $$3) {
         U $$4 = this.create($$1.a($$3, $$2.s.gc()), $$2.s.gc(), $$0);
         $$2.s.cc = $$4.D();
         $$2.a($$4);
      }

      U create(T var1, clv var2, wx var3);
   }
}
