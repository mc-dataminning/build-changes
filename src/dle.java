import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dle extends dfo {
   public static final MapCodec<dle> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(det.c.d.fieldOf("precipitation").forGetter($$0x -> $$0x.j), kk.b.fieldOf("interactions").forGetter($$0x -> $$0x.c), u())
            .apply($$0, dle::new)
   );
   public static final int e = 1;
   public static final int f = 3;
   public static final dva g = duq.aK;
   private static final int h = 6;
   private static final double i = 3.0;
   private final det.c j;

   @Override
   public MapCodec<dle> a() {
      return d;
   }

   public dle(det.c $$0, kk.a $$1, dtz.d $$2) {
      super($$2, $$1);
      this.j = $$0;
      this.l(this.E.b().b(g, Integer.valueOf(1)));
   }

   @Override
   public boolean d(dua $$0) {
      return $$0.c(g) == 3;
   }

   @Override
   protected boolean a(eqa $$0) {
      return $$0 == eqc.c && this.j == det.c.b;
   }

   @Override
   protected double b(dua $$0) {
      return (6.0 + (double)$$0.c(g).intValue() * 3.0) / 16.0;
   }

   @Override
   protected void a(dua $$0, dds $$1, je $$2, btj $$3) {
      if (!$$1.B && $$3.bV() && this.a($$0, $$2, $$3)) {
         $$3.aF();
         if ($$3.a($$1, $$2)) {
            this.e($$0, $$1, $$2);
         }
      }
   }

   private void e(dua $$0, dds $$1, je $$2) {
      if (this.j == det.c.c) {
         d(dgx.fu.o().b(g, $$0.c(g)), $$1, $$2);
      } else {
         d($$0, $$1, $$2);
      }
   }

   public static void d(dua $$0, dds $$1, je $$2) {
      int $$3 = $$0.c(g) - 1;
      dua $$4 = $$3 == 0 ? dgx.ft.o() : $$0.b(g, Integer.valueOf($$3));
      $$1.b($$2, $$4);
      $$1.a(dyx.c, $$2, dyx.a.a($$4));
   }

   @Override
   public void a(dua $$0, dds $$1, je $$2, det.c $$3) {
      if (dhq.a($$1, $$3) && $$0.c(g) != 3 && $$3 == this.j) {
         dua $$4 = $$0.a(g);
         $$1.b($$2, $$4);
         $$1.a(dyx.c, $$2, dyx.a.a($$4));
      }
   }

   @Override
   protected int a(dua $$0, dds $$1, je $$2) {
      return $$0.c(g);
   }

   @Override
   protected void a(dub.a<dgv, dua> $$0) {
      $$0.a(g);
   }

   @Override
   protected void a(dua $$0, dds $$1, je $$2, eqa $$3) {
      if (!this.d($$0)) {
         dua $$4 = $$0.b(g, Integer.valueOf($$0.c(g) + 1));
         $$1.b($$2, $$4);
         $$1.a(dyx.c, $$2, dyx.a.a($$4));
         $$1.c(1047, $$2, 0);
      }
   }
}
