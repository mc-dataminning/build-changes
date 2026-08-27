import java.util.Arrays;

public class eyq extends eye {
   private etp c;

   private static era<?>[] a(erb $$0) {
      return new era[]{$$0.S(), $$0.T()};
   }

   public eyq(eym $$0, erb $$1) {
      super($$0, $$1, tn.c("options.sounds.title"));
   }

   @Override
   protected void aH_() {
      this.c = new etp(this.f, this.g, this.h, 32, this.h - 32, 25);
      this.c.a(this.b.b(apg.a));
      this.c.a(this.l());
      this.c.a(this.b.ap());
      this.c.a(a(this.b));
      this.e(this.c);
      this.d(ess.a(tm.d, $$0 -> {
         this.f.m.ar();
         this.f.a(this.a);
      }).a(this.g / 2 - 100, this.h - 27, 200, 20).a());
   }

   private era<?>[] l() {
      return Arrays.stream(apg.values()).filter($$0 -> $$0 != apg.a).map($$0 -> this.b.b($$0)).toArray(era[]::new);
   }

   @Override
   public void a(esh $$0, int $$1, int $$2, float $$3) {
      this.a($$0, this.c, $$1, $$2, $$3);
   }

   @Override
   public void b(esh $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
   }
}
