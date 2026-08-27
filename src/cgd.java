import java.util.List;

public class cgd implements ceu {
   private final hp<cja> c;
   private final int d;
   private final int e;
   private final ceg f;

   public cgd(ceg $$0, int $$1, int $$2) {
      this($$0, $$1, $$2, hp.a($$1 * $$2, cja.b));
   }

   public cgd(ceg $$0, int $$1, int $$2, hp<cja> $$3) {
      this.c = $$3;
      this.f = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   @Override
   public int b() {
      return this.c.size();
   }

   @Override
   public boolean aa_() {
      for (cja $$0 : this.c) {
         if (!$$0.b()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public cja a(int $$0) {
      return $$0 >= this.b() ? cja.b : this.c.get($$0);
   }

   @Override
   public cja b(int $$0) {
      return bgn.a(this.c, $$0);
   }

   @Override
   public cja a(int $$0, int $$1) {
      cja $$2 = bgn.a(this.c, $$0, $$1);
      if (!$$2.b()) {
         this.f.a(this);
      }

      return $$2;
   }

   @Override
   public void a(int $$0, cja $$1) {
      this.c.set($$0, $$1);
      this.f.a(this);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(cbp $$0) {
      return true;
   }

   @Override
   public void a() {
      this.c.clear();
   }

   @Override
   public int g() {
      return this.e;
   }

   @Override
   public int f() {
      return this.d;
   }

   @Override
   public List<cja> h() {
      return List.copyOf(this.c);
   }

   @Override
   public void a(cbt $$0) {
      for (cja $$1 : this.c) {
         $$0.a($$1);
      }
   }
}
