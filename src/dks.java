import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.Optional;

public class dks extends dot implements dkx, dsb {
   public static final MapCodec<dks> a = b(dks::new);
   private static final dzd b = dzc.I;
   private static final Map<jo, fdo> c = fdl.c(dku.b(6.0, 0.0, 16.0).a(0.0, 0.0, 0.25).d());

   @Override
   public MapCodec<dks> a() {
      return a;
   }

   protected dks(dyl.d $$0) {
      super($$0);
      this.l(this.B.b().b(b, Boolean.valueOf(false)).b(e, jo.c));
   }

   @Override
   protected fdo a(dym $$0, dgv $$1, jj $$2, fcz $$3) {
      return c.get($$0.c(e));
   }

   @Override
   protected void a(dyn.a<dku, dym> $$0) {
      $$0.a(b, e);
   }

   @Override
   protected eut b_(dym $$0) {
      return $$0.c(b) ? euu.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dym $$0, dhs $$1, jj $$2) {
      jj $$3 = $$2.e();
      dym $$4 = $$1.a_($$3);
      dym $$5 = $$1.a_($$2.d());
      return ($$4.a(this) || $$4.a(awz.bA)) && ($$5.a(this) || $$5.a(dkw.tj));
   }

   protected static boolean a(dhq $$0, jj $$1, eut $$2, jo $$3) {
      dym $$4 = dkw.tk.m().b(b, Boolean.valueOf($$2.a(euu.c))).b(e, $$3);
      return $$0.a($$1, $$4, 3);
   }

   @Override
   protected dym a(dym $$0, dhs $$1, die $$2, jj $$3, jo $$4, jj $$5, dym $$6, azs $$7) {
      if (($$4 == jo.a || $$4 == jo.b) && !$$0.a($$1, $$3)) {
         $$2.a($$3, this, 1);
      }

      if ($$0.c(b)) {
         $$2.a($$3, euu.c, euu.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(dym $$0, arn $$1, jj $$2, azs $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   public boolean a(dhs $$0, jj $$1, dym $$2) {
      Optional<jj> $$3 = l.a($$0, $$1, $$2.b(), jo.b, dkw.tj);
      if ($$3.isEmpty()) {
         return false;
      } else {
         jj $$4 = $$3.get().d();
         dym $$5 = $$0.a_($$4);
         return dkr.a((dhr)$$0, $$4, $$5);
      }
   }

   @Override
   public boolean a(dhp $$0, azs $$1, jj $$2, dym $$3) {
      return true;
   }

   @Override
   public void a(arn $$0, azs $$1, jj $$2, dym $$3) {
      Optional<jj> $$4 = l.a($$0, $$2, $$3.b(), jo.b, dkw.tj);
      if (!$$4.isEmpty()) {
         jj $$5 = $$4.get();
         jj $$6 = $$5.d();
         jo $$7 = $$3.c(e);
         a($$0, $$5, $$0.b_($$5), $$7);
         dkr.a($$0, $$6, $$0.b_($$6), $$7);
      }
   }

   @Override
   protected cxy a(dhs $$0, jj $$1, dym $$2, boolean $$3) {
      return new cxy(dkw.tj);
   }
}
