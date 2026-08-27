import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dek extends cyv {
   public static final MapCodec<dek> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(cya.c.d.fieldOf("precipitation").forGetter($$0x -> $$0x.j), ji.b.fieldOf("interactions").forGetter($$0x -> $$0x.c), u())
            .apply($$0, dek::new)
   );
   public static final int e = 1;
   public static final int f = 3;
   public static final dob g = dnr.aK;
   private static final int h = 6;
   private static final double i = 3.0;
   private final cya.c j;

   @Override
   public MapCodec<dek> a() {
      return d;
   }

   public dek(cya.c $$0, ji.a $$1, dna.d $$2) {
      super($$2, $$1);
      this.j = $$0;
      this.k(this.E.b().a(g, Integer.valueOf(1)));
   }

   @Override
   public boolean d(dnb $$0) {
      return $$0.c(g) == 3;
   }

   @Override
   protected boolean a(eio $$0) {
      return $$0 == eiq.c && this.j == cya.c.b;
   }

   @Override
   protected double b(dnb $$0) {
      return (6.0 + (double)$$0.c(g).intValue() * 3.0) / 16.0;
   }

   @Override
   protected void a(dnb $$0, cxb $$1, ib $$2, box $$3) {
      if (!$$1.B && $$3.bN() && this.a($$0, $$2, $$3)) {
         $$3.aA();
         if ($$3.a($$1, $$2)) {
            this.e($$0, $$1, $$2);
         }
      }
   }

   private void e(dnb $$0, cxb $$1, ib $$2) {
      if (this.j == cya.c.c) {
         d(dae.fu.o().a(g, $$0.c(g)), $$1, $$2);
      } else {
         d($$0, $$1, $$2);
      }
   }

   public static void d(dnb $$0, cxb $$1, ib $$2) {
      int $$3 = $$0.c(g) - 1;
      dnb $$4 = $$3 == 0 ? dae.ft.o() : $$0.a(g, Integer.valueOf($$3));
      $$1.b($$2, $$4);
      $$1.a(drp.c, $$2, drp.a.a($$4));
   }

   @Override
   public void a(dnb $$0, cxb $$1, ib $$2, cya.c $$3) {
      if (dax.a($$1, $$3) && $$0.c(g) != 3 && $$3 == this.j) {
         dnb $$4 = $$0.a(g);
         $$1.b($$2, $$4);
         $$1.a(drp.c, $$2, drp.a.a($$4));
      }
   }

   @Override
   protected int a(dnb $$0, cxb $$1, ib $$2) {
      return $$0.c(g);
   }

   @Override
   protected void a(dnc.a<dac, dnb> $$0) {
      $$0.a(g);
   }

   @Override
   protected void a(dnb $$0, cxb $$1, ib $$2, eio $$3) {
      if (!this.d($$0)) {
         dnb $$4 = $$0.a(g, Integer.valueOf($$0.c(g) + 1));
         $$1.b($$2, $$4);
         $$1.a(drp.c, $$2, drp.a.a($$4));
         $$1.c(1047, $$2, 0);
      }
   }
}
