import javax.annotation.Nullable;

public class eqk extends ghe {
   private static final ur a = ur.c("mco.account.privacy.information");
   private static final int b = 15;
   private final eya c = eya.d();
   private final fah v;
   @Nullable
   private evg w;

   public eqk(fah $$0) {
      super(esj.a);
      this.v = $$0;
   }

   @Override
   public void aO_() {
      this.c.a(15).c().b();
      this.w = new evg(a, this.i).b(true);
      this.c.a(this.w);
      eya $$0 = this.c.a(eya.e().a(8));
      ur $$1 = ur.c("mco.account.privacy.info.button");
      $$0.a(eum.a($$1, eyz.b(this, "https://aka.ms/MinecraftGDPR")).a());
      $$0.a(eum.a(uq.k, $$0x -> this.aE_()).a());
      this.c.a($$1x -> {
         euk var10000 = this.d($$1x);
      });
      this.c();
   }

   @Override
   public void aE_() {
      this.f.a(this.v);
   }

   @Override
   protected void c() {
      if (this.w != null) {
         this.w.j(this.g - 15);
      }

      this.c.a();
      exu.a(this.c, this.s());
   }

   @Override
   public ur h() {
      return a;
   }
}
