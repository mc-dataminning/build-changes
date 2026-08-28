import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dlv extends dgf {
   public static final MapCodec<dlv> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dfk.c.d.fieldOf("precipitation").forGetter($$0x -> $$0x.j), kl.b.fieldOf("interactions").forGetter($$0x -> $$0x.c), t())
            .apply($$0, dlv::new)
   );
   public static final int e = 1;
   public static final int f = 3;
   public static final dvs g = dvi.aK;
   private static final int h = 6;
   private static final double i = 3.0;
   private final dfk.c j;

   @Override
   public MapCodec<dlv> a() {
      return d;
   }

   public dlv(dfk.c $$0, kl.a $$1, dur.d $$2) {
      super($$2, $$1);
      this.j = $$0;
      this.l(this.F.b().b(g, Integer.valueOf(1)));
   }

   @Override
   public boolean d(dus $$0) {
      return $$0.c(g) == 3;
   }

   @Override
   protected boolean a(eqs $$0) {
      return $$0 == equ.c && this.j == dfk.c.b;
   }

   @Override
   protected double b(dus $$0) {
      return (6.0 + (double)$$0.c(g).intValue() * 3.0) / 16.0;
   }

   @Override
   protected void a(dus $$0, dej $$1, jf $$2, btr $$3) {
      if (!$$1.B && $$3.bV() && this.a($$0, $$2, $$3)) {
         $$3.aF();
         if ($$3.a($$1, $$2)) {
            this.e($$0, $$1, $$2);
         }
      }
   }

   private void e(dus $$0, dej $$1, jf $$2) {
      if (this.j == dfk.c.c) {
         d(dho.fu.n().b(g, $$0.c(g)), $$1, $$2);
      } else {
         d($$0, $$1, $$2);
      }
   }

   public static void d(dus $$0, dej $$1, jf $$2) {
      int $$3 = $$0.c(g) - 1;
      dus $$4 = $$3 == 0 ? dho.ft.n() : $$0.b(g, Integer.valueOf($$3));
      $$1.b($$2, $$4);
      $$1.a(dzp.c, $$2, dzp.a.a($$4));
   }

   @Override
   public void a(dus $$0, dej $$1, jf $$2, dfk.c $$3) {
      if (dih.a($$1, $$3) && $$0.c(g) != 3 && $$3 == this.j) {
         dus $$4 = $$0.a(g);
         $$1.b($$2, $$4);
         $$1.a(dzp.c, $$2, dzp.a.a($$4));
      }
   }

   @Override
   protected int a(dus $$0, dej $$1, jf $$2) {
      return $$0.c(g);
   }

   @Override
   protected void a(dut.a<dhm, dus> $$0) {
      $$0.a(g);
   }

   @Override
   protected void a(dus $$0, dej $$1, jf $$2, eqs $$3) {
      if (!this.d($$0)) {
         dus $$4 = $$0.b(g, Integer.valueOf($$0.c(g) + 1));
         $$1.b($$2, $$4);
         $$1.a(dzp.c, $$2, dzp.a.a($$4));
         $$1.c(1047, $$2, 0);
      }
   }
}
