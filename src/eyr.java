import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import java.util.Map;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class eyr {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<cgu<?>, eyr.a<?, ?>> b = Maps.newHashMap();

   public static <T extends cfp> void a(@Nullable cgu<T> $$0, ero $$1, int $$2, ui $$3) {
      if ($$0 == null) {
         a.warn("Trying to open invalid screen with name: {}", $$3.getString());
      } else {
         eyr.a<T, ?> $$4 = a($$0);
         if ($$4 == null) {
            a.warn("Failed to create screen for menu type: {}", jy.s.b($$0));
         } else {
            $$4.a($$3, $$0, $$1, $$2);
         }
      }
   }

   @Nullable
   private static <T extends cfp> eyr.a<T, ?> a(cgu<T> $$0) {
      return (eyr.a<T, ?>)b.get($$0);
   }

   private static <M extends cfp, U extends ezd & fbg<M>> void a(cgu<? extends M> $$0, eyr.a<M, U> $$1) {
      eyr.a<?, ?> $$2 = b.put($$0, $$1);
      if ($$2 != null) {
         throw new IllegalStateException("Duplicate registration for " + jy.s.b($$0));
      }
   }

   public static boolean a() {
      boolean $$0 = false;

      for (cgu<?> $$1 : jy.s) {
         if (!b.containsKey($$1)) {
            a.debug("Menu {} has no matching screen", jy.s.b($$1));
            $$0 = true;
         }
      }

      return $$0;
   }

   static {
      a(cgu.a, fan::new);
      a(cgu.b, fan::new);
      a(cgu.c, fan::new);
      a(cgu.d, fan::new);
      a(cgu.e, fan::new);
      a(cgu.f, fan::new);
      a(cgu.g, fas::new);
      a(cgu.h, faf::new);
      a(cgu.i, fag::new);
      a(cgu.j, fah::new);
      a(cgu.k, fak::new);
      a(cgu.l, fao::new);
      a(cgu.m, fav::new);
      a(cgu.n, faw::new);
      a(cgu.o, fax::new);
      a(cgu.p, faz::new);
      a(cgu.q, fbe::new);
      a(cgu.r, fbf::new);
      a(cgu.s, fbh::new);
      a(cgu.t, fbk::new);
      a(cgu.u, fbm::new);
      a(cgu.v, fbn::new);
      a(cgu.w, fal::new);
      a(cgu.x, fbo::new);
   }

   interface a<T extends cfp, U extends ezd & fbg<T>> {
      default void a(ui $$0, cgu<T> $$1, ero $$2, int $$3) {
         U $$4 = this.create($$1.a($$3, $$2.s.fS()), $$2.s.fS(), $$0);
         $$2.s.bS = $$4.D();
         $$2.a($$4);
      }

      U create(T var1, ccw var2, ui var3);
   }
}
