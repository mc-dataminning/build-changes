import java.util.Arrays;

public class fni extends fmw {
   private static final xp a = xp.c("options.sounds.title");
   private fic r;

   private static ffj<?>[] a(ffk $$0) {
      return new ffj[]{$$0.W(), $$0.X()};
   }

   public fni(fne $$0, ffk $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void aM_() {
      this.r = this.c(new fic(this.m, this.n, this.o, this));
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

   private ffj<?>[] E() {
      return Arrays.stream(awb.values()).filter($$0 -> $$0 != awb.a).map($$0 -> this.c.b($$0)).toArray(ffj[]::new);
   }
}
