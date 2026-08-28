import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dfj extends der {
   public static final MapCodec<dfj> a = b(dfj::new);
   public static final dsy[] b = new dsy[]{dsx.k, dsx.l, dsx.m};
   protected static final ews c = ewp.a(dff.a(1.0, 0.0, 1.0, 15.0, 2.0, 15.0), dff.a(7.0, 0.0, 7.0, 9.0, 14.0, 9.0));

   @Override
   public MapCodec<dfj> a() {
      return a;
   }

   public dfj(dsg.d $$0) {
      super($$0);
      this.k(this.E.b().a(b[0], Boolean.valueOf(false)).a(b[1], Boolean.valueOf(false)).a(b[2], Boolean.valueOf(false)));
   }

   @Override
   protected dll a_(dsh $$0) {
      return dll.c;
   }

   @Override
   public dpn a(ja $$0, dsh $$1) {
      return new dpq($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dpn> dpo<T> a(dcd $$0, dsh $$1, dpp<T> $$2) {
      return $$0.B ? null : a($$2, dpp.l, dpq::a);
   }

   @Override
   protected ews a(dsh $$0, dbj $$1, ja $$2, ewe $$3) {
      return c;
   }

   @Override
   protected bqd a(dsh $$0, dcd $$1, ja $$2, cmh $$3, evv $$4) {
      if ($$1.B) {
         return bqd.a;
      } else {
         dpn $$5 = $$1.c_($$2);
         if ($$5 instanceof dpq) {
            $$3.a((dpq)$$5);
            $$3.a(avp.aa);
         }

         return bqd.c;
      }
   }

   @Override
   public void a(dsh $$0, dcd $$1, ja $$2, aym $$3) {
      double $$4 = (double)$$2.u() + 0.4 + (double)$$3.i() * 0.2;
      double $$5 = (double)$$2.v() + 0.7 + (double)$$3.i() * 0.3;
      double $$6 = (double)$$2.w() + 0.4 + (double)$$3.i() * 0.2;
      $$1.a(lj.ae, $$4, $$5, $$6, 0.0, 0.0, 0.0);
   }

   @Override
   protected void a(dsh $$0, dcd $$1, ja $$2, dsh $$3, boolean $$4) {
      bpz.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected boolean c_(dsh $$0) {
      return true;
   }

   @Override
   protected int a(dsh $$0, dcd $$1, ja $$2) {
      return cpe.a($$1.c_($$2));
   }

   @Override
   protected void a(dsi.a<dff, dsh> $$0) {
      $$0.a(b[0], b[1], b[2]);
   }

   @Override
   protected boolean a(dsh $$0, eoq $$1) {
      return false;
   }
}
