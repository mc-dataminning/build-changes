import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dmi extends dku {
   public static final MapCodec<dmi> a = b(dmi::new);
   public static final dzd b = dzc.A;
   public static final dzd c = dzc.u;

   @Override
   protected MapCodec<? extends dmi> a() {
      return a;
   }

   public dmi(dyl.d $$0) {
      super($$0);
      this.l(this.m().b(c, Boolean.valueOf(false)).b(b, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dym $$0, dhp $$1, jj $$2, dym $$3, boolean $$4) {
      if ($$3.b() != $$0.b() && $$1 instanceof arn $$5) {
         this.a($$0, $$5, $$2);
      }
   }

   @Override
   protected void a(dym $$0, dhp $$1, jj $$2, dku $$3, @Nullable ewb $$4, boolean $$5) {
      if ($$1 instanceof arn $$6) {
         this.a($$0, $$6, $$2);
      }
   }

   public void a(dym $$0, arn $$1, jj $$2) {
      boolean $$3 = $$1.C($$2);
      if ($$3 != $$0.c(b)) {
         dym $$4 = $$0;
         if (!$$0.c(b)) {
            $$4 = $$0.a(c);
            $$1.a(null, $$2, $$4.c(c) ? awk.fI : awk.fJ, awl.e);
         }

         $$1.a($$2, $$4.b(b, Boolean.valueOf($$3)), 3);
      }
   }

   @Override
   protected void a(dyn.a<dku, dym> $$0) {
      $$0.a(c, b);
   }

   @Override
   protected boolean c_(dym $$0) {
      return true;
   }

   @Override
   protected int a(dym $$0, dhp $$1, jj $$2) {
      return $$1.a_($$2).c(c) ? 15 : 0;
   }
}
