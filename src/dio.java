import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class dio extends dml implements dit, dpr {
   public static final MapCodec<dio> a = b(dio::new);
   private static final dwm f = dwl.C;
   private static final int g = 6;
   protected static final fas b = diq.a(5.0, 0.0, 9.0, 11.0, 16.0, 15.0);
   protected static final fas c = diq.a(5.0, 0.0, 1.0, 11.0, 16.0, 7.0);
   protected static final fas d = diq.a(1.0, 0.0, 5.0, 7.0, 16.0, 11.0);
   protected static final fas e = diq.a(9.0, 0.0, 5.0, 15.0, 16.0, 11.0);

   @Override
   public MapCodec<dio> a() {
      return a;
   }

   protected dio(dvu.d $$0) {
      super($$0);
      this.l(this.F.b().b(f, Boolean.valueOf(false)).b(aF, jm.c));
   }

   @Override
   protected fas a(dvv $$0, der $$1, jh $$2, fad $$3) {
      switch ((jm)$$0.c(aF)) {
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
   protected void a(dvw.a<diq, dvv> $$0) {
      $$0.a(f, aF);
   }

   @Override
   protected erv b_(dvv $$0) {
      return $$0.c(f) ? erw.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dvv $$0, dfp $$1, jh $$2) {
      jh $$3 = $$2.e();
      dvv $$4 = $$1.a_($$3);
      dvv $$5 = $$1.a_($$2.d());
      return ($$4.a(this) || $$4.a(axc.bz)) && ($$5.a(this) || $$5.a(dis.sD));
   }

   protected static boolean a(dfn $$0, jh $$1, erv $$2, jm $$3) {
      dvv $$4 = dis.sE.m().b(f, Boolean.valueOf($$2.a(erw.c))).b(aF, $$3);
      return $$0.a($$1, $$4, 3);
   }

   @Override
   protected dvv a(dvv $$0, dfp $$1, dgb $$2, jh $$3, jm $$4, jh $$5, dvv $$6, azu $$7) {
      if (($$4 == jm.a || $$4 == jm.b) && !$$0.a($$1, $$3)) {
         $$2.a($$3, this, 1);
      }

      if ($$0.c(f)) {
         $$2.a($$3, erw.c, erw.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(dvv $$0, arp $$1, jh $$2, azu $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   public boolean b(dfp $$0, jh $$1, dvv $$2) {
      Optional<jh> $$3 = l.a($$0, $$1, $$2.b(), jm.b, dis.sD);
      if ($$3.isEmpty()) {
         return false;
      } else {
         jh $$4 = $$3.get().d();
         dvv $$5 = $$0.a_($$4);
         return din.a($$0, $$4, $$5);
      }
   }

   @Override
   public boolean a(dfm $$0, azu $$1, jh $$2, dvv $$3) {
      return true;
   }

   @Override
   public void a(arp $$0, azu $$1, jh $$2, dvv $$3) {
      Optional<jh> $$4 = l.a($$0, $$2, $$3.b(), jm.b, dis.sD);
      if (!$$4.isEmpty()) {
         jh $$5 = $$4.get();
         jh $$6 = $$5.d();
         jm $$7 = $$3.c(aF);
         a($$0, $$5, $$0.b_($$5), $$7);
         din.a($$0, $$6, $$0.b_($$6), $$7);
      }
   }

   @Override
   public cwm a(dfp $$0, jh $$1, dvv $$2) {
      return new cwm(dis.sD);
   }
}
