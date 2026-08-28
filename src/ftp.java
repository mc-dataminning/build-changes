import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import java.util.Map;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ftp {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<cul<?>, ftp.a<?, ?>> b = Maps.newHashMap();

   public static <T extends ctc> void a(cul<T> $$0, fmg $$1, int $$2, xv $$3) {
      ftp.a<T, ?> $$4 = a($$0);
      if ($$4 == null) {
         a.warn("Failed to create screen for menu type: {}", ma.p.b($$0));
      } else {
         $$4.a($$3, $$0, $$1, $$2);
      }
   }

   @Nullable
   private static <T extends ctc> ftp.a<T, ?> a(cul<T> $$0) {
      return (ftp.a<T, ?>)b.get($$0);
   }

   private static <M extends ctc, U extends fty & fvt<M>> void a(cul<? extends M> $$0, ftp.a<M, U> $$1) {
      ftp.a<?, ?> $$2 = b.put($$0, $$1);
      if ($$2 != null) {
         throw new IllegalStateException("Duplicate registration for " + ma.p.b($$0));
      }
   }

   public static boolean a() {
      boolean $$0 = false;

      for (cul<?> $$1 : ma.p) {
         if (!b.containsKey($$1)) {
            a.debug("Menu {} has no matching screen", ma.p.b($$1));
            $$0 = true;
         }
      }

      return $$0;
   }

   static {
      a(cul.a, fuz::new);
      a(cul.b, fuz::new);
      a(cul.c, fuz::new);
      a(cul.d, fuz::new);
      a(cul.e, fuz::new);
      a(cul.f, fuz::new);
      a(cul.g, fvf::new);
      a(cul.h, fva::new);
      a(cul.i, fur::new);
      a(cul.j, fus::new);
      a(cul.k, fut::new);
      a(cul.l, fuw::new);
      a(cul.m, fvb::new);
      a(cul.n, fvi::new);
      a(cul.o, fvj::new);
      a(cul.p, fvk::new);
      a(cul.q, fvm::new);
      a(cul.r, fvr::new);
      a(cul.s, fvs::new);
      a(cul.t, fvu::new);
      a(cul.u, fvx::new);
      a(cul.v, fvz::new);
      a(cul.w, fwa::new);
      a(cul.x, fux::new);
      a(cul.y, fwb::new);
   }

   interface a<T extends ctc, U extends fty & fvt<T>> {
      default void a(xv $$0, cul<T> $$1, fmg $$2, int $$3) {
         U $$4 = this.create($$1.a($$3, $$2.t.gi()), $$2.t.gi(), $$0);
         $$2.t.cd = $$4.F();
         $$2.a($$4);
      }

      U create(T var1, cpw var2, xv var3);
   }
}
