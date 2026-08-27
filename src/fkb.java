import java.util.Arrays;

public class fkb extends fjp {
   private static final wi a = wi.c("options.sounds.title");
   private fev o;

   private static fcb<?>[] a(fcc $$0) {
      return new fcb[]{$$0.W(), $$0.X()};
   }

   public fkb(fjx $$0, fcc $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void aM_() {
      this.o = this.c(new fev(this.j, this.k, this.l, this));
      this.o.a(this.c.b(aup.a));
      this.o.a(this.C());
      this.o.a(this.c.at());
      this.o.a(a(this.c));
      super.aM_();
   }

   @Override
   protected void c() {
      super.c();
      this.o.a(this.k, this.d);
   }

   private fcb<?>[] C() {
      return Arrays.stream(aup.values()).filter($$0 -> $$0 != aup.a).map($$0 -> this.c.b($$0)).toArray(fcb[]::new);
   }
}
