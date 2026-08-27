import java.util.List;

public class coz implements cnm {
   private final iw<crs> c;
   private final int d;
   private final int e;
   private final cmw f;

   public coz(cmw $$0, int $$1, int $$2) {
      this($$0, $$1, $$2, iw.a($$1 * $$2, crs.i));
   }

   public coz(cmw $$0, int $$1, int $$2, iw<crs> $$3) {
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
   public boolean c() {
      for (crs $$0 : this.c) {
         if (!$$0.d()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public crs a(int $$0) {
      return $$0 >= this.b() ? crs.i : this.c.get($$0);
   }

   @Override
   public crs b(int $$0) {
      return bnz.a(this.c, $$0);
   }

   @Override
   public crs a(int $$0, int $$1) {
      crs $$2 = bnz.a(this.c, $$0, $$1);
      if (!$$2.d()) {
         this.f.a(this);
      }

      return $$2;
   }

   @Override
   public void a(int $$0, crs $$1) {
      this.c.set($$0, $$1);
      this.f.a(this);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(cka $$0) {
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
   public List<crs> h() {
      return List.copyOf(this.c);
   }

   @Override
   public void a(cke $$0) {
      for (crs $$1 : this.c) {
         $$0.a($$1);
      }
   }
}
