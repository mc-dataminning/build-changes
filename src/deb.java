import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class deb extends dhx {
   public static final MapCodec<deb> a = b(deb::new);
   public static final dsy b = dix.aE;
   private static final ewm c = dfb.a(2.0, 0.0, 2.0, 14.0, 4.0, 14.0);
   private static final ewm d = dfb.a(3.0, 4.0, 4.0, 13.0, 5.0, 12.0);
   private static final ewm e = dfb.a(4.0, 5.0, 6.0, 12.0, 10.0, 10.0);
   private static final ewm f = dfb.a(0.0, 10.0, 3.0, 16.0, 16.0, 13.0);
   private static final ewm g = dfb.a(4.0, 4.0, 3.0, 12.0, 5.0, 13.0);
   private static final ewm h = dfb.a(6.0, 5.0, 4.0, 10.0, 10.0, 12.0);
   private static final ewm i = dfb.a(3.0, 10.0, 0.0, 13.0, 16.0, 16.0);
   private static final ewm j = ewj.a(c, d, e, f);
   private static final ewm k = ewj.a(c, g, h, i);
   private static final xp l = xp.c("container.repair");
   private static final float m = 2.0F;
   private static final int n = 40;

   @Override
   public MapCodec<deb> a() {
      return a;
   }

   public deb(dsd.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, je.c));
   }

   @Override
   public dse a(cyc $$0) {
      return this.o().a(b, $$0.g().h());
   }

   @Override
   protected bqw a(dse $$0, dca $$1, iz $$2, cmz $$3, evp $$4) {
      if ($$1.B) {
         return bqw.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(awk.aC);
         return bqw.c;
      }
   }

   @Nullable
   @Override
   protected bra b(dse $$0, dca $$1, iz $$2) {
      return new brg(($$2x, $$3, $$4) -> new cpy($$2x, $$3, cqh.a($$1, $$2)), l);
   }

   @Override
   protected ewm a(dse $$0, dbg $$1, iz $$2, evy $$3) {
      je $$4 = $$0.c(b);
      return $$4.o() == je.a.a ? j : k;
   }

   @Override
   protected void a(cji $$0) {
      $$0.b(2.0F, 40);
   }

   @Override
   public void a(dca $$0, iz $$1, dse $$2, dse $$3, cji $$4) {
      if (!$$4.aW()) {
         $$0.c(1031, $$1, 0);
      }
   }

   @Override
   public void a(dca $$0, iz $$1, cji $$2) {
      if (!$$2.aW()) {
         $$0.c(1029, $$1, 0);
      }
   }

   @Override
   public brp a(bsw $$0) {
      return $$0.dQ().b($$0);
   }

   @Nullable
   public static dse e(dse $$0) {
      if ($$0.a(dfd.gS)) {
         return dfd.gT.o().a(b, $$0.c(b));
      } else {
         return $$0.a(dfd.gT) ? dfd.gU.o().a(b, $$0.c(b)) : null;
      }
   }

   @Override
   protected dse a(dse $$0, dlo $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected void a(dsf.a<dfb, dse> $$0) {
      $$0.a(b);
   }

   @Override
   protected boolean a(dse $$0, eom $$1) {
      return false;
   }

   @Override
   public int b(dse $$0, dbg $$1, iz $$2) {
      return $$0.d($$1, $$2).ak;
   }
}
