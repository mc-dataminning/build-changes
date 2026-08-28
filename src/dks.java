import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dks extends dnj implements djo {
   public static final MapCodec<dks> a = b(dks::new);
   public static final int b = 2;
   public static final dxv c = dxm.au;
   protected static final int d = 4;
   protected static final int e = 5;
   protected static final int f = 2;
   protected static final int g = 6;
   protected static final int h = 7;
   protected static final int i = 3;
   protected static final int j = 8;
   protected static final int k = 9;
   protected static final int l = 4;
   protected static final fbt[] m = new fbt[]{
      djl.a(11.0, 7.0, 6.0, 15.0, 12.0, 10.0), djl.a(9.0, 5.0, 5.0, 15.0, 12.0, 11.0), djl.a(7.0, 3.0, 4.0, 15.0, 12.0, 12.0)
   };
   protected static final fbt[] n = new fbt[]{
      djl.a(1.0, 7.0, 6.0, 5.0, 12.0, 10.0), djl.a(1.0, 5.0, 5.0, 7.0, 12.0, 11.0), djl.a(1.0, 3.0, 4.0, 9.0, 12.0, 12.0)
   };
   protected static final fbt[] o = new fbt[]{
      djl.a(6.0, 7.0, 1.0, 10.0, 12.0, 5.0), djl.a(5.0, 5.0, 1.0, 11.0, 12.0, 7.0), djl.a(4.0, 3.0, 1.0, 12.0, 12.0, 9.0)
   };
   protected static final fbt[] G = new fbt[]{
      djl.a(6.0, 7.0, 11.0, 10.0, 12.0, 15.0), djl.a(5.0, 5.0, 9.0, 11.0, 12.0, 15.0), djl.a(4.0, 3.0, 7.0, 12.0, 12.0, 15.0)
   };

   @Override
   public MapCodec<dks> a() {
      return a;
   }

   public dks(dwv.d $$0) {
      super($$0);
      this.l(this.F.b().b(aF, jn.c).b(c, Integer.valueOf(0)));
   }

   @Override
   protected boolean f(dww $$0) {
      return $$0.c(c) < 2;
   }

   @Override
   protected void b(dww $$0, ard $$1, ji $$2, azh $$3) {
      if ($$1.A.a(5) == 0) {
         int $$4 = $$0.c(c);
         if ($$4 < 2) {
            $$1.a($$2, $$0.b(c, Integer.valueOf($$4 + 1)), 2);
         }
      }
   }

   @Override
   protected boolean a(dww $$0, dgk $$1, ji $$2) {
      dww $$3 = $$1.a_($$2.a($$0.c(aF)));
      return $$3.a(awp.B);
   }

   @Override
   protected fbt a(dww $$0, dfm $$1, ji $$2, fbe $$3) {
      int $$4 = $$0.c(c);
      switch ((jn)$$0.c(aF)) {
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
   public dww a(daf $$0) {
      dww $$1 = this.m();
      dgk $$2 = $$0.q();
      ji $$3 = $$0.a();

      for (jn $$4 : $$0.f()) {
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
   protected dww a(dww $$0, dgk $$1, dgw $$2, ji $$3, jn $$4, ji $$5, dww $$6, azh $$7) {
      return $$4 == $$0.c(aF) && !$$0.a($$1, $$3) ? djn.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public boolean a(dgk $$0, ji $$1, dww $$2) {
      return $$2.c(c) < 2;
   }

   @Override
   public boolean a(dgh $$0, azh $$1, ji $$2, dww $$3) {
      return true;
   }

   @Override
   public void a(ard $$0, azh $$1, ji $$2, dww $$3) {
      $$0.a($$2, $$3.b(c, Integer.valueOf($$3.c(c) + 1)), 2);
   }

   @Override
   protected void a(dwx.a<djl, dww> $$0) {
      $$0.a(aF, c);
   }

   @Override
   protected boolean a(dww $$0, etn $$1) {
      return false;
   }
}
