import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class dew extends diu implements dfb, dlz {
   public static final MapCodec<dew> a = b(dew::new);
   private static final dss f = dsr.C;
   private static final int g = 6;
   protected static final ewj b = dey.a(5.0, 0.0, 9.0, 11.0, 16.0, 15.0);
   protected static final ewj c = dey.a(5.0, 0.0, 1.0, 11.0, 16.0, 7.0);
   protected static final ewj d = dey.a(1.0, 0.0, 5.0, 7.0, 16.0, 11.0);
   protected static final ewj e = dey.a(9.0, 0.0, 5.0, 15.0, 16.0, 11.0);

   @Override
   public MapCodec<dew> a() {
      return a;
   }

   protected dew(dsa.d $$0) {
      super($$0);
      this.k(this.E.b().a(f, Boolean.valueOf(false)).a(aE, je.c));
   }

   @Override
   protected ewj a(dsb $$0, dbd $$1, iz $$2, evv $$3) {
      switch ((je)$$0.c(aE)) {
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
   protected void a(dsc.a<dey, dsb> $$0) {
      $$0.a(f, aE);
   }

   @Override
   protected enu b_(dsb $$0) {
      return $$0.c(f) ? env.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dsb $$0, dca $$1, iz $$2) {
      iz $$3 = $$2.d();
      dsb $$4 = $$1.a_($$3);
      dsb $$5 = $$1.a_($$2.c());
      return ($$4.a(this) || $$4.a(awo.by)) && ($$5.a(this) || $$5.a(dfa.sD));
   }

   protected static boolean a(dby $$0, iz $$1, enu $$2, je $$3) {
      dsb $$4 = dfa.sE.o().a(f, Boolean.valueOf($$2.a(env.c))).a(aE, $$3);
      return $$0.a($$1, $$4, 3);
   }

   @Override
   protected dsb a(dsb $$0, je $$1, dsb $$2, dby $$3, iz $$4, iz $$5) {
      if (($$1 == je.a || $$1 == je.b) && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      if ($$0.c(f)) {
         $$3.a($$4, env.c, env.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dsb $$0, are $$1, iz $$2, azg $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   public boolean b(dca $$0, iz $$1, dsb $$2) {
      Optional<iz> $$3 = l.a($$0, $$1, $$2.b(), je.b, dfa.sD);
      if ($$3.isEmpty()) {
         return false;
      } else {
         iz $$4 = $$3.get().c();
         dsb $$5 = $$0.a_($$4);
         return dev.a($$0, $$4, $$5);
      }
   }

   @Override
   public boolean a(dbx $$0, azg $$1, iz $$2, dsb $$3) {
      return true;
   }

   @Override
   public void a(are $$0, azg $$1, iz $$2, dsb $$3) {
      Optional<iz> $$4 = l.a($$0, $$2, $$3.b(), je.b, dfa.sD);
      if (!$$4.isEmpty()) {
         iz $$5 = $$4.get();
         iz $$6 = $$5.c();
         je $$7 = $$3.c(aE);
         a($$0, $$5, $$0.b_($$5), $$7);
         dev.a($$0, $$6, $$0.b_($$6), $$7);
      }
   }

   @Override
   public cuo a(dca $$0, iz $$1, dsb $$2) {
      return new cuo(dfa.sD);
   }
}
