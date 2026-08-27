import java.util.Arrays;

public class flh extends fkv {
   private static final wu a = wu.c("options.sounds.title");
   private fgb r;

   private static fdh<?>[] a(fdi $$0) {
      return new fdh[]{$$0.W(), $$0.X()};
   }

   public flh(fld $$0, fdi $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void aM_() {
      this.r = this.c(new fgb(this.m, this.n, this.o, this));
      this.r.a(this.c.b(avd.a));
      this.r.a(this.C());
      this.r.a(this.c.at());
      this.r.a(a(this.c));
      super.aM_();
   }

   @Override
   protected void c() {
      super.c();
      this.r.a(this.n, this.d);
   }

   private fdh<?>[] C() {
      return Arrays.stream(avd.values()).filter($$0 -> $$0 != avd.a).map($$0 -> this.c.b($$0)).toArray(fdh[]::new);
   }
}
