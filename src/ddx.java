import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class ddx extends dht {
   public static final MapCodec<ddx> a = b(ddx::new);
   public static final dsu b = dit.aE;
   private static final ewi c = dex.a(2.0, 0.0, 2.0, 14.0, 4.0, 14.0);
   private static final ewi d = dex.a(3.0, 4.0, 4.0, 13.0, 5.0, 12.0);
   private static final ewi e = dex.a(4.0, 5.0, 6.0, 12.0, 10.0, 10.0);
   private static final ewi f = dex.a(0.0, 10.0, 3.0, 16.0, 16.0, 13.0);
   private static final ewi g = dex.a(4.0, 4.0, 3.0, 12.0, 5.0, 13.0);
   private static final ewi h = dex.a(6.0, 5.0, 4.0, 10.0, 10.0, 12.0);
   private static final ewi i = dex.a(3.0, 10.0, 0.0, 13.0, 16.0, 16.0);
   private static final ewi j = ewf.a(c, d, e, f);
   private static final ewi k = ewf.a(c, g, h, i);
   private static final xo l = xo.c("container.repair");
   private static final float m = 2.0F;
   private static final int n = 40;

   @Override
   public MapCodec<ddx> a() {
      return a;
   }

   public ddx(drz.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, je.c));
   }

   @Override
   public dsa a(cxy $$0) {
      return this.o().a(b, $$0.g().h());
   }

   @Override
   protected bqs a(dsa $$0, dbw $$1, iz $$2, cmv $$3, evl $$4) {
      if ($$1.B) {
         return bqs.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(awj.aC);
         return bqs.c;
      }
   }

   @Nullable
   @Override
   protected bqw b(dsa $$0, dbw $$1, iz $$2) {
      return new brc(($$2x, $$3, $$4) -> new cpu($$2x, $$3, cqd.a($$1, $$2)), l);
   }

   @Override
   protected ewi a(dsa $$0, dbc $$1, iz $$2, evu $$3) {
      je $$4 = $$0.c(b);
      return $$4.o() == je.a.a ? j : k;
   }

   @Override
   protected void a(cje $$0) {
      $$0.b(2.0F, 40);
   }

   @Override
   public void a(dbw $$0, iz $$1, dsa $$2, dsa $$3, cje $$4) {
      if (!$$4.aW()) {
         $$0.c(1031, $$1, 0);
      }
   }

   @Override
   public void a(dbw $$0, iz $$1, cje $$2) {
      if (!$$2.aW()) {
         $$0.c(1029, $$1, 0);
      }
   }

   @Override
   public brl a(bss $$0) {
      return $$0.dQ().b($$0);
   }

   @Nullable
   public static dsa e(dsa $$0) {
      if ($$0.a(dez.gS)) {
         return dez.gT.o().a(b, $$0.c(b));
      } else {
         return $$0.a(dez.gT) ? dez.gU.o().a(b, $$0.c(b)) : null;
      }
   }

   @Override
   protected dsa a(dsa $$0, dlk $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected void a(dsb.a<dex, dsa> $$0) {
      $$0.a(b);
   }

   @Override
   protected boolean a(dsa $$0, eoi $$1) {
      return false;
   }

   @Override
   public int b(dsa $$0, dbc $$1, iz $$2) {
      return $$0.d($$1, $$2).ak;
   }
}
