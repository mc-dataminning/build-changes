import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class cvm extends cso {
   public static final MapCodec<cvm> a = b(cvm::new);
   protected static final eia b = ctc.a(0.0, 0.0, 0.0, 16.0, 12.0, 16.0);
   public static final List<gw> c = gw.a(-2, 0, -2, 2, 1, 2).filter($$0 -> Math.abs($$0.u()) == 2 || Math.abs($$0.w()) == 2).map(gw::i).toList();

   @Override
   public MapCodec<cvm> a() {
      return a;
   }

   protected cvm(dfc.d $$0) {
      super($$0);
   }

   public static boolean a(cqb $$0, gw $$1, gw $$2) {
      return $$0.a_($$1.a((hy)$$2)).a(apv.cn) && $$0.a_($$1.b($$2.u() / 2, $$2.v(), $$2.w() / 2)).a(apv.co);
   }

   @Override
   public boolean g_(dfd $$0) {
      return true;
   }

   @Override
   public eia a(dfd $$0, cph $$1, gw $$2, ehm $$3) {
      return b;
   }

   @Override
   public void a(dfd $$0, cqb $$1, gw $$2, ash $$3) {
      super.a($$0, $$1, $$2, $$3);

      for (gw $$4 : c) {
         if ($$3.a(16) == 0 && a($$1, $$2, $$4)) {
            $$1.a(
               iv.t,
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
   public czg b_(dfd $$0) {
      return czg.c;
   }

   @Override
   public dcz a(gw $$0, dfd $$1) {
      return new dds($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dcz> dda<T> a(cqb $$0, dfd $$1, ddb<T> $$2) {
      return $$0.B ? a($$2, ddb.m, dds::a) : null;
   }

   @Override
   public bhe a(dfd $$0, cqb $$1, gw $$2, cca $$3, bhd $$4, ehd $$5) {
      if ($$1.B) {
         return bhe.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         return bhe.b;
      }
   }

   @Nullable
   @Override
   public bhh b(dfd $$0, cqb $$1, gw $$2) {
      dcz $$3 = $$1.c_($$2);
      if ($$3 instanceof dds) {
         tl $$4 = ((bhi)$$3).N_();
         return new bhm(($$2x, $$3x, $$4x) -> new cfj($$2x, $$3x, cfc.a($$1, $$2)), $$4);
      } else {
         return null;
      }
   }

   @Override
   public void a(cqb $$0, gw $$1, dfd $$2, bjm $$3, cjl $$4) {
      if ($$4.A()) {
         dcz $$5 = $$0.c_($$1);
         if ($$5 instanceof dds) {
            ((dds)$$5).a($$4.y());
         }
      }
   }

   @Override
   public boolean a(dfd $$0, cph $$1, gw $$2, eaw $$3) {
      return false;
   }
}
