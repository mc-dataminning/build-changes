import javax.annotation.Nullable;

public class fjb extends hky {
   private static final wo a = wo.c("mco.account.privacy.information");
   private static final int b = 15;
   private final fsi c = fsi.d();
   private final fui C;
   @Nullable
   private fpk D;

   public fjb(fui $$0) {
      super(fky.a);
      this.C = $$0;
   }

   @Override
   public void aR_() {
      this.c.a(15).c().b();
      this.D = new fpk(a, this.p).b(true);
      this.c.a(this.D);
      fsi $$0 = this.c.a(fsi.e().a(8));
      wo $$1 = wo.c("mco.account.privacy.info.button");
      $$0.a(fop.a($$1, ftf.b(this, axu.a)).a());
      $$0.a(fop.a(wn.k, $$0x -> this.aO_()).a());
      this.c.a($$1x -> {
         fon var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   public void aO_() {
      this.m.a(this.C);
   }

   @Override
   protected void c() {
      if (this.D != null) {
         this.D.d(this.n - 15);
      }

      this.c.a();
      fsc.a(this.c, this.J());
   }

   @Override
   public wo i() {
      return a;
   }
}
