import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.function.Supplier;

public class dao extends cwq {
   public static final MapCodec<dao> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(kd.e.q().fieldOf("host").forGetter(dao::b), u()).apply($$0, dao::new));
   private final cwq b;
   private static final Map<cwq, cwq> c = Maps.newIdentityHashMap();
   private static final Map<djh, djh> d = Maps.newIdentityHashMap();
   private static final Map<djh, djh> e = Maps.newIdentityHashMap();

   @Override
   public MapCodec<? extends dao> a() {
      return a;
   }

   public dao(cwq $$0, djg.d $$1) {
      super($$1.e($$0.x() / 2.0F).f(0.75F));
      this.b = $$0;
      c.put($$0, this);
   }

   public cwq b() {
      return this.b;
   }

   public static boolean h(djh $$0) {
      return c.containsKey($$0.b());
   }

   private void a(and $$0, hx $$1) {
      ccw $$2 = blz.aJ.a((ctp)$$0);
      if ($$2 != null) {
         $$2.b((double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, 0.0F, 0.0F);
         $$0.b($$2);
         $$2.S();
      }
   }

   @Override
   public void a(djh $$0, and $$1, hx $$2, cmy $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$1.Z().b(ctl.h) && crl.a(crn.v, $$3) == 0) {
         this.a($$1, $$2);
      }
   }

   public static djh n(djh $$0) {
      return a(d, $$0, () -> c.get($$0.b()).o());
   }

   public djh o(djh $$0) {
      return a(e, $$0, () -> this.b().o());
   }

   private static djh a(Map<djh, djh> $$0, djh $$1, Supplier<djh> $$2) {
      return $$0.computeIfAbsent($$1, $$1x -> {
         djh $$2x = $$2.get();

         for (dkk $$3 : $$1x.B()) {
            $$2x = $$2x.b($$3) ? $$2x.a($$3, $$1x.c($$3)) : $$2x;
         }

         return $$2x;
      });
   }
}
