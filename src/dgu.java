import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.function.Supplier;

public class dgu extends dcv {
   public static final MapCodec<dgu> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(lc.e.q().fieldOf("host").forGetter(dgu::b), u()).apply($$0, dgu::new));
   private final dcv b;
   private static final Map<dcv, dcv> c = Maps.newIdentityHashMap();
   private static final Map<dpy, dpy> d = Maps.newIdentityHashMap();
   private static final Map<dpy, dpy> e = Maps.newIdentityHashMap();

   @Override
   public MapCodec<? extends dgu> a() {
      return a;
   }

   public dgu(dcv $$0, dpx.d $$1) {
      super($$1.e($$0.x() / 2.0F).f(0.75F));
      this.b = $$0;
      c.put($$0, this);
   }

   public dcv b() {
      return this.b;
   }

   public static boolean m(dpy $$0) {
      return c.containsKey($$0.b());
   }

   private void a(aqe $$0, im $$1) {
      chy $$2 = bqr.aL.a((czu)$$0);
      if ($$2 != null) {
         $$2.b((double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, 0.0F, 0.0F);
         $$0.b($$2);
         $$2.Q();
      }
   }

   @Override
   protected void a(dpy $$0, aqe $$1, im $$2, csd $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$1.aa().b(czq.h) && cxo.a(cxq.v, $$3) == 0) {
         this.a($$1, $$2);
      }
   }

   public static dpy n(dpy $$0) {
      return a(d, $$0, () -> c.get($$0.b()).n());
   }

   public dpy o(dpy $$0) {
      return a(e, $$0, () -> this.b().n());
   }

   private static dpy a(Map<dpy, dpy> $$0, dpy $$1, Supplier<dpy> $$2) {
      return $$0.computeIfAbsent($$1, $$1x -> {
         dpy $$2x = $$2.get();

         for (drb $$3 : $$1x.B()) {
            $$2x = $$2x.b($$3) ? $$2x.a($$3, $$1x.c($$3)) : $$2x;
         }

         return $$2x;
      });
   }
}
