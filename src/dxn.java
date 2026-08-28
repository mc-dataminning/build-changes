import com.mojang.serialization.MapCodec;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public class dxn extends djy {
   public static final MapCodec<dxn> a = b(dxn::new);
   public static final dys<jm> b = dxp.a;
   public static final dys<dyw> c = dxp.c;

   @Override
   public MapCodec<dxn> a() {
      return a;
   }

   public dxn(dxu.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jm.c).b(c, dyw.a));
   }

   @Nullable
   @Override
   public dux a(jh $$0, dxv $$1) {
      return null;
   }

   public static dux a(jh $$0, dxv $$1, dxv $$2, jm $$3, boolean $$4, boolean $$5) {
      return new dxr($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public <T extends dux> duy<T> a(dhi $$0, dxv $$1, duz<T> $$2) {
      return a($$2, duz.l, dxr::a);
   }

   @Override
   protected void a(dxv $$0, dhi $$1, jh $$2, dxv $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dux $$5 = $$1.c_($$2);
         if ($$5 instanceof dxr) {
            ((dxr)$$5).k();
         }
      }
   }

   @Override
   public void a(dhj $$0, jh $$1, dxv $$2) {
      jh $$3 = $$1.a($$2.c(b).g());
      dxv $$4 = $$0.a_($$3);
      if ($$4.b() instanceof dxo && $$4.c(dxo.c)) {
         $$0.a($$3, false);
      }
   }

   @Override
   protected btj a(dxv $$0, dhi $$1, jh $$2, cpx $$3, fbu $$4) {
      if (!$$1.C && $$1.c_($$2) == null) {
         $$1.a($$2, false);
         return btj.c;
      } else {
         return btj.e;
      }
   }

   @Override
   protected List<cxp> a(dxv $$0, ews.a $$1) {
      dxr $$2 = this.a($$1.a(), jh.a($$1.a(ezj.f)));
      return $$2 == null ? Collections.emptyList() : $$2.j().a($$1);
   }

   @Override
   protected fcs a(dxv $$0, dgn $$1, jh $$2, fcd $$3) {
      return fcp.a();
   }

   @Override
   protected fcs b(dxv $$0, dgn $$1, jh $$2, fcd $$3) {
      dxr $$4 = this.a($$1, $$2);
      return $$4 != null ? $$4.a($$1, $$2) : fcp.a();
   }

   @Nullable
   private dxr a(dgn $$0, jh $$1) {
      dux $$2 = $$0.c_($$1);
      return $$2 instanceof dxr ? (dxr)$$2 : null;
   }

   @Override
   public cxp a(dhl $$0, jh $$1, dxv $$2) {
      return cxp.j;
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
   protected boolean a(dxv $$0, eum $$1) {
      return false;
   }
}
