import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.function.Supplier;

public class dhx extends ddy {
   public static final MapCodec<dhx> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(le.e.q().fieldOf("host").forGetter(dhx::b), u()).apply($$0, dhx::new));
   private final ddy b;
   private static final Map<ddy, ddy> c = Maps.newIdentityHashMap();
   private static final Map<drb, drb> d = Maps.newIdentityHashMap();
   private static final Map<drb, drb> e = Maps.newIdentityHashMap();

   @Override
   public MapCodec<? extends dhx> a() {
      return a;
   }

   public dhx(ddy $$0, dra.d $$1) {
      super($$1.e($$0.x() / 2.0F).f(0.75F));
      this.b = $$0;
      c.put($$0, this);
   }

   public ddy b() {
      return this.b;
   }

   public static boolean m(drb $$0) {
      return c.containsKey($$0.b());
   }

   private void a(aqm $$0, io $$1) {
      cjj $$2 = bsa.aM.a((dax)$$0);
      if ($$2 != null) {
         $$2.b((double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, 0.0F, 0.0F);
         $$0.b($$2);
         $$2.Q();
      }
   }

   @Override
   protected void a(drb $$0, aqm $$1, io $$2, cto $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$1.aa().b(dat.h) && cza.a(czc.v, $$3) == 0) {
         this.a($$1, $$2);
      }
   }

   public static drb n(drb $$0) {
      return a(d, $$0, () -> c.get($$0.b()).n());
   }

   public drb o(drb $$0) {
      return a(e, $$0, () -> this.b().n());
   }

   private static drb a(Map<drb, drb> $$0, drb $$1, Supplier<drb> $$2) {
      return $$0.computeIfAbsent($$1, $$1x -> {
         drb $$2x = $$2.get();

         for (dse $$3 : $$1x.B()) {
            $$2x = $$2x.b($$3) ? $$2x.a($$3, $$1x.c($$3)) : $$2x;
         }

         return $$2x;
      });
   }
}
