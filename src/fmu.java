import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import java.util.Map;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fmu {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<cqm<?>, fmu.a<?, ?>> b = Maps.newHashMap();

   public static <T extends cpe> void a(cqm<T> $$0, ffn $$1, int $$2, wu $$3) {
      fmu.a<T, ?> $$4 = a($$0);
      if ($$4 == null) {
         a.warn("Failed to create screen for menu type: {}", lq.p.b($$0));
      } else {
         $$4.a($$3, $$0, $$1, $$2);
      }
   }

   @Nullable
   private static <T extends cpe> fmu.a<T, ?> a(cqm<T> $$0) {
      return (fmu.a<T, ?>)b.get($$0);
   }

   private static <M extends cpe, U extends fnd & foy<M>> void a(cqm<? extends M> $$0, fmu.a<M, U> $$1) {
      fmu.a<?, ?> $$2 = b.put($$0, $$1);
      if ($$2 != null) {
         throw new IllegalStateException("Duplicate registration for " + lq.p.b($$0));
      }
   }

   public static boolean a() {
      boolean $$0 = false;

      for (cqm<?> $$1 : lq.p) {
         if (!b.containsKey($$1)) {
            a.debug("Menu {} has no matching screen", lq.p.b($$1));
            $$0 = true;
         }
      }

      return $$0;
   }

   static {
      a(cqm.a, fod::new);
      a(cqm.b, fod::new);
      a(cqm.c, fod::new);
      a(cqm.d, fod::new);
      a(cqm.e, fod::new);
      a(cqm.f, fod::new);
      a(cqm.g, foj::new);
      a(cqm.h, foe::new);
      a(cqm.i, fnv::new);
      a(cqm.j, fnw::new);
      a(cqm.k, fnx::new);
      a(cqm.l, foa::new);
      a(cqm.m, fof::new);
      a(cqm.n, fom::new);
      a(cqm.o, fon::new);
      a(cqm.p, foo::new);
      a(cqm.q, foq::new);
      a(cqm.r, fow::new);
      a(cqm.s, fox::new);
      a(cqm.t, foz::new);
      a(cqm.u, fpc::new);
      a(cqm.v, fpe::new);
      a(cqm.w, fpf::new);
      a(cqm.x, fob::new);
      a(cqm.y, fpg::new);
   }

   interface a<T extends cpe, U extends fnd & foy<T>> {
      default void a(wu $$0, cqm<T> $$1, ffn $$2, int $$3) {
         U $$4 = this.create($$1.a($$3, $$2.s.fY()), $$2.s.fY(), $$0);
         $$2.s.cd = $$4.F();
         $$2.a($$4);
      }

      U create(T var1, cmg var2, wu var3);
   }
}
