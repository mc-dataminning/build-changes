import javax.annotation.Nullable;

public class flu extends fkv {
   private static final wu a = wu.c("controls.title");
   @Nullable
   private fgb r;

   private static fdh<?>[] a(fdi $$0) {
      return new fdh[]{$$0.ac(), $$0.ad(), $$0.H(), $$0.I()};
   }

   public flu(fld $$0, fdi $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void aM_() {
      this.r = this.c(new fgb(this.m, this.n, this.o, this));
      this.r
         .a(
            ffe.a(wu.c("options.mouse_settings"), $$0 -> this.m.a(new fkr(this, this.c))).a(),
            ffe.a(wu.c("controls.keybinds"), $$0 -> this.m.a(new flw(this, this.c))).a()
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
