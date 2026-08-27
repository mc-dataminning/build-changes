import javax.annotation.Nullable;

public class eqw extends ghr {
   private static final ur a = ur.c("mco.account.privacy.information");
   private static final int b = 15;
   private final eyn c = eyn.d();
   private final fau v;
   @Nullable
   private evt w;

   public eqw(fau $$0) {
      super(esv.a);
      this.v = $$0;
   }

   @Override
   public void aP_() {
      this.c.a(15).c().b();
      this.w = new evt(a, this.i).b(true);
      this.c.a(this.w);
      eyn $$0 = this.c.a(eyn.e().a(8));
      ur $$1 = ur.c("mco.account.privacy.info.button");
      $$0.a(euz.a($$1, ezm.b(this, "https://aka.ms/MinecraftGDPR")).a());
      $$0.a(euz.a(uq.k, $$0x -> this.aF_()).a());
      this.c.a($$1x -> {
         eux var10000 = this.d($$1x);
      });
      this.c();
   }

   @Override
   public void aF_() {
      this.f.a(this.v);
   }

   @Override
   protected void c() {
      if (this.w != null) {
         this.w.j(this.g - 15);
      }

      this.c.a();
      eyh.a(this.c, this.s());
   }

   @Override
   public ur h() {
      return a;
   }
}
