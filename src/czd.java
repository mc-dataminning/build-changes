import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.function.Supplier;

public class czd extends cvf {
   public static final MapCodec<czd> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(kc.f.q().fieldOf("host").forGetter(czd::b), u()).apply($$0, czd::new));
   private final cvf b;
   private static final Map<cvf, cvf> c = Maps.newIdentityHashMap();
   private static final Map<dhn, dhn> d = Maps.newIdentityHashMap();
   private static final Map<dhn, dhn> e = Maps.newIdentityHashMap();

   @Override
   public MapCodec<? extends czd> a() {
      return a;
   }

   public czd(cvf $$0, dhm.d $$1) {
      super($$1.e($$0.x() / 2.0F).f(0.75F));
      this.b = $$0;
      c.put($$0, this);
   }

   public cvf b() {
      return this.b;
   }

   public static boolean h(dhn $$0) {
      return c.containsKey($$0.b());
   }

   private void a(ami $$0, hx $$1) {
      cbu $$2 = bkz.aI.a((csf)$$0);
      if ($$2 != null) {
         $$2.b((double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, 0.0F, 0.0F);
         $$0.b($$2);
         $$2.S();
      }
   }

   @Override
   public void a(dhn $$0, ami $$1, hx $$2, clo $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$1.Y().b(csb.h) && cqb.a(cqd.v, $$3) == 0) {
         this.a($$1, $$2);
      }
   }

   public static dhn n(dhn $$0) {
      return a(d, $$0, () -> c.get($$0.b()).o());
   }

   public dhn o(dhn $$0) {
      return a(e, $$0, () -> this.b().o());
   }

   private static dhn a(Map<dhn, dhn> $$0, dhn $$1, Supplier<dhn> $$2) {
      return $$0.computeIfAbsent($$1, $$1x -> {
         dhn $$2x = $$2.get();

         for (diq $$3 : $$1x.B()) {
            $$2x = $$2x.b($$3) ? $$2x.a($$3, $$1x.c($$3)) : $$2x;
         }

         return $$2x;
      });
   }
}
