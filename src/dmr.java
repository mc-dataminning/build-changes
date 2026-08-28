import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dmr extends dhc {
   public static final MapCodec<dmr> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dgh.c.d.fieldOf("precipitation").forGetter($$0x -> $$0x.j), kn.b.fieldOf("interactions").forGetter($$0x -> $$0x.c), t())
            .apply($$0, dmr::new)
   );
   public static final int e = 1;
   public static final int f = 3;
   public static final dwn g = dwe.aK;
   private static final int h = 6;
   private static final double i = 3.0;
   private final dgh.c j;

   @Override
   public MapCodec<dmr> a() {
      return d;
   }

   public dmr(dgh.c $$0, kn.a $$1, dvn.d $$2) {
      super($$2, $$1);
      this.j = $$0;
      this.l(this.F.b().b(g, Integer.valueOf(1)));
   }

   @Override
   public boolean d(dvo $$0) {
      return $$0.c(g) == 3;
   }

   @Override
   protected boolean a(ern $$0) {
      return $$0 == erp.c && this.j == dgh.c.b;
   }

   @Override
   protected double b(dvo $$0) {
      return (6.0 + (double)$$0.c(g).intValue() * 3.0) / 16.0;
   }

   @Override
   protected void a(dvo $$0, dff $$1, jh $$2, bui $$3) {
      if (!$$1.C && $$3.ca() && this.a($$0, $$2, $$3)) {
         $$3.aJ();
         if ($$3.a($$1, $$2)) {
            this.f($$0, $$1, $$2);
         }
      }
   }

   private void f(dvo $$0, dff $$1, jh $$2) {
      if (this.j == dgh.c.c) {
         e(dil.fu.m().b(g, $$0.c(g)), $$1, $$2);
      } else {
         e($$0, $$1, $$2);
      }
   }

   public static void e(dvo $$0, dff $$1, jh $$2) {
      int $$3 = $$0.c(g) - 1;
      dvo $$4 = $$3 == 0 ? dil.ft.m() : $$0.b(g, Integer.valueOf($$3));
      $$1.b($$2, $$4);
      $$1.a(eak.c, $$2, eak.a.a($$4));
   }

   @Override
   public void a(dvo $$0, dff $$1, jh $$2, dgh.c $$3) {
      if (dje.a($$1, $$3) && $$0.c(g) != 3 && $$3 == this.j) {
         dvo $$4 = $$0.a(g);
         $$1.b($$2, $$4);
         $$1.a(eak.c, $$2, eak.a.a($$4));
      }
   }

   @Override
   protected int a(dvo $$0, dff $$1, jh $$2) {
      return $$0.c(g);
   }

   @Override
   protected void a(dvp.a<dij, dvo> $$0) {
      $$0.a(g);
   }

   @Override
   protected void a(dvo $$0, dff $$1, jh $$2, ern $$3) {
      if (!this.d($$0)) {
         dvo $$4 = $$0.b(g, Integer.valueOf($$0.c(g) + 1));
         $$1.b($$2, $$4);
         $$1.a(eak.c, $$2, eak.a.a($$4));
         $$1.c(1047, $$2, 0);
      }
   }
}
