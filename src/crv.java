import java.util.List;

public class crv implements cqj {
   private final jv<cuo> b;
   private final int c;
   private final int d;
   private final cps e;

   public crv(cps $$0, int $$1, int $$2) {
      this($$0, $$1, $$2, jv.a($$1 * $$2, cuo.l));
   }

   public crv(cps $$0, int $$1, int $$2, jv<cuo> $$3) {
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
      for (cuo $$0 : this.b) {
         if (!$$0.e()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public cuo a(int $$0) {
      return $$0 >= this.b() ? cuo.l : this.b.get($$0);
   }

   @Override
   public cuo b(int $$0) {
      return bqk.a(this.b, $$0);
   }

   @Override
   public cuo a(int $$0, int $$1) {
      cuo $$2 = bqk.a(this.b, $$0, $$1);
      if (!$$2.e()) {
         this.e.a(this);
      }

      return $$2;
   }

   @Override
   public void a(int $$0, cuo $$1) {
      this.b.set($$0, $$1);
      this.e.a(this);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(cmv $$0) {
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
   public List<cuo> h() {
      return List.copyOf(this.b);
   }

   @Override
   public void a(cmz $$0) {
      for (cuo $$1 : this.b) {
         $$0.a($$1);
      }
   }
}
