import com.google.common.collect.ImmutableList;

public class fib<T extends bxm> extends fev<T> {
   private final fiw a;
   private final fiw b;

   public fib(fiw $$0) {
      super(true, 8.0F, 3.35F);
      this.a = $$0;
      this.b = $$0.b("tail");
   }

   public static fjc c() {
      fje $$0 = new fje();
      fjf $$1 = $$0.a();
      float $$2 = 0.0F;
      float $$3 = 22.0F;
      float $$4 = -3.0F;
      $$1.a("body", fjb.c().a(0, 0).a(-1.5F, -1.0F, 0.0F, 3.0F, 2.0F, 3.0F), fiy.a(0.0F, 22.0F, -3.0F));
      $$1.a("tail", fjb.c().a(0, 0).a(0.0F, -1.0F, 0.0F, 0.0F, 2.0F, 7.0F), fiy.a(0.0F, 22.0F, 0.0F));
      return fjc.a($$0, 16, 16);
   }

   @Override
   protected Iterable<fiw> a() {
      return ImmutableList.of(this.a);
   }

   @Override
   protected Iterable<fiw> b() {
      return ImmutableList.of(this.b);
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      float $$6 = $$0.aX() ? 1.0F : 1.5F;
      this.b.f = -$$6 * 0.25F * asy.a(0.3F * $$3);
   }
}
