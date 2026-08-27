import java.util.List;

public class cgk implements cfb {
   private final hp<cjh> c;
   private final int d;
   private final int e;
   private final cen f;

   public cgk(cen $$0, int $$1, int $$2) {
      this($$0, $$1, $$2, hp.a($$1 * $$2, cjh.b));
   }

   public cgk(cen $$0, int $$1, int $$2, hp<cjh> $$3) {
      this.c = $$3;
      this.f = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   @Override
   public int b() {
      return this.c.size();
   }

   @Override
   public boolean af_() {
      for (cjh $$0 : this.c) {
         if (!$$0.b()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public cjh a(int $$0) {
      return $$0 >= this.b() ? cjh.b : this.c.get($$0);
   }

   @Override
   public cjh b(int $$0) {
      return bgu.a(this.c, $$0);
   }

   @Override
   public cjh a(int $$0, int $$1) {
      cjh $$2 = bgu.a(this.c, $$0, $$1);
      if (!$$2.b()) {
         this.f.a(this);
      }

      return $$2;
   }

   @Override
   public void a(int $$0, cjh $$1) {
      this.c.set($$0, $$1);
      this.f.a(this);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(cbw $$0) {
      return true;
   }

   @Override
   public void a() {
      this.c.clear();
   }

   @Override
   public int g() {
      return this.e;
   }

   @Override
   public int f() {
      return this.d;
   }

   @Override
   public List<cjh> h() {
      return List.copyOf(this.c);
   }

   @Override
   public void a(cca $$0) {
      for (cjh $$1 : this.c) {
         $$0.a($$1);
      }
   }
}
