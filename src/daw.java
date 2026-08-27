import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.function.Supplier;

public class daw extends cwy {
   public static final MapCodec<daw> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(kd.e.q().fieldOf("host").forGetter(daw::b), u()).apply($$0, daw::new));
   private final cwy b;
   private static final Map<cwy, cwy> c = Maps.newIdentityHashMap();
   private static final Map<djp, djp> d = Maps.newIdentityHashMap();
   private static final Map<djp, djp> e = Maps.newIdentityHashMap();

   @Override
   public MapCodec<? extends daw> a() {
      return a;
   }

   public daw(cwy $$0, djo.d $$1) {
      super($$1.e($$0.x() / 2.0F).f(0.75F));
      this.b = $$0;
      c.put($$0, this);
   }

   public cwy b() {
      return this.b;
   }

   public static boolean h(djp $$0) {
      return c.containsKey($$0.b());
   }

   private void a(ane $$0, hx $$1) {
      cdd $$2 = bmc.aK.a((ctx)$$0);
      if ($$2 != null) {
         $$2.b((double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, 0.0F, 0.0F);
         $$0.b($$2);
         $$2.S();
      }
   }

   @Override
   public void a(djp $$0, ane $$1, hx $$2, cng $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$1.Z().b(ctt.h) && crt.a(crv.v, $$3) == 0) {
         this.a($$1, $$2);
      }
   }

   public static djp n(djp $$0) {
      return a(d, $$0, () -> c.get($$0.b()).o());
   }

   public djp o(djp $$0) {
      return a(e, $$0, () -> this.b().o());
   }

   private static djp a(Map<djp, djp> $$0, djp $$1, Supplier<djp> $$2) {
      return $$0.computeIfAbsent($$1, $$1x -> {
         djp $$2x = $$2.get();

         for (dks $$3 : $$1x.B()) {
            $$2x = $$2x.b($$3) ? $$2x.a($$3, $$1x.c($$3)) : $$2x;
         }

         return $$2x;
      });
   }
}
