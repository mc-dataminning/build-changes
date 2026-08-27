import java.util.Arrays;

public class fay extends fam {
   private evw c;

   private static etg<?>[] a(eth $$0) {
      return new etg[]{$$0.T(), $$0.U()};
   }

   public fay(fau $$0, eth $$1) {
      super($$0, $$1, ur.c("options.sounds.title"));
   }

   @Override
   protected void aP_() {
      this.c = new evw(this.f, this.g, this.h, 32, this.h - 32, 25);
      this.c.a(this.b.b(aqs.a));
      this.c.a(this.l());
      this.c.a(this.b.aq());
      this.c.a(a(this.b));
      this.e(this.c);
      this.d(euz.a(uq.d, $$0 -> {
         this.f.m.as();
         this.f.a(this.a);
      }).a(this.g / 2 - 100, this.h - 27, 200, 20).a());
   }

   private etg<?>[] l() {
      return Arrays.stream(aqs.values()).filter($$0 -> $$0 != aqs.a).map($$0 -> this.b.b($$0)).toArray(etg[]::new);
   }

   @Override
   public void a(euo $$0, int $$1, int $$2, float $$3) {
      this.a($$0, this.c, $$1, $$2, $$3);
   }

   @Override
   public void b(euo $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
   }
}
