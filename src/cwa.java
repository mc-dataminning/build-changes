import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cwa extends cyo implements cuw {
   public static final MapCodec<cwa> a = b(cwa::new);
   public static final int b = 2;
   public static final dhw c = dhm.ar;
   protected static final int d = 4;
   protected static final int e = 5;
   protected static final int f = 2;
   protected static final int g = 6;
   protected static final int h = 7;
   protected static final int i = 3;
   protected static final int j = 8;
   protected static final int k = 9;
   protected static final int l = 4;
   protected static final ekb[] m = new ekb[]{
      cut.a(11.0, 7.0, 6.0, 15.0, 12.0, 10.0), cut.a(9.0, 5.0, 5.0, 15.0, 12.0, 11.0), cut.a(7.0, 3.0, 4.0, 15.0, 12.0, 12.0)
   };
   protected static final ekb[] n = new ekb[]{
      cut.a(1.0, 7.0, 6.0, 5.0, 12.0, 10.0), cut.a(1.0, 5.0, 5.0, 7.0, 12.0, 11.0), cut.a(1.0, 3.0, 4.0, 9.0, 12.0, 12.0)
   };
   protected static final ekb[] o = new ekb[]{
      cut.a(6.0, 7.0, 1.0, 10.0, 12.0, 5.0), cut.a(5.0, 5.0, 1.0, 11.0, 12.0, 7.0), cut.a(4.0, 3.0, 1.0, 12.0, 12.0, 9.0)
   };
   protected static final ekb[] F = new ekb[]{
      cut.a(6.0, 7.0, 11.0, 10.0, 12.0, 15.0), cut.a(5.0, 5.0, 9.0, 11.0, 12.0, 15.0), cut.a(4.0, 3.0, 7.0, 12.0, 12.0, 15.0)
   };

   @Override
   public MapCodec<cwa> a() {
      return a;
   }

   public cwa(dgv.d $$0) {
      super($$0);
      this.k(this.E.b().a(aE, hx.c).a(c, Integer.valueOf(0)));
   }

   @Override
   public boolean e_(dgw $$0) {
      return $$0.c(c) < 2;
   }

   @Override
   public void b(dgw $$0, ama $$1, ht $$2, ato $$3) {
      if ($$1.z.a(5) == 0) {
         int $$4 = $$0.c(c);
         if ($$4 < 2) {
            $$1.a($$2, $$0.a(c, Integer.valueOf($$4 + 1)), 2);
         }
      }
   }

   @Override
   public boolean a(dgw $$0, crv $$1, ht $$2) {
      dgw $$3 = $$1.a_($$2.a($$0.c(aE)));
      return $$3.a(arc.z);
   }

   @Override
   public ekb a(dgw $$0, cqy $$1, ht $$2, ejn $$3) {
      int $$4 = $$0.c(c);
      switch ((hx)$$0.c(aE)) {
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
   public dgw a(cnj $$0) {
      dgw $$1 = this.o();
      crv $$2 = $$0.q();
      ht $$3 = $$0.a();

      for (hx $$4 : $$0.f()) {
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
   public dgw a(dgw $$0, hx $$1, dgw $$2, crt $$3, ht $$4, ht $$5) {
      return $$1 == $$0.c(aE) && !$$0.a($$3, $$4) ? cuv.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean b(crv $$0, ht $$1, dgw $$2) {
      return $$2.c(c) < 2;
   }

   @Override
   public boolean a(crs $$0, ato $$1, ht $$2, dgw $$3) {
      return true;
   }

   @Override
   public void a(ama $$0, ato $$1, ht $$2, dgw $$3) {
      $$0.a($$2, $$3.a(c, Integer.valueOf($$3.c(c) + 1)), 2);
   }

   @Override
   protected void a(dgx.a<cut, dgw> $$0) {
      $$0.a(aE, c);
   }

   @Override
   public boolean a(dgw $$0, cqy $$1, ht $$2, ecw $$3) {
      return false;
   }
}
