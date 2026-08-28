import java.util.List;

public class cvg implements ctu {
   private final jz<cxp> b;
   private final int c;
   private final int d;
   private final ctc e;

   public cvg(ctc $$0, int $$1, int $$2) {
      this($$0, $$1, $$2, jz.a($$1 * $$2, cxp.j));
   }

   private cvg(ctc $$0, int $$1, int $$2, jz<cxp> $$3) {
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
      for (cxp $$0 : this.b) {
         if (!$$0.f()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public cxp a(int $$0) {
      return $$0 >= this.b() ? cxp.j : this.b.get($$0);
   }

   @Override
   public cxp b(int $$0) {
      return btd.a(this.b, $$0);
   }

   @Override
   public cxp a(int $$0, int $$1) {
      cxp $$2 = btd.a(this.b, $$0, $$1);
      if (!$$2.f()) {
         this.e.a(this);
      }

      return $$2;
   }

   @Override
   public void a(int $$0, cxp $$1) {
      this.b.set($$0, $$1);
      this.e.a(this);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(cpx $$0) {
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
   public List<cxp> h() {
      return List.copyOf(this.b);
   }

   @Override
   public void fillStackedContents(cqc $$0) {
      for (cxp $$1 : this.b) {
         $$0.a($$1);
      }
   }
}
