import java.util.Arrays;

public class fng extends fmu {
   private static final xo a = xo.c("options.sounds.title");
   private fia r;

   private static ffh<?>[] a(ffi $$0) {
      return new ffh[]{$$0.W(), $$0.X()};
   }

   public fng(fnc $$0, ffi $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void aM_() {
      this.r = this.c(new fia(this.m, this.n, this.o, this));
      this.r.a(this.c.b(awa.a));
      this.r.a(this.E());
      this.r.a(this.c.at());
      this.r.a(a(this.c));
      super.aM_();
   }

   @Override
   protected void c() {
      super.c();
      this.r.a(this.n, this.d);
   }

   private ffh<?>[] E() {
      return Arrays.stream(awa.values()).filter($$0 -> $$0 != awa.a).map($$0 -> this.c.b($$0)).toArray(ffh[]::new);
   }
}
