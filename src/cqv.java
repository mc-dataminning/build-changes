import java.util.List;

public class cqv implements cpj {
   private final jg<cto> b;
   private final int c;
   private final int d;
   private final cot e;

   public cqv(cot $$0, int $$1, int $$2) {
      this($$0, $$1, $$2, jg.a($$1 * $$2, cto.i));
   }

   public cqv(cot $$0, int $$1, int $$2, jg<cto> $$3) {
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
      for (cto $$0 : this.b) {
         if (!$$0.e()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public cto a(int $$0) {
      return $$0 >= this.b() ? cto.i : this.b.get($$0);
   }

   @Override
   public cto b(int $$0) {
      return bpo.a(this.b, $$0);
   }

   @Override
   public cto a(int $$0, int $$1) {
      cto $$2 = bpo.a(this.b, $$0, $$1);
      if (!$$2.e()) {
         this.e.a(this);
      }

      return $$2;
   }

   @Override
   public void a(int $$0, cto $$1) {
      this.b.set($$0, $$1);
      this.e.a(this);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(clw $$0) {
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
   public List<cto> h() {
      return List.copyOf(this.b);
   }

   @Override
   public void a(cma $$0) {
      for (cto $$1 : this.b) {
         $$0.a($$1);
      }
   }
}
