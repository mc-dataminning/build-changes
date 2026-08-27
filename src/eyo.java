import java.util.Arrays;

public class eyo extends eyc {
   private etn c;

   private static eqy<?>[] a(eqz $$0) {
      return new eqy[]{$$0.S(), $$0.T()};
   }

   public eyo(eyk $$0, eqz $$1) {
      super($$0, $$1, tm.c("options.sounds.title"));
   }

   @Override
   protected void aI_() {
      this.c = new etn(this.f, this.g, this.h, 32, this.h - 32, 25);
      this.c.a(this.b.b(apf.a));
      this.c.a(this.l());
      this.c.a(this.b.ap());
      this.c.a(a(this.b));
      this.e(this.c);
      this.d(esq.a(tl.d, $$0 -> {
         this.f.m.ar();
         this.f.a(this.a);
      }).a(this.g / 2 - 100, this.h - 27, 200, 20).a());
   }

   private eqy<?>[] l() {
      return Arrays.stream(apf.values()).filter($$0 -> $$0 != apf.a).map($$0 -> this.b.b($$0)).toArray(eqy[]::new);
   }

   @Override
   public void a(esf $$0, int $$1, int $$2, float $$3) {
      this.a($$0, this.c, $$1, $$2, $$3);
   }

   @Override
   public void b(esf $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
   }
}
