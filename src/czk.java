import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class czk extends cwk {
   public static final MapCodec<czk> a = b(czk::new);
   protected static final emv b = cwy.a(0.0, 0.0, 0.0, 16.0, 12.0, 16.0);
   public static final List<hx> c = hx.a(-2, 0, -2, 2, 1, 2).filter($$0 -> Math.abs($$0.u()) == 2 || Math.abs($$0.w()) == 2).map(hx::i).toList();

   @Override
   public MapCodec<czk> a() {
      return a;
   }

   protected czk(djo.d $$0) {
      super($$0);
   }

   public static boolean a(ctx $$0, hx $$1, hx $$2) {
      return $$0.a_($$1.a((jb)$$2)).a(asi.cn) && $$0.a_($$1.b($$2.u() / 2, $$2.v(), $$2.w() / 2)).a(asi.co);
   }

   @Override
   public boolean g_(djp $$0) {
      return true;
   }

   @Override
   public emv a(djp $$0, ctd $$1, hx $$2, emh $$3) {
      return b;
   }

   @Override
   public void a(djp $$0, ctx $$1, hx $$2, auw $$3) {
      super.a($$0, $$1, $$2, $$3);

      for (hx $$4 : c) {
         if ($$3.a(16) == 0 && a($$1, $$2, $$4)) {
            $$1.a(
               jx.t,
               (double)$$2.u() + 0.5,
               (double)$$2.v() + 2.0,
               (double)$$2.w() + 0.5,
               (double)((float)$$4.u() + $$3.i()) - 0.5,
               (double)((float)$$4.v() - $$3.i() - 1.0F),
               (double)((float)$$4.w() + $$3.i()) - 0.5
            );
         }
      }
   }

   @Override
   public ddd b_(djp $$0) {
      return ddd.c;
   }

   @Override
   public dhd a(hx $$0, djp $$1) {
      return new dhx($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dhd> dhe<T> a(ctx $$0, djp $$1, dhf<T> $$2) {
      return $$0.B ? a($$2, dhf.m, dhx::a) : null;
   }

   @Override
   public bkc a(djp $$0, ctx $$1, hx $$2, cfq $$3, ely $$4) {
      if ($$1.B) {
         return bkc.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         return bkc.b;
      }
   }

   @Nullable
   @Override
   public bkg b(djp $$0, ctx $$1, hx $$2) {
      dhd $$3 = $$1.c_($$2);
      if ($$3 instanceof dhx) {
         vg $$4 = ((bkh)$$3).Q_();
         return new bkm(($$2x, $$3x, $$4x) -> new cjd($$2x, $$3x, ciu.a($$1, $$2)), $$4);
      } else {
         return null;
      }
   }

   @Override
   public void a(ctx $$0, hx $$1, djp $$2, bmo $$3, cng $$4) {
      if ($$4.A()) {
         dhd $$5 = $$0.c_($$1);
         if ($$5 instanceof dhx) {
            ((dhx)$$5).a($$4.y());
         }
      }
   }

   @Override
   public boolean a(djp $$0, ctd $$1, hx $$2, efp $$3) {
      return false;
   }
}
