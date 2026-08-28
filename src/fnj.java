import java.util.Arrays;

public class fnj extends fmx {
   private static final xp a = xp.c("options.sounds.title");
   private fid r;

   private static ffk<?>[] a(ffl $$0) {
      return new ffk[]{$$0.W(), $$0.X()};
   }

   public fnj(fnf $$0, ffl $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void aM_() {
      this.r = this.c(new fid(this.m, this.n, this.o, this));
      this.r.a(this.c.b(awb.a));
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

   private ffk<?>[] E() {
      return Arrays.stream(awb.values()).filter($$0 -> $$0 != awb.a).map($$0 -> this.c.b($$0)).toArray(ffk[]::new);
   }
}
