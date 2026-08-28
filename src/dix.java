import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.function.Supplier;

public class dix extends dey {
   public static final MapCodec<dix> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(lp.e.q().fieldOf("host").forGetter(dix::b), u()).apply($$0, dix::new));
   private final dey b;
   private static final Map<dey, dey> c = Maps.newIdentityHashMap();
   private static final Map<dsb, dsb> d = Maps.newIdentityHashMap();
   private static final Map<dsb, dsb> e = Maps.newIdentityHashMap();

   @Override
   public MapCodec<? extends dix> a() {
      return a;
   }

   public dix(dey $$0, dsa.d $$1) {
      super($$1.e($$0.x() / 2.0F).f(0.75F));
      this.b = $$0;
      c.put($$0, this);
   }

   public dey b() {
      return this.b;
   }

   public static boolean m(dsb $$0) {
      return c.containsKey($$0.b());
   }

   private void a(are $$0, iz $$1) {
      ckj $$2 = bsz.aM.a((dbx)$$0);
      if ($$2 != null) {
         $$2.b((double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, 0.0F, 0.0F);
         $$0.b($$2);
         $$2.R();
      }
   }

   @Override
   protected void a(dsb $$0, are $$1, iz $$2, cuo $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$1.ab().b(dbt.h) && daa.a(dac.v, $$3) == 0) {
         this.a($$1, $$2);
      }
   }

   public static dsb n(dsb $$0) {
      return a(d, $$0, () -> c.get($$0.b()).o());
   }

   public dsb o(dsb $$0) {
      return a(e, $$0, () -> this.b().o());
   }

   private static dsb a(Map<dsb, dsb> $$0, dsb $$1, Supplier<dsb> $$2) {
      return $$0.computeIfAbsent($$1, $$1x -> {
         dsb $$2x = $$2.get();

         for (dte $$3 : $$1x.B()) {
            $$2x = $$2x.b($$3) ? $$2x.a($$3, $$1x.c($$3)) : $$2x;
         }

         return $$2x;
      });
   }
}
