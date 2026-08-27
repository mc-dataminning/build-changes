import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import java.util.Map;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class exx {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<cfq<?>, exx.a<?, ?>> b = Maps.newHashMap();

   public static <T extends cel> void a(@Nullable cfq<T> $$0, eqv $$1, int $$2, tl $$3) {
      if ($$0 == null) {
         a.warn("Trying to open invalid screen with name: {}", $$3.getString());
      } else {
         exx.a<T, ?> $$4 = a($$0);
         if ($$4 == null) {
            a.warn("Failed to create screen for menu type: {}", jb.s.b($$0));
         } else {
            $$4.a($$3, $$0, $$1, $$2);
         }
      }
   }

   @Nullable
   private static <T extends cel> exx.a<T, ?> a(cfq<T> $$0) {
      return (exx.a<T, ?>)b.get($$0);
   }

   private static <M extends cel, U extends eyk & fam<M>> void a(cfq<? extends M> $$0, exx.a<M, U> $$1) {
      exx.a<?, ?> $$2 = b.put($$0, $$1);
      if ($$2 != null) {
         throw new IllegalStateException("Duplicate registration for " + jb.s.b($$0));
      }
   }

   public static boolean a() {
      boolean $$0 = false;

      for (cfq<?> $$1 : jb.s) {
         if (!b.containsKey($$1)) {
            a.debug("Menu {} has no matching screen", jb.s.b($$1));
            $$0 = true;
         }
      }

      return $$0;
   }

   static {
      a(cfq.a, ezt::new);
      a(cfq.b, ezt::new);
      a(cfq.c, ezt::new);
      a(cfq.d, ezt::new);
      a(cfq.e, ezt::new);
      a(cfq.f, ezt::new);
      a(cfq.g, ezy::new);
      a(cfq.h, ezl::new);
      a(cfq.i, ezm::new);
      a(cfq.j, ezn::new);
      a(cfq.k, ezq::new);
      a(cfq.l, ezu::new);
      a(cfq.m, fab::new);
      a(cfq.n, fac::new);
      a(cfq.o, fad::new);
      a(cfq.p, faf::new);
      a(cfq.q, fak::new);
      a(cfq.r, fal::new);
      a(cfq.s, fan::new);
      a(cfq.t, faq::new);
      a(cfq.u, fas::new);
      a(cfq.v, fat::new);
      a(cfq.w, ezr::new);
      a(cfq.x, fau::new);
   }

   interface a<T extends cel, U extends eyk & fam<T>> {
      default void a(tl $$0, cfq<T> $$1, eqv $$2, int $$3) {
         U $$4 = this.create($$1.a($$3, $$2.s.fR()), $$2.s.fR(), $$0);
         $$2.s.bS = $$4.E();
         $$2.a($$4);
      }

      U create(T var1, cbt var2, tl var3);
   }
}
