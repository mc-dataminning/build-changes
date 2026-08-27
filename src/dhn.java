import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dhn extends dbx {
   public static final MapCodec<dhn> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dbc.c.d.fieldOf("precipitation").forGetter($$0x -> $$0x.j), jt.b.fieldOf("interactions").forGetter($$0x -> $$0x.c), u())
            .apply($$0, dhn::new)
   );
   public static final int e = 1;
   public static final int f = 3;
   public static final drh g = dqx.aK;
   private static final int h = 6;
   private static final double i = 3.0;
   private final dbc.c j;

   @Override
   public MapCodec<dhn> a() {
      return d;
   }

   public dhn(dbc.c $$0, jt.a $$1, dqg.d $$2) {
      super($$2, $$1);
      this.j = $$0;
      this.k(this.E.b().a(g, Integer.valueOf(1)));
   }

   @Override
   public boolean d(dqh $$0) {
      return $$0.c(g) == 3;
   }

   @Override
   protected boolean a(elz $$0) {
      return $$0 == emb.c && this.j == dbc.c.b;
   }

   @Override
   protected double b(dqh $$0) {
      return (6.0 + (double)$$0.c(g).intValue() * 3.0) / 16.0;
   }

   @Override
   protected void a(dqh $$0, dad $$1, in $$2, brh $$3) {
      if (!$$1.B && $$3.bO() && this.a($$0, $$2, $$3)) {
         $$3.aA();
         if ($$3.a($$1, $$2)) {
            this.e($$0, $$1, $$2);
         }
      }
   }

   private void e(dqh $$0, dad $$1, in $$2) {
      if (this.j == dbc.c.c) {
         d(ddg.fu.n().a(g, $$0.c(g)), $$1, $$2);
      } else {
         d($$0, $$1, $$2);
      }
   }

   public static void d(dqh $$0, dad $$1, in $$2) {
      int $$3 = $$0.c(g) - 1;
      dqh $$4 = $$3 == 0 ? ddg.ft.n() : $$0.a(g, Integer.valueOf($$3));
      $$1.b($$2, $$4);
      $$1.a(dva.c, $$2, dva.a.a($$4));
   }

   @Override
   public void a(dqh $$0, dad $$1, in $$2, dbc.c $$3) {
      if (ddz.a($$1, $$3) && $$0.c(g) != 3 && $$3 == this.j) {
         dqh $$4 = $$0.a(g);
         $$1.b($$2, $$4);
         $$1.a(dva.c, $$2, dva.a.a($$4));
      }
   }

   @Override
   protected int a(dqh $$0, dad $$1, in $$2) {
      return $$0.c(g);
   }

   @Override
   protected void a(dqi.a<dde, dqh> $$0) {
      $$0.a(g);
   }

   @Override
   protected void a(dqh $$0, dad $$1, in $$2, elz $$3) {
      if (!this.d($$0)) {
         dqh $$4 = $$0.a(g, Integer.valueOf($$0.c(g) + 1));
         $$1.b($$2, $$4);
         $$1.a(dva.c, $$2, dva.a.a($$4));
         $$1.c(1047, $$2, 0);
      }
   }
}
