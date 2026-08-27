import java.util.List;

public class cgo implements cff {
   private final hn<cjl> c;
   private final int d;
   private final int e;
   private final cer f;

   public cgo(cer $$0, int $$1, int $$2) {
      this($$0, $$1, $$2, hn.a($$1 * $$2, cjl.b));
   }

   public cgo(cer $$0, int $$1, int $$2, hn<cjl> $$3) {
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
      for (cjl $$0 : this.c) {
         if (!$$0.b()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public cjl a(int $$0) {
      return $$0 >= this.b() ? cjl.b : this.c.get($$0);
   }

   @Override
   public cjl b(int $$0) {
      return bgy.a(this.c, $$0);
   }

   @Override
   public cjl a(int $$0, int $$1) {
      cjl $$2 = bgy.a(this.c, $$0, $$1);
      if (!$$2.b()) {
         this.f.a(this);
      }

      return $$2;
   }

   @Override
   public void a(int $$0, cjl $$1) {
      this.c.set($$0, $$1);
      this.f.a(this);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(cca $$0) {
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
   public List<cjl> h() {
      return List.copyOf(this.c);
   }

   @Override
   public void a(cce $$0) {
      for (cjl $$1 : this.c) {
         $$0.a($$1);
      }
   }
}
