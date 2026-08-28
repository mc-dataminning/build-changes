import com.mojang.datafixers.util.Pair;
import javax.annotation.Nullable;

class cra extends cst {
   private final buk a;
   private final btw b;
   @Nullable
   private final alc g;

   public cra(bri $$0, buk $$1, btw $$2, int $$3, int $$4, int $$5, @Nullable alc $$6) {
      super($$0, $$3, $$4, $$5);
      this.a = $$1;
      this.b = $$2;
      this.g = $$6;
   }

   @Override
   public void a(cvp $$0, cvp $$1) {
      this.a.a(this.b, $$1, $$0);
      super.a($$0, $$1);
   }

   @Override
   public int a() {
      return 1;
   }

   @Override
   public boolean a(cvp $$0) {
      return this.b == this.a.g($$0);
   }

   @Override
   public boolean a(cnu $$0) {
      cvp $$1 = this.g();
      return !$$1.f() && !$$0.f() && dbm.a($$1, dbl.E) ? false : super.a($$0);
   }

   @Override
   public Pair<alc, alc> b() {
      return this.g != null ? Pair.of(crz.B, this.g) : super.b();
   }
}
