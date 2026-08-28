import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dmy extends dhj {
   public static final MapCodec<dmy> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dgo.c.d.fieldOf("precipitation").forGetter($$0x -> $$0x.j), kn.b.fieldOf("interactions").forGetter($$0x -> $$0x.c), t())
            .apply($$0, dmy::new)
   );
   public static final int e = 1;
   public static final int f = 3;
   public static final dwu g = dwl.aK;
   private static final int h = 6;
   private static final double i = 3.0;
   private final dgo.c j;

   @Override
   public MapCodec<dmy> a() {
      return d;
   }

   public dmy(dgo.c $$0, kn.a $$1, dvu.d $$2) {
      super($$2, $$1);
      this.j = $$0;
      this.l(this.F.b().b(g, Integer.valueOf(1)));
   }

   @Override
   public boolean d(dvv $$0) {
      return $$0.c(g) == 3;
   }

   @Override
   protected boolean a(eru $$0) {
      return $$0 == erw.c && this.j == dgo.c.b;
   }

   @Override
   protected double b(dvv $$0) {
      return (6.0 + (double)$$0.c(g).intValue() * 3.0) / 16.0;
   }

   @Override
   protected void a(dvv $$0, dfm $$1, jh $$2, bul $$3) {
      if ($$1 instanceof arp $$4 && $$3.bY() && this.a($$0, $$2, $$3)) {
         $$3.aH();
         if ($$3.c($$4, $$2)) {
            this.f($$0, $$1, $$2);
         }
      }
   }

   private void f(dvv $$0, dfm $$1, jh $$2) {
      if (this.j == dgo.c.c) {
         e(dis.fu.m().b(g, $$0.c(g)), $$1, $$2);
      } else {
         e($$0, $$1, $$2);
      }
   }

   public static void e(dvv $$0, dfm $$1, jh $$2) {
      int $$3 = $$0.c(g) - 1;
      dvv $$4 = $$3 == 0 ? dis.ft.m() : $$0.b(g, Integer.valueOf($$3));
      $$1.b($$2, $$4);
      $$1.a(ear.c, $$2, ear.a.a($$4));
   }

   @Override
   public void a(dvv $$0, dfm $$1, jh $$2, dgo.c $$3) {
      if (djl.a($$1, $$3) && $$0.c(g) != 3 && $$3 == this.j) {
         dvv $$4 = $$0.a(g);
         $$1.b($$2, $$4);
         $$1.a(ear.c, $$2, ear.a.a($$4));
      }
   }

   @Override
   protected int a(dvv $$0, dfm $$1, jh $$2) {
      return $$0.c(g);
   }

   @Override
   protected void a(dvw.a<diq, dvv> $$0) {
      $$0.a(g);
   }

   @Override
   protected void a(dvv $$0, dfm $$1, jh $$2, eru $$3) {
      if (!this.d($$0)) {
         dvv $$4 = $$0.b(g, Integer.valueOf($$0.c(g) + 1));
         $$1.b($$2, $$4);
         $$1.a(ear.c, $$2, ear.a.a($$4));
         $$1.c(1047, $$2, 0);
      }
   }
}
