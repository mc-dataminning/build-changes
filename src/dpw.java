import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.function.Supplier;

public class dpw extends dlu {
   public static final MapCodec<dpw> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(mf.e.q().fieldOf("host").forGetter(dpw::b), t()).apply($$0, dpw::new));
   private final dlu b;
   private static final Map<dlu, dlu> c = Maps.newIdentityHashMap();
   private static final Map<dzo, dzo> d = Maps.newIdentityHashMap();
   private static final Map<dzo, dzo> e = Maps.newIdentityHashMap();

   @Override
   public MapCodec<? extends dpw> a() {
      return a;
   }

   public dpw(dlu $$0, dzn.d $$1) {
      super($$1.e($$0.x() / 2.0F).f(0.75F));
      this.b = $$0;
      c.put($$0, this);
   }

   public dlu b() {
      return this.b;
   }

   public static boolean o(dzo $$0) {
      return c.containsKey($$0.b());
   }

   private void a(aro $$0, iu $$1) {
      coa $$2 = bwj.be.a($$0, bwi.k);
      if ($$2 != null) {
         $$2.b((double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, 0.0F, 0.0F);
         $$0.b($$2);
         $$2.U();
      }
   }

   @Override
   protected void a(dzo $$0, aro $$1, iu $$2, cys $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$1.O().c(dil.h) && !dfh.a($$3, axc.t)) {
         this.a($$1, $$2);
      }
   }

   public static dzo p(dzo $$0) {
      return a(d, $$0, () -> c.get($$0.b()).m());
   }

   public dzo q(dzo $$0) {
      return a(e, $$0, () -> this.b().m());
   }

   private static dzo a(Map<dzo, dzo> $$0, dzo $$1, Supplier<dzo> $$2) {
      return $$0.computeIfAbsent($$1, $$1x -> {
         dzo $$2x = $$2.get();

         for (ear $$3 : $$1x.F()) {
            $$2x = $$2x.b($$3) ? $$2x.b($$3, $$1x.c($$3)) : $$2x;
         }

         return $$2x;
      });
   }
}
