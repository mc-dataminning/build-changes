import com.mojang.serialization.MapCodec;

public class dac extends cyo {
   public static final MapCodec<dac> a = b(dac::new);
   public static final dlw b = dlv.w;
   public static final dlw c = dlv.r;

   @Override
   protected MapCodec<? extends dac> a() {
      return a;
   }

   public dac(dle.d $$0) {
      super($$0);
      this.k(this.o().a(c, Boolean.valueOf(false)).a(b, Boolean.valueOf(false)));
   }

   @Override
   protected void b(dlf $$0, cvn $$1, hz $$2, dlf $$3, boolean $$4) {
      if ($$3.b() != $$0.b() && $$1 instanceof aov $$5) {
         this.a($$0, $$5, $$2);
      }
   }

   @Override
   protected void a(dlf $$0, cvn $$1, hz $$2, cyo $$3, hz $$4, boolean $$5) {
      if ($$1 instanceof aov $$6) {
         this.a($$0, $$6, $$2);
      }
   }

   public void a(dlf $$0, aov $$1, hz $$2) {
      boolean $$3 = $$1.C($$2);
      if ($$3 != $$0.c(b)) {
         dlf $$4 = $$0;
         if (!$$0.c(b)) {
            $$4 = $$0.a(c);
            $$1.a(null, $$2, $$4.c(c) ? atk.fs : atk.ft, atl.e);
         }

         $$1.a($$2, $$4.a(b, Boolean.valueOf($$3)), 3);
      }
   }

   @Override
   protected void a(dlg.a<cyo, dlf> $$0) {
      $$0.a(c, b);
   }

   @Override
   protected boolean d_(dlf $$0) {
      return true;
   }

   @Override
   protected int a(dlf $$0, cvn $$1, hz $$2) {
      return $$1.a_($$2).c(c) ? 15 : 0;
   }
}
