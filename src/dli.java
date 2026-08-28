import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.function.Supplier;

public class dli extends dhj {
   public static final MapCodec<dli> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(lu.e.q().fieldOf("host").forGetter(dli::b), u()).apply($$0, dli::new));
   private final dhj b;
   private static final Map<dhj, dhj> c = Maps.newIdentityHashMap();
   private static final Map<duo, duo> d = Maps.newIdentityHashMap();
   private static final Map<duo, duo> e = Maps.newIdentityHashMap();

   @Override
   public MapCodec<? extends dli> a() {
      return a;
   }

   public dli(dhj $$0, dun.d $$1) {
      super($$1.e($$0.x() / 2.0F).f(0.75F));
      this.b = $$0;
      c.put($$0, this);
   }

   public dhj b() {
      return this.b;
   }

   public static boolean o(duo $$0) {
      return c.containsKey($$0.b());
   }

   private void a(arh $$0, je $$1) {
      clh $$2 = btv.aM.a($$0, btu.k);
      if ($$2 != null) {
         $$2.b((double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, 0.0F, 0.0F);
         $$0.b($$2);
         $$2.V();
      }
   }

   @Override
   protected void a(duo $$0, arh $$1, je $$2, cvp $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$1.ac().b(dec.h) && !dbm.a($$3, aww.t)) {
         this.a($$1, $$2);
      }
   }

   public static duo p(duo $$0) {
      return a(d, $$0, () -> c.get($$0.b()).o());
   }

   public duo q(duo $$0) {
      return a(e, $$0, () -> this.b().o());
   }

   private static duo a(Map<duo, duo> $$0, duo $$1, Supplier<duo> $$2) {
      return $$0.computeIfAbsent($$1, $$1x -> {
         duo $$2x = $$2.get();

         for (dvr $$3 : $$1x.F()) {
            $$2x = $$2x.b($$3) ? $$2x.b($$3, $$1x.c($$3)) : $$2x;
         }

         return $$2x;
      });
   }
}
