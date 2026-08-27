import java.util.List;

public class cmb implements ckr {
   private final is<coz> c;
   private final int d;
   private final int e;
   private final ckb f;

   public cmb(ckb $$0, int $$1, int $$2) {
      this($$0, $$1, $$2, is.a($$1 * $$2, coz.h));
   }

   public cmb(ckb $$0, int $$1, int $$2, is<coz> $$3) {
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
   public boolean aj_() {
      for (coz $$0 : this.c) {
         if (!$$0.b()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public coz a(int $$0) {
      return $$0 >= this.b() ? coz.h : this.c.get($$0);
   }

   @Override
   public coz b(int $$0) {
      return blo.a(this.c, $$0);
   }

   @Override
   public coz a(int $$0, int $$1) {
      coz $$2 = blo.a(this.c, $$0, $$1);
      if (!$$2.b()) {
         this.f.a(this);
      }

      return $$2;
   }

   @Override
   public void a(int $$0, coz $$1) {
      this.c.set($$0, $$1);
      this.f.a(this);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(chh $$0) {
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
   public List<coz> h() {
      return List.copyOf(this.c);
   }

   @Override
   public void a(chl $$0) {
      for (coz $$1 : this.c) {
         $$0.a($$1);
      }
   }
}
