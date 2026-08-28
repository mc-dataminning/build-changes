import java.util.List;

public class crv implements cqj {
   private final jr<cuo> b;
   private final int c;
   private final int d;
   private final cpt e;

   public crv(cpt $$0, int $$1, int $$2) {
      this($$0, $$1, $$2, jr.a($$1 * $$2, cuo.l));
   }

   public crv(cpt $$0, int $$1, int $$2, jr<cuo> $$3) {
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
      return bqn.a(this.b, $$0);
   }

   @Override
   public cuo a(int $$0, int $$1) {
      cuo $$2 = bqn.a(this.b, $$0, $$1);
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
   public boolean a(cmw $$0) {
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
   public void a(cna $$0) {
      for (cuo $$1 : this.b) {
         $$0.a($$1);
      }
   }
}
