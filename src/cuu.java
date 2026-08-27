import java.util.List;
import javax.annotation.Nullable;

public class cuu extends crz {
   protected static final ehx a = csm.a(0.0, 0.0, 0.0, 16.0, 12.0, 16.0);
   public static final List<gu> b = gu.a(-2, 0, -2, 2, 1, 2).filter($$0 -> Math.abs($$0.u()) == 2 || Math.abs($$0.w()) == 2).map(gu::i).toList();

   protected cuu(dez.d $$0) {
      super($$0);
   }

   public static boolean a(cpm $$0, gu $$1, gu $$2) {
      return $$0.a_($$1.a((hz)$$2)).a(apl.cn) && $$0.a_($$1.b($$2.u() / 2, $$2.v(), $$2.w() / 2)).a(apl.co);
   }

   @Override
   public boolean g_(dfa $$0) {
      return true;
   }

   @Override
   public ehx a(dfa $$0, cos $$1, gu $$2, ehj $$3) {
      return a;
   }

   @Override
   public void a(dfa $$0, cpm $$1, gu $$2, aru $$3) {
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
   public cyr b_(dfa $$0) {
      return cyr.c;
   }

   @Override
   public dcm a(gu $$0, dfa $$1) {
      return new ddf($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dcm> dcn<T> a(cpm $$0, dfa $$1, dco<T> $$2) {
      return $$0.B ? a($$2, dco.m, ddf::a) : null;
   }

   @Override
   public bgq a(dfa $$0, cpm $$1, gu $$2, cbn $$3, bgp $$4, eha $$5) {
      if ($$1.B) {
         return bgq.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         return bgq.b;
      }
   }

   @Nullable
   @Override
   public bgt b(dfa $$0, cpm $$1, gu $$2) {
      dcm $$3 = $$1.c_($$2);
      if ($$3 instanceof ddf) {
         tf $$4 = ((bgu)$$3).H_();
         return new bgy(($$2x, $$3x, $$4x) -> new cew($$2x, $$3x, cep.a($$1, $$2)), $$4);
      } else {
         return null;
      }
   }

   @Override
   public void a(cpm $$0, gu $$1, dfa $$2, biy $$3, ciy $$4) {
      if ($$4.A()) {
         dcm $$5 = $$0.c_($$1);
         if ($$5 instanceof ddf) {
            ((ddf)$$5).a($$4.y());
         }
      }
   }

   @Override
   public boolean a(dfa $$0, cos $$1, gu $$2, eat $$3) {
      return false;
   }
}
