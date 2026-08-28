import com.mojang.datafixers.util.Pair;
import javax.annotation.Nullable;

class crd extends csw {
   private final bun a;
   private final btz b;
   @Nullable
   private final ale g;

   public crd(brl $$0, bun $$1, btz $$2, int $$3, int $$4, int $$5, @Nullable ale $$6) {
      super($$0, $$3, $$4, $$5);
      this.a = $$1;
      this.b = $$2;
      this.g = $$6;
   }

   @Override
   public void a(cvs $$0, cvs $$1) {
      this.a.a(this.b, $$1, $$0);
      super.a($$0, $$1);
   }

   @Override
   public int a() {
      return 1;
   }

   @Override
   public boolean a(cvs $$0) {
      return this.b == this.a.g($$0);
   }

   @Override
   public boolean a(cnx $$0) {
      cvs $$1 = this.g();
      return !$$1.f() && !$$0.f() && dbp.a($$1, dbo.E) ? false : super.a($$0);
   }

   @Override
   public Pair<ale, ale> b() {
      return this.g != null ? Pair.of(csc.B, this.g) : super.b();
   }
}
