import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.function.Supplier;

public class dof extends dke {
   public static final MapCodec<dof> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ma.e.q().fieldOf("host").forGetter(dof::b), t()).apply($$0, dof::new));
   private final dke b;
   private static final Map<dke, dke> c = Maps.newIdentityHashMap();
   private static final Map<dxn, dxn> d = Maps.newIdentityHashMap();
   private static final Map<dxn, dxn> e = Maps.newIdentityHashMap();

   @Override
   public MapCodec<? extends dof> a() {
      return a;
   }

   public dof(dke $$0, dxm.d $$1) {
      super($$1.e($$0.x() / 2.0F).f(0.75F));
      this.b = $$0;
      c.put($$0, this);
   }

   public dke b() {
      return this.b;
   }

   public static boolean o(dxn $$0) {
      return c.containsKey($$0.b());
   }

   private void a(ash $$0, jh $$1) {
      cmz $$2 = bvm.be.a($$0, bvl.k);
      if ($$2 != null) {
         $$2.b((double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, 0.0F, 0.0F);
         $$0.b($$2);
         $$2.S();
      }
   }

   @Override
   protected void a(dxn $$0, ash $$1, jh $$2, cxk $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$1.N().b(dgw.h) && !ddt.a($$3, axx.t)) {
         this.a($$1, $$2);
      }
   }

   public static dxn p(dxn $$0) {
      return a(d, $$0, () -> c.get($$0.b()).m());
   }

   public dxn q(dxn $$0) {
      return a(e, $$0, () -> this.b().m());
   }

   private static dxn a(Map<dxn, dxn> $$0, dxn $$1, Supplier<dxn> $$2) {
      return $$0.computeIfAbsent($$1, $$1x -> {
         dxn $$2x = $$2.get();

         for (dyp $$3 : $$1x.F()) {
            $$2x = $$2x.b($$3) ? $$2x.b($$3, $$1x.c($$3)) : $$2x;
         }

         return $$2x;
      });
   }
}
