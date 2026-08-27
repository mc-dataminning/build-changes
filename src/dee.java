import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dee extends ddm {
   public static final MapCodec<dee> a = b(dee::new);
   public static final dru[] b = new dru[]{drt.k, drt.l, drt.m};
   protected static final evf c = evc.a(dea.a(1.0, 0.0, 1.0, 15.0, 2.0, 15.0), dea.a(7.0, 0.0, 7.0, 9.0, 14.0, 9.0));

   @Override
   public MapCodec<dee> a() {
      return a;
   }

   public dee(drc.d $$0) {
      super($$0);
      this.k(this.E.b().a(b[0], Boolean.valueOf(false)).a(b[1], Boolean.valueOf(false)).a(b[2], Boolean.valueOf(false)));
   }

   @Override
   protected dkg a_(drd $$0) {
      return dkg.c;
   }

   @Override
   public doi a(io $$0, drd $$1) {
      return new dol($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends doi> doj<T> a(daz $$0, drd $$1, dok<T> $$2) {
      return $$0.B ? null : a($$2, dok.l, dol::a);
   }

   @Override
   protected evf a(drd $$0, daf $$1, io $$2, eur $$3) {
      return c;
   }

   @Override
   protected bpw a(drd $$0, daz $$1, io $$2, cly $$3, eui $$4) {
      if ($$1.B) {
         return bpw.a;
      } else {
         doi $$5 = $$1.c_($$2);
         if ($$5 instanceof dol) {
            $$3.a((dol)$$5);
            $$3.a(avs.aa);
         }

         return bpw.b;
      }
   }

   @Override
   public void a(drd $$0, daz $$1, io $$2, aym $$3) {
      double $$4 = (double)$$2.u() + 0.4 + (double)$$3.i() * 0.2;
      double $$5 = (double)$$2.v() + 0.7 + (double)$$3.i() * 0.3;
      double $$6 = (double)$$2.w() + 0.4 + (double)$$3.i() * 0.2;
      $$1.a(ky.ae, $$4, $$5, $$6, 0.0, 0.0, 0.0);
   }

   @Override
   protected void a(drd $$0, daz $$1, io $$2, drd $$3, boolean $$4) {
      bps.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected boolean c_(drd $$0) {
      return true;
   }

   @Override
   protected int a(drd $$0, daz $$1, io $$2) {
      return cov.a($$1.c_($$2));
   }

   @Override
   protected void a(dre.a<dea, drd> $$0) {
      $$0.a(b[0], b[1], b[2]);
   }

   @Override
   protected boolean a(drd $$0, enl $$1) {
      return false;
   }
}
