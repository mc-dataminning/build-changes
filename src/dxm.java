import com.mojang.serialization.MapCodec;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public class dxm extends djx {
   public static final MapCodec<dxm> a = b(dxm::new);
   public static final dyr<jm> b = dxo.a;
   public static final dyr<dyv> c = dxo.c;

   @Override
   public MapCodec<dxm> a() {
      return a;
   }

   public dxm(dxt.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jm.c).b(c, dyv.a));
   }

   @Nullable
   @Override
   public duw a(jh $$0, dxu $$1) {
      return null;
   }

   public static duw a(jh $$0, dxu $$1, dxu $$2, jm $$3, boolean $$4, boolean $$5) {
      return new dxq($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public <T extends duw> dux<T> a(dhh $$0, dxu $$1, duy<T> $$2) {
      return a($$2, duy.l, dxq::a);
   }

   @Override
   protected void a(dxu $$0, dhh $$1, jh $$2, dxu $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         duw $$5 = $$1.c_($$2);
         if ($$5 instanceof dxq) {
            ((dxq)$$5).k();
         }
      }
   }

   @Override
   public void a(dhi $$0, jh $$1, dxu $$2) {
      jh $$3 = $$1.a($$2.c(b).g());
      dxu $$4 = $$0.a_($$3);
      if ($$4.b() instanceof dxn && $$4.c(dxn.c)) {
         $$0.a($$3, false);
      }
   }

   @Override
   protected bti a(dxu $$0, dhh $$1, jh $$2, cpw $$3, fbt $$4) {
      if (!$$1.C && $$1.c_($$2) == null) {
         $$1.a($$2, false);
         return bti.c;
      } else {
         return bti.e;
      }
   }

   @Override
   protected List<cxo> a(dxu $$0, ewr.a $$1) {
      dxq $$2 = this.a($$1.a(), jh.a($$1.a(ezi.f)));
      return $$2 == null ? Collections.emptyList() : $$2.j().a($$1);
   }

   @Override
   protected fcr a(dxu $$0, dgm $$1, jh $$2, fcc $$3) {
      return fco.a();
   }

   @Override
   protected fcr b(dxu $$0, dgm $$1, jh $$2, fcc $$3) {
      dxq $$4 = this.a($$1, $$2);
      return $$4 != null ? $$4.a($$1, $$2) : fco.a();
   }

   @Nullable
   private dxq a(dgm $$0, jh $$1) {
      duw $$2 = $$0.c_($$1);
      return $$2 instanceof dxq ? (dxq)$$2 : null;
   }

   @Override
   public cxo a(dhk $$0, jh $$1, dxu $$2) {
      return cxo.k;
   }

   @Override
   protected dxu a(dxu $$0, drb $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dxu a(dxu $$0, dpk $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dxv.a<dkl, dxu> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected boolean a(dxu $$0, eul $$1) {
      return false;
   }
}
