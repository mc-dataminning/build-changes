import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cxx extends dal implements cwt {
   public static final MapCodec<cxx> a = b(cxx::new);
   public static final int b = 2;
   public static final dkh c = djx.ar;
   protected static final int d = 4;
   protected static final int e = 5;
   protected static final int f = 2;
   protected static final int g = 6;
   protected static final int h = 7;
   protected static final int i = 3;
   protected static final int j = 8;
   protected static final int k = 9;
   protected static final int l = 4;
   protected static final emm[] m = new emm[]{
      cwq.a(11.0, 7.0, 6.0, 15.0, 12.0, 10.0), cwq.a(9.0, 5.0, 5.0, 15.0, 12.0, 11.0), cwq.a(7.0, 3.0, 4.0, 15.0, 12.0, 12.0)
   };
   protected static final emm[] n = new emm[]{
      cwq.a(1.0, 7.0, 6.0, 5.0, 12.0, 10.0), cwq.a(1.0, 5.0, 5.0, 7.0, 12.0, 11.0), cwq.a(1.0, 3.0, 4.0, 9.0, 12.0, 12.0)
   };
   protected static final emm[] o = new emm[]{
      cwq.a(6.0, 7.0, 1.0, 10.0, 12.0, 5.0), cwq.a(5.0, 5.0, 1.0, 11.0, 12.0, 7.0), cwq.a(4.0, 3.0, 1.0, 12.0, 12.0, 9.0)
   };
   protected static final emm[] F = new emm[]{
      cwq.a(6.0, 7.0, 11.0, 10.0, 12.0, 15.0), cwq.a(5.0, 5.0, 9.0, 11.0, 12.0, 15.0), cwq.a(4.0, 3.0, 7.0, 12.0, 12.0, 15.0)
   };

   @Override
   public MapCodec<cxx> a() {
      return a;
   }

   public cxx(djg.d $$0) {
      super($$0);
      this.k(this.E.b().a(aE, ic.c).a(c, Integer.valueOf(0)));
   }

   @Override
   public boolean e_(djh $$0) {
      return $$0.c(c) < 2;
   }

   @Override
   public void b(djh $$0, and $$1, hx $$2, auv $$3) {
      if ($$1.z.a(5) == 0) {
         int $$4 = $$0.c(c);
         if ($$4 < 2) {
            $$1.a($$2, $$0.a(c, Integer.valueOf($$4 + 1)), 2);
         }
      }
   }

   @Override
   public boolean a(djh $$0, cts $$1, hx $$2) {
      djh $$3 = $$1.a_($$2.a($$0.c(aE)));
      return $$3.a(ash.z);
   }

   @Override
   public emm a(djh $$0, csv $$1, hx $$2, ely $$3) {
      int $$4 = $$0.c(c);
      switch ((ic)$$0.c(aE)) {
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
   public djh a(cph $$0) {
      djh $$1 = this.o();
      cts $$2 = $$0.q();
      hx $$3 = $$0.a();

      for (ic $$4 : $$0.f()) {
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
   public djh a(djh $$0, ic $$1, djh $$2, ctq $$3, hx $$4, hx $$5) {
      return $$1 == $$0.c(aE) && !$$0.a($$3, $$4) ? cws.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean b(cts $$0, hx $$1, djh $$2) {
      return $$2.c(c) < 2;
   }

   @Override
   public boolean a(ctp $$0, auv $$1, hx $$2, djh $$3) {
      return true;
   }

   @Override
   public void a(and $$0, auv $$1, hx $$2, djh $$3) {
      $$0.a($$2, $$3.a(c, Integer.valueOf($$3.c(c) + 1)), 2);
   }

   @Override
   protected void a(dji.a<cwq, djh> $$0) {
      $$0.a(aE, c);
   }

   @Override
   public boolean a(djh $$0, csv $$1, hx $$2, efh $$3) {
      return false;
   }
}
