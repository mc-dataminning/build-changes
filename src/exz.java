import java.util.Arrays;

public class exz extends exn {
   private etf c;

   private static eqq<?>[] a(eqr $$0) {
      return new eqq[]{$$0.R(), $$0.S()};
   }

   public exz(exv $$0, eqr $$1) {
      super($$0, $$1, te.c("options.sounds.title"));
   }

   @Override
   protected void aE_() {
      this.c = new etf(this.f, this.g, this.h, 32, this.h - 32, 25);
      this.c.a(this.b.b(aov.a));
      this.c.a(this.l());
      this.c.a(this.b.ao());
      this.c.a(a(this.b));
      this.e(this.c);
      this.d(esi.a(td.d, $$0 -> {
         this.f.m.aq();
         this.f.a(this.a);
      }).a(this.g / 2 - 100, this.h - 27, 200, 20).a());
   }

   private eqq<?>[] l() {
      return Arrays.stream(aov.values()).filter($$0 -> $$0 != aov.a).map($$0 -> this.b.b($$0)).toArray(eqq[]::new);
   }

   @Override
   public void a(erx $$0, int $$1, int $$2, float $$3) {
      this.a($$0, this.c, $$1, $$2, $$3);
   }

   @Override
   public void b(erx $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
   }
}
