import java.util.Arrays;

public class fjs extends fjg {
   private static final wg a = wg.c("options.sounds.title");
   private fem o;

   private static fbs<?>[] a(fbt $$0) {
      return new fbs[]{$$0.W(), $$0.X()};
   }

   public fjs(fjo $$0, fbt $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void aN_() {
      this.o = this.c(new fem(this.j, this.k, this.l, this));
      this.o.a(this.c.b(aun.a));
      this.o.a(this.C());
      this.o.a(this.c.at());
      this.o.a(a(this.c));
      super.aN_();
   }

   @Override
   protected void c() {
      super.c();
      this.o.a(this.k, this.d);
   }

   private fbs<?>[] C() {
      return Arrays.stream(aun.values()).filter($$0 -> $$0 != aun.a).map($$0 -> this.c.b($$0)).toArray(fbs[]::new);
   }
}
