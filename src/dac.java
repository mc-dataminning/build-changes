import javax.annotation.Nullable;

public class dac extends cyb {
   private final bwr<? extends bxl> a;
   private final awm b;

   public dac(bwr<? extends bxl> $$0, ewz $$1, awm $$2, czj.a $$3) {
      super($$1, $$3);
      this.a = $$0;
      this.b = $$2;
   }

   @Override
   public void a(@Nullable bxj $$0, djm $$1, czn $$2, iv $$3) {
      if ($$1 instanceof arq) {
         this.a((arq)$$1, $$2, $$3);
         $$1.a($$0, eft.t, $$3);
      }
   }

   @Override
   protected void a(@Nullable bxj $$0, djn $$1, iv $$2) {
      $$1.a($$0, $$2, this.b, awo.g, 1.0F, 1.0F);
   }

   private void a(arq $$0, czn $$1, iv $$2) {
      bxl $$3 = this.a.b($$0, bwr.a($$0, $$1, null), $$2, bwq.l, true, false);
      if ($$3 instanceof cjb $$4) {
         dbv $$5 = $$1.a(kk.Z, dbv.a);
         $$4.h($$5.d());
         $$4.w(true);
      }

      if ($$3 != null) {
         $$0.a_($$3);
         $$3.T();
      }
   }
}
