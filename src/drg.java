import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.function.Supplier;

public class drg extends dnc {
   public static final MapCodec<drg> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(mg.e.q().fieldOf("host").forGetter(drg::b), t()).apply($$0, drg::new));
   private final dnc b;
   private static final Map<dnc, dnc> c = Maps.newIdentityHashMap();
   private static final Map<ebe, ebe> d = Maps.newIdentityHashMap();
   private static final Map<ebe, ebe> e = Maps.newIdentityHashMap();

   @Override
   public MapCodec<? extends drg> a() {
      return a;
   }

   public drg(dnc $$0, ebd.d $$1) {
      super($$1.e($$0.x() / 2.0F).f(0.75F));
      this.b = $$0;
      c.put($$0, this);
   }

   public dnc b() {
      return this.b;
   }

   public static boolean o(ebe $$0) {
      return c.containsKey($$0.b());
   }

   private void a(ars $$0, iv $$1) {
      cpg $$2 = bxc.bf.a($$0, bxb.k);
      if ($$2 != null) {
         $$2.b((double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, 0.0F, 0.0F);
         $$0.b($$2);
         $$2.U();
      }
   }

   @Override
   protected void a(ebe $$0, ars $$1, iv $$2, czy $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$1.O().c(djt.i) && !dgn.a($$3, axg.t)) {
         this.a($$1, $$2);
      }
   }

   public static ebe p(ebe $$0) {
      return a(d, $$0, () -> c.get($$0.b()).m());
   }

   public ebe q(ebe $$0) {
      return a(e, $$0, () -> this.b().m());
   }

   private static ebe a(Map<ebe, ebe> $$0, ebe $$1, Supplier<ebe> $$2) {
      return $$0.computeIfAbsent($$1, $$1x -> {
         ebe $$2x = $$2.get();

         for (ech $$3 : $$1x.F()) {
            $$2x = $$2x.b($$3) ? $$2x.b($$3, $$1x.c($$3)) : $$2x;
         }

         return $$2x;
      });
   }
}
