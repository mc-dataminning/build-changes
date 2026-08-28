import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.function.Supplier;

public class dqv extends dmr {
   public static final MapCodec<dqv> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(mg.e.q().fieldOf("host").forGetter(dqv::b), t()).apply($$0, dqv::new));
   private final dmr b;
   private static final Map<dmr, dmr> c = Maps.newIdentityHashMap();
   private static final Map<eat, eat> d = Maps.newIdentityHashMap();
   private static final Map<eat, eat> e = Maps.newIdentityHashMap();

   @Override
   public MapCodec<? extends dqv> a() {
      return a;
   }

   public dqv(dmr $$0, eas.d $$1) {
      super($$1.e($$0.x() / 2.0F).f(0.75F));
      this.b = $$0;
      c.put($$0, this);
   }

   public dmr b() {
      return this.b;
   }

   public static boolean o(eat $$0) {
      return c.containsKey($$0.b());
   }

   private void a(arq $$0, iv $$1) {
      cov $$2 = bwr.be.a($$0, bwq.k);
      if ($$2 != null) {
         $$2.b((double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, 0.0F, 0.0F);
         $$0.b($$2);
         $$2.U();
      }
   }

   @Override
   protected void a(eat $$0, arq $$1, iv $$2, czn $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$1.O().c(dji.i) && !dgc.a($$3, axe.t)) {
         this.a($$1, $$2);
      }
   }

   public static eat p(eat $$0) {
      return a(d, $$0, () -> c.get($$0.b()).m());
   }

   public eat q(eat $$0) {
      return a(e, $$0, () -> this.b().m());
   }

   private static eat a(Map<eat, eat> $$0, eat $$1, Supplier<eat> $$2) {
      return $$0.computeIfAbsent($$1, $$1x -> {
         eat $$2x = $$2.get();

         for (ebw $$3 : $$1x.F()) {
            $$2x = $$2x.b($$3) ? $$2x.b($$3, $$1x.c($$3)) : $$2x;
         }

         return $$2x;
      });
   }
}
