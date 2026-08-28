import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.function.Supplier;

public class dqj extends dmf {
   public static final MapCodec<dqj> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(mf.e.q().fieldOf("host").forGetter(dqj::b), t()).apply($$0, dqj::new));
   private final dmf b;
   private static final Map<dmf, dmf> c = Maps.newIdentityHashMap();
   private static final Map<eah, eah> d = Maps.newIdentityHashMap();
   private static final Map<eah, eah> e = Maps.newIdentityHashMap();

   @Override
   public MapCodec<? extends dqj> a() {
      return a;
   }

   public dqj(dmf $$0, eag.d $$1) {
      super($$1.e($$0.x() / 2.0F).f(0.75F));
      this.b = $$0;
      c.put($$0, this);
   }

   public dmf b() {
      return this.b;
   }

   public static boolean o(eah $$0) {
      return c.containsKey($$0.b());
   }

   private void a(arq $$0, iu $$1) {
      cok $$2 = bwo.be.a($$0, bwn.k);
      if ($$2 != null) {
         $$2.b((double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, 0.0F, 0.0F);
         $$0.b($$2);
         $$2.U();
      }
   }

   @Override
   protected void a(eah $$0, arq $$1, iu $$2, czd $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$1.O().c(diw.i) && !dfs.a($$3, axe.t)) {
         this.a($$1, $$2);
      }
   }

   public static eah p(eah $$0) {
      return a(d, $$0, () -> c.get($$0.b()).m());
   }

   public eah q(eah $$0) {
      return a(e, $$0, () -> this.b().m());
   }

   private static eah a(Map<eah, eah> $$0, eah $$1, Supplier<eah> $$2) {
      return $$0.computeIfAbsent($$1, $$1x -> {
         eah $$2x = $$2.get();

         for (ebk $$3 : $$1x.F()) {
            $$2x = $$2x.b($$3) ? $$2x.b($$3, $$1x.c($$3)) : $$2x;
         }

         return $$2x;
      });
   }
}
