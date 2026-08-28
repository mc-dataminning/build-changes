import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dpd extends dno {
   public static final MapCodec<dpd> a = b(dpd::new);
   public static final ech b = ecg.A;
   public static final ech c = ecg.u;

   @Override
   protected MapCodec<? extends dpd> a() {
      return a;
   }

   public dpd(ebp.d $$0) {
      super($$0);
      this.l(this.m().b(c, Boolean.valueOf(false)).b(b, Boolean.valueOf(false)));
   }

   @Override
   protected void a(ebq $$0, dkj $$1, iw $$2, ebq $$3, boolean $$4) {
      if ($$3.b() != $$0.b() && $$1 instanceof asb $$5) {
         this.a($$0, $$5, $$2);
      }
   }

   @Override
   protected void a(ebq $$0, dkj $$1, iw $$2, dno $$3, @Nullable ezi $$4, boolean $$5) {
      if ($$1 instanceof asb $$6) {
         this.a($$0, $$6, $$2);
      }
   }

   public void a(ebq $$0, asb $$1, iw $$2) {
      boolean $$3 = $$1.D($$2);
      if ($$3 != $$0.c(b)) {
         ebq $$4 = $$0;
         if (!$$0.c(b)) {
            $$4 = $$0.a(c);
            $$1.a(null, $$2, $$4.c(c) ? awy.fK : awy.fL, awz.e);
         }

         $$1.a($$2, $$4.b(b, Boolean.valueOf($$3)), 3);
      }
   }

   @Override
   protected void a(ebr.a<dno, ebq> $$0) {
      $$0.a(c, b);
   }

   @Override
   protected boolean c_(ebq $$0) {
      return true;
   }

   @Override
   protected int a(ebq $$0, dkj $$1, iw $$2) {
      return $$1.a_($$2).c(c) ? 15 : 0;
   }
}
