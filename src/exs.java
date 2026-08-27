import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import java.util.Map;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class exs {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<cfw<?>, exs.a<?, ?>> b = Maps.newHashMap();

   public static <T extends cer> void a(@Nullable cfw<T> $$0, eqp $$1, int $$2, tl $$3) {
      if ($$0 == null) {
         a.warn("Trying to open invalid screen with name: {}", $$3.getString());
      } else {
         exs.a<T, ?> $$4 = a($$0);
         if ($$4 == null) {
            a.warn("Failed to create screen for menu type: {}", jb.s.b($$0));
         } else {
            $$4.a($$3, $$0, $$1, $$2);
         }
      }
   }

   @Nullable
   private static <T extends cer> exs.a<T, ?> a(cfw<T> $$0) {
      return (exs.a<T, ?>)b.get($$0);
   }

   private static <M extends cer, U extends eye & fah<M>> void a(cfw<? extends M> $$0, exs.a<M, U> $$1) {
      exs.a<?, ?> $$2 = b.put($$0, $$1);
      if ($$2 != null) {
         throw new IllegalStateException("Duplicate registration for " + jb.s.b($$0));
      }
   }

   public static boolean a() {
      boolean $$0 = false;

      for (cfw<?> $$1 : jb.s) {
         if (!b.containsKey($$1)) {
            a.debug("Menu {} has no matching screen", jb.s.b($$1));
            $$0 = true;
         }
      }

      return $$0;
   }

   static {
      a(cfw.a, ezo::new);
      a(cfw.b, ezo::new);
      a(cfw.c, ezo::new);
      a(cfw.d, ezo::new);
      a(cfw.e, ezo::new);
      a(cfw.f, ezo::new);
      a(cfw.g, ezt::new);
      a(cfw.h, ezg::new);
      a(cfw.i, ezh::new);
      a(cfw.j, ezi::new);
      a(cfw.k, ezl::new);
      a(cfw.l, ezp::new);
      a(cfw.m, ezw::new);
      a(cfw.n, ezx::new);
      a(cfw.o, ezy::new);
      a(cfw.p, faa::new);
      a(cfw.q, faf::new);
      a(cfw.r, fag::new);
      a(cfw.s, fai::new);
      a(cfw.t, fal::new);
      a(cfw.u, fan::new);
      a(cfw.v, fao::new);
      a(cfw.w, ezm::new);
      a(cfw.x, fap::new);
   }

   interface a<T extends cer, U extends eye & fah<T>> {
      default void a(tl $$0, cfw<T> $$1, eqp $$2, int $$3) {
         U $$4 = this.create($$1.a($$3, $$2.s.fS()), $$2.s.fS(), $$0);
         $$2.s.bS = $$4.E();
         $$2.a($$4);
      }

      U create(T var1, cbz var2, tl var3);
   }
}
