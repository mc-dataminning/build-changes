import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dou extends dkm implements drq {
   public static final MapCodec<dou> a = b(dou::new);
   public static final dys<jm> b = dok.aF;
   public static final dym c = dyl.D;
   protected static final float d = 3.0F;
   protected static final fcs e = dkm.a(0.0, 0.0, 0.0, 3.0, 16.0, 16.0);
   protected static final fcs f = dkm.a(13.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final fcs g = dkm.a(0.0, 0.0, 0.0, 16.0, 16.0, 3.0);
   protected static final fcs h = dkm.a(0.0, 0.0, 13.0, 16.0, 16.0, 16.0);

   @Override
   public MapCodec<dou> a() {
      return a;
   }

   protected dou(dxu.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jm.c).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected fcs a(dxv $$0, dgn $$1, jh $$2, fcd $$3) {
      switch ((jm)$$0.c(b)) {
         case c:
            return h;
         case d:
            return g;
         case e:
            return f;
         case f:
         default:
            return e;
      }
   }

   private boolean a(dgn $$0, jh $$1, jm $$2) {
      dxv $$3 = $$0.a_($$1);
      return $$3.c($$0, $$1, $$2);
   }

   @Override
   protected boolean a(dxv $$0, dhl $$1, jh $$2) {
      jm $$3 = $$0.c(b);
      return this.a($$1, $$2.a($$3.g()), $$3);
   }

   @Override
   protected dxv a(dxv $$0, dhl $$1, dhx $$2, jh $$3, jm $$4, jh $$5, dxv $$6, bam $$7) {
      if ($$4.g() == $$0.c(b) && !$$0.a($$1, $$3)) {
         return dko.a.m();
      } else {
         if ($$0.c(c)) {
            $$2.a($$3, ety.c, ety.c.a($$1));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }

   @Nullable
   @Override
   public dxv a(dbg $$0) {
      if (!$$0.c()) {
         dxv $$1 = $$0.q().a_($$0.a().a($$0.k().g()));
         if ($$1.a(this) && $$1.c(b) == $$0.k()) {
            return null;
         }
      }

      dxv $$2 = this.m();
      dhl $$3 = $$0.q();
      jh $$4 = $$0.a();
      etx $$5 = $$0.q().b_($$0.a());

      for (jm $$6 : $$0.f()) {
         if ($$6.o().d()) {
            $$2 = $$2.b(b, $$6.g());
            if ($$2.a($$3, $$4)) {
               return $$2.b(c, Boolean.valueOf($$5.a() == ety.c));
            }
         }
      }

      return null;
   }

   @Override
   protected dxv a(dxv $$0, drc $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dxv a(dxv $$0, dpl $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dxw.a<dkm, dxv> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected etx b_(dxv $$0) {
      return $$0.c(c) ? ety.c.a(false) : super.b_($$0);
   }
}
