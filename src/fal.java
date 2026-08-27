import java.util.Arrays;

public class fal extends ezz {
   private evj c;

   private static esu<?>[] a(esv $$0) {
      return new esu[]{$$0.T(), $$0.U()};
   }

   public fal(fah $$0, esv $$1) {
      super($$0, $$1, ur.c("options.sounds.title"));
   }

   @Override
   protected void aO_() {
      this.c = new evj(this.f, this.g, this.h, 32, this.h - 32, 25);
      this.c.a(this.b.b(aqo.a));
      this.c.a(this.l());
      this.c.a(this.b.aq());
      this.c.a(a(this.b));
      this.e(this.c);
      this.d(eum.a(uq.d, $$0 -> {
         this.f.m.as();
         this.f.a(this.a);
      }).a(this.g / 2 - 100, this.h - 27, 200, 20).a());
   }

   private esu<?>[] l() {
      return Arrays.stream(aqo.values()).filter($$0 -> $$0 != aqo.a).map($$0 -> this.b.b($$0)).toArray(esu[]::new);
   }

   @Override
   public void a(eub $$0, int $$1, int $$2, float $$3) {
      this.a($$0, this.c, $$1, $$2, $$3);
   }

   @Override
   public void b(eub $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
   }
}
