import java.util.List;

public class cvb implements ctp {
   private final jz<cxk> b;
   private final int c;
   private final int d;
   private final csx e;

   public cvb(csx $$0, int $$1, int $$2) {
      this($$0, $$1, $$2, jz.a($$1 * $$2, cxk.k));
   }

   private cvb(csx $$0, int $$1, int $$2, jz<cxk> $$3) {
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
      for (cxk $$0 : this.b) {
         if (!$$0.f()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public cxk a(int $$0) {
      return $$0 >= this.b() ? cxk.k : this.b.get($$0);
   }

   @Override
   public cxk b(int $$0) {
      return bsy.a(this.b, $$0);
   }

   @Override
   public cxk a(int $$0, int $$1) {
      cxk $$2 = bsy.a(this.b, $$0, $$1);
      if (!$$2.f()) {
         this.e.a(this);
      }

      return $$2;
   }

   @Override
   public void a(int $$0, cxk $$1) {
      this.b.set($$0, $$1);
      this.e.a(this);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(cps $$0) {
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
   public int az_() {
      return this.c;
   }

   @Override
   public List<cxk> h() {
      return List.copyOf(this.b);
   }

   @Override
   public void fillStackedContents(cpx $$0) {
      for (cxk $$1 : this.b) {
         $$0.a($$1);
      }
   }
}
