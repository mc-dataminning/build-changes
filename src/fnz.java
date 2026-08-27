public class fnz<T extends box> extends fon<T> {
   private final frf a;
   private final frf b;
   private final frf f;
   private final frf g;

   public fnz(frf $$0) {
      this.a = $$0;
      this.b = $$0.b("body");
      this.f = this.b.b("tail");
      this.g = this.f.b("tail_fin");
   }

   public static frl b() {
      frn $$0 = new frn();
      fro $$1 = $$0.a();
      float $$2 = 18.0F;
      float $$3 = -8.0F;
      fro $$4 = $$1.a("body", frk.c().a(22, 0).a(-4.0F, -7.0F, 0.0F, 8.0F, 7.0F, 13.0F), frh.a(0.0F, 22.0F, -5.0F));
      $$4.a("back_fin", frk.c().a(51, 0).a(-0.5F, 0.0F, 8.0F, 1.0F, 4.0F, 5.0F), frh.b((float) (Math.PI / 3), 0.0F, 0.0F));
      $$4.a(
         "left_fin",
         frk.c().a(48, 20).a().a(-0.5F, -4.0F, 0.0F, 1.0F, 4.0F, 7.0F),
         frh.a(2.0F, -2.0F, 4.0F, (float) (Math.PI / 3), 0.0F, (float) (Math.PI * 2.0 / 3.0))
      );
      $$4.a(
         "right_fin",
         frk.c().a(48, 20).a(-0.5F, -4.0F, 0.0F, 1.0F, 4.0F, 7.0F),
         frh.a(-2.0F, -2.0F, 4.0F, (float) (Math.PI / 3), 0.0F, (float) (-Math.PI * 2.0 / 3.0))
      );
      fro $$5 = $$4.a("tail", frk.c().a(0, 19).a(-2.0F, -2.5F, 0.0F, 4.0F, 5.0F, 11.0F), frh.a(0.0F, -2.5F, 11.0F, -0.10471976F, 0.0F, 0.0F));
      $$5.a("tail_fin", frk.c().a(19, 20).a(-5.0F, -0.5F, 0.0F, 10.0F, 1.0F, 6.0F), frh.a(0.0F, 0.0F, 9.0F));
      fro $$6 = $$4.a("head", frk.c().a(0, 0).a(-4.0F, -3.0F, -3.0F, 8.0F, 7.0F, 6.0F), frh.a(0.0F, -4.0F, -3.0F));
      $$6.a("nose", frk.c().a(0, 13).a(-1.0F, 2.0F, -7.0F, 2.0F, 2.0F, 4.0F), frh.a);
      return frl.a($$0, 64, 64);
   }

   @Override
   public frf a() {
      return this.a;
   }

   @Override
   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.b.e = $$5 * (float) (Math.PI / 180.0);
      this.b.f = $$4 * (float) (Math.PI / 180.0);
      if ($$0.dp().i() > 1.0E-7) {
         this.b.e = this.b.e + (-0.05F - 0.05F * aww.b($$3 * 0.3F));
         this.f.e = -0.1F * aww.b($$3 * 0.3F);
         this.g.e = -0.2F * aww.b($$3 * 0.3F);
      }
   }
}
