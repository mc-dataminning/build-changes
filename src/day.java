import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class day extends cvj {
   public static final MapCodec<day> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(cuo.c.d.fieldOf("precipitation").forGetter($$0x -> $$0x.j), jd.b.fieldOf("interactions").forGetter($$0x -> $$0x.c), u())
            .apply($$0, day::new)
   );
   public static final int e = 1;
   public static final int f = 3;
   public static final dkh g = djx.aK;
   private static final int h = 6;
   private static final double i = 3.0;
   private final cuo.c j;

   @Override
   public MapCodec<day> a() {
      return d;
   }

   public day(cuo.c $$0, jd.a $$1, djg.d $$2) {
      super($$2, $$1);
      this.j = $$0;
      this.k(this.E.b().a(g, Integer.valueOf(1)));
   }

   @Override
   public boolean d(djh $$0) {
      return $$0.c(g) == 3;
   }

   @Override
   protected boolean a(eeq $$0) {
      return $$0 == ees.c && this.j == cuo.c.b;
   }

   @Override
   protected double b(djh $$0) {
      return (6.0 + (double)$$0.c(g).intValue() * 3.0) / 16.0;
   }

   @Override
   public void a(djh $$0, ctp $$1, hx $$2, blv $$3) {
      if (!$$1.B && $$3.bN() && this.a($$0, $$2, $$3)) {
         $$3.aA();
         if ($$3.a($$1, $$2)) {
            this.e($$0, $$1, $$2);
         }
      }
   }

   private void e(djh $$0, ctp $$1, hx $$2) {
      if (this.j == cuo.c.c) {
         d(cws.fu.o().a(g, $$0.c(g)), $$1, $$2);
      } else {
         d($$0, $$1, $$2);
      }
   }

   public static void d(djh $$0, ctp $$1, hx $$2) {
      int $$3 = $$0.c(g) - 1;
      djh $$4 = $$3 == 0 ? cws.ft.o() : $$0.a(g, Integer.valueOf($$3));
      $$1.b($$2, $$4);
      $$1.a(dnr.c, $$2, dnr.a.a($$4));
   }

   @Override
   public void a(djh $$0, ctp $$1, hx $$2, cuo.c $$3) {
      if (cxl.a($$1, $$3) && $$0.c(g) != 3 && $$3 == this.j) {
         djh $$4 = $$0.a(g);
         $$1.b($$2, $$4);
         $$1.a(dnr.c, $$2, dnr.a.a($$4));
      }
   }

   @Override
   public int a(djh $$0, ctp $$1, hx $$2) {
      return $$0.c(g);
   }

   @Override
   protected void a(dji.a<cwq, djh> $$0) {
      $$0.a(g);
   }

   @Override
   protected void a(djh $$0, ctp $$1, hx $$2, eeq $$3) {
      if (!this.d($$0)) {
         djh $$4 = $$0.a(g, Integer.valueOf($$0.c(g) + 1));
         $$1.b($$2, $$4);
         $$1.a(dnr.c, $$2, dnr.a.a($$4));
         $$1.c(1047, $$2, 0);
      }
   }
}
