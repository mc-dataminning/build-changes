import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import java.util.Map;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fcg {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<cjb<?>, fcg.a<?, ?>> b = Maps.newHashMap();

   public static <T extends chu> void a(@Nullable cjb<T> $$0, eva $$1, int $$2, vd $$3) {
      if ($$0 == null) {
         a.warn("Trying to open invalid screen with name: {}", $$3.getString());
      } else {
         fcg.a<T, ?> $$4 = a($$0);
         if ($$4 == null) {
            a.warn("Failed to create screen for menu type: {}", kd.r.b($$0));
         } else {
            $$4.a($$3, $$0, $$1, $$2);
         }
      }
   }

   @Nullable
   private static <T extends chu> fcg.a<T, ?> a(cjb<T> $$0) {
      return (fcg.a<T, ?>)b.get($$0);
   }

   private static <M extends chu, U extends fct & fex<M>> void a(cjb<? extends M> $$0, fcg.a<M, U> $$1) {
      fcg.a<?, ?> $$2 = b.put($$0, $$1);
      if ($$2 != null) {
         throw new IllegalStateException("Duplicate registration for " + kd.r.b($$0));
      }
   }

   public static boolean a() {
      boolean $$0 = false;

      for (cjb<?> $$1 : kd.r) {
         if (!b.containsKey($$1)) {
            a.debug("Menu {} has no matching screen", kd.r.b($$1));
            $$0 = true;
         }
      }

      return $$0;
   }

   static {
      a(cjb.a, fed::new);
      a(cjb.b, fed::new);
      a(cjb.c, fed::new);
      a(cjb.d, fed::new);
      a(cjb.e, fed::new);
      a(cjb.f, fed::new);
      a(cjb.g, fej::new);
      a(cjb.h, fee::new);
      a(cjb.i, fdv::new);
      a(cjb.j, fdw::new);
      a(cjb.k, fdx::new);
      a(cjb.l, fea::new);
      a(cjb.m, fef::new);
      a(cjb.n, fem::new);
      a(cjb.o, fen::new);
      a(cjb.p, feo::new);
      a(cjb.q, feq::new);
      a(cjb.r, fev::new);
      a(cjb.s, few::new);
      a(cjb.t, fey::new);
      a(cjb.u, ffb::new);
      a(cjb.v, ffd::new);
      a(cjb.w, ffe::new);
      a(cjb.x, feb::new);
      a(cjb.y, fff::new);
   }

   interface a<T extends chu, U extends fct & fex<T>> {
      default void a(vd $$0, cjb<T> $$1, eva $$2, int $$3) {
         U $$4 = this.create($$1.a($$3, $$2.s.fS()), $$2.s.fS(), $$0);
         $$2.s.bS = $$4.D();
         $$2.a($$4);
      }

      U create(T var1, cfa var2, vd var3);
   }
}
