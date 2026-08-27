import java.util.Arrays;

public class eyi extends exx {
   private eth c;

   private static eqs<?>[] a(eqt $$0) {
      return new eqs[]{$$0.S(), $$0.T()};
   }

   public eyi(eye $$0, eqt $$1) {
      super($$0, $$1, tl.c("options.sounds.title"));
   }

   @Override
   protected void aH_() {
      this.c = new eth(this.f, this.g, this.h, 32, this.h - 32, 25);
      this.c.a(this.b.b(aph.a));
      this.c.a(this.l());
      this.c.a(this.b.ap());
      this.c.a(a(this.b));
      this.e(this.c);
      this.d(esk.a(tk.d, $$0 -> {
         this.f.m.ar();
         this.f.a(this.a);
      }).a(this.g / 2 - 100, this.h - 27, 200, 20).a());
   }

   private eqs<?>[] l() {
      return Arrays.stream(aph.values()).filter($$0 -> $$0 != aph.a).map($$0 -> this.b.b($$0)).toArray(eqs[]::new);
   }

   @Override
   public void a(erz $$0, int $$1, int $$2, float $$3) {
      this.a($$0, this.c, $$1, $$2, $$3);
   }

   @Override
   public void b(erz $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
   }
}
