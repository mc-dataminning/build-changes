import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dei extends cyt {
   public static final MapCodec<dei> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(cxy.c.d.fieldOf("precipitation").forGetter($$0x -> $$0x.j), ji.b.fieldOf("interactions").forGetter($$0x -> $$0x.c), u())
            .apply($$0, dei::new)
   );
   public static final int e = 1;
   public static final int f = 3;
   public static final dnz g = dnp.aK;
   private static final int h = 6;
   private static final double i = 3.0;
   private final cxy.c j;

   @Override
   public MapCodec<dei> a() {
      return d;
   }

   public dei(cxy.c $$0, ji.a $$1, dmy.d $$2) {
      super($$2, $$1);
      this.j = $$0;
      this.k(this.E.b().a(g, Integer.valueOf(1)));
   }

   @Override
   public boolean d(dmz $$0) {
      return $$0.c(g) == 3;
   }

   @Override
   protected boolean a(eim $$0) {
      return $$0 == eio.c && this.j == cxy.c.b;
   }

   @Override
   protected double b(dmz $$0) {
      return (6.0 + (double)$$0.c(g).intValue() * 3.0) / 16.0;
   }

   @Override
   protected void a(dmz $$0, cwz $$1, ib $$2, bow $$3) {
      if (!$$1.B && $$3.bN() && this.a($$0, $$2, $$3)) {
         $$3.aA();
         if ($$3.a($$1, $$2)) {
            this.e($$0, $$1, $$2);
         }
      }
   }

   private void e(dmz $$0, cwz $$1, ib $$2) {
      if (this.j == cxy.c.c) {
         d(dac.fu.o().a(g, $$0.c(g)), $$1, $$2);
      } else {
         d($$0, $$1, $$2);
      }
   }

   public static void d(dmz $$0, cwz $$1, ib $$2) {
      int $$3 = $$0.c(g) - 1;
      dmz $$4 = $$3 == 0 ? dac.ft.o() : $$0.a(g, Integer.valueOf($$3));
      $$1.b($$2, $$4);
      $$1.a(drn.c, $$2, drn.a.a($$4));
   }

   @Override
   public void a(dmz $$0, cwz $$1, ib $$2, cxy.c $$3) {
      if (dav.a($$1, $$3) && $$0.c(g) != 3 && $$3 == this.j) {
         dmz $$4 = $$0.a(g);
         $$1.b($$2, $$4);
         $$1.a(drn.c, $$2, drn.a.a($$4));
      }
   }

   @Override
   protected int a(dmz $$0, cwz $$1, ib $$2) {
      return $$0.c(g);
   }

   @Override
   protected void a(dna.a<daa, dmz> $$0) {
      $$0.a(g);
   }

   @Override
   protected void a(dmz $$0, cwz $$1, ib $$2, eim $$3) {
      if (!this.d($$0)) {
         dmz $$4 = $$0.a(g, Integer.valueOf($$0.c(g) + 1));
         $$1.b($$2, $$4);
         $$1.a(drn.c, $$2, drn.a.a($$4));
         $$1.c(1047, $$2, 0);
      }
   }
}
