import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import java.util.Map;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class exm {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<cfj<?>, exm.a<?, ?>> b = Maps.newHashMap();

   public static <T extends cee> void a(@Nullable cfj<T> $$0, eqm $$1, int $$2, tf $$3) {
      if ($$0 == null) {
         a.warn("Trying to open invalid screen with name: {}", $$3.getString());
      } else {
         exm.a<T, ?> $$4 = a($$0);
         if ($$4 == null) {
            a.warn("Failed to create screen for menu type: {}", jb.s.b($$0));
         } else {
            $$4.a($$3, $$0, $$1, $$2);
         }
      }
   }

   @Nullable
   private static <T extends cee> exm.a<T, ?> a(cfj<T> $$0) {
      return (exm.a<T, ?>)b.get($$0);
   }

   private static <M extends cee, U extends exz & fab<M>> void a(cfj<? extends M> $$0, exm.a<M, U> $$1) {
      exm.a<?, ?> $$2 = b.put($$0, $$1);
      if ($$2 != null) {
         throw new IllegalStateException("Duplicate registration for " + jb.s.b($$0));
      }
   }

   public static boolean a() {
      boolean $$0 = false;

      for (cfj<?> $$1 : jb.s) {
         if (!b.containsKey($$1)) {
            a.debug("Menu {} has no matching screen", jb.s.b($$1));
            $$0 = true;
         }
      }

      return $$0;
   }

   static {
      a(cfj.a, ezi::new);
      a(cfj.b, ezi::new);
      a(cfj.c, ezi::new);
      a(cfj.d, ezi::new);
      a(cfj.e, ezi::new);
      a(cfj.f, ezi::new);
      a(cfj.g, ezn::new);
      a(cfj.h, eza::new);
      a(cfj.i, ezb::new);
      a(cfj.j, ezc::new);
      a(cfj.k, ezf::new);
      a(cfj.l, ezj::new);
      a(cfj.m, ezq::new);
      a(cfj.n, ezr::new);
      a(cfj.o, ezs::new);
      a(cfj.p, ezu::new);
      a(cfj.q, ezz::new);
      a(cfj.r, faa::new);
      a(cfj.s, fac::new);
      a(cfj.t, faf::new);
      a(cfj.u, fah::new);
      a(cfj.v, fai::new);
      a(cfj.w, ezg::new);
      a(cfj.x, faj::new);
   }

   interface a<T extends cee, U extends exz & fab<T>> {
      default void a(tf $$0, cfj<T> $$1, eqm $$2, int $$3) {
         U $$4 = this.create($$1.a($$3, $$2.v.fQ()), $$2.v.fQ(), $$0);
         $$2.v.bQ = $$4.C();
         $$2.a($$4);
      }

      U create(T var1, cbm var2, tf var3);
   }
}
