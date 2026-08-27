import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import java.util.Map;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class exz {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<cfs<?>, exz.a<?, ?>> b = Maps.newHashMap();

   public static <T extends cen> void a(@Nullable cfs<T> $$0, eqx $$1, int $$2, tn $$3) {
      if ($$0 == null) {
         a.warn("Trying to open invalid screen with name: {}", $$3.getString());
      } else {
         exz.a<T, ?> $$4 = a($$0);
         if ($$4 == null) {
            a.warn("Failed to create screen for menu type: {}", jd.s.b($$0));
         } else {
            $$4.a($$3, $$0, $$1, $$2);
         }
      }
   }

   @Nullable
   private static <T extends cen> exz.a<T, ?> a(cfs<T> $$0) {
      return (exz.a<T, ?>)b.get($$0);
   }

   private static <M extends cen, U extends eym & fao<M>> void a(cfs<? extends M> $$0, exz.a<M, U> $$1) {
      exz.a<?, ?> $$2 = b.put($$0, $$1);
      if ($$2 != null) {
         throw new IllegalStateException("Duplicate registration for " + jd.s.b($$0));
      }
   }

   public static boolean a() {
      boolean $$0 = false;

      for (cfs<?> $$1 : jd.s) {
         if (!b.containsKey($$1)) {
            a.debug("Menu {} has no matching screen", jd.s.b($$1));
            $$0 = true;
         }
      }

      return $$0;
   }

   static {
      a(cfs.a, ezv::new);
      a(cfs.b, ezv::new);
      a(cfs.c, ezv::new);
      a(cfs.d, ezv::new);
      a(cfs.e, ezv::new);
      a(cfs.f, ezv::new);
      a(cfs.g, faa::new);
      a(cfs.h, ezn::new);
      a(cfs.i, ezo::new);
      a(cfs.j, ezp::new);
      a(cfs.k, ezs::new);
      a(cfs.l, ezw::new);
      a(cfs.m, fad::new);
      a(cfs.n, fae::new);
      a(cfs.o, faf::new);
      a(cfs.p, fah::new);
      a(cfs.q, fam::new);
      a(cfs.r, fan::new);
      a(cfs.s, fap::new);
      a(cfs.t, fas::new);
      a(cfs.u, fau::new);
      a(cfs.v, fav::new);
      a(cfs.w, ezt::new);
      a(cfs.x, faw::new);
   }

   interface a<T extends cen, U extends eym & fao<T>> {
      default void a(tn $$0, cfs<T> $$1, eqx $$2, int $$3) {
         U $$4 = this.create($$1.a($$3, $$2.s.fR()), $$2.s.fR(), $$0);
         $$2.s.bS = $$4.E();
         $$2.a($$4);
      }

      U create(T var1, cbv var2, tn var3);
   }
}
