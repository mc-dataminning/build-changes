import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class cxm extends cum {
   public static final MapCodec<cxm> a = b(cxm::new);
   protected static final ekn b = cva.a(0.0, 0.0, 0.0, 16.0, 12.0, 16.0);
   public static final List<ht> c = ht.a(-2, 0, -2, 2, 1, 2).filter($$0 -> Math.abs($$0.u()) == 2 || Math.abs($$0.w()) == 2).map(ht::i).toList();

   @Override
   public MapCodec<cxm> a() {
      return a;
   }

   protected cxm(dhh.d $$0) {
      super($$0);
   }

   public static boolean a(csa $$0, ht $$1, ht $$2) {
      return $$0.a_($$1.a((iw)$$2)).a(arg.cn) && $$0.a_($$1.b($$2.u() / 2, $$2.v(), $$2.w() / 2)).a(arg.co);
   }

   @Override
   public boolean g_(dhi $$0) {
      return true;
   }

   @Override
   public ekn a(dhi $$0, crg $$1, ht $$2, ejz $$3) {
      return b;
   }

   @Override
   public void a(dhi $$0, csa $$1, ht $$2, ats $$3) {
      super.a($$0, $$1, $$2, $$3);

      for (ht $$4 : c) {
         if ($$3.a(16) == 0 && a($$1, $$2, $$4)) {
            $$1.a(
               js.t,
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
   public dbf b_(dhi $$0) {
      return dbf.c;
   }

   @Override
   public dfd a(ht $$0, dhi $$1) {
      return new dfx($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dfd> dfe<T> a(csa $$0, dhi $$1, dff<T> $$2) {
      return $$0.B ? a($$2, dff.m, dfx::a) : null;
   }

   @Override
   public bix a(dhi $$0, csa $$1, ht $$2, cdu $$3, biw $$4, ejq $$5) {
      if ($$1.B) {
         return bix.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         return bix.b;
      }
   }

   @Nullable
   @Override
   public bja b(dhi $$0, csa $$1, ht $$2) {
      dfd $$3 = $$1.c_($$2);
      if ($$3 instanceof dfx) {
         ur $$4 = ((bjb)$$3).P_();
         return new bjf(($$2x, $$3x, $$4x) -> new chg($$2x, $$3x, cgx.a($$1, $$2)), $$4);
      } else {
         return null;
      }
   }

   @Override
   public void a(csa $$0, ht $$1, dhi $$2, blg $$3, clj $$4) {
      if ($$4.A()) {
         dfd $$5 = $$0.c_($$1);
         if ($$5 instanceof dfx) {
            ((dfx)$$5).a($$4.y());
         }
      }
   }

   @Override
   public boolean a(dhi $$0, crg $$1, ht $$2, edi $$3) {
      return false;
   }
}
