import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dly extends dmo {
   public static final ebv a = ebu.A;
   private final duo.a b;

   public dly(duo.a $$0, ebd.d $$1) {
      super($$1);
      this.b = $$0;
      this.l(this.C.b().b(a, Boolean.valueOf(false)));
   }

   @Override
   protected abstract MapCodec<? extends dly> a();

   @Override
   public dyc a(iv $$0, ebe $$1) {
      return new dzs($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dyc> dyd<T> a(djx $$0, ebe $$1, dye<T> $$2) {
      if ($$0.C) {
         boolean $$3 = $$1.a(dne.hp) || $$1.a(dne.hq) || $$1.a(dne.hr) || $$1.a(dne.hs);
         if ($$3) {
            return a($$2, dye.q, dzs::a);
         }
      }

      return null;
   }

   public duo.a b() {
      return this.b;
   }

   @Override
   protected boolean a(ebe $$0, eyd $$1) {
      return false;
   }

   @Override
   protected void a(ebf.a<dnc, ebe> $$0) {
      $$0.a(a);
   }

   @Override
   public ebe a(ddr $$0) {
      return this.m().b(a, Boolean.valueOf($$0.q().D($$0.a())));
   }

   @Override
   protected void a(ebe $$0, djx $$1, iv $$2, dnc $$3, @Nullable eyw $$4, boolean $$5) {
      if (!$$1.C) {
         boolean $$6 = $$1.D($$2);
         if ($$6 != $$0.c(a)) {
            $$1.a($$2, $$0.b(a, Boolean.valueOf($$6)), 2);
         }
      }
   }
}
