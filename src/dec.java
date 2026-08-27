import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dec extends czm {
   public static final MapCodec<dec> a = b(dec::new);
   public static final dnq b = dnp.n;

   @Override
   public MapCodec<dec> a() {
      return a;
   }

   protected dec(dmy.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)));
   }

   @Override
   public void a(cwz $$0, ib $$1, dmz $$2, @Nullable bpo $$3, cqk $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      ta $$5 = cof.a($$4);
      if ($$5 != null && $$5.e("RecordItem")) {
         $$0.a($$1, $$2.a(b, Boolean.valueOf(true)), 2);
      }
   }

   @Override
   protected bnc a(dmz $$0, cwz $$1, ib $$2, cis $$3, epn $$4) {
      if ($$0.c(b) && $$1.c_($$2) instanceof dlh $$5) {
         $$5.l();
         return bnc.a($$1.B);
      } else {
         return bnc.d;
      }
   }

   @Override
   protected void a(dmz $$0, cwz $$1, ib $$2, dmz $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$1.c_($$2) instanceof dlh $$5) {
            $$5.l();
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public dkg a(ib $$0, dmz $$1) {
      return new dlh($$0, $$1);
   }

   @Override
   public boolean f_(dmz $$0) {
      return true;
   }

   @Override
   public int a(dmz $$0, cwf $$1, ib $$2, ih $$3) {
      if ($$1.c_($$2) instanceof dlh $$4 && $$4.j()) {
         return 15;
      }

      return 0;
   }

   @Override
   protected boolean d_(dmz $$0) {
      return true;
   }

   @Override
   protected int a(dmz $$0, cwz $$1, ib $$2) {
      if ($$1.c_($$2) instanceof dlh $$3 && $$3.f().d() instanceof crc $$4) {
         return $$4.h();
      }

      return 0;
   }

   @Override
   protected dgf b_(dmz $$0) {
      return dgf.c;
   }

   @Override
   protected void a(dna.a<daa, dmz> $$0) {
      $$0.a(b);
   }

   @Nullable
   @Override
   public <T extends dkg> dkh<T> a(cwz $$0, dmz $$1, dki<T> $$2) {
      return $$1.c(b) ? a($$2, dki.e, dlh::a) : null;
   }
}
