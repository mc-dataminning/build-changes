import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class czv extends dcj implements cyr {
   public static final MapCodec<czv> a = b(czv::new);
   public static final int b = 2;
   public static final dmf c = dlv.ar;
   protected static final int d = 4;
   protected static final int e = 5;
   protected static final int f = 2;
   protected static final int g = 6;
   protected static final int h = 7;
   protected static final int i = 3;
   protected static final int j = 8;
   protected static final int k = 9;
   protected static final int l = 4;
   protected static final eol[] m = new eol[]{
      cyo.a(11.0, 7.0, 6.0, 15.0, 12.0, 10.0), cyo.a(9.0, 5.0, 5.0, 15.0, 12.0, 11.0), cyo.a(7.0, 3.0, 4.0, 15.0, 12.0, 12.0)
   };
   protected static final eol[] n = new eol[]{
      cyo.a(1.0, 7.0, 6.0, 5.0, 12.0, 10.0), cyo.a(1.0, 5.0, 5.0, 7.0, 12.0, 11.0), cyo.a(1.0, 3.0, 4.0, 9.0, 12.0, 12.0)
   };
   protected static final eol[] o = new eol[]{
      cyo.a(6.0, 7.0, 1.0, 10.0, 12.0, 5.0), cyo.a(5.0, 5.0, 1.0, 11.0, 12.0, 7.0), cyo.a(4.0, 3.0, 1.0, 12.0, 12.0, 9.0)
   };
   protected static final eol[] F = new eol[]{
      cyo.a(6.0, 7.0, 11.0, 10.0, 12.0, 15.0), cyo.a(5.0, 5.0, 9.0, 11.0, 12.0, 15.0), cyo.a(4.0, 3.0, 7.0, 12.0, 12.0, 15.0)
   };

   @Override
   public MapCodec<czv> a() {
      return a;
   }

   public czv(dle.d $$0) {
      super($$0);
      this.k(this.E.b().a(aE, ie.c).a(c, Integer.valueOf(0)));
   }

   @Override
   protected boolean e_(dlf $$0) {
      return $$0.c(c) < 2;
   }

   @Override
   protected void b(dlf $$0, aov $$1, hz $$2, awo $$3) {
      if ($$1.z.a(5) == 0) {
         int $$4 = $$0.c(c);
         if ($$4 < 2) {
            $$1.a($$2, $$0.a(c, Integer.valueOf($$4 + 1)), 2);
         }
      }
   }

   @Override
   protected boolean a(dlf $$0, cvq $$1, hz $$2) {
      dlf $$3 = $$1.a_($$2.a($$0.c(aE)));
      return $$3.a(atz.z);
   }

   @Override
   protected eol a(dlf $$0, cut $$1, hz $$2, enx $$3) {
      int $$4 = $$0.c(c);
      switch ((ie)$$0.c(aE)) {
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
   public dlf a(crg $$0) {
      dlf $$1 = this.o();
      cvq $$2 = $$0.q();
      hz $$3 = $$0.a();

      for (ie $$4 : $$0.f()) {
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
   protected dlf a(dlf $$0, ie $$1, dlf $$2, cvo $$3, hz $$4, hz $$5) {
      return $$1 == $$0.c(aE) && !$$0.a($$3, $$4) ? cyq.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean b(cvq $$0, hz $$1, dlf $$2) {
      return $$2.c(c) < 2;
   }

   @Override
   public boolean a(cvn $$0, awo $$1, hz $$2, dlf $$3) {
      return true;
   }

   @Override
   public void a(aov $$0, awo $$1, hz $$2, dlf $$3) {
      $$0.a($$2, $$3.a(c, Integer.valueOf($$3.c(c) + 1)), 2);
   }

   @Override
   protected void a(dlg.a<cyo, dlf> $$0) {
      $$0.a(aE, c);
   }

   @Override
   protected boolean a(dlf $$0, cut $$1, hz $$2, ehf $$3) {
      return false;
   }
}
