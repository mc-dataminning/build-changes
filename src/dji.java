import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class dji extends dni implements djn, dqq {
   public static final MapCodec<dji> a = b(dji::new);
   private static final dxm f = dxl.J;
   private static final int g = 6;
   protected static final fbs b = djk.a(5.0, 0.0, 9.0, 11.0, 16.0, 15.0);
   protected static final fbs c = djk.a(5.0, 0.0, 1.0, 11.0, 16.0, 7.0);
   protected static final fbs d = djk.a(1.0, 0.0, 5.0, 7.0, 16.0, 11.0);
   protected static final fbs e = djk.a(9.0, 0.0, 5.0, 15.0, 16.0, 11.0);

   @Override
   public MapCodec<dji> a() {
      return a;
   }

   protected dji(dwu.d $$0) {
      super($$0);
      this.l(this.F.b().b(f, Boolean.valueOf(false)).b(aF, jn.c));
   }

   @Override
   protected fbs a(dwv $$0, dfl $$1, ji $$2, fbd $$3) {
      switch ((jn)$$0.c(aF)) {
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
   protected void a(dww.a<djk, dwv> $$0) {
      $$0.a(f, aF);
   }

   @Override
   protected esx b_(dwv $$0) {
      return $$0.c(f) ? esy.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dwv $$0, dgj $$1, ji $$2) {
      ji $$3 = $$2.e();
      dwv $$4 = $$1.a_($$3);
      dwv $$5 = $$1.a_($$2.d());
      return ($$4.a(this) || $$4.a(awo.bA)) && ($$5.a(this) || $$5.a(djm.tf));
   }

   protected static boolean a(dgh $$0, ji $$1, esx $$2, jn $$3) {
      dwv $$4 = djm.tg.m().b(f, Boolean.valueOf($$2.a(esy.c))).b(aF, $$3);
      return $$0.a($$1, $$4, 3);
   }

   @Override
   protected dwv a(dwv $$0, dgj $$1, dgv $$2, ji $$3, jn $$4, ji $$5, dwv $$6, azg $$7) {
      if (($$4 == jn.a || $$4 == jn.b) && !$$0.a($$1, $$3)) {
         $$2.a($$3, this, 1);
      }

      if ($$0.c(f)) {
         $$2.a($$3, esy.c, esy.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(dwv $$0, arc $$1, ji $$2, azg $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   public boolean a(dgj $$0, ji $$1, dwv $$2) {
      Optional<ji> $$3 = l.a($$0, $$1, $$2.b(), jn.b, djm.tf);
      if ($$3.isEmpty()) {
         return false;
      } else {
         ji $$4 = $$3.get().d();
         dwv $$5 = $$0.a_($$4);
         return djh.a((dgi)$$0, $$4, $$5);
      }
   }

   @Override
   public boolean a(dgg $$0, azg $$1, ji $$2, dwv $$3) {
      return true;
   }

   @Override
   public void a(arc $$0, azg $$1, ji $$2, dwv $$3) {
      Optional<ji> $$4 = l.a($$0, $$2, $$3.b(), jn.b, djm.tf);
      if (!$$4.isEmpty()) {
         ji $$5 = $$4.get();
         ji $$6 = $$5.d();
         jn $$7 = $$3.c(aF);
         a($$0, $$5, $$0.b_($$5), $$7);
         djh.a($$0, $$6, $$0.b_($$6), $$7);
      }
   }

   @Override
   protected cwn a(dgj $$0, ji $$1, dwv $$2, boolean $$3) {
      return new cwn(djm.tf);
   }
}
