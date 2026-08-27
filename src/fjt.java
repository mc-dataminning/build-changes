import com.google.common.collect.ImmutableList;

public class fjt<T extends byj> extends fgn<T> {
   private final fko a;
   private final fko b;

   public fjt(fko $$0) {
      super(true, 8.0F, 3.35F);
      this.a = $$0;
      this.b = $$0.b("tail");
   }

   public static fku c() {
      fkw $$0 = new fkw();
      fkx $$1 = $$0.a();
      float $$2 = 0.0F;
      float $$3 = 22.0F;
      float $$4 = -3.0F;
      $$1.a("body", fkt.c().a(0, 0).a(-1.5F, -1.0F, 0.0F, 3.0F, 2.0F, 3.0F), fkq.a(0.0F, 22.0F, -3.0F));
      $$1.a("tail", fkt.c().a(0, 0).a(0.0F, -1.0F, 0.0F, 0.0F, 2.0F, 7.0F), fkq.a(0.0F, 22.0F, 0.0F));
      return fku.a($$0, 16, 16);
   }

   @Override
   protected Iterable<fko> a() {
      return ImmutableList.of(this.a);
   }

   @Override
   protected Iterable<fko> b() {
      return ImmutableList.of(this.b);
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      float $$6 = $$0.aZ() ? 1.0F : 1.5F;
      this.b.f = -$$6 * 0.25F * atm.a(0.3F * $$3);
   }
}
