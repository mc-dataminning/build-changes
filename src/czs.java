import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class czs extends czm implements czr {
   public static final MapCodec<czs> a = b(czs::new);

   @Override
   public MapCodec<czs> a() {
      return a;
   }

   public czs(dmy.d $$0) {
      super($$0);
   }

   @Override
   public cpb b() {
      return cpb.a;
   }

   @Override
   public dkg a(ib $$0, dmz $$1) {
      return new dkb($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dkg> dkh<T> a(cwz $$0, dmz $$1, dki<T> $$2) {
      return a($$2, dki.o, dkb::a);
   }

   @Override
   protected bnc a(dmz $$0, cwz $$1, ib $$2, cis $$3, epn $$4) {
      if ($$1.B) {
         return bnc.a;
      } else {
         dkg $$5 = $$1.c_($$2);
         if ($$5 instanceof dkb) {
            $$3.a((dkb)$$5);
            $$3.a(aui.ab);
         }

         return bnc.b;
      }
   }

   @Override
   protected dgf b_(dmz $$0) {
      return dgf.c;
   }

   @Override
   public void a(cwz $$0, ib $$1, dmz $$2, bpo $$3, cqk $$4) {
      if ($$4.B()) {
         dkg $$5 = $$0.c_($$1);
         if ($$5 instanceof dkb) {
            ((dkb)$$5).a($$4.z());
         }
      }
   }
}
