import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dgf extends diu implements dfb {
   public static final MapCodec<dgf> a = b(dgf::new);
   public static final int b = 2;
   public static final dtb c = dsr.ar;
   protected static final int d = 4;
   protected static final int e = 5;
   protected static final int f = 2;
   protected static final int g = 6;
   protected static final int h = 7;
   protected static final int i = 3;
   protected static final int j = 8;
   protected static final int k = 9;
   protected static final int l = 4;
   protected static final ewj[] m = new ewj[]{
      dey.a(11.0, 7.0, 6.0, 15.0, 12.0, 10.0), dey.a(9.0, 5.0, 5.0, 15.0, 12.0, 11.0), dey.a(7.0, 3.0, 4.0, 15.0, 12.0, 12.0)
   };
   protected static final ewj[] n = new ewj[]{
      dey.a(1.0, 7.0, 6.0, 5.0, 12.0, 10.0), dey.a(1.0, 5.0, 5.0, 7.0, 12.0, 11.0), dey.a(1.0, 3.0, 4.0, 9.0, 12.0, 12.0)
   };
   protected static final ewj[] o = new ewj[]{
      dey.a(6.0, 7.0, 1.0, 10.0, 12.0, 5.0), dey.a(5.0, 5.0, 1.0, 11.0, 12.0, 7.0), dey.a(4.0, 3.0, 1.0, 12.0, 12.0, 9.0)
   };
   protected static final ewj[] F = new ewj[]{
      dey.a(6.0, 7.0, 11.0, 10.0, 12.0, 15.0), dey.a(5.0, 5.0, 9.0, 11.0, 12.0, 15.0), dey.a(4.0, 3.0, 7.0, 12.0, 12.0, 15.0)
   };

   @Override
   public MapCodec<dgf> a() {
      return a;
   }

   public dgf(dsa.d $$0) {
      super($$0);
      this.k(this.E.b().a(aE, je.c).a(c, Integer.valueOf(0)));
   }

   @Override
   protected boolean d_(dsb $$0) {
      return $$0.c(c) < 2;
   }

   @Override
   protected void b(dsb $$0, are $$1, iz $$2, azg $$3) {
      if ($$1.z.a(5) == 0) {
         int $$4 = $$0.c(c);
         if ($$4 < 2) {
            $$1.a($$2, $$0.a(c, Integer.valueOf($$4 + 1)), 2);
         }
      }
   }

   @Override
   protected boolean a(dsb $$0, dca $$1, iz $$2) {
      dsb $$3 = $$1.a_($$2.a($$0.c(aE)));
      return $$3.a(awo.z);
   }

   @Override
   protected ewj a(dsb $$0, dbd $$1, iz $$2, evv $$3) {
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
   public dsb a(cxz $$0) {
      dsb $$1 = this.o();
      dca $$2 = $$0.q();
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
   protected dsb a(dsb $$0, je $$1, dsb $$2, dby $$3, iz $$4, iz $$5) {
      return $$1 == $$0.c(aE) && !$$0.a($$3, $$4) ? dfa.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean b(dca $$0, iz $$1, dsb $$2) {
      return $$2.c(c) < 2;
   }

   @Override
   public boolean a(dbx $$0, azg $$1, iz $$2, dsb $$3) {
      return true;
   }

   @Override
   public void a(are $$0, azg $$1, iz $$2, dsb $$3) {
      $$0.a($$2, $$3.a(c, Integer.valueOf($$3.c(c) + 1)), 2);
   }

   @Override
   protected void a(dsc.a<dey, dsb> $$0) {
      $$0.a(aE, c);
   }

   @Override
   protected boolean a(dsb $$0, eoj $$1) {
      return false;
   }
}
