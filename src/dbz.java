import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dbz extends dcq {
   public static final drb a = dha.aE;
   public static final dqy b = dqx.r;

   protected dbz(dqg.d $$0) {
      super($$0);
      this.k(this.E.b().a(a, is.c).a(b, Boolean.valueOf(false)));
   }

   @Override
   protected abstract MapCodec<? extends dbz> a();

   @Override
   protected bpm a(dqh $$0, dad $$1, in $$2, clh $$3, etl $$4) {
      if ($$1.B) {
         return bpm.a;
      } else {
         this.a($$1, $$2, $$3);
         return bpm.b;
      }
   }

   protected abstract void a(dad var1, in var2, clh var3);

   @Override
   public dqh a(cwi $$0) {
      return this.n().a(a, $$0.g().g());
   }

   @Override
   protected void a(dqh $$0, dad $$1, in $$2, dqh $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dnm $$5 = $$1.c_($$2);
         if ($$5 instanceof dna) {
            if ($$1 instanceof aqh) {
               bpi.a($$1, $$2, (dna)$$5);
               ((dna)$$5).a((aqh)$$1, etp.b($$2));
            }

            super.a($$0, $$1, $$2, $$3, $$4);
            $$1.c($$2, this);
         } else {
            super.a($$0, $$1, $$2, $$3, $$4);
         }
      }
   }

   @Override
   protected boolean c_(dqh $$0) {
      return true;
   }

   @Override
   protected int a(dqh $$0, dad $$1, in $$2) {
      return cod.a($$1.c_($$2));
   }

   @Override
   protected djk a_(dqh $$0) {
      return djk.c;
   }

   @Override
   protected dqh a(dqh $$0, djr $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   protected dqh a(dqh $$0, dib $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dqi.a<dde, dqh> $$0) {
      $$0.a(a, b);
   }

   @Nullable
   protected static <T extends dnm> dnn<T> a(dad $$0, dno<T> $$1, dno<? extends dna> $$2) {
      return $$0.B ? null : a($$1, $$2, dna::a);
   }
}
