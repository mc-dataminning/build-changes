import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class cyv extends cvv {
   public static final MapCodec<cyv> a = b(cyv::new);
   protected static final emf b = cwj.a(0.0, 0.0, 0.0, 16.0, 12.0, 16.0);
   public static final List<hx> c = hx.a(-2, 0, -2, 2, 1, 2).filter($$0 -> Math.abs($$0.u()) == 2 || Math.abs($$0.w()) == 2).map(hx::i).toList();

   @Override
   public MapCodec<cyv> a() {
      return a;
   }

   protected cyv(diz.d $$0) {
      super($$0);
   }

   public static boolean a(cti $$0, hx $$1, hx $$2) {
      return $$0.a_($$1.a((jb)$$2)).a(asb.cn) && $$0.a_($$1.b($$2.u() / 2, $$2.v(), $$2.w() / 2)).a(asb.co);
   }

   @Override
   public boolean g_(dja $$0) {
      return true;
   }

   @Override
   public emf a(dja $$0, cso $$1, hx $$2, elr $$3) {
      return b;
   }

   @Override
   public void a(dja $$0, cti $$1, hx $$2, aup $$3) {
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
   public dco b_(dja $$0) {
      return dco.c;
   }

   @Override
   public dgo a(hx $$0, dja $$1) {
      return new dhi($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dgo> dgp<T> a(cti $$0, dja $$1, dgq<T> $$2) {
      return $$0.B ? a($$2, dgq.m, dhi::a) : null;
   }

   @Override
   public bjv a(dja $$0, cti $$1, hx $$2, cfb $$3, bju $$4, eli $$5) {
      if ($$1.B) {
         return bjv.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         return bjv.b;
      }
   }

   @Nullable
   @Override
   public bjy b(dja $$0, cti $$1, hx $$2) {
      dgo $$3 = $$1.c_($$2);
      if ($$3 instanceof dhi) {
         vd $$4 = ((bjz)$$3).Q_();
         return new bke(($$2x, $$3x, $$4x) -> new cio($$2x, $$3x, cif.a($$1, $$2)), $$4);
      } else {
         return null;
      }
   }

   @Override
   public void a(cti $$0, hx $$1, dja $$2, bmf $$3, cmr $$4) {
      if ($$4.A()) {
         dgo $$5 = $$0.c_($$1);
         if ($$5 instanceof dhi) {
            ((dhi)$$5).a($$4.y());
         }
      }
   }

   @Override
   public boolean a(dja $$0, cso $$1, hx $$2, efa $$3) {
      return false;
   }
}
