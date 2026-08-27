import com.google.common.collect.ImmutableList;

public class fof<T extends cbo> extends fkx<T> {
   private final fpc a;
   private final fpc b;

   public fof(fpc $$0) {
      super(true, 8.0F, 3.35F);
      this.a = $$0;
      this.b = $$0.b("tail");
   }

   public static fpi c() {
      fpk $$0 = new fpk();
      fpl $$1 = $$0.a();
      float $$2 = 0.0F;
      float $$3 = 22.0F;
      float $$4 = -3.0F;
      $$1.a("body", fph.c().a(0, 0).a(-1.5F, -1.0F, 0.0F, 3.0F, 2.0F, 3.0F), fpe.a(0.0F, 22.0F, -3.0F));
      $$1.a("tail", fph.c().a(0, 0).a(0.0F, -1.0F, 0.0F, 0.0F, 2.0F, 7.0F), fpe.a(0.0F, 22.0F, 0.0F));
      return fpi.a($$0, 16, 16);
   }

   @Override
   protected Iterable<fpc> a() {
      return ImmutableList.of(this.a);
   }

   @Override
   protected Iterable<fpc> b() {
      return ImmutableList.of(this.b);
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      float $$6 = $$0.aZ() ? 1.0F : 1.5F;
      this.b.f = -$$6 * 0.25F * awh.a(0.3F * $$3);
   }
}
