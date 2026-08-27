import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cwd extends cvl {
   public static final MapCodec<cwd> a = b(cwd::new);
   public static final djg[] b = new djg[]{djf.k, djf.l, djf.m};
   protected static final elu c = elr.a(cvz.a(1.0, 0.0, 1.0, 15.0, 2.0, 15.0), cvz.a(7.0, 0.0, 7.0, 9.0, 14.0, 9.0));

   @Override
   public MapCodec<cwd> a() {
      return a;
   }

   public cwd(dio.d $$0) {
      super($$0);
      this.k(this.E.b().a(b[0], Boolean.valueOf(false)).a(b[1], Boolean.valueOf(false)).a(b[2], Boolean.valueOf(false)));
   }

   @Override
   public dce b_(dip $$0) {
      return dce.c;
   }

   @Override
   public dgd a(hv $$0, dip $$1) {
      return new dgg($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dgd> dge<T> a(csy $$0, dip $$1, dgf<T> $$2) {
      return $$0.B ? null : a($$2, dgf.l, dgg::a);
   }

   @Override
   public elu a(dip $$0, cse $$1, hv $$2, elg $$3) {
      return c;
   }

   @Override
   public bjl a(dip $$0, csy $$1, hv $$2, cer $$3, bjk $$4, ekx $$5) {
      if ($$1.B) {
         return bjl.a;
      } else {
         dgd $$6 = $$1.c_($$2);
         if ($$6 instanceof dgg) {
            $$3.a((dgg)$$6);
            $$3.a(arm.aa);
         }

         return bjl.b;
      }
   }

   @Override
   public void a(csy $$0, hv $$1, dip $$2, blv $$3, cmh $$4) {
      if ($$4.A()) {
         dgd $$5 = $$0.c_($$1);
         if ($$5 instanceof dgg) {
            ((dgg)$$5).a($$4.y());
         }
      }
   }

   @Override
   public void a(dip $$0, csy $$1, hv $$2, auf $$3) {
      double $$4 = (double)$$2.u() + 0.4 + (double)$$3.i() * 0.2;
      double $$5 = (double)$$2.v() + 0.7 + (double)$$3.i() * 0.3;
      double $$6 = (double)$$2.w() + 0.4 + (double)$$3.i() * 0.2;
      $$1.a(jv.ab, $$4, $$5, $$6, 0.0, 0.0, 0.0);
   }

   @Override
   public void a(dip $$0, csy $$1, hv $$2, dip $$3, boolean $$4) {
      bjh.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public boolean d_(dip $$0) {
      return true;
   }

   @Override
   public int a(dip $$0, csy $$1, hv $$2) {
      return chk.a($$1.c_($$2));
   }

   @Override
   protected void a(diq.a<cvz, dip> $$0) {
      $$0.a(b[0], b[1], b[2]);
   }

   @Override
   public boolean a(dip $$0, cse $$1, hv $$2, eep $$3) {
      return false;
   }
}
