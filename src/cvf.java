import java.util.List;

public class cvf implements ctt {
   private final jz<cxo> b;
   private final int c;
   private final int d;
   private final ctb e;

   public cvf(ctb $$0, int $$1, int $$2) {
      this($$0, $$1, $$2, jz.a($$1 * $$2, cxo.k));
   }

   private cvf(ctb $$0, int $$1, int $$2, jz<cxo> $$3) {
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
      for (cxo $$0 : this.b) {
         if (!$$0.f()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public cxo a(int $$0) {
      return $$0 >= this.b() ? cxo.k : this.b.get($$0);
   }

   @Override
   public cxo b(int $$0) {
      return btc.a(this.b, $$0);
   }

   @Override
   public cxo a(int $$0, int $$1) {
      cxo $$2 = btc.a(this.b, $$0, $$1);
      if (!$$2.f()) {
         this.e.a(this);
      }

      return $$2;
   }

   @Override
   public void a(int $$0, cxo $$1) {
      this.b.set($$0, $$1);
      this.e.a(this);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(cpw $$0) {
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
   public List<cxo> h() {
      return List.copyOf(this.b);
   }

   @Override
   public void fillStackedContents(cqb $$0) {
      for (cxo $$1 : this.b) {
         $$0.a($$1);
      }
   }
}
