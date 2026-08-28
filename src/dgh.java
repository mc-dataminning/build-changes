import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dgh extends diw implements dfd {
   public static final MapCodec<dgh> a = b(dgh::new);
   public static final int b = 2;
   public static final dtd c = dst.ar;
   protected static final int d = 4;
   protected static final int e = 5;
   protected static final int f = 2;
   protected static final int g = 6;
   protected static final int h = 7;
   protected static final int i = 3;
   protected static final int j = 8;
   protected static final int k = 9;
   protected static final int l = 4;
   protected static final ewl[] m = new ewl[]{
      dfa.a(11.0, 7.0, 6.0, 15.0, 12.0, 10.0), dfa.a(9.0, 5.0, 5.0, 15.0, 12.0, 11.0), dfa.a(7.0, 3.0, 4.0, 15.0, 12.0, 12.0)
   };
   protected static final ewl[] n = new ewl[]{
      dfa.a(1.0, 7.0, 6.0, 5.0, 12.0, 10.0), dfa.a(1.0, 5.0, 5.0, 7.0, 12.0, 11.0), dfa.a(1.0, 3.0, 4.0, 9.0, 12.0, 12.0)
   };
   protected static final ewl[] o = new ewl[]{
      dfa.a(6.0, 7.0, 1.0, 10.0, 12.0, 5.0), dfa.a(5.0, 5.0, 1.0, 11.0, 12.0, 7.0), dfa.a(4.0, 3.0, 1.0, 12.0, 12.0, 9.0)
   };
   protected static final ewl[] F = new ewl[]{
      dfa.a(6.0, 7.0, 11.0, 10.0, 12.0, 15.0), dfa.a(5.0, 5.0, 9.0, 11.0, 12.0, 15.0), dfa.a(4.0, 3.0, 7.0, 12.0, 12.0, 15.0)
   };

   @Override
   public MapCodec<dgh> a() {
      return a;
   }

   public dgh(dsc.d $$0) {
      super($$0);
      this.k(this.E.b().a(aE, je.c).a(c, Integer.valueOf(0)));
   }

   @Override
   protected boolean d_(dsd $$0) {
      return $$0.c(c) < 2;
   }

   @Override
   protected void b(dsd $$0, arf $$1, iz $$2, azh $$3) {
      if ($$1.z.a(5) == 0) {
         int $$4 = $$0.c(c);
         if ($$4 < 2) {
            $$1.a($$2, $$0.a(c, Integer.valueOf($$4 + 1)), 2);
         }
      }
   }

   @Override
   protected boolean a(dsd $$0, dcc $$1, iz $$2) {
      dsd $$3 = $$1.a_($$2.a($$0.c(aE)));
      return $$3.a(awp.z);
   }

   @Override
   protected ewl a(dsd $$0, dbf $$1, iz $$2, evx $$3) {
      int $$4 = $$0.c(c);
      switch ((je)$$0.c(aE)) {
         case d:
            return F[$$4];
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
   public dsd a(cyb $$0) {
      dsd $$1 = this.o();
      dcc $$2 = $$0.q();
      iz $$3 = $$0.a();

      for (je $$4 : $$0.f()) {
         if ($$4.o().d()) {
            $$1 = $$1.a(aE, $$4);
            if ($$1.a($$2, $$3)) {
               return $$1;
            }
         }
      }

      return null;
   }

   @Override
   protected dsd a(dsd $$0, je $$1, dsd $$2, dca $$3, iz $$4, iz $$5) {
      return $$1 == $$0.c(aE) && !$$0.a($$3, $$4) ? dfc.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean b(dcc $$0, iz $$1, dsd $$2) {
      return $$2.c(c) < 2;
   }

   @Override
   public boolean a(dbz $$0, azh $$1, iz $$2, dsd $$3) {
      return true;
   }

   @Override
   public void a(arf $$0, azh $$1, iz $$2, dsd $$3) {
      $$0.a($$2, $$3.a(c, Integer.valueOf($$3.c(c) + 1)), 2);
   }

   @Override
   protected void a(dse.a<dfa, dsd> $$0) {
      $$0.a(aE, c);
   }

   @Override
   protected boolean a(dsd $$0, eol $$1) {
      return false;
   }
}
