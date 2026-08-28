import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import java.util.Map;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fpy {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<csi<?>, fpy.a<?, ?>> b = Maps.newHashMap();

   public static <T extends cqz> void a(csi<T> $$0, fip $$1, int $$2, xe $$3) {
      fpy.a<T, ?> $$4 = a($$0);
      if ($$4 == null) {
         a.warn("Failed to create screen for menu type: {}", lv.p.b($$0));
      } else {
         $$4.a($$3, $$0, $$1, $$2);
      }
   }

   @Nullable
   private static <T extends cqz> fpy.a<T, ?> a(csi<T> $$0) {
      return (fpy.a<T, ?>)b.get($$0);
   }

   private static <M extends cqz, U extends fqh & fsb<M>> void a(csi<? extends M> $$0, fpy.a<M, U> $$1) {
      fpy.a<?, ?> $$2 = b.put($$0, $$1);
      if ($$2 != null) {
         throw new IllegalStateException("Duplicate registration for " + lv.p.b($$0));
      }
   }

   public static boolean a() {
      boolean $$0 = false;

      for (csi<?> $$1 : lv.p) {
         if (!b.containsKey($$1)) {
            a.debug("Menu {} has no matching screen", lv.p.b($$1));
            $$0 = true;
         }
      }

      return $$0;
   }

   static {
      a(csi.a, frh::new);
      a(csi.b, frh::new);
      a(csi.c, frh::new);
      a(csi.d, frh::new);
      a(csi.e, frh::new);
      a(csi.f, frh::new);
      a(csi.g, frn::new);
      a(csi.h, fri::new);
      a(csi.i, fqz::new);
      a(csi.j, fra::new);
      a(csi.k, frb::new);
      a(csi.l, fre::new);
      a(csi.m, frj::new);
      a(csi.n, frq::new);
      a(csi.o, frr::new);
      a(csi.p, frs::new);
      a(csi.q, fru::new);
      a(csi.r, frz::new);
      a(csi.s, fsa::new);
      a(csi.t, fsc::new);
      a(csi.u, fsf::new);
      a(csi.v, fsh::new);
      a(csi.w, fsi::new);
      a(csi.x, frf::new);
      a(csi.y, fsj::new);
   }

   interface a<T extends cqz, U extends fqh & fsb<T>> {
      default void a(xe $$0, csi<T> $$1, fip $$2, int $$3) {
         U $$4 = this.create($$1.a($$3, $$2.t.gd()), $$2.t.gd(), $$0);
         $$2.t.bZ = $$4.E();
         $$2.a($$4);
      }

      U create(T var1, cnw var2, xe var3);
   }
}
