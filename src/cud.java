import java.util.List;

public class cud implements csr {
   private final jz<cwm> b;
   private final int c;
   private final int d;
   private final crz e;

   public cud(crz $$0, int $$1, int $$2) {
      this($$0, $$1, $$2, jz.a($$1 * $$2, cwm.k));
   }

   private cud(crz $$0, int $$1, int $$2, jz<cwm> $$3) {
      this.b = $$3;
      this.e = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   public int b() {
      return this.b.size();
   }

   @Override
   public boolean c() {
      for (cwm $$0 : this.b) {
         if (!$$0.f()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public cwm a(int $$0) {
      return $$0 >= this.b() ? cwm.k : this.b.get($$0);
   }

   @Override
   public cwm b(int $$0) {
      return bse.a(this.b, $$0);
   }

   @Override
   public cwm a(int $$0, int $$1) {
      cwm $$2 = bse.a(this.b, $$0, $$1);
      if (!$$2.f()) {
         this.e.a(this);
      }

      return $$2;
   }

   @Override
   public void a(int $$0, cwm $$1) {
      this.b.set($$0, $$1);
      this.e.a(this);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(cou $$0) {
      return true;
   }

   @Override
   public void a() {
      this.b.clear();
   }

   @Override
   public int g() {
      return this.d;
   }

   @Override
   public int ay_() {
      return this.c;
   }

   @Override
   public List<cwm> h() {
      return List.copyOf(this.b);
   }

   @Override
   public void fillStackedContents(coz $$0) {
      for (cwm $$1 : this.b) {
         $$0.a($$1);
      }
   }
}
