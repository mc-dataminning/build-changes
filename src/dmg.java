import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dmg extends dgr {
   public static final MapCodec<dmg> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dfw.c.d.fieldOf("precipitation").forGetter($$0x -> $$0x.j), km.b.fieldOf("interactions").forGetter($$0x -> $$0x.c), t())
            .apply($$0, dmg::new)
   );
   public static final int e = 1;
   public static final int f = 3;
   public static final dwd g = dvt.aK;
   private static final int h = 6;
   private static final double i = 3.0;
   private final dfw.c j;

   @Override
   public MapCodec<dmg> a() {
      return d;
   }

   public dmg(dfw.c $$0, km.a $$1, dvc.d $$2) {
      super($$2, $$1);
      this.j = $$0;
      this.l(this.F.b().b(g, Integer.valueOf(1)));
   }

   @Override
   public boolean d(dvd $$0) {
      return $$0.c(g) == 3;
   }

   @Override
   protected boolean a(erd $$0) {
      return $$0 == erf.c && this.j == dfw.c.b;
   }

   @Override
   protected double b(dvd $$0) {
      return (6.0 + (double)$$0.c(g).intValue() * 3.0) / 16.0;
   }

   @Override
   protected void a(dvd $$0, dev $$1, jg $$2, btz $$3) {
      if (!$$1.C && $$3.bZ() && this.a($$0, $$2, $$3)) {
         $$3.aH();
         if ($$3.a($$1, $$2)) {
            this.f($$0, $$1, $$2);
         }
      }
   }

   private void f(dvd $$0, dev $$1, jg $$2) {
      if (this.j == dfw.c.c) {
         e(dia.fu.m().b(g, $$0.c(g)), $$1, $$2);
      } else {
         e($$0, $$1, $$2);
      }
   }

   public static void e(dvd $$0, dev $$1, jg $$2) {
      int $$3 = $$0.c(g) - 1;
      dvd $$4 = $$3 == 0 ? dia.ft.m() : $$0.b(g, Integer.valueOf($$3));
      $$1.b($$2, $$4);
      $$1.a(eaa.c, $$2, eaa.a.a($$4));
   }

   @Override
   public void a(dvd $$0, dev $$1, jg $$2, dfw.c $$3) {
      if (dit.a($$1, $$3) && $$0.c(g) != 3 && $$3 == this.j) {
         dvd $$4 = $$0.a(g);
         $$1.b($$2, $$4);
         $$1.a(eaa.c, $$2, eaa.a.a($$4));
      }
   }

   @Override
   protected int a(dvd $$0, dev $$1, jg $$2) {
      return $$0.c(g);
   }

   @Override
   protected void a(dve.a<dhy, dvd> $$0) {
      $$0.a(g);
   }

   @Override
   protected void a(dvd $$0, dev $$1, jg $$2, erd $$3) {
      if (!this.d($$0)) {
         dvd $$4 = $$0.b(g, Integer.valueOf($$0.c(g) + 1));
         $$1.b($$2, $$4);
         $$1.a(eaa.c, $$2, eaa.a.a($$4));
         $$1.c(1047, $$2, 0);
      }
   }
}
