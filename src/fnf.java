import java.util.Arrays;

public class fnf extends fmt {
   private static final xo a = xo.c("options.sounds.title");
   private fhz r;

   private static ffg<?>[] a(ffh $$0) {
      return new ffg[]{$$0.W(), $$0.X()};
   }

   public fnf(fnb $$0, ffh $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void aM_() {
      this.r = this.c(new fhz(this.m, this.n, this.o, this));
      this.r.a(this.c.b(awa.a));
      this.r.a(this.D());
      this.r.a(this.c.at());
      this.r.a(a(this.c));
      super.aM_();
   }

   @Override
   protected void c() {
      super.c();
      this.r.a(this.n, this.d);
   }

   private ffg<?>[] D() {
      return Arrays.stream(awa.values()).filter($$0 -> $$0 != awa.a).map($$0 -> this.c.b($$0)).toArray(ffg[]::new);
   }
}
