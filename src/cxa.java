import com.mojang.serialization.MapCodec;

public class cxa extends cwp {
   public static final MapCodec<cxa> a = b(cxa::new);
   public static final dkg b = djw.aw;
   public static final int c = 15;
   protected static final int d = 1;
   protected static final eml e = cwp.a(1.0, 0.0, 1.0, 15.0, 15.0, 15.0);
   protected static final eml f = cwp.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);

   @Override
   public MapCodec<cxa> a() {
      return a;
   }

   protected cxa(djf.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Integer.valueOf(0)));
   }

   @Override
   public void a(djg $$0, and $$1, hx $$2, auu $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   public void b(djg $$0, and $$1, hx $$2, auu $$3) {
      hx $$4 = $$2.c();
      if ($$1.u($$4)) {
         int $$5 = 1;

         while ($$1.a_($$2.c($$5)).a(this)) {
            $$5++;
         }

         if ($$5 < 3) {
            int $$6 = $$0.c(b);
            if ($$6 == 15) {
               $$1.b($$4, this.o());
               djg $$7 = $$0.a(b, Integer.valueOf(0));
               $$1.a($$2, $$7, 4);
               $$1.a($$7, $$4, this, $$2, false);
            } else {
               $$1.a($$2, $$0.a(b, Integer.valueOf($$6 + 1)), 4);
            }
         }
      }
   }

   @Override
   public eml b(djg $$0, csu $$1, hx $$2, elx $$3) {
      return e;
   }

   @Override
   public eml a(djg $$0, csu $$1, hx $$2, elx $$3) {
      return f;
   }

   @Override
   public djg a(djg $$0, ic $$1, djg $$2, ctp $$3, hx $$4, hx $$5) {
      if (!$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(djg $$0, ctr $$1, hx $$2) {
      for (ic $$3 : ic.c.a) {
         djg $$4 = $$1.a_($$2.a($$3));
         if ($$4.e() || $$1.b_($$2.a($$3)).a(asl.b)) {
            return false;
         }
      }

      djg $$5 = $$1.a_($$2.d());
      return ($$5.a(cwr.dQ) || $$5.a(asg.H)) && !$$1.a_($$2.c()).k();
   }

   @Override
   public void a(djg $$0, cto $$1, hx $$2, blu $$3) {
      $$3.a($$1.ai().j(), 1.0F);
   }

   @Override
   protected void a(djh.a<cwp, djg> $$0) {
      $$0.a(b);
   }

   @Override
   public boolean a(djg $$0, csu $$1, hx $$2, efg $$3) {
      return false;
   }
}
