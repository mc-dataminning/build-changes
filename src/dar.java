import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dar extends cvc {
   public static final MapCodec<dar> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(cuh.c.d.fieldOf("precipitation").forGetter($$0x -> $$0x.j), jd.b.fieldOf("interactions").forGetter($$0x -> $$0x.c), u())
            .apply($$0, dar::new)
   );
   public static final int e = 1;
   public static final int f = 3;
   public static final dka g = djq.aK;
   private static final int h = 6;
   private static final double i = 3.0;
   private final cuh.c j;

   @Override
   public MapCodec<dar> a() {
      return d;
   }

   public dar(cuh.c $$0, jd.a $$1, diz.d $$2) {
      super($$2, $$1);
      this.j = $$0;
      this.k(this.E.b().a(g, Integer.valueOf(1)));
   }

   @Override
   public boolean d(dja $$0) {
      return $$0.c(g) == 3;
   }

   @Override
   protected boolean a(eej $$0) {
      return $$0 == eel.c && this.j == cuh.c.b;
   }

   @Override
   protected double b(dja $$0) {
      return (6.0 + (double)$$0.c(g).intValue() * 3.0) / 16.0;
   }

   @Override
   public void a(dja $$0, cti $$1, hx $$2, blp $$3) {
      if (!$$1.B && $$3.bN() && this.a($$0, $$2, $$3)) {
         $$3.aA();
         if ($$3.a($$1, $$2)) {
            this.e($$0, $$1, $$2);
         }
      }
   }

   private void e(dja $$0, cti $$1, hx $$2) {
      if (this.j == cuh.c.c) {
         d(cwl.fu.o().a(g, $$0.c(g)), $$1, $$2);
      } else {
         d($$0, $$1, $$2);
      }
   }

   public static void d(dja $$0, cti $$1, hx $$2) {
      int $$3 = $$0.c(g) - 1;
      dja $$4 = $$3 == 0 ? cwl.ft.o() : $$0.a(g, Integer.valueOf($$3));
      $$1.b($$2, $$4);
      $$1.a(dnk.c, $$2, dnk.a.a($$4));
   }

   @Override
   public void a(dja $$0, cti $$1, hx $$2, cuh.c $$3) {
      if (cxe.a($$1, $$3) && $$0.c(g) != 3 && $$3 == this.j) {
         dja $$4 = $$0.a(g);
         $$1.b($$2, $$4);
         $$1.a(dnk.c, $$2, dnk.a.a($$4));
      }
   }

   @Override
   public int a(dja $$0, cti $$1, hx $$2) {
      return $$0.c(g);
   }

   @Override
   protected void a(djb.a<cwj, dja> $$0) {
      $$0.a(g);
   }

   @Override
   protected void a(dja $$0, cti $$1, hx $$2, eej $$3) {
      if (!this.d($$0)) {
         dja $$4 = $$0.a(g, Integer.valueOf($$0.c(g) + 1));
         $$1.b($$2, $$4);
         $$1.a(dnk.c, $$2, dnk.a.a($$4));
         $$1.c(1047, $$2, 0);
      }
   }
}
