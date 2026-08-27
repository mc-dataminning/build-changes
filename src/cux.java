import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cux extends cuf {
   public static final MapCodec<cux> a = b(cux::new);
   public static final dhn[] b = new dhn[]{dhm.k, dhm.l, dhm.m};
   protected static final ekb c = ejy.a(cut.a(1.0, 0.0, 1.0, 15.0, 2.0, 15.0), cut.a(7.0, 0.0, 7.0, 9.0, 14.0, 9.0));

   @Override
   public MapCodec<cux> a() {
      return a;
   }

   public cux(dgv.d $$0) {
      super($$0);
      this.k(this.E.b().a(b[0], Boolean.valueOf(false)).a(b[1], Boolean.valueOf(false)).a(b[2], Boolean.valueOf(false)));
   }

   @Override
   public day b_(dgw $$0) {
      return day.c;
   }

   @Override
   public der a(ht $$0, dgw $$1) {
      return new deu($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends der> des<T> a(crs $$0, dgw $$1, det<T> $$2) {
      return $$0.B ? null : a($$2, det.l, deu::a);
   }

   @Override
   public ekb a(dgw $$0, cqy $$1, ht $$2, ejn $$3) {
      return c;
   }

   @Override
   public biq a(dgw $$0, crs $$1, ht $$2, cdm $$3, bip $$4, eje $$5) {
      if ($$1.B) {
         return biq.a;
      } else {
         der $$6 = $$1.c_($$2);
         if ($$6 instanceof deu) {
            $$3.a((deu)$$6);
            $$3.a(aqx.aa);
         }

         return biq.b;
      }
   }

   @Override
   public void a(crs $$0, ht $$1, dgw $$2, bky $$3, clb $$4) {
      if ($$4.A()) {
         der $$5 = $$0.c_($$1);
         if ($$5 instanceof deu) {
            ((deu)$$5).a($$4.y());
         }
      }
   }

   @Override
   public void a(dgw $$0, crs $$1, ht $$2, ato $$3) {
      double $$4 = (double)$$2.u() + 0.4 + (double)$$3.i() * 0.2;
      double $$5 = (double)$$2.v() + 0.7 + (double)$$3.i() * 0.3;
      double $$6 = (double)$$2.w() + 0.4 + (double)$$3.i() * 0.2;
      $$1.a(js.Z, $$4, $$5, $$6, 0.0, 0.0, 0.0);
   }

   @Override
   public void a(dgw $$0, crs $$1, ht $$2, dgw $$3, boolean $$4) {
      bim.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public boolean d_(dgw $$0) {
      return true;
   }

   @Override
   public int a(dgw $$0, crs $$1, ht $$2) {
      return cge.a($$1.c_($$2));
   }

   @Override
   protected void a(dgx.a<cut, dgw> $$0) {
      $$0.a(b[0], b[1], b[2]);
   }

   @Override
   public boolean a(dgw $$0, cqy $$1, ht $$2, ecw $$3) {
      return false;
   }
}
