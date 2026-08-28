import java.util.List;

public class cwu implements cvi {
   private final jn<cyy> b;
   private final int c;
   private final int d;
   private final cuq e;

   public cwu(cuq $$0, int $$1, int $$2) {
      this($$0, $$1, $$2, jn.a($$1 * $$2, cyy.k));
   }

   private cwu(cuq $$0, int $$1, int $$2, jn<cyy> $$3) {
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
      for (cyy $$0 : this.b) {
         if (!$$0.f()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public cyy a(int $$0) {
      return $$0 >= this.b() ? cyy.k : this.b.get($$0);
   }

   @Override
   public cyy b(int $$0) {
      return btv.a(this.b, $$0);
   }

   @Override
   public cyy a(int $$0, int $$1) {
      cyy $$2 = btv.a(this.b, $$0, $$1);
      if (!$$2.f()) {
         this.e.a(this);
      }

      return $$2;
   }

   @Override
   public void a(int $$0, cyy $$1) {
      this.b.set($$0, $$1);
      this.e.a(this);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(cqy $$0) {
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
   public int au_() {
      return this.c;
   }

   @Override
   public List<cyy> h() {
      return List.copyOf(this.b);
   }

   @Override
   public void fillStackedContents(crd $$0) {
      for (cyy $$1 : this.b) {
         $$0.a($$1);
      }
   }
}
