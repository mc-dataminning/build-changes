import java.util.List;
import javax.annotation.Nullable;

public class cut extends cry {
   protected static final ehw a = csl.a(0.0, 0.0, 0.0, 16.0, 12.0, 16.0);
   public static final List<gu> b = gu.a(-2, 0, -2, 2, 1, 2).filter($$0 -> Math.abs($$0.u()) == 2 || Math.abs($$0.w()) == 2).map(gu::i).toList();

   protected cut(dey.d $$0) {
      super($$0);
   }

   public static boolean a(cpl $$0, gu $$1, gu $$2) {
      return $$0.a_($$1.a((hz)$$2)).a(apl.cn) && $$0.a_($$1.b($$2.u() / 2, $$2.v(), $$2.w() / 2)).a(apl.co);
   }

   @Override
   public boolean g_(dez $$0) {
      return true;
   }

   @Override
   public ehw a(dez $$0, cor $$1, gu $$2, ehi $$3) {
      return a;
   }

   @Override
   public void a(dez $$0, cpl $$1, gu $$2, aru $$3) {
      super.a($$0, $$1, $$2, $$3);

      for (gu $$4 : b) {
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
   public cyq b_(dez $$0) {
      return cyq.c;
   }

   @Override
   public dcl a(gu $$0, dez $$1) {
      return new dde($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dcl> dcm<T> a(cpl $$0, dez $$1, dcn<T> $$2) {
      return $$0.B ? a($$2, dcn.m, dde::a) : null;
   }

   @Override
   public bgq a(dez $$0, cpl $$1, gu $$2, cbm $$3, bgp $$4, egz $$5) {
      if ($$1.B) {
         return bgq.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         return bgq.b;
      }
   }

   @Nullable
   @Override
   public bgt b(dez $$0, cpl $$1, gu $$2) {
      dcl $$3 = $$1.c_($$2);
      if ($$3 instanceof dde) {
         tf $$4 = ((bgu)$$3).H_();
         return new bgy(($$2x, $$3x, $$4x) -> new cev($$2x, $$3x, ceo.a($$1, $$2)), $$4);
      } else {
         return null;
      }
   }

   @Override
   public void a(cpl $$0, gu $$1, dez $$2, biy $$3, cix $$4) {
      if ($$4.A()) {
         dcl $$5 = $$0.c_($$1);
         if ($$5 instanceof dde) {
            ((dde)$$5).a($$4.y());
         }
      }
   }

   @Override
   public boolean a(dez $$0, cor $$1, gu $$2, eas $$3) {
      return false;
   }
}
