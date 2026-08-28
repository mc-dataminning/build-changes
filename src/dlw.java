import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.function.Supplier;

public class dlw extends dhy {
   public static final MapCodec<dlw> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(lx.e.q().fieldOf("host").forGetter(dlw::b), t()).apply($$0, dlw::new));
   private final dhy b;
   private static final Map<dhy, dhy> c = Maps.newIdentityHashMap();
   private static final Map<dvd, dvd> d = Maps.newIdentityHashMap();
   private static final Map<dvd, dvd> e = Maps.newIdentityHashMap();

   @Override
   public MapCodec<? extends dlw> a() {
      return a;
   }

   public dlw(dhy $$0, dvc.d $$1) {
      super($$1.e($$0.x() / 2.0F).f(0.75F));
      this.b = $$0;
      c.put($$0, this);
   }

   public dhy b() {
      return this.b;
   }

   public static boolean o(dvd $$0) {
      return c.containsKey($$0.b());
   }

   private void a(arm $$0, jg $$1) {
      clt $$2 = bug.aM.a($$0, buf.k);
      if ($$2 != null) {
         $$2.b((double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, 0.0F, 0.0F);
         $$0.b($$2);
         $$2.V();
      }
   }

   @Override
   protected void a(dvd $$0, arm $$1, jg $$2, cvx $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$1.ac().b(der.h) && !dbo.a($$3, axc.t)) {
         this.a($$1, $$2);
      }
   }

   public static dvd p(dvd $$0) {
      return a(d, $$0, () -> c.get($$0.b()).m());
   }

   public dvd q(dvd $$0) {
      return a(e, $$0, () -> this.b().m());
   }

   private static dvd a(Map<dvd, dvd> $$0, dvd $$1, Supplier<dvd> $$2) {
      return $$0.computeIfAbsent($$1, $$1x -> {
         dvd $$2x = $$2.get();

         for (dwg $$3 : $$1x.F()) {
            $$2x = $$2x.b($$3) ? $$2x.b($$3, $$1x.c($$3)) : $$2x;
         }

         return $$2x;
      });
   }
}
