import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import java.util.Map;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fco {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<cji<?>, fco.a<?, ?>> b = Maps.newHashMap();

   public static <T extends cib> void a(@Nullable cji<T> $$0, evi $$1, int $$2, vf $$3) {
      if ($$0 == null) {
         a.warn("Trying to open invalid screen with name: {}", $$3.getString());
      } else {
         fco.a<T, ?> $$4 = a($$0);
         if ($$4 == null) {
            a.warn("Failed to create screen for menu type: {}", kd.r.b($$0));
         } else {
            $$4.a($$3, $$0, $$1, $$2);
         }
      }
   }

   @Nullable
   private static <T extends cib> fco.a<T, ?> a(cji<T> $$0) {
      return (fco.a<T, ?>)b.get($$0);
   }

   private static <M extends cib, U extends fdb & fff<M>> void a(cji<? extends M> $$0, fco.a<M, U> $$1) {
      fco.a<?, ?> $$2 = b.put($$0, $$1);
      if ($$2 != null) {
         throw new IllegalStateException("Duplicate registration for " + kd.r.b($$0));
      }
   }

   public static boolean a() {
      boolean $$0 = false;

      for (cji<?> $$1 : kd.r) {
         if (!b.containsKey($$1)) {
            a.debug("Menu {} has no matching screen", kd.r.b($$1));
            $$0 = true;
         }
      }

      return $$0;
   }

   static {
      a(cji.a, fel::new);
      a(cji.b, fel::new);
      a(cji.c, fel::new);
      a(cji.d, fel::new);
      a(cji.e, fel::new);
      a(cji.f, fel::new);
      a(cji.g, fer::new);
      a(cji.h, fem::new);
      a(cji.i, fed::new);
      a(cji.j, fee::new);
      a(cji.k, fef::new);
      a(cji.l, fei::new);
      a(cji.m, fen::new);
      a(cji.n, feu::new);
      a(cji.o, fev::new);
      a(cji.p, few::new);
      a(cji.q, fey::new);
      a(cji.r, ffd::new);
      a(cji.s, ffe::new);
      a(cji.t, ffg::new);
      a(cji.u, ffj::new);
      a(cji.v, ffl::new);
      a(cji.w, ffm::new);
      a(cji.x, fej::new);
      a(cji.y, ffn::new);
   }

   interface a<T extends cib, U extends fdb & fff<T>> {
      default void a(vf $$0, cji<T> $$1, evi $$2, int $$3) {
         U $$4 = this.create($$1.a($$3, $$2.s.fS()), $$2.s.fS(), $$0);
         $$2.s.bS = $$4.E();
         $$2.a($$4);
      }

      U create(T var1, cfh var2, vf var3);
   }
}
