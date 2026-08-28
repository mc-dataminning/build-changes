import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class diu extends dic {
   public static final MapCodec<diu> a = b(diu::new);
   public static final dwm[] b = new dwm[]{dwl.k, dwl.l, dwl.m};
   protected static final fas c = fap.a(diq.a(1.0, 0.0, 1.0, 15.0, 2.0, 15.0), diq.a(7.0, 0.0, 7.0, 9.0, 14.0, 9.0));

   @Override
   public MapCodec<diu> a() {
      return a;
   }

   public diu(dvu.d $$0) {
      super($$0);
      this.l(this.F.b().b(b[0], Boolean.valueOf(false)).b(b[1], Boolean.valueOf(false)).b(b[2], Boolean.valueOf(false)));
   }

   @Override
   protected dow a_(dvv $$0) {
      return dow.c;
   }

   @Override
   public dsy a(jh $$0, dvv $$1) {
      return new dtb($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dsy> dsz<T> a(dfm $$0, dvv $$1, dta<T> $$2) {
      return $$0.C ? null : a($$2, dta.l, dtb::a);
   }

   @Override
   protected fas a(dvv $$0, der $$1, jh $$2, fad $$3) {
      return c;
   }

   @Override
   protected bsk a(dvv $$0, dfm $$1, jh $$2, cou $$3, ezu $$4) {
      if (!$$1.C && $$1.c_($$2) instanceof dtb $$5) {
         $$3.a($$5);
         $$3.a(awx.aa);
      }

      return bsk.a;
   }

   @Override
   public void a(dvv $$0, dfm $$1, jh $$2, azu $$3) {
      double $$4 = (double)$$2.u() + 0.4 + (double)$$3.i() * 0.2;
      double $$5 = (double)$$2.v() + 0.7 + (double)$$3.i() * 0.3;
      double $$6 = (double)$$2.w() + 0.4 + (double)$$3.i() * 0.2;
      $$1.a(ls.ae, $$4, $$5, $$6, 0.0, 0.0, 0.0);
   }

   @Override
   protected void a(dvv $$0, dfm $$1, jh $$2, dvv $$3, boolean $$4) {
      bsg.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected boolean c_(dvv $$0) {
      return true;
   }

   @Override
   protected int a(dvv $$0, dfm $$1, jh $$2) {
      return crz.a($$1.c_($$2));
   }

   @Override
   protected void a(dvw.a<diq, dvv> $$0) {
      $$0.a(b[0], b[1], b[2]);
   }

   @Override
   protected boolean a(dvv $$0, esk $$1) {
      return false;
   }
}
