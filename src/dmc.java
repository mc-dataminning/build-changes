import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.function.Supplier;

public class dmc extends die {
   public static final MapCodec<dmc> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ly.e.q().fieldOf("host").forGetter(dmc::b), t()).apply($$0, dmc::new));
   private final die b;
   private static final Map<die, die> c = Maps.newIdentityHashMap();
   private static final Map<dvj, dvj> d = Maps.newIdentityHashMap();
   private static final Map<dvj, dvj> e = Maps.newIdentityHashMap();

   @Override
   public MapCodec<? extends dmc> a() {
      return a;
   }

   public dmc(die $$0, dvi.d $$1) {
      super($$1.e($$0.x() / 2.0F).f(0.75F));
      this.b = $$0;
      c.put($$0, this);
   }

   public die b() {
      return this.b;
   }

   public static boolean o(dvj $$0) {
      return c.containsKey($$0.b());
   }

   private void a(arn $$0, jh $$1) {
      cly $$2 = bul.aM.a($$0, buk.k);
      if ($$2 != null) {
         $$2.b((double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, 0.0F, 0.0F);
         $$0.b($$2);
         $$2.V();
      }
   }

   @Override
   protected void a(dvj $$0, arn $$1, jh $$2, cwb $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$1.ac().b(dex.h) && !dbu.a($$3, axd.t)) {
         this.a($$1, $$2);
      }
   }

   public static dvj p(dvj $$0) {
      return a(d, $$0, () -> c.get($$0.b()).m());
   }

   public dvj q(dvj $$0) {
      return a(e, $$0, () -> this.b().m());
   }

   private static dvj a(Map<dvj, dvj> $$0, dvj $$1, Supplier<dvj> $$2) {
      return $$0.computeIfAbsent($$1, $$1x -> {
         dvj $$2x = $$2.get();

         for (dwm $$3 : $$1x.F()) {
            $$2x = $$2x.b($$3) ? $$2x.b($$3, $$1x.c($$3)) : $$2x;
         }

         return $$2x;
      });
   }
}
