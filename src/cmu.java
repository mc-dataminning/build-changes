import java.util.List;

public class cmu implements clk {
   private final iu<cpq> c;
   private final int d;
   private final int e;
   private final cku f;

   public cmu(cku $$0, int $$1, int $$2) {
      this($$0, $$1, $$2, iu.a($$1 * $$2, cpq.h));
   }

   public cmu(cku $$0, int $$1, int $$2, iu<cpq> $$3) {
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
   public boolean aj_() {
      for (cpq $$0 : this.c) {
         if (!$$0.b()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public cpq a(int $$0) {
      return $$0 >= this.b() ? cpq.h : this.c.get($$0);
   }

   @Override
   public cpq b(int $$0) {
      return bmf.a(this.c, $$0);
   }

   @Override
   public cpq a(int $$0, int $$1) {
      cpq $$2 = bmf.a(this.c, $$0, $$1);
      if (!$$2.b()) {
         this.f.a(this);
      }

      return $$2;
   }

   @Override
   public void a(int $$0, cpq $$1) {
      this.c.set($$0, $$1);
      this.f.a(this);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(cia $$0) {
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
   public List<cpq> h() {
      return List.copyOf(this.c);
   }

   @Override
   public void a(cie $$0) {
      for (cpq $$1 : this.c) {
         $$0.a($$1);
      }
   }
}
