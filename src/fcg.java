import java.util.Arrays;

public class fcg extends fbu {
   private exe c;

   private static eun<?>[] a(euo $$0) {
      return new eun[]{$$0.T(), $$0.U()};
   }

   public fcg(fcc $$0, euo $$1) {
      super($$0, $$1, vb.c("options.sounds.title"));
   }

   @Override
   protected void aP_() {
      this.c = new exe(this.f, this.g, this.h, 32, this.h - 32, 25);
      this.c.a(this.b.b(ard.a));
      this.c.a(this.l());
      this.c.a(this.b.aq());
      this.c.a(a(this.b));
      this.e(this.c);
      this.d(ewh.a(va.d, $$0 -> {
         this.f.m.as();
         this.f.a(this.a);
      }).a(this.g / 2 - 100, this.h - 27, 200, 20).a());
   }

   private eun<?>[] l() {
      return Arrays.stream(ard.values()).filter($$0 -> $$0 != ard.a).map($$0 -> this.b.b($$0)).toArray(eun[]::new);
   }

   @Override
   public void a(evw $$0, int $$1, int $$2, float $$3) {
      this.a($$0, this.c, $$1, $$2, $$3);
   }

   @Override
   public void b(evw $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
   }
}
