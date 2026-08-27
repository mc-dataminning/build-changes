import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class cyv extends czm {
   public static final dnt a = ddv.aE;
   public static final dnq b = dnp.r;

   protected cyv(dmy.d $$0) {
      super($$0);
      this.k(this.E.b().a(a, ih.c).a(b, Boolean.valueOf(false)));
   }

   @Override
   protected abstract MapCodec<? extends cyv> a();

   @Override
   protected bnc a(dmz $$0, cwz $$1, ib $$2, cis $$3, epn $$4) {
      if ($$1.B) {
         return bnc.a;
      } else {
         this.a($$1, $$2, $$3);
         return bnc.b;
      }
   }

   protected abstract void a(cwz var1, ib var2, cis var3);

   @Override
   public dmz a(css $$0) {
      return this.o().a(a, $$0.g().g());
   }

   @Override
   public void a(cwz $$0, ib $$1, dmz $$2, bpo $$3, cqk $$4) {
      if ($$4.B()) {
         dkg $$5 = $$0.c_($$1);
         if ($$5 instanceof djv) {
            ((djv)$$5).a($$4.z());
         }
      }
   }

   @Override
   protected void a(dmz $$0, cwz $$1, ib $$2, dmz $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dkg $$5 = $$1.c_($$2);
         if ($$5 instanceof djv) {
            if ($$1 instanceof apf) {
               bmy.a($$1, $$2, (djv)$$5);
               ((djv)$$5).a((apf)$$1, epr.b($$2));
            }

            super.a($$0, $$1, $$2, $$3, $$4);
            $$1.c($$2, this);
         } else {
            super.a($$0, $$1, $$2, $$3, $$4);
         }
      }
   }

   @Override
   protected boolean d_(dmz $$0) {
      return true;
   }

   @Override
   protected int a(dmz $$0, cwz $$1, ib $$2) {
      return clo.a($$1.c_($$2));
   }

   @Override
   protected dgf b_(dmz $$0) {
      return dgf.c;
   }

   @Override
   protected dmz a(dmz $$0, dgm $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   protected dmz a(dmz $$0, dew $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dna.a<daa, dmz> $$0) {
      $$0.a(a, b);
   }

   @Nullable
   protected static <T extends dkg> dkh<T> a(cwz $$0, dki<T> $$1, dki<? extends djv> $$2) {
      return $$0.B ? null : a($$1, $$2, djv::a);
   }
}
