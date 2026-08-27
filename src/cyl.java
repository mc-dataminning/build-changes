import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class cyl extends cvl {
   public static final MapCodec<cyl> a = b(cyl::new);
   protected static final elu b = cvz.a(0.0, 0.0, 0.0, 16.0, 12.0, 16.0);
   public static final List<hv> c = hv.a(-2, 0, -2, 2, 1, 2).filter($$0 -> Math.abs($$0.u()) == 2 || Math.abs($$0.w()) == 2).map(hv::i).toList();

   @Override
   public MapCodec<cyl> a() {
      return a;
   }

   protected cyl(dio.d $$0) {
      super($$0);
   }

   public static boolean a(csy $$0, hv $$1, hv $$2) {
      return $$0.a_($$1.a((iz)$$2)).a(arr.cn) && $$0.a_($$1.b($$2.u() / 2, $$2.v(), $$2.w() / 2)).a(arr.co);
   }

   @Override
   public boolean g_(dip $$0) {
      return true;
   }

   @Override
   public elu a(dip $$0, cse $$1, hv $$2, elg $$3) {
      return b;
   }

   @Override
   public void a(dip $$0, csy $$1, hv $$2, auf $$3) {
      super.a($$0, $$1, $$2, $$3);

      for (hv $$4 : c) {
         if ($$3.a(16) == 0 && a($$1, $$2, $$4)) {
            $$1.a(
               jv.t,
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
   public dce b_(dip $$0) {
      return dce.c;
   }

   @Override
   public dgd a(hv $$0, dip $$1) {
      return new dgx($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dgd> dge<T> a(csy $$0, dip $$1, dgf<T> $$2) {
      return $$0.B ? a($$2, dgf.m, dgx::a) : null;
   }

   @Override
   public bjl a(dip $$0, csy $$1, hv $$2, cer $$3, bjk $$4, ekx $$5) {
      if ($$1.B) {
         return bjl.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         return bjl.b;
      }
   }

   @Nullable
   @Override
   public bjo b(dip $$0, csy $$1, hv $$2) {
      dgd $$3 = $$1.c_($$2);
      if ($$3 instanceof dgx) {
         vb $$4 = ((bjp)$$3).Q_();
         return new bju(($$2x, $$3x, $$4x) -> new cie($$2x, $$3x, chv.a($$1, $$2)), $$4);
      } else {
         return null;
      }
   }

   @Override
   public void a(csy $$0, hv $$1, dip $$2, blv $$3, cmh $$4) {
      if ($$4.A()) {
         dgd $$5 = $$0.c_($$1);
         if ($$5 instanceof dgx) {
            ((dgx)$$5).a($$4.y());
         }
      }
   }

   @Override
   public boolean a(dip $$0, cse $$1, hv $$2, eep $$3) {
      return false;
   }
}
