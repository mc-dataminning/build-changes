import java.util.List;

public class crx implements cql {
   private final jv<cuq> b;
   private final int c;
   private final int d;
   private final cpu e;

   public crx(cpu $$0, int $$1, int $$2) {
      this($$0, $$1, $$2, jv.a($$1 * $$2, cuq.l));
   }

   public crx(cpu $$0, int $$1, int $$2, jv<cuq> $$3) {
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
      for (cuq $$0 : this.b) {
         if (!$$0.e()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public cuq a(int $$0) {
      return $$0 >= this.b() ? cuq.l : this.b.get($$0);
   }

   @Override
   public cuq b(int $$0) {
      return bql.a(this.b, $$0);
   }

   @Override
   public cuq a(int $$0, int $$1) {
      cuq $$2 = bql.a(this.b, $$0, $$1);
      if (!$$2.e()) {
         this.e.a(this);
      }

      return $$2;
   }

   @Override
   public void a(int $$0, cuq $$1) {
      this.b.set($$0, $$1);
      this.e.a(this);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(cmx $$0) {
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
   public List<cuq> h() {
      return List.copyOf(this.b);
   }

   @Override
   public void a(cnb $$0) {
      for (cuq $$1 : this.b) {
         $$0.a($$1);
      }
   }
}
