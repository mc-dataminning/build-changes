import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class ddw extends dhu implements deb, dkz {
   public static final MapCodec<ddw> a = b(ddw::new);
   private static final drs f = drr.C;
   private static final int g = 6;
   protected static final evd b = ddy.a(5.0, 0.0, 9.0, 11.0, 16.0, 15.0);
   protected static final evd c = ddy.a(5.0, 0.0, 1.0, 11.0, 16.0, 7.0);
   protected static final evd d = ddy.a(1.0, 0.0, 5.0, 7.0, 16.0, 11.0);
   protected static final evd e = ddy.a(9.0, 0.0, 5.0, 15.0, 16.0, 11.0);

   @Override
   public MapCodec<ddw> a() {
      return a;
   }

   protected ddw(dra.d $$0) {
      super($$0);
      this.k(this.E.b().a(f, Boolean.valueOf(false)).a(aE, it.c));
   }

   @Override
   protected evd a(drb $$0, dad $$1, io $$2, eup $$3) {
      switch ((it)$$0.c(aE)) {
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
   protected void a(drc.a<ddy, drb> $$0) {
      $$0.a(f, aE);
   }

   @Override
   protected emu b_(drb $$0) {
      return $$0.c(f) ? emv.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(drb $$0, dba $$1, io $$2) {
      io $$3 = $$2.d();
      drb $$4 = $$1.a_($$3);
      drb $$5 = $$1.a_($$2.c());
      return ($$4.a(this) || $$4.a(avw.by)) && ($$5.a(this) || $$5.a(dea.sD));
   }

   protected static boolean a(day $$0, io $$1, emu $$2, it $$3) {
      drb $$4 = dea.sE.n().a(f, Boolean.valueOf($$2.a(emv.c))).a(aE, $$3);
      return $$0.a($$1, $$4, 3);
   }

   @Override
   protected drb a(drb $$0, it $$1, drb $$2, day $$3, io $$4, io $$5) {
      if (($$1 == it.a || $$1 == it.b) && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      if ($$0.c(f)) {
         $$3.a($$4, emv.c, emv.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(drb $$0, aqm $$1, io $$2, ayk $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   public boolean b(dba $$0, io $$1, drb $$2) {
      Optional<io> $$3 = l.a($$0, $$1, $$2.b(), it.b, dea.sD);
      if ($$3.isEmpty()) {
         return false;
      } else {
         io $$4 = $$3.get().c();
         drb $$5 = $$0.a_($$4);
         return ddv.a($$0, $$4, $$5);
      }
   }

   @Override
   public boolean a(dax $$0, ayk $$1, io $$2, drb $$3) {
      return true;
   }

   @Override
   public void a(aqm $$0, ayk $$1, io $$2, drb $$3) {
      Optional<io> $$4 = l.a($$0, $$2, $$3.b(), it.b, dea.sD);
      if (!$$4.isEmpty()) {
         io $$5 = $$4.get();
         io $$6 = $$5.c();
         it $$7 = $$3.c(aE);
         a($$0, $$5, $$0.b_($$5), $$7);
         ddv.a($$0, $$6, $$0.b_($$6), $$7);
      }
   }

   @Override
   public cto a(dba $$0, io $$1, drb $$2) {
      return new cto(dea.sD);
   }
}
