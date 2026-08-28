import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.function.Supplier;

public class dll extends dhm {
   public static final MapCodec<dll> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(lv.e.q().fieldOf("host").forGetter(dll::b), t()).apply($$0, dll::new));
   private final dhm b;
   private static final Map<dhm, dhm> c = Maps.newIdentityHashMap();
   private static final Map<dus, dus> d = Maps.newIdentityHashMap();
   private static final Map<dus, dus> e = Maps.newIdentityHashMap();

   @Override
   public MapCodec<? extends dll> a() {
      return a;
   }

   public dll(dhm $$0, dur.d $$1) {
      super($$1.e($$0.x() / 2.0F).f(0.75F));
      this.b = $$0;
      c.put($$0, this);
   }

   public dhm b() {
      return this.b;
   }

   public static boolean o(dus $$0) {
      return c.containsKey($$0.b());
   }

   private void a(arj $$0, jf $$1) {
      clk $$2 = bty.aM.a($$0, btx.k);
      if ($$2 != null) {
         $$2.b((double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, 0.0F, 0.0F);
         $$0.b($$2);
         $$2.V();
      }
   }

   @Override
   protected void a(dus $$0, arj $$1, jf $$2, cvs $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$1.ac().b(def.h) && !dbp.a($$3, awy.t)) {
         this.a($$1, $$2);
      }
   }

   public static dus p(dus $$0) {
      return a(d, $$0, () -> c.get($$0.b()).n());
   }

   public dus q(dus $$0) {
      return a(e, $$0, () -> this.b().n());
   }

   private static dus a(Map<dus, dus> $$0, dus $$1, Supplier<dus> $$2) {
      return $$0.computeIfAbsent($$1, $$1x -> {
         dus $$2x = $$2.get();

         for (dvv $$3 : $$1x.F()) {
            $$2x = $$2x.b($$3) ? $$2x.b($$3, $$1x.c($$3)) : $$2x;
         }

         return $$2x;
      });
   }
}
