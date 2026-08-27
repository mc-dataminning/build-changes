import java.util.List;

public class crl implements cpw {
   private final jj<cuh> b;
   private final int c;
   private final int d;
   private final cpg e;

   public crl(cpg $$0, int $$1, int $$2) {
      this($$0, $$1, $$2, jj.a($$1 * $$2, cuh.i));
   }

   public crl(cpg $$0, int $$1, int $$2, jj<cuh> $$3) {
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
      for (cuh $$0 : this.b) {
         if (!$$0.d()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public cuh a(int $$0) {
      return $$0 >= this.b() ? cuh.i : this.b.get($$0);
   }

   @Override
   public cuh b(int $$0) {
      return bpu.a(this.b, $$0);
   }

   @Override
   public cuh a(int $$0, int $$1) {
      cuh $$2 = bpu.a(this.b, $$0, $$1);
      if (!$$2.d()) {
         this.e.a(this);
      }

      return $$2;
   }

   @Override
   public void a(int $$0, cuh $$1) {
      this.b.set($$0, $$1);
      this.e.a(this);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(cly $$0) {
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
   public int f() {
      return this.c;
   }

   @Override
   public List<cuh> h() {
      return List.copyOf(this.b);
   }

   @Override
   public void a(cmc $$0) {
      for (cuh $$1 : this.b) {
         $$0.a($$1);
      }
   }
}
