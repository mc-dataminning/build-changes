import java.util.Arrays;

public class ffi extends few {
   private fae c;

   private static exk<?>[] a(exl $$0) {
      return new exk[]{$$0.T(), $$0.U()};
   }

   public ffi(ffe $$0, exl $$1) {
      super($$0, $$1, vq.c("options.sounds.title"));
   }

   @Override
   protected void aQ_() {
      this.c = this.d(new fae(this.f, this.g, this.h - 64, 32, 25));
      this.c.a(this.b.b(atl.a));
      this.c.a(this.o());
      this.c.a(this.b.aq());
      this.c.a(a(this.b));
      this.d(ezh.a(vp.d, $$0 -> {
         this.f.m.as();
         this.f.a(this.a);
      }).a(this.g / 2 - 100, this.h - 27, 200, 20).a());
   }

   private exk<?>[] o() {
      return Arrays.stream(atl.values()).filter($$0 -> $$0 != atl.a).map($$0 -> this.b.b($$0)).toArray(exk[]::new);
   }

   @Override
   public void a(eyu $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 20, 16777215);
   }

   @Override
   public void b(eyu $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
   }
}
