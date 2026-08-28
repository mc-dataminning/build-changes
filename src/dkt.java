import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dkt extends dnk implements djp {
   public static final MapCodec<dkt> a = b(dkt::new);
   public static final int b = 2;
   public static final dxw c = dxn.au;
   protected static final int d = 4;
   protected static final int e = 5;
   protected static final int f = 2;
   protected static final int g = 6;
   protected static final int h = 7;
   protected static final int i = 3;
   protected static final int j = 8;
   protected static final int k = 9;
   protected static final int l = 4;
   protected static final fbu[] m = new fbu[]{
      djm.a(11.0, 7.0, 6.0, 15.0, 12.0, 10.0), djm.a(9.0, 5.0, 5.0, 15.0, 12.0, 11.0), djm.a(7.0, 3.0, 4.0, 15.0, 12.0, 12.0)
   };
   protected static final fbu[] n = new fbu[]{
      djm.a(1.0, 7.0, 6.0, 5.0, 12.0, 10.0), djm.a(1.0, 5.0, 5.0, 7.0, 12.0, 11.0), djm.a(1.0, 3.0, 4.0, 9.0, 12.0, 12.0)
   };
   protected static final fbu[] o = new fbu[]{
      djm.a(6.0, 7.0, 1.0, 10.0, 12.0, 5.0), djm.a(5.0, 5.0, 1.0, 11.0, 12.0, 7.0), djm.a(4.0, 3.0, 1.0, 12.0, 12.0, 9.0)
   };
   protected static final fbu[] G = new fbu[]{
      djm.a(6.0, 7.0, 11.0, 10.0, 12.0, 15.0), djm.a(5.0, 5.0, 9.0, 11.0, 12.0, 15.0), djm.a(4.0, 3.0, 7.0, 12.0, 12.0, 15.0)
   };

   @Override
   public MapCodec<dkt> a() {
      return a;
   }

   public dkt(dww.d $$0) {
      super($$0);
      this.l(this.F.b().b(aF, jn.c).b(c, Integer.valueOf(0)));
   }

   @Override
   protected boolean f(dwx $$0) {
      return $$0.c(c) < 2;
   }

   @Override
   protected void b(dwx $$0, arc $$1, ji $$2, azh $$3) {
      if ($$1.A.a(5) == 0) {
         int $$4 = $$0.c(c);
         if ($$4 < 2) {
            $$1.a($$2, $$0.b(c, Integer.valueOf($$4 + 1)), 2);
         }
      }
   }

   @Override
   protected boolean a(dwx $$0, dgl $$1, ji $$2) {
      dwx $$3 = $$1.a_($$2.a($$0.c(aF)));
      return $$3.a(awp.B);
   }

   @Override
   protected fbu a(dwx $$0, dfn $$1, ji $$2, fbf $$3) {
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
   public dwx a(dag $$0) {
      dwx $$1 = this.m();
      dgl $$2 = $$0.q();
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
   protected dwx a(dwx $$0, dgl $$1, dgx $$2, ji $$3, jn $$4, ji $$5, dwx $$6, azh $$7) {
      return $$4 == $$0.c(aF) && !$$0.a($$1, $$3) ? djo.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public boolean a(dgl $$0, ji $$1, dwx $$2) {
      return $$2.c(c) < 2;
   }

   @Override
   public boolean a(dgi $$0, azh $$1, ji $$2, dwx $$3) {
      return true;
   }

   @Override
   public void a(arc $$0, azh $$1, ji $$2, dwx $$3) {
      $$0.a($$2, $$3.b(c, Integer.valueOf($$3.c(c) + 1)), 2);
   }

   @Override
   protected void a(dwy.a<djm, dwx> $$0) {
      $$0.a(aF, c);
   }

   @Override
   protected boolean a(dwx $$0, eto $$1) {
      return false;
   }
}
