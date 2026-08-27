import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.function.Supplier;

public class cwz extends ctc {
   public static final MapCodec<cwz> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(jb.f.q().fieldOf("host").forGetter(cwz::b), t()).apply($$0, cwz::new));
   private final ctc b;
   private static final Map<ctc, ctc> c = Maps.newIdentityHashMap();
   private static final Map<dfd, dfd> d = Maps.newIdentityHashMap();
   private static final Map<dfd, dfd> e = Maps.newIdentityHashMap();

   @Override
   public MapCodec<? extends cwz> a() {
      return a;
   }

   public cwz(ctc $$0, dfc.d $$1) {
      super($$1.e($$0.w() / 2.0F).f(0.75F));
      this.b = $$0;
      c.put($$0, this);
   }

   public ctc b() {
      return this.b;
   }

   public static boolean h(dfd $$0) {
      return c.containsKey($$0.b());
   }

   private void a(akt $$0, gw $$1) {
      bzv $$2 = bja.aI.a((cqb)$$0);
      if ($$2 != null) {
         $$2.b((double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, 0.0F, 0.0F);
         $$0.b($$2);
         $$2.Q();
      }
   }

   @Override
   public void a(dfd $$0, akt $$1, gw $$2, cjl $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$1.X().b(cpx.g) && cnw.a(cny.v, $$3) == 0) {
         this.a($$1, $$2);
      }
   }

   public static dfd n(dfd $$0) {
      return a(d, $$0, () -> c.get($$0.b()).o());
   }

   public dfd o(dfd $$0) {
      return a(e, $$0, () -> this.b().o());
   }

   private static dfd a(Map<dfd, dfd> $$0, dfd $$1, Supplier<dfd> $$2) {
      return $$0.computeIfAbsent($$1, $$1x -> {
         dfd $$2x = $$2.get();

         for (dgg $$3 : $$1x.B()) {
            $$2x = $$2x.b($$3) ? $$2x.a($$3, $$1x.c($$3)) : $$2x;
         }

         return $$2x;
      });
   }
}
