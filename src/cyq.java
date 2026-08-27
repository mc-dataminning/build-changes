import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class cyq extends dcn implements cyv, dfs {
   public static final MapCodec<cyq> a = b(cyq::new);
   private static final dma f = dlz.C;
   private static final int g = 6;
   protected static final eos b = cys.a(5.0, 0.0, 9.0, 11.0, 16.0, 15.0);
   protected static final eos c = cys.a(5.0, 0.0, 1.0, 11.0, 16.0, 7.0);
   protected static final eos d = cys.a(1.0, 0.0, 5.0, 7.0, 16.0, 11.0);
   protected static final eos e = cys.a(9.0, 0.0, 5.0, 15.0, 16.0, 11.0);

   @Override
   public MapCodec<cyq> a() {
      return a;
   }

   protected cyq(dli.d $$0) {
      super($$0);
      this.k(this.E.b().a(f, Boolean.valueOf(false)).a(aE, ie.c));
   }

   @Override
   protected eos a(dlj $$0, cux $$1, hz $$2, eoe $$3) {
      switch ((ie)$$0.c(aE)) {
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
   protected void a(dlk.a<cys, dlj> $$0) {
      $$0.a(f, aE);
   }

   @Override
   protected egw c_(dlj $$0) {
      return $$0.c(f) ? egx.c.a(false) : super.c_($$0);
   }

   @Override
   protected boolean a(dlj $$0, cvu $$1, hz $$2) {
      hz $$3 = $$2.d();
      dlj $$4 = $$1.a_($$3);
      dlj $$5 = $$1.a_($$2.c());
      return ($$4.a(this) || $$4.a(aua.bx)) && ($$5.a(this) || $$5.a(cyu.sD));
   }

   protected static boolean a(cvs $$0, hz $$1, egw $$2, ie $$3) {
      dlj $$4 = cyu.sE.o().a(f, Boolean.valueOf($$2.a(egx.c))).a(aE, $$3);
      return $$0.a($$1, $$4, 3);
   }

   @Override
   protected dlj a(dlj $$0, ie $$1, dlj $$2, cvs $$3, hz $$4, hz $$5) {
      if (($$1 == ie.a || $$1 == ie.b) && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      if ($$0.c(f)) {
         $$3.a($$4, egx.c, egx.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dlj $$0, aow $$1, hz $$2, awp $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   public boolean b(cvu $$0, hz $$1, dlj $$2) {
      Optional<hz> $$3 = l.a($$0, $$1, $$2.b(), ie.b, cyu.sD);
      if ($$3.isEmpty()) {
         return false;
      } else {
         hz $$4 = $$3.get().c();
         dlj $$5 = $$0.a_($$4);
         return cyp.a($$0, $$4, $$5);
      }
   }

   @Override
   public boolean a(cvr $$0, awp $$1, hz $$2, dlj $$3) {
      return true;
   }

   @Override
   public void a(aow $$0, awp $$1, hz $$2, dlj $$3) {
      Optional<hz> $$4 = l.a($$0, $$2, $$3.b(), ie.b, cyu.sD);
      if (!$$4.isEmpty()) {
         hz $$5 = $$4.get();
         hz $$6 = $$5.c();
         ie $$7 = $$3.c(aE);
         a($$0, $$5, $$0.b_($$5), $$7);
         cyp.a($$0, $$6, $$0.b_($$6), $$7);
      }
   }

   @Override
   public cpd a(cvu $$0, hz $$1, dlj $$2) {
      return new cpd(cyu.sD);
   }
}
