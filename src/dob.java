import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dob extends dmm {
   public static final MapCodec<dob> a = b(dob::new);
   public static final ebf b = ebe.A;
   public static final ebf c = ebe.u;

   @Override
   protected MapCodec<? extends dob> a() {
      return a;
   }

   public dob(ean.d $$0) {
      super($$0);
      this.l(this.m().b(c, Boolean.valueOf(false)).b(b, Boolean.valueOf(false)));
   }

   @Override
   protected void a(eao $$0, djh $$1, iv $$2, eao $$3, boolean $$4) {
      if ($$3.b() != $$0.b() && $$1 instanceof arq $$5) {
         this.a($$0, $$5, $$2);
      }
   }

   @Override
   protected void a(eao $$0, djh $$1, iv $$2, dmm $$3, @Nullable eyd $$4, boolean $$5) {
      if ($$1 instanceof arq $$6) {
         this.a($$0, $$6, $$2);
      }
   }

   public void a(eao $$0, arq $$1, iv $$2) {
      boolean $$3 = $$1.D($$2);
      if ($$3 != $$0.c(b)) {
         eao $$4 = $$0;
         if (!$$0.c(b)) {
            $$4 = $$0.a(c);
            $$1.a(null, $$2, $$4.c(c) ? awn.fK : awn.fL, awo.e);
         }

         $$1.a($$2, $$4.b(b, Boolean.valueOf($$3)), 3);
      }
   }

   @Override
   protected void a(eap.a<dmm, eao> $$0) {
      $$0.a(c, b);
   }

   @Override
   protected boolean c_(eao $$0) {
      return true;
   }

   @Override
   protected int a(eao $$0, djh $$1, iv $$2) {
      return $$1.a_($$2).c(c) ? 15 : 0;
   }
}
