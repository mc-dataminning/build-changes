import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dmj extends dna {
   public static final eco<jc> a = drp.e;
   public static final ech b = ecg.u;

   protected dmj(ebp.d $$0) {
      super($$0);
      this.l(this.C.b().b(a, jc.c).b(b, Boolean.valueOf(false)));
   }

   @Override
   protected abstract MapCodec<? extends dmj> a();

   @Override
   protected bvc a(ebq $$0, dkj $$1, iw $$2, csi $$3, ffy $$4) {
      if (!$$1.C) {
         this.a($$1, $$2, $$3);
      }

      return bvc.a;
   }

   protected abstract void a(dkj var1, iw var2, csi var3);

   @Override
   public ebq a(ded $$0) {
      return this.m().b(a, $$0.g().g());
   }

   @Override
   protected void a(ebq $$0, asb $$1, iw $$2, boolean $$3) {
      buy.a($$0, $$1, $$2);
   }

   @Override
   protected boolean c_(ebq $$0) {
      return true;
   }

   @Override
   protected int a(ebq $$0, dkj $$1, iw $$2) {
      return cwb.a($$1.c_($$2));
   }

   @Override
   protected ebq a(ebq $$0, dui $$1) {
      return $$0.b(a, $$1.a($$0.c(a)));
   }

   @Override
   protected ebq a(ebq $$0, dsr $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(ebr.a<dno, ebq> $$0) {
      $$0.a(a, b);
   }

   @Nullable
   protected static <T extends dyo> dyp<T> a(dkj $$0, dyq<T> $$1, dyq<? extends dyb> $$2) {
      return $$0 instanceof asb $$3 ? a($$1, $$2, ($$1x, $$2x, $$3x, $$4) -> dyb.a($$3, $$2x, $$3x, $$4)) : null;
   }
}
