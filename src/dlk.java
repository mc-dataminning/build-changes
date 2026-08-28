import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dlk extends dob implements dkg {
   public static final MapCodec<dlk> a = b(dlk::new);
   public static final int b = 2;
   public static final dyn c = dye.au;
   protected static final int d = 4;
   protected static final int e = 5;
   protected static final int f = 2;
   protected static final int g = 6;
   protected static final int h = 7;
   protected static final int i = 3;
   protected static final int j = 8;
   protected static final int k = 9;
   protected static final int l = 4;
   protected static final fcl[] m = new fcl[]{
      dkd.a(11.0, 7.0, 6.0, 15.0, 12.0, 10.0), dkd.a(9.0, 5.0, 5.0, 15.0, 12.0, 11.0), dkd.a(7.0, 3.0, 4.0, 15.0, 12.0, 12.0)
   };
   protected static final fcl[] n = new fcl[]{
      dkd.a(1.0, 7.0, 6.0, 5.0, 12.0, 10.0), dkd.a(1.0, 5.0, 5.0, 7.0, 12.0, 11.0), dkd.a(1.0, 3.0, 4.0, 9.0, 12.0, 12.0)
   };
   protected static final fcl[] o = new fcl[]{
      dkd.a(6.0, 7.0, 1.0, 10.0, 12.0, 5.0), dkd.a(5.0, 5.0, 1.0, 11.0, 12.0, 7.0), dkd.a(4.0, 3.0, 1.0, 12.0, 12.0, 9.0)
   };
   protected static final fcl[] G = new fcl[]{
      dkd.a(6.0, 7.0, 11.0, 10.0, 12.0, 15.0), dkd.a(5.0, 5.0, 9.0, 11.0, 12.0, 15.0), dkd.a(4.0, 3.0, 7.0, 12.0, 12.0, 15.0)
   };

   @Override
   public MapCodec<dlk> a() {
      return a;
   }

   public dlk(dxn.d $$0) {
      super($$0);
      this.l(this.F.b().b(aF, jm.c).b(c, Integer.valueOf(0)));
   }

   @Override
   protected boolean f(dxo $$0) {
      return $$0.c(c) < 2;
   }

   @Override
   protected void b(dxo $$0, arx $$1, jh $$2, bac $$3) {
      if ($$1.A.a(5) == 0) {
         int $$4 = $$0.c(c);
         if ($$4 < 2) {
            $$1.a($$2, $$0.b(c, Integer.valueOf($$4 + 1)), 2);
         }
      }
   }

   @Override
   protected boolean a(dxo $$0, dhc $$1, jh $$2) {
      dxo $$3 = $$1.a_($$2.a($$0.c(aF)));
      return $$3.a(axk.B);
   }

   @Override
   protected fcl a(dxo $$0, dge $$1, jh $$2, fbw $$3) {
      int $$4 = $$0.c(c);
      switch ((jm)$$0.c(aF)) {
         case d:
            return G[$$4];
         case c:
         default:
            return o[$$4];
         case e:
            return n[$$4];
         case f:
            return m[$$4];
      }
   }

   @Nullable
   @Override
   public dxo a(dax $$0) {
      dxo $$1 = this.m();
      dhc $$2 = $$0.q();
      jh $$3 = $$0.a();

      for (jm $$4 : $$0.f()) {
         if ($$4.o().d()) {
            $$1 = $$1.b(aF, $$4);
            if ($$1.a($$2, $$3)) {
               return $$1;
            }
         }
      }

      return null;
   }

   @Override
   protected dxo a(dxo $$0, dhc $$1, dho $$2, jh $$3, jm $$4, jh $$5, dxo $$6, bac $$7) {
      return $$4 == $$0.c(aF) && !$$0.a($$1, $$3) ? dkf.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public boolean b(dhc $$0, jh $$1, dxo $$2) {
      return $$2.c(c) < 2;
   }

   @Override
   public boolean a(dgz $$0, bac $$1, jh $$2, dxo $$3) {
      return true;
   }

   @Override
   public void a(arx $$0, bac $$1, jh $$2, dxo $$3) {
      $$0.a($$2, $$3.b(c, Integer.valueOf($$3.c(c) + 1)), 2);
   }

   @Override
   protected void a(dxp.a<dkd, dxo> $$0) {
      $$0.a(aF, c);
   }

   @Override
   protected boolean a(dxo $$0, euf $$1) {
      return false;
   }
}
