import javax.annotation.Nullable;

public class flk extends fkl {
   private static final ws a = ws.c("controls.title");
   @Nullable
   private ffr r;

   private static fcx<?>[] a(fcy $$0) {
      return new fcx[]{$$0.ac(), $$0.ad(), $$0.H(), $$0.I()};
   }

   public flk(fkt $$0, fcy $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void aM_() {
      this.r = this.c(new ffr(this.m, this.n, this.o, this));
      this.r
         .a(
            feu.a(ws.c("options.mouse_settings"), $$0 -> this.m.a(new fkh(this, this.c))).a(),
            feu.a(ws.c("controls.keybinds"), $$0 -> this.m.a(new flm(this, this.c))).a()
         );
      this.r.a(a(this.c));
      super.aM_();
   }

   @Override
   protected void c() {
      super.c();
      if (this.r != null) {
         this.r.a(this.n, this.d);
      }
   }
}
