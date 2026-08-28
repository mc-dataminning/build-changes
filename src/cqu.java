import com.mojang.datafixers.util.Pair;
import javax.annotation.Nullable;

class cqu extends csn {
   private final buf a;
   private final btr b;
   @Nullable
   private final alb g;

   public cqu(brd $$0, buf $$1, btr $$2, int $$3, int $$4, int $$5, @Nullable alb $$6) {
      super($$0, $$3, $$4, $$5);
      this.a = $$1;
      this.b = $$2;
      this.g = $$6;
   }

   @Override
   public void a(cvl $$0, cvl $$1) {
      this.a.a(this.b, $$1, $$0);
      super.a($$0, $$1);
   }

   @Override
   public int a() {
      return 1;
   }

   @Override
   public boolean a(cvl $$0) {
      return this.b == this.a.i($$0);
   }

   @Override
   public boolean a(cnp $$0) {
      cvl $$1 = this.g();
      return !$$1.f() && !$$0.f() && day.a($$1, dax.E) ? false : super.a($$0);
   }

   @Override
   public Pair<alb, alb> b() {
      return this.g != null ? Pair.of(crt.B, this.g) : super.b();
   }
}
