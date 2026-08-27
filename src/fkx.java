import java.util.Arrays;

public class fkx extends fkl {
   private static final ws a = ws.c("options.sounds.title");
   private ffr r;

   private static fcx<?>[] a(fcy $$0) {
      return new fcx[]{$$0.W(), $$0.X()};
   }

   public fkx(fkt $$0, fcy $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void aM_() {
      this.r = this.c(new ffr(this.m, this.n, this.o, this));
      this.r.a(this.c.b(ava.a));
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

   private fcx<?>[] C() {
      return Arrays.stream(ava.values()).filter($$0 -> $$0 != ava.a).map($$0 -> this.c.b($$0)).toArray(fcx[]::new);
   }
}
