import java.util.List;

public class cry implements cqm {
   private final jr<cur> b;
   private final int c;
   private final int d;
   private final cpw e;

   public cry(cpw $$0, int $$1, int $$2) {
      this($$0, $$1, $$2, jr.a($$1 * $$2, cur.l));
   }

   public cry(cpw $$0, int $$1, int $$2, jr<cur> $$3) {
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
      for (cur $$0 : this.b) {
         if (!$$0.e()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public cur a(int $$0) {
      return $$0 >= this.b() ? cur.l : this.b.get($$0);
   }

   @Override
   public cur b(int $$0) {
      return bqq.a(this.b, $$0);
   }

   @Override
   public cur a(int $$0, int $$1) {
      cur $$2 = bqq.a(this.b, $$0, $$1);
      if (!$$2.e()) {
         this.e.a(this);
      }

      return $$2;
   }

   @Override
   public void a(int $$0, cur $$1) {
      this.b.set($$0, $$1);
      this.e.a(this);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(cmz $$0) {
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
   public List<cur> h() {
      return List.copyOf(this.b);
   }

   @Override
   public void a(cnd $$0) {
      for (cur $$1 : this.b) {
         $$0.a($$1);
      }
   }
}
