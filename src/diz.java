import com.mojang.serialization.MapCodec;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public class diz extends cwc {
   public static final MapCodec<diz> a = b(diz::new);
   public static final dkb b = djb.a;
   public static final dkf<dkj> c = djb.c;

   @Override
   public MapCodec<diz> a() {
      return a;
   }

   public diz(djg.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ic.c).a(c, dkj.a));
   }

   @Nullable
   @Override
   public dgv a(hx $$0, djh $$1) {
      return null;
   }

   public static dgv a(hx $$0, djh $$1, djh $$2, ic $$3, boolean $$4, boolean $$5) {
      return new djd($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public <T extends dgv> dgw<T> a(ctp $$0, djh $$1, dgx<T> $$2) {
      return a($$2, dgx.k, djd::a);
   }

   @Override
   public void a(djh $$0, ctp $$1, hx $$2, djh $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dgv $$5 = $$1.c_($$2);
         if ($$5 instanceof djd) {
            ((djd)$$5).l();
         }
      }
   }

   @Override
   public void a(ctq $$0, hx $$1, djh $$2) {
      hx $$3 = $$1.a($$2.c(b).g());
      djh $$4 = $$0.a_($$3);
      if ($$4.b() instanceof dja && $$4.c(dja.c)) {
         $$0.a($$3, false);
      }
   }

   @Override
   public bkb a(djh $$0, ctp $$1, hx $$2, cfi $$3, bka $$4, elp $$5) {
      if (!$$1.B && $$1.c_($$2) == null) {
         $$1.a($$2, false);
         return bkb.b;
      } else {
         return bkb.d;
      }
   }

   @Override
   public List<cmy> a(djh $$0, ehc.a $$1) {
      djd $$2 = this.a($$1.a(), hx.a($$1.a(ejh.f)));
      return $$2 == null ? Collections.emptyList() : $$2.k().a($$1);
   }

   @Override
   public emm a(djh $$0, csv $$1, hx $$2, ely $$3) {
      return emj.a();
   }

   @Override
   public emm b(djh $$0, csv $$1, hx $$2, ely $$3) {
      djd $$4 = this.a($$1, $$2);
      return $$4 != null ? $$4.a($$1, $$2) : emj.a();
   }

   @Nullable
   private djd a(csv $$0, hx $$1) {
      dgv $$2 = $$0.c_($$1);
      return $$2 instanceof djd ? (djd)$$2 : null;
   }

   @Override
   public cmy a(cts $$0, hx $$1, djh $$2) {
      return cmy.f;
   }

   @Override
   public djh a(djh $$0, ddc $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public djh a(djh $$0, dbm $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dji.a<cwq, djh> $$0) {
      $$0.a(b, c);
   }

   @Override
   public boolean a(djh $$0, csv $$1, hx $$2, efh $$3) {
      return false;
   }
}
