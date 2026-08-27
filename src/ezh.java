import java.util.Arrays;

public class ezh extends eyw {
   private eug c;

   private static err<?>[] a(ers $$0) {
      return new err[]{$$0.S(), $$0.T()};
   }

   public ezh(ezd $$0, ers $$1) {
      super($$0, $$1, ui.c("options.sounds.title"));
   }

   @Override
   protected void aM_() {
      this.c = new eug(this.f, this.g, this.h, 32, this.h - 32, 25);
      this.c.a(this.b.b(aqe.a));
      this.c.a(this.l());
      this.c.a(this.b.ap());
      this.c.a(a(this.b));
      this.e(this.c);
      this.d(etj.a(uh.d, $$0 -> {
         this.f.m.ar();
         this.f.a(this.a);
      }).a(this.g / 2 - 100, this.h - 27, 200, 20).a());
   }

   private err<?>[] l() {
      return Arrays.stream(aqe.values()).filter($$0 -> $$0 != aqe.a).map($$0 -> this.b.b($$0)).toArray(err[]::new);
   }

   @Override
   public void a(esy $$0, int $$1, int $$2, float $$3) {
      this.a($$0, this.c, $$1, $$2, $$3);
   }

   @Override
   public void b(esy $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
   }
}
