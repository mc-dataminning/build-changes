import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class dgt extends dkr implements dgy, dnx {
   public static final MapCodec<dgt> a = b(dgt::new);
   private static final dur f = duq.C;
   private static final int g = 6;
   protected static final eyx b = dgv.a(5.0, 0.0, 9.0, 11.0, 16.0, 15.0);
   protected static final eyx c = dgv.a(5.0, 0.0, 1.0, 11.0, 16.0, 7.0);
   protected static final eyx d = dgv.a(1.0, 0.0, 5.0, 7.0, 16.0, 11.0);
   protected static final eyx e = dgv.a(9.0, 0.0, 5.0, 15.0, 16.0, 11.0);

   @Override
   public MapCodec<dgt> a() {
      return a;
   }

   protected dgt(dtz.d $$0) {
      super($$0);
      this.l(this.E.b().b(f, Boolean.valueOf(false)).b(aE, jj.c));
   }

   @Override
   protected eyx a(dua $$0, dcx $$1, je $$2, eyj $$3) {
      switch ((jj)$$0.c(aE)) {
         case d:
            return c;
         case c:
         default:
            return b;
         case e:
            return e;
         case f:
            return d;
      }
   }

   @Override
   protected void a(dub.a<dgv, dua> $$0) {
      $$0.a(f, aE);
   }

   @Override
   protected eqb b_(dua $$0) {
      return $$0.c(f) ? eqc.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dua $$0, ddv $$1, je $$2) {
      je $$3 = $$2.e();
      dua $$4 = $$1.a_($$3);
      dua $$5 = $$1.a_($$2.d());
      return ($$4.a(this) || $$4.a(aws.bz)) && ($$5.a(this) || $$5.a(dgx.sD));
   }

   protected static boolean a(ddt $$0, je $$1, eqb $$2, jj $$3) {
      dua $$4 = dgx.sE.o().b(f, Boolean.valueOf($$2.a(eqc.c))).b(aE, $$3);
      return $$0.a($$1, $$4, 3);
   }

   @Override
   protected dua a(dua $$0, jj $$1, dua $$2, ddt $$3, je $$4, je $$5) {
      if (($$1 == jj.a || $$1 == jj.b) && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      if ($$0.c(f)) {
         $$3.a($$4, eqc.c, eqc.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dua $$0, arg $$1, je $$2, azk $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   public boolean b(ddv $$0, je $$1, dua $$2) {
      Optional<je> $$3 = l.a($$0, $$1, $$2.b(), jj.b, dgx.sD);
      if ($$3.isEmpty()) {
         return false;
      } else {
         je $$4 = $$3.get().d();
         dua $$5 = $$0.a_($$4);
         return dgs.a($$0, $$4, $$5);
      }
   }

   @Override
   public boolean a(dds $$0, azk $$1, je $$2, dua $$3) {
      return true;
   }

   @Override
   public void a(arg $$0, azk $$1, je $$2, dua $$3) {
      Optional<je> $$4 = l.a($$0, $$2, $$3.b(), jj.b, dgx.sD);
      if (!$$4.isEmpty()) {
         je $$5 = $$4.get();
         je $$6 = $$5.d();
         jj $$7 = $$3.c(aE);
         a($$0, $$5, $$0.b_($$5), $$7);
         dgs.a($$0, $$6, $$0.b_($$6), $$7);
      }
   }

   @Override
   public cvl a(ddv $$0, je $$1, dua $$2) {
      return new cvl(dgx.sD);
   }
}
