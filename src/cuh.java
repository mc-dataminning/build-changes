import java.util.List;

public class cuh implements csv {
   private final ka<cwq> b;
   private final int c;
   private final int d;
   private final csd e;

   public cuh(csd $$0, int $$1, int $$2) {
      this($$0, $$1, $$2, ka.a($$1 * $$2, cwq.j));
   }

   private cuh(csd $$0, int $$1, int $$2, ka<cwq> $$3) {
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
      for (cwq $$0 : this.b) {
         if (!$$0.f()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public cwq a(int $$0) {
      return $$0 >= this.b() ? cwq.j : this.b.get($$0);
   }

   @Override
   public cwq b(int $$0) {
      return bsf.a(this.b, $$0);
   }

   @Override
   public cwq a(int $$0, int $$1) {
      cwq $$2 = bsf.a(this.b, $$0, $$1);
      if (!$$2.f()) {
         this.e.a(this);
      }

      return $$2;
   }

   @Override
   public void a(int $$0, cwq $$1) {
      this.b.set($$0, $$1);
      this.e.a(this);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(coy $$0) {
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
   public List<cwq> h() {
      return List.copyOf(this.b);
   }

   @Override
   public void fillStackedContents(cpd $$0) {
      for (cwq $$1 : this.b) {
         $$0.a($$1);
      }
   }
}
