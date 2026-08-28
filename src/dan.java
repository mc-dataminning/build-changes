import javax.annotation.Nullable;

public class dan extends cym {
   private final bxc<? extends bxw> a;
   private final awo b;

   public dan(bxc<? extends bxw> $$0, exn $$1, awo $$2, czu.a $$3) {
      super($$1, $$3);
      this.a = $$0;
      this.b = $$2;
   }

   @Override
   public void a(@Nullable bxu $$0, djx $$1, czy $$2, iv $$3) {
      if ($$1 instanceof ars) {
         this.a((ars)$$1, $$2, $$3);
         $$1.a($$0, ege.t, $$3);
      }
   }

   @Override
   protected void a(@Nullable bxu $$0, djy $$1, iv $$2) {
      $$1.a($$0, $$2, this.b, awq.g, 1.0F, 1.0F);
   }

   private void a(ars $$0, czy $$1, iv $$2) {
      bxw $$3 = this.a.b($$0, bxc.a($$0, $$1, null), $$2, bxb.l, true, false);
      if ($$3 instanceof cjm $$4) {
         dcg $$5 = $$1.a(kk.Z, dcg.a);
         $$4.d($$5.d());
         $$4.w(true);
      }

      if ($$3 != null) {
         $$0.a_($$3);
         $$3.T();
      }
   }
}
