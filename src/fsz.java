import com.google.common.collect.ImmutableList;

public class fsz<T extends cef> extends fpq<T> {
   private final ftv a;
   private final ftv b;

   public fsz(ftv $$0) {
      super(true, 8.0F, 3.35F);
      this.a = $$0;
      this.b = $$0.b("tail");
   }

   public static fub c() {
      fud $$0 = new fud();
      fue $$1 = $$0.a();
      float $$2 = 0.0F;
      float $$3 = 22.0F;
      float $$4 = -3.0F;
      $$1.a("body", fua.c().a(0, 0).a(-1.5F, -1.0F, 0.0F, 3.0F, 2.0F, 3.0F), ftx.a(0.0F, 22.0F, -3.0F));
      $$1.a("tail", fua.c().a(0, 0).a(0.0F, -1.0F, 0.0F, 0.0F, 2.0F, 7.0F), ftx.a(0.0F, 22.0F, 0.0F));
      return fub.a($$0, 16, 16);
   }

   @Override
   protected Iterable<ftv> a() {
      return ImmutableList.of(this.a);
   }

   @Override
   protected Iterable<ftv> b() {
      return ImmutableList.of(this.b);
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      float $$6 = $$0.bc() ? 1.0F : 1.5F;
      this.b.f = -$$6 * 0.25F * axm.a(0.3F * $$3);
   }
}
