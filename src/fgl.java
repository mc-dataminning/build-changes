import java.util.Arrays;

public class fgl extends ffz {
   private fbh c;

   private static eyn<?>[] a(eyo $$0) {
      return new eyn[]{$$0.T(), $$0.U()};
   }

   public fgl(fgh $$0, eyo $$1) {
      super($$0, $$1, vs.c("options.sounds.title"));
   }

   @Override
   protected void aP_() {
      this.c = this.c(new fbh(this.f, this.g, this.h - 64, 32, 25));
      this.c.a(this.b.b(atq.a));
      this.c.a(this.o());
      this.c.a(this.b.aq());
      this.c.a(a(this.b));
      this.c(fak.a(vr.d, $$0 -> {
         this.f.m.as();
         this.f.a(this.a);
      }).a(this.g / 2 - 100, this.h - 27, 200, 20).a());
   }

   private eyn<?>[] o() {
      return Arrays.stream(atq.values()).filter($$0 -> $$0 != atq.a).map($$0 -> this.b.b($$0)).toArray(eyn[]::new);
   }

   @Override
   public void a(ezx $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 20, 16777215);
   }

   @Override
   public void b(ezx $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
   }
}
