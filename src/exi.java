import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import java.util.Map;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class exi {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<cfh<?>, exi.a<?, ?>> b = Maps.newHashMap();

   public static <T extends cec> void a(@Nullable cfh<T> $$0, eqn $$1, int $$2, te $$3) {
      if ($$0 == null) {
         a.warn("Trying to open invalid screen with name: {}", $$3.getString());
      } else {
         exi.a<T, ?> $$4 = a($$0);
         if ($$4 == null) {
            a.warn("Failed to create screen for menu type: {}", jc.s.b($$0));
         } else {
            $$4.a($$3, $$0, $$1, $$2);
         }
      }
   }

   @Nullable
   private static <T extends cec> exi.a<T, ?> a(cfh<T> $$0) {
      return (exi.a<T, ?>)b.get($$0);
   }

   private static <M extends cec, U extends exv & ezx<M>> void a(cfh<? extends M> $$0, exi.a<M, U> $$1) {
      exi.a<?, ?> $$2 = b.put($$0, $$1);
      if ($$2 != null) {
         throw new IllegalStateException("Duplicate registration for " + jc.s.b($$0));
      }
   }

   public static boolean a() {
      boolean $$0 = false;

      for (cfh<?> $$1 : jc.s) {
         if (!b.containsKey($$1)) {
            a.debug("Menu {} has no matching screen", jc.s.b($$1));
            $$0 = true;
         }
      }

      return $$0;
   }

   static {
      a(cfh.a, eze::new);
      a(cfh.b, eze::new);
      a(cfh.c, eze::new);
      a(cfh.d, eze::new);
      a(cfh.e, eze::new);
      a(cfh.f, eze::new);
      a(cfh.g, ezj::new);
      a(cfh.h, eyw::new);
      a(cfh.i, eyx::new);
      a(cfh.j, eyy::new);
      a(cfh.k, ezb::new);
      a(cfh.l, ezf::new);
      a(cfh.m, ezm::new);
      a(cfh.n, ezn::new);
      a(cfh.o, ezo::new);
      a(cfh.p, ezq::new);
      a(cfh.q, ezv::new);
      a(cfh.r, ezw::new);
      a(cfh.s, ezy::new);
      a(cfh.t, fab::new);
      a(cfh.u, fad::new);
      a(cfh.v, fae::new);
      a(cfh.w, ezc::new);
      a(cfh.x, faf::new);
   }

   interface a<T extends cec, U extends exv & ezx<T>> {
      default void a(te $$0, cfh<T> $$1, eqn $$2, int $$3) {
         U $$4 = this.create($$1.a($$3, $$2.t.fQ()), $$2.t.fQ(), $$0);
         $$2.t.bQ = $$4.C();
         $$2.a($$4);
      }

      U create(T var1, cbk var2, te var3);
   }
}
