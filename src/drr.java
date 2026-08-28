import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class drr extends dkd {
   public static final MapCodec<drr> a = b(drr::new);
   public static final int b = 8;
   public static final dyn c = dye.aI;
   protected static final fcl[] d = new fcl[]{
      fci.a(),
      dkd.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      dkd.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      dkd.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      dkd.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      dkd.a(0.0, 0.0, 0.0, 16.0, 10.0, 16.0),
      dkd.a(0.0, 0.0, 0.0, 16.0, 12.0, 16.0),
      dkd.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0),
      dkd.a(0.0, 0.0, 0.0, 16.0, 16.0, 16.0)
   };
   public static final int e = 5;

   @Override
   public MapCodec<drr> a() {
      return a;
   }

   protected drr(dxn.d $$0) {
      super($$0);
      this.l(this.F.b().b(c, Integer.valueOf(1)));
   }

   @Override
   protected boolean a(dxo $$0, euf $$1) {
      switch ($$1) {
         case a:
            return $$0.c(c) < 5;
         case b:
            return false;
         case c:
            return false;
         default:
            return false;
      }
   }

   @Override
   protected fcl a(dxo $$0, dge $$1, jh $$2, fbw $$3) {
      return d[$$0.c(c)];
   }

   @Override
   protected fcl b(dxo $$0, dge $$1, jh $$2, fbw $$3) {
      return d[$$0.c(c) - 1];
   }

   @Override
   protected fcl b_(dxo $$0, dge $$1, jh $$2) {
      return d[$$0.c(c)];
   }

   @Override
   protected fcl c(dxo $$0, dge $$1, jh $$2, fbw $$3) {
      return d[$$0.c(c)];
   }

   @Override
   protected boolean g_(dxo $$0) {
      return true;
   }

   @Override
   protected float c(dxo $$0, dge $$1, jh $$2) {
      return $$0.c(c) == 8 ? 0.2F : 1.0F;
   }

   @Override
   protected boolean a(dxo $$0, dhc $$1, jh $$2) {
      dxo $$3 = $$1.a_($$2.e());
      if ($$3.a(axk.cr)) {
         return false;
      } else {
         return $$3.a(axk.cs) ? true : dkd.a($$3.g($$1, $$2.e()), jm.b) || $$3.a(this) && $$3.c(c) == 8;
      }
   }

   @Override
   protected dxo a(dxo $$0, dhc $$1, dho $$2, jh $$3, jm $$4, jh $$5, dxo $$6, bac $$7) {
      return !$$0.a($$1, $$3) ? dkf.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void b(dxo $$0, arx $$1, jh $$2, bac $$3) {
      if ($$1.a(dhi.b, $$2) > 11) {
         c($$0, $$1, $$2);
         $$1.a($$2, false);
      }
   }

   @Override
   protected boolean a(dxo $$0, dax $$1) {
      int $$2 = $$0.c(c);
      if (!$$1.n().a(this.j()) || $$2 >= 8) {
         return $$2 == 1;
      } else {
         return $$1.c() ? $$1.k() == jm.b : true;
      }
   }

   @Nullable
   @Override
   public dxo a(dax $$0) {
      dxo $$1 = $$0.q().a_($$0.a());
      if ($$1.a(this)) {
         int $$2 = $$1.c(c);
         return $$1.b(c, Integer.valueOf(Math.min(8, $$2 + 1)));
      } else {
         return super.a($$0);
      }
   }

   @Override
   protected void a(dxp.a<dkd, dxo> $$0) {
      $$0.a(c);
   }
}
