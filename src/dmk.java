import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dmk extends dna {
   public static final ech a = ecg.A;
   private final dva.a b;

   public dmk(dva.a $$0, ebp.d $$1) {
      super($$1);
      this.b = $$0;
      this.l(this.C.b().b(a, Boolean.valueOf(false)));
   }

   @Override
   protected abstract MapCodec<? extends dmk> a();

   @Override
   public dyo a(iw $$0, ebq $$1) {
      return new eae($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dyo> dyp<T> a(dkj $$0, ebq $$1, dyq<T> $$2) {
      if ($$0.C) {
         boolean $$3 = $$1.a(dnq.hp) || $$1.a(dnq.hq) || $$1.a(dnq.hr) || $$1.a(dnq.hs);
         if ($$3) {
            return a($$2, dyq.q, eae::a);
         }
      }

      return null;
   }

   public dva.a b() {
      return this.b;
   }

   @Override
   protected boolean a(ebq $$0, eyp $$1) {
      return false;
   }

   @Override
   protected void a(ebr.a<dno, ebq> $$0) {
      $$0.a(a);
   }

   @Override
   public ebq a(ded $$0) {
      return this.m().b(a, Boolean.valueOf($$0.q().D($$0.a())));
   }

   @Override
   protected void a(ebq $$0, dkj $$1, iw $$2, dno $$3, @Nullable ezi $$4, boolean $$5) {
      if (!$$1.C) {
         boolean $$6 = $$1.D($$2);
         if ($$6 != $$0.c(a)) {
            $$1.a($$2, $$0.b(a, Boolean.valueOf($$6)), 2);
         }
      }
   }
}
