import java.util.List;

public class cux implements ctl {
   private final jz<cxg> b;
   private final int c;
   private final int d;
   private final cst e;

   public cux(cst $$0, int $$1, int $$2) {
      this($$0, $$1, $$2, jz.a($$1 * $$2, cxg.j));
   }

   private cux(cst $$0, int $$1, int $$2, jz<cxg> $$3) {
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
      for (cxg $$0 : this.b) {
         if (!$$0.f()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public cxg a(int $$0) {
      return $$0 >= this.b() ? cxg.j : this.b.get($$0);
   }

   @Override
   public cxg b(int $$0) {
      return bsu.a(this.b, $$0);
   }

   @Override
   public cxg a(int $$0, int $$1) {
      cxg $$2 = bsu.a(this.b, $$0, $$1);
      if (!$$2.f()) {
         this.e.a(this);
      }

      return $$2;
   }

   @Override
   public void a(int $$0, cxg $$1) {
      this.b.set($$0, $$1);
      this.e.a(this);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(cpo $$0) {
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
   public List<cxg> h() {
      return List.copyOf(this.b);
   }

   @Override
   public void fillStackedContents(cpt $$0) {
      for (cxg $$1 : this.b) {
         $$0.a($$1);
      }
   }
}
