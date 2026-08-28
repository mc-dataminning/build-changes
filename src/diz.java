import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.function.Supplier;

public class diz extends dfa {
   public static final MapCodec<diz> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(lp.e.q().fieldOf("host").forGetter(diz::b), u()).apply($$0, diz::new));
   private final dfa b;
   private static final Map<dfa, dfa> c = Maps.newIdentityHashMap();
   private static final Map<dsd, dsd> d = Maps.newIdentityHashMap();
   private static final Map<dsd, dsd> e = Maps.newIdentityHashMap();

   @Override
   public MapCodec<? extends diz> a() {
      return a;
   }

   public diz(dfa $$0, dsc.d $$1) {
      super($$1.e($$0.x() / 2.0F).f(0.75F));
      this.b = $$0;
      c.put($$0, this);
   }

   public dfa b() {
      return this.b;
   }

   public static boolean m(dsd $$0) {
      return c.containsKey($$0.b());
   }

   private void a(arf $$0, iz $$1) {
      ckl $$2 = btb.aM.a((dbz)$$0);
      if ($$2 != null) {
         $$2.b((double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, 0.0F, 0.0F);
         $$0.b($$2);
         $$2.R();
      }
   }

   @Override
   protected void a(dsd $$0, arf $$1, iz $$2, cuq $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$1.ab().b(dbv.h) && dac.a(dae.v, $$3) == 0) {
         this.a($$1, $$2);
      }
   }

   public static dsd n(dsd $$0) {
      return a(d, $$0, () -> c.get($$0.b()).o());
   }

   public dsd o(dsd $$0) {
      return a(e, $$0, () -> this.b().o());
   }

   private static dsd a(Map<dsd, dsd> $$0, dsd $$1, Supplier<dsd> $$2) {
      return $$0.computeIfAbsent($$1, $$1x -> {
         dsd $$2x = $$2.get();

         for (dtg $$3 : $$1x.B()) {
            $$2x = $$2x.b($$3) ? $$2x.a($$3, $$1x.c($$3)) : $$2x;
         }

         return $$2x;
      });
   }
}
