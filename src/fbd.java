import java.util.Arrays;

public class fbd extends far {
   private ewb c;

   private static etl<?>[] a(etm $$0) {
      return new etl[]{$$0.T(), $$0.U()};
   }

   public fbd(faz $$0, etm $$1) {
      super($$0, $$1, uv.c("options.sounds.title"));
   }

   @Override
   protected void aQ_() {
      this.c = new ewb(this.f, this.g, this.h, 32, this.h - 32, 25);
      this.c.a(this.b.b(aqw.a));
      this.c.a(this.l());
      this.c.a(this.b.aq());
      this.c.a(a(this.b));
      this.e(this.c);
      this.d(eve.a(uu.d, $$0 -> {
         this.f.m.as();
         this.f.a(this.a);
      }).a(this.g / 2 - 100, this.h - 27, 200, 20).a());
   }

   private etl<?>[] l() {
      return Arrays.stream(aqw.values()).filter($$0 -> $$0 != aqw.a).map($$0 -> this.b.b($$0)).toArray(etl[]::new);
   }

   @Override
   public void a(eut $$0, int $$1, int $$2, float $$3) {
      this.a($$0, this.c, $$1, $$2, $$3);
   }

   @Override
   public void b(eut $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
   }
}
