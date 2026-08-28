import java.util.List;

public class ctn implements csb {
   private final jy<cvx> b;
   private final int c;
   private final int d;
   private final crj e;

   public ctn(crj $$0, int $$1, int $$2) {
      this($$0, $$1, $$2, jy.a($$1 * $$2, cvx.k));
   }

   private ctn(crj $$0, int $$1, int $$2, jy<cvx> $$3) {
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
      for (cvx $$0 : this.b) {
         if (!$$0.f()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public cvx a(int $$0) {
      return $$0 >= this.b() ? cvx.k : this.b.get($$0);
   }

   @Override
   public cvx b(int $$0) {
      return brs.a(this.b, $$0);
   }

   @Override
   public cvx a(int $$0, int $$1) {
      cvx $$2 = brs.a(this.b, $$0, $$1);
      if (!$$2.f()) {
         this.e.a(this);
      }

      return $$2;
   }

   @Override
   public void a(int $$0, cvx $$1) {
      this.b.set($$0, $$1);
      this.e.a(this);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(coh $$0) {
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
   public int aA_() {
      return this.c;
   }

   @Override
   public List<cvx> h() {
      return List.copyOf(this.b);
   }

   @Override
   public void fillStackedContents(com $$0) {
      for (cvx $$1 : this.b) {
         $$0.a($$1);
      }
   }
}
