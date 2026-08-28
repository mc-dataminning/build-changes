import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.function.Supplier;

public class dno extends djn {
   public static final MapCodec<dno> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(mb.e.q().fieldOf("host").forGetter(dno::b), t()).apply($$0, dno::new));
   private final djn b;
   private static final Map<djn, djn> c = Maps.newIdentityHashMap();
   private static final Map<dwy, dwy> d = Maps.newIdentityHashMap();
   private static final Map<dwy, dwy> e = Maps.newIdentityHashMap();

   @Override
   public MapCodec<? extends dno> a() {
      return a;
   }

   public dno(djn $$0, dwx.d $$1) {
      super($$1.e($$0.x() / 2.0F).f(0.75F));
      this.b = $$0;
      c.put($$0, this);
   }

   public djn b() {
      return this.b;
   }

   public static boolean o(dwy $$0) {
      return c.containsKey($$0.b());
   }

   private void a(ard $$0, ji $$1) {
      cmg $$2 = but.bd.a($$0, bus.k);
      if ($$2 != null) {
         $$2.b((double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, 0.0F, 0.0F);
         $$0.b($$2);
         $$2.V();
      }
   }

   @Override
   protected void a(dwy $$0, ard $$1, ji $$2, cwq $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$1.O().b(dgf.h) && !ddc.a($$3, aws.t)) {
         this.a($$1, $$2);
      }
   }

   public static dwy p(dwy $$0) {
      return a(d, $$0, () -> c.get($$0.b()).m());
   }

   public dwy q(dwy $$0) {
      return a(e, $$0, () -> this.b().m());
   }

   private static dwy a(Map<dwy, dwy> $$0, dwy $$1, Supplier<dwy> $$2) {
      return $$0.computeIfAbsent($$1, $$1x -> {
         dwy $$2x = $$2.get();

         for (dya $$3 : $$1x.F()) {
            $$2x = $$2x.b($$3) ? $$2x.b($$3, $$1x.c($$3)) : $$2x;
         }

         return $$2x;
      });
   }
}
