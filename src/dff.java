import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dff extends dhu implements deb {
   public static final MapCodec<dff> a = b(dff::new);
   public static final int b = 2;
   public static final dsb c = drr.ar;
   protected static final int d = 4;
   protected static final int e = 5;
   protected static final int f = 2;
   protected static final int g = 6;
   protected static final int h = 7;
   protected static final int i = 3;
   protected static final int j = 8;
   protected static final int k = 9;
   protected static final int l = 4;
   protected static final evd[] m = new evd[]{
      ddy.a(11.0, 7.0, 6.0, 15.0, 12.0, 10.0), ddy.a(9.0, 5.0, 5.0, 15.0, 12.0, 11.0), ddy.a(7.0, 3.0, 4.0, 15.0, 12.0, 12.0)
   };
   protected static final evd[] n = new evd[]{
      ddy.a(1.0, 7.0, 6.0, 5.0, 12.0, 10.0), ddy.a(1.0, 5.0, 5.0, 7.0, 12.0, 11.0), ddy.a(1.0, 3.0, 4.0, 9.0, 12.0, 12.0)
   };
   protected static final evd[] o = new evd[]{
      ddy.a(6.0, 7.0, 1.0, 10.0, 12.0, 5.0), ddy.a(5.0, 5.0, 1.0, 11.0, 12.0, 7.0), ddy.a(4.0, 3.0, 1.0, 12.0, 12.0, 9.0)
   };
   protected static final evd[] F = new evd[]{
      ddy.a(6.0, 7.0, 11.0, 10.0, 12.0, 15.0), ddy.a(5.0, 5.0, 9.0, 11.0, 12.0, 15.0), ddy.a(4.0, 3.0, 7.0, 12.0, 12.0, 15.0)
   };

   @Override
   public MapCodec<dff> a() {
      return a;
   }

   public dff(dra.d $$0) {
      super($$0);
      this.k(this.E.b().a(aE, it.c).a(c, Integer.valueOf(0)));
   }

   @Override
   protected boolean d_(drb $$0) {
      return $$0.c(c) < 2;
   }

   @Override
   protected void b(drb $$0, aqm $$1, io $$2, ayk $$3) {
      if ($$1.z.a(5) == 0) {
         int $$4 = $$0.c(c);
         if ($$4 < 2) {
            $$1.a($$2, $$0.a(c, Integer.valueOf($$4 + 1)), 2);
         }
      }
   }

   @Override
   protected boolean a(drb $$0, dba $$1, io $$2) {
      drb $$3 = $$1.a_($$2.a($$0.c(aE)));
      return $$3.a(avw.z);
   }

   @Override
   protected evd a(drb $$0, dad $$1, io $$2, eup $$3) {
      int $$4 = $$0.c(c);
      switch ((it)$$0.c(aE)) {
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
   public drb a(cwz $$0) {
      drb $$1 = this.n();
      dba $$2 = $$0.q();
      io $$3 = $$0.a();

      for (it $$4 : $$0.f()) {
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
   protected drb a(drb $$0, it $$1, drb $$2, day $$3, io $$4, io $$5) {
      return $$1 == $$0.c(aE) && !$$0.a($$3, $$4) ? dea.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean b(dba $$0, io $$1, drb $$2) {
      return $$2.c(c) < 2;
   }

   @Override
   public boolean a(dax $$0, ayk $$1, io $$2, drb $$3) {
      return true;
   }

   @Override
   public void a(aqm $$0, ayk $$1, io $$2, drb $$3) {
      $$0.a($$2, $$3.a(c, Integer.valueOf($$3.c(c) + 1)), 2);
   }

   @Override
   protected void a(drc.a<ddy, drb> $$0) {
      $$0.a(aE, c);
   }

   @Override
   protected boolean a(drb $$0, enj $$1) {
      return false;
   }
}
