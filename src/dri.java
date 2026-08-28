import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.function.Supplier;

public class dri extends dne {
   public static final MapCodec<dri> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(mh.e.q().fieldOf("host").forGetter(dri::b), t()).apply($$0, dri::new));
   private final dne b;
   private static final Map<dne, dne> c = Maps.newIdentityHashMap();
   private static final Map<ebg, ebg> d = Maps.newIdentityHashMap();
   private static final Map<ebg, ebg> e = Maps.newIdentityHashMap();

   @Override
   public MapCodec<? extends dri> a() {
      return a;
   }

   public dri(dne $$0, ebf.d $$1) {
      super($$1.e($$0.x() / 2.0F).f(0.75F));
      this.b = $$0;
      c.put($$0, this);
   }

   public dne b() {
      return this.b;
   }

   public static boolean o(ebg $$0) {
      return c.containsKey($$0.b());
   }

   private void a(aru $$0, iw $$1) {
      cpi $$2 = bxe.bf.a($$0, bxd.k);
      if ($$2 != null) {
         $$2.b((double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, 0.0F, 0.0F);
         $$0.b($$2);
         $$2.U();
      }
   }

   @Override
   protected void a(ebg $$0, aru $$1, iw $$2, daa $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$1.O().c(djv.i) && !dgp.a($$3, axi.t)) {
         this.a($$1, $$2);
      }
   }

   public static ebg p(ebg $$0) {
      return a(d, $$0, () -> c.get($$0.b()).m());
   }

   public ebg q(ebg $$0) {
      return a(e, $$0, () -> this.b().m());
   }

   private static ebg a(Map<ebg, ebg> $$0, ebg $$1, Supplier<ebg> $$2) {
      return $$0.computeIfAbsent($$1, $$1x -> {
         ebg $$2x = $$2.get();

         for (ecj $$3 : $$1x.F()) {
            $$2x = $$2x.b($$3) ? $$2x.b($$3, $$1x.c($$3)) : $$2x;
         }

         return $$2x;
      });
   }
}
