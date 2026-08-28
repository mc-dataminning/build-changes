import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import java.util.Map;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fpu {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<csf<?>, fpu.a<?, ?>> b = Maps.newHashMap();

   public static <T extends cqw> void a(csf<T> $$0, fil $$1, int $$2, xd $$3) {
      fpu.a<T, ?> $$4 = a($$0);
      if ($$4 == null) {
         a.warn("Failed to create screen for menu type: {}", lu.p.b($$0));
      } else {
         $$4.a($$3, $$0, $$1, $$2);
      }
   }

   @Nullable
   private static <T extends cqw> fpu.a<T, ?> a(csf<T> $$0) {
      return (fpu.a<T, ?>)b.get($$0);
   }

   private static <M extends cqw, U extends fqd & frx<M>> void a(csf<? extends M> $$0, fpu.a<M, U> $$1) {
      fpu.a<?, ?> $$2 = b.put($$0, $$1);
      if ($$2 != null) {
         throw new IllegalStateException("Duplicate registration for " + lu.p.b($$0));
      }
   }

   public static boolean a() {
      boolean $$0 = false;

      for (csf<?> $$1 : lu.p) {
         if (!b.containsKey($$1)) {
            a.debug("Menu {} has no matching screen", lu.p.b($$1));
            $$0 = true;
         }
      }

      return $$0;
   }

   static {
      a(csf.a, frd::new);
      a(csf.b, frd::new);
      a(csf.c, frd::new);
      a(csf.d, frd::new);
      a(csf.e, frd::new);
      a(csf.f, frd::new);
      a(csf.g, frj::new);
      a(csf.h, fre::new);
      a(csf.i, fqv::new);
      a(csf.j, fqw::new);
      a(csf.k, fqx::new);
      a(csf.l, fra::new);
      a(csf.m, frf::new);
      a(csf.n, frm::new);
      a(csf.o, frn::new);
      a(csf.p, fro::new);
      a(csf.q, frq::new);
      a(csf.r, frv::new);
      a(csf.s, frw::new);
      a(csf.t, fry::new);
      a(csf.u, fsb::new);
      a(csf.v, fsd::new);
      a(csf.w, fse::new);
      a(csf.x, frb::new);
      a(csf.y, fsf::new);
   }

   interface a<T extends cqw, U extends fqd & frx<T>> {
      default void a(xd $$0, csf<T> $$1, fil $$2, int $$3) {
         U $$4 = this.create($$1.a($$3, $$2.t.gc()), $$2.t.gc(), $$0);
         $$2.t.bZ = $$4.E();
         $$2.a($$4);
      }

      U create(T var1, cnt var2, xd var3);
   }
}
