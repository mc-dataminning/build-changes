import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.function.Supplier;

public class dqq extends dmm {
   public static final MapCodec<dqq> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(mg.e.q().fieldOf("host").forGetter(dqq::b), t()).apply($$0, dqq::new));
   private final dmm b;
   private static final Map<dmm, dmm> c = Maps.newIdentityHashMap();
   private static final Map<eao, eao> d = Maps.newIdentityHashMap();
   private static final Map<eao, eao> e = Maps.newIdentityHashMap();

   @Override
   public MapCodec<? extends dqq> a() {
      return a;
   }

   public dqq(dmm $$0, ean.d $$1) {
      super($$1.e($$0.x() / 2.0F).f(0.75F));
      this.b = $$0;
      c.put($$0, this);
   }

   public dmm b() {
      return this.b;
   }

   public static boolean o(eao $$0) {
      return c.containsKey($$0.b());
   }

   private void a(arq $$0, iv $$1) {
      cos $$2 = bwr.be.a($$0, bwq.k);
      if ($$2 != null) {
         $$2.b((double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, 0.0F, 0.0F);
         $$0.b($$2);
         $$2.U();
      }
   }

   @Override
   protected void a(eao $$0, arq $$1, iv $$2, czk $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$1.O().c(djd.i) && !dfz.a($$3, axe.t)) {
         this.a($$1, $$2);
      }
   }

   public static eao p(eao $$0) {
      return a(d, $$0, () -> c.get($$0.b()).m());
   }

   public eao q(eao $$0) {
      return a(e, $$0, () -> this.b().m());
   }

   private static eao a(Map<eao, eao> $$0, eao $$1, Supplier<eao> $$2) {
      return $$0.computeIfAbsent($$1, $$1x -> {
         eao $$2x = $$2.get();

         for (ebr $$3 : $$1x.F()) {
            $$2x = $$2x.b($$3) ? $$2x.b($$3, $$1x.c($$3)) : $$2x;
         }

         return $$2x;
      });
   }
}
