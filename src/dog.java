import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.function.Supplier;

public class dog extends dke {
   public static final MapCodec<dog> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(mb.e.q().fieldOf("host").forGetter(dog::b), t()).apply($$0, dog::new));
   private final dke b;
   private static final Map<dke, dke> c = Maps.newIdentityHashMap();
   private static final Map<dxq, dxq> d = Maps.newIdentityHashMap();
   private static final Map<dxq, dxq> e = Maps.newIdentityHashMap();

   @Override
   public MapCodec<? extends dog> a() {
      return a;
   }

   public dog(dke $$0, dxp.d $$1) {
      super($$1.e($$0.x() / 2.0F).f(0.75F));
      this.b = $$0;
      c.put($$0, this);
   }

   public dke b() {
      return this.b;
   }

   public static boolean o(dxq $$0) {
      return c.containsKey($$0.b());
   }

   private void a(ard $$0, ji $$1) {
      cmz $$2 = bvi.bd.a($$0, bvh.k);
      if ($$2 != null) {
         $$2.b((double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, 0.0F, 0.0F);
         $$0.b($$2);
         $$2.U();
      }
   }

   @Override
   protected void a(dxq $$0, ard $$1, ji $$2, cxh $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$1.O().b(dgv.h) && !ddt.a($$3, aws.t)) {
         this.a($$1, $$2);
      }
   }

   public static dxq p(dxq $$0) {
      return a(d, $$0, () -> c.get($$0.b()).m());
   }

   public dxq q(dxq $$0) {
      return a(e, $$0, () -> this.b().m());
   }

   private static dxq a(Map<dxq, dxq> $$0, dxq $$1, Supplier<dxq> $$2) {
      return $$0.computeIfAbsent($$1, $$1x -> {
         dxq $$2x = $$2.get();

         for (dyt $$3 : $$1x.F()) {
            $$2x = $$2x.b($$3) ? $$2x.b($$3, $$1x.c($$3)) : $$2x;
         }

         return $$2x;
      });
   }
}
