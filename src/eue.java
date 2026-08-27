import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import java.util.Map;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class eue {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<cck<?>, eue.a<?, ?>> b = Maps.newHashMap();

   public static <T extends cbf> void a(@Nullable cck<T> $$0, enn $$1, int $$2, sw $$3) {
      if ($$0 == null) {
         a.warn("Trying to open invalid screen with name: {}", $$3.getString());
      } else {
         eue.a<T, ?> $$4 = a($$0);
         if ($$4 == null) {
            a.warn("Failed to create screen for menu type: {}", jb.s.b($$0));
         } else {
            $$4.a($$3, $$0, $$1, $$2);
         }
      }
   }

   @Nullable
   private static <T extends cbf> eue.a<T, ?> a(cck<T> $$0) {
      return (eue.a<T, ?>)b.get($$0);
   }

   private static <M extends cbf, U extends euq & ewt<M>> void a(cck<? extends M> $$0, eue.a<M, U> $$1) {
      eue.a<?, ?> $$2 = b.put($$0, $$1);
      if ($$2 != null) {
         throw new IllegalStateException("Duplicate registration for " + jb.s.b($$0));
      }
   }

   public static boolean a() {
      boolean $$0 = false;

      for (cck<?> $$1 : jb.s) {
         if (!b.containsKey($$1)) {
            a.debug("Menu {} has no matching screen", jb.s.b($$1));
            $$0 = true;
         }
      }

      return $$0;
   }

   static {
      a(cck.a, ewa::new);
      a(cck.b, ewa::new);
      a(cck.c, ewa::new);
      a(cck.d, ewa::new);
      a(cck.e, ewa::new);
      a(cck.f, ewa::new);
      a(cck.g, ewf::new);
      a(cck.h, evs::new);
      a(cck.i, evt::new);
      a(cck.j, evu::new);
      a(cck.k, evx::new);
      a(cck.l, ewb::new);
      a(cck.m, ewi::new);
      a(cck.n, ewj::new);
      a(cck.o, ewk::new);
      a(cck.p, ewm::new);
      a(cck.q, ewr::new);
      a(cck.r, ews::new);
      a(cck.s, ewu::new);
      a(cck.t, ewx::new);
      a(cck.u, ewz::new);
      a(cck.v, exa::new);
      a(cck.w, evy::new);
      a(cck.x, exb::new);
   }

   interface a<T extends cbf, U extends euq & ewt<T>> {
      default void a(sw $$0, cck<T> $$1, enn $$2, int $$3) {
         U $$4 = this.create($$1.a($$3, $$2.t.fN()), $$2.t.fN(), $$0);
         $$2.t.bR = $$4.C();
         $$2.a($$4);
      }

      U create(T var1, byn var2, sw var3);
   }
}
