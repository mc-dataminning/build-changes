import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dhg extends cyv {
   public static final MapCodec<dhg> c = b(dhg::new);

   @Override
   public MapCodec<dhg> a() {
      return c;
   }

   protected dhg(dmy.d $$0) {
      super($$0);
   }

   @Override
   public dkg a(ib $$0, dmz $$1) {
      return new dls($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dkg> dkh<T> a(cwz $$0, dmz $$1, dki<T> $$2) {
      return a($$0, $$2, dki.B);
   }

   @Override
   protected void a(cwz $$0, ib $$1, cis $$2) {
      dkg $$3 = $$0.c_($$1);
      if ($$3 instanceof dls) {
         $$2.a((bng)$$3);
         $$2.a(aui.at);
      }
   }

   @Override
   public void a(dmz $$0, cwz $$1, ib $$2, axd $$3) {
      if ($$0.c(b)) {
         double $$4 = (double)$$2.u() + 0.5;
         double $$5 = (double)$$2.v();
         double $$6 = (double)$$2.w() + 0.5;
         if ($$3.j() < 0.1) {
            $$1.a($$4, $$5, $$6, aty.xG, atz.e, 1.0F, 1.0F, false);
         }

         $$1.a(kc.ac, $$4, $$5 + 1.1, $$6, 0.0, 0.0, 0.0);
      }
   }
}
