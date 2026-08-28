import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class djd extends ddn {
   public static final MapCodec<djd> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dcs.c.d.fieldOf("precipitation").forGetter($$0x -> $$0x.j), kf.b.fieldOf("interactions").forGetter($$0x -> $$0x.c), u())
            .apply($$0, djd::new)
   );
   public static final int e = 1;
   public static final int f = 3;
   public static final dsx g = dsn.aK;
   private static final int h = 6;
   private static final double i = 3.0;
   private final dcs.c j;

   @Override
   public MapCodec<djd> a() {
      return d;
   }

   public djd(dcs.c $$0, kf.a $$1, drw.d $$2) {
      super($$2, $$1);
      this.j = $$0;
      this.k(this.E.b().a(g, Integer.valueOf(1)));
   }

   @Override
   public boolean d(drx $$0) {
      return $$0.c(g) == 3;
   }

   @Override
   protected boolean a(enp $$0) {
      return $$0 == enr.c && this.j == dcs.c.b;
   }

   @Override
   protected double b(drx $$0) {
      return (6.0 + (double)$$0.c(g).intValue() * 3.0) / 16.0;
   }

   @Override
   protected void a(drx $$0, dbt $$1, iz $$2, bsp $$3) {
      if (!$$1.B && $$3.bQ() && this.a($$0, $$2, $$3)) {
         $$3.aC();
         if ($$3.a($$1, $$2)) {
            this.e($$0, $$1, $$2);
         }
      }
   }

   private void e(drx $$0, dbt $$1, iz $$2) {
      if (this.j == dcs.c.c) {
         d(dew.fu.n().a(g, $$0.c(g)), $$1, $$2);
      } else {
         d($$0, $$1, $$2);
      }
   }

   public static void d(drx $$0, dbt $$1, iz $$2) {
      int $$3 = $$0.c(g) - 1;
      drx $$4 = $$3 == 0 ? dew.ft.n() : $$0.a(g, Integer.valueOf($$3));
      $$1.b($$2, $$4);
      $$1.a(dwq.c, $$2, dwq.a.a($$4));
   }

   @Override
   public void a(drx $$0, dbt $$1, iz $$2, dcs.c $$3) {
      if (dfp.a($$1, $$3) && $$0.c(g) != 3 && $$3 == this.j) {
         drx $$4 = $$0.a(g);
         $$1.b($$2, $$4);
         $$1.a(dwq.c, $$2, dwq.a.a($$4));
      }
   }

   @Override
   protected int a(drx $$0, dbt $$1, iz $$2) {
      return $$0.c(g);
   }

   @Override
   protected void a(dry.a<deu, drx> $$0) {
      $$0.a(g);
   }

   @Override
   protected void a(drx $$0, dbt $$1, iz $$2, enp $$3) {
      if (!this.d($$0)) {
         drx $$4 = $$0.a(g, Integer.valueOf($$0.c(g) + 1));
         $$1.b($$2, $$4);
         $$1.a(dwq.c, $$2, dwq.a.a($$4));
         $$1.c(1047, $$2, 0);
      }
   }
}
