import java.util.Arrays;

public class fdq extends fde {
   private eyo c;

   private static evu<?>[] a(evv $$0) {
      return new evu[]{$$0.T(), $$0.U()};
   }

   public fdq(fdm $$0, evv $$1) {
      super($$0, $$1, vg.c("options.sounds.title"));
   }

   @Override
   protected void aP_() {
      this.c = this.d(new eyo(this.f, this.g, this.h - 64, 32, 25));
      this.c.a(this.b.b(aru.a));
      this.c.a(this.o());
      this.c.a(this.b.aq());
      this.c.a(a(this.b));
      this.d(exr.a(vf.d, $$0 -> {
         this.f.m.as();
         this.f.a(this.a);
      }).a(this.g / 2 - 100, this.h - 27, 200, 20).a());
   }

   private evu<?>[] o() {
      return Arrays.stream(aru.values()).filter($$0 -> $$0 != aru.a).map($$0 -> this.b.b($$0)).toArray(evu[]::new);
   }

   @Override
   public void a(exe $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 20, 16777215);
   }

   @Override
   public void b(exe $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
   }
}
