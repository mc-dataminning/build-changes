import java.util.List;

public class cmf implements ckv {
   private final is<cpd> c;
   private final int d;
   private final int e;
   private final ckf f;

   public cmf(ckf $$0, int $$1, int $$2) {
      this($$0, $$1, $$2, is.a($$1 * $$2, cpd.h));
   }

   public cmf(ckf $$0, int $$1, int $$2, is<cpd> $$3) {
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
      for (cpd $$0 : this.c) {
         if (!$$0.b()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public cpd a(int $$0) {
      return $$0 >= this.b() ? cpd.h : this.c.get($$0);
   }

   @Override
   public cpd b(int $$0) {
      return blq.a(this.c, $$0);
   }

   @Override
   public cpd a(int $$0, int $$1) {
      cpd $$2 = blq.a(this.c, $$0, $$1);
      if (!$$2.b()) {
         this.f.a(this);
      }

      return $$2;
   }

   @Override
   public void a(int $$0, cpd $$1) {
      this.c.set($$0, $$1);
      this.f.a(this);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(chl $$0) {
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
   public List<cpd> h() {
      return List.copyOf(this.c);
   }

   @Override
   public void a(chp $$0) {
      for (cpd $$1 : this.c) {
         $$0.a($$1);
      }
   }
}
