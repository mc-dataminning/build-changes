import javax.annotation.Nullable;

public class czz extends cxy {
   private final bwr<? extends bxl> a;
   private final awm b;

   public czz(bwr<? extends bxl> $$0, ewu $$1, awm $$2, czg.a $$3) {
      super($$1, $$3);
      this.a = $$0;
      this.b = $$2;
   }

   @Override
   public void a(@Nullable bxj $$0, djh $$1, czk $$2, iv $$3) {
      if ($$1 instanceof arq) {
         this.a((arq)$$1, $$2, $$3);
         $$1.a($$0, efo.t, $$3);
      }
   }

   @Override
   protected void a(@Nullable bxj $$0, dji $$1, iv $$2) {
      $$1.a($$0, $$2, this.b, awo.g, 1.0F, 1.0F);
   }

   private void a(arq $$0, czk $$1, iv $$2) {
      bxl $$3 = this.a.b($$0, bwr.a($$0, $$1, null), $$2, bwq.l, true, false);
      if ($$3 instanceof cjb $$4) {
         dbs $$5 = $$1.a(kk.Z, dbs.a);
         $$4.h($$5.d());
         $$4.w(true);
      }

      if ($$3 != null) {
         $$0.a_($$3);
         $$3.T();
      }
   }
}
