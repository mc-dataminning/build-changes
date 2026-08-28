import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.function.Supplier;

public class dnn extends djm {
   public static final MapCodec<dnn> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(mb.e.q().fieldOf("host").forGetter(dnn::b), t()).apply($$0, dnn::new));
   private final djm b;
   private static final Map<djm, djm> c = Maps.newIdentityHashMap();
   private static final Map<dwx, dwx> d = Maps.newIdentityHashMap();
   private static final Map<dwx, dwx> e = Maps.newIdentityHashMap();

   @Override
   public MapCodec<? extends dnn> a() {
      return a;
   }

   public dnn(djm $$0, dww.d $$1) {
      super($$1.e($$0.x() / 2.0F).f(0.75F));
      this.b = $$0;
      c.put($$0, this);
   }

   public djm b() {
      return this.b;
   }

   public static boolean o(dwx $$0) {
      return c.containsKey($$0.b());
   }

   private void a(ard $$0, ji $$1) {
      cmf $$2 = bus.bd.a($$0, bur.k);
      if ($$2 != null) {
         $$2.b((double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, 0.0F, 0.0F);
         $$0.b($$2);
         $$2.V();
      }
   }

   @Override
   protected void a(dwx $$0, ard $$1, ji $$2, cwp $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$1.O().b(dge.h) && !ddb.a($$3, aws.t)) {
         this.a($$1, $$2);
      }
   }

   public static dwx p(dwx $$0) {
      return a(d, $$0, () -> c.get($$0.b()).m());
   }

   public dwx q(dwx $$0) {
      return a(e, $$0, () -> this.b().m());
   }

   private static dwx a(Map<dwx, dwx> $$0, dwx $$1, Supplier<dwx> $$2) {
      return $$0.computeIfAbsent($$1, $$1x -> {
         dwx $$2x = $$2.get();

         for (dxz $$3 : $$1x.F()) {
            $$2x = $$2x.b($$3) ? $$2x.b($$3, $$1x.c($$3)) : $$2x;
         }

         return $$2x;
      });
   }
}
