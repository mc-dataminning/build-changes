import java.util.Arrays;

public class eyj extends exx {
   private eti c;

   private static eqt<?>[] a(equ $$0) {
      return new eqt[]{$$0.S(), $$0.T()};
   }

   public eyj(eyf $$0, equ $$1) {
      super($$0, $$1, ti.c("options.sounds.title"));
   }

   @Override
   protected void aD_() {
      this.c = new eti(this.f, this.g, this.h, 32, this.h - 32, 25);
      this.c.a(this.b.b(apa.a));
      this.c.a(this.l());
      this.c.a(this.b.ap());
      this.c.a(a(this.b));
      this.e(this.c);
      this.d(esl.a(th.d, $$0 -> {
         this.f.m.ar();
         this.f.a(this.a);
      }).a(this.g / 2 - 100, this.h - 27, 200, 20).a());
   }

   private eqt<?>[] l() {
      return Arrays.stream(apa.values()).filter($$0 -> $$0 != apa.a).map($$0 -> this.b.b($$0)).toArray(eqt[]::new);
   }

   @Override
   public void a(esa $$0, int $$1, int $$2, float $$3) {
      this.a($$0, this.c, $$1, $$2, $$3);
   }

   @Override
   public void b(esa $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
   }
}
