import com.mojang.serialization.MapCodec;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public class djh extends cwk {
   public static final MapCodec<djh> a = b(djh::new);
   public static final dkj b = djj.a;
   public static final dkn<dkr> c = djj.c;

   @Override
   public MapCodec<djh> a() {
      return a;
   }

   public djh(djo.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ic.c).a(c, dkr.a));
   }

   @Nullable
   @Override
   public dhd a(hx $$0, djp $$1) {
      return null;
   }

   public static dhd a(hx $$0, djp $$1, djp $$2, ic $$3, boolean $$4, boolean $$5) {
      return new djl($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public <T extends dhd> dhe<T> a(ctx $$0, djp $$1, dhf<T> $$2) {
      return a($$2, dhf.k, djl::a);
   }

   @Override
   public void a(djp $$0, ctx $$1, hx $$2, djp $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dhd $$5 = $$1.c_($$2);
         if ($$5 instanceof djl) {
            ((djl)$$5).l();
         }
      }
   }

   @Override
   public void a(cty $$0, hx $$1, djp $$2) {
      hx $$3 = $$1.a($$2.c(b).g());
      djp $$4 = $$0.a_($$3);
      if ($$4.b() instanceof dji && $$4.c(dji.c)) {
         $$0.a($$3, false);
      }
   }

   @Override
   public bkc a(djp $$0, ctx $$1, hx $$2, cfq $$3, ely $$4) {
      if (!$$1.B && $$1.c_($$2) == null) {
         $$1.a($$2, false);
         return bkc.b;
      } else {
         return bkc.d;
      }
   }

   @Override
   public List<cng> a(djp $$0, ehl.a $$1) {
      djl $$2 = this.a($$1.a(), hx.a($$1.a(ejq.f)));
      return $$2 == null ? Collections.emptyList() : $$2.k().a($$1);
   }

   @Override
   public emv a(djp $$0, ctd $$1, hx $$2, emh $$3) {
      return ems.a();
   }

   @Override
   public emv b(djp $$0, ctd $$1, hx $$2, emh $$3) {
      djl $$4 = this.a($$1, $$2);
      return $$4 != null ? $$4.a($$1, $$2) : ems.a();
   }

   @Nullable
   private djl a(ctd $$0, hx $$1) {
      dhd $$2 = $$0.c_($$1);
      return $$2 instanceof djl ? (djl)$$2 : null;
   }

   @Override
   public cng a(cua $$0, hx $$1, djp $$2) {
      return cng.f;
   }

   @Override
   public djp a(djp $$0, ddk $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public djp a(djp $$0, dbu $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(djq.a<cwy, djp> $$0) {
      $$0.a(b, c);
   }

   @Override
   public boolean a(djp $$0, ctd $$1, hx $$2, efp $$3) {
      return false;
   }
}
